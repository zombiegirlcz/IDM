package py3;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import sf0.h;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f240656a;

    public e(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f240656a = serverErrorParser;
    }

    @Override // py3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CreditApplicationException) {
            throwable = ((CreditApplicationException) throwable).f66910a;
        }
        HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
        Integer numValueOf = httpException != null ? Integer.valueOf(httpException.code()) : null;
        ServerError serverErrorA = numValueOf != null && numValueOf.intValue() == 406 ? this.f240656a.a(throwable) : null;
        return serverErrorA != null && serverErrorA.f51362a == 32042;
    }
}
