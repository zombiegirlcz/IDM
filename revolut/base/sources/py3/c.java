package py3;

import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ulm.j1;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements py3.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f240654a = new Regex("^/credit-application/[a-fA-F0-9\\-]{36}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f240655b = new Regex("^/credit-application/.*$");

    public static final class a {
        private a() {
        }
    }

    @Override // py3.a
    public final boolean a(Throwable throwable) {
        Response<?> response;
        okhttp3.Response responseRaw;
        j1 j1Var;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CreditApplicationException) {
            throwable = ((CreditApplicationException) throwable).f66910a;
        }
        if (throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            if (httpException.code() == 404 && (response = httpException.response()) != null && (responseRaw = response.raw()) != null && (j1Var = responseRaw.f226087a) != null) {
                String str = j1Var.f281096b;
                String path = j1Var.f281095a.k().getPath();
                if (Intrinsics.f(str, "GET")) {
                    Intrinsics.h(path);
                    return f240654a.f(path);
                }
                Intrinsics.h(path);
                return f240655b.f(path);
            }
        }
        return false;
    }
}
