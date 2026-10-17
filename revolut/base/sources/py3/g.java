package py3;

import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements py3.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // py3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CreditApplicationException) {
            throwable = ((CreditApplicationException) throwable).f66910a;
        }
        return (throwable instanceof HttpException) && ((HttpException) throwable).code() == 423;
    }
}
