package ik5;

import com.revolut.core.error.data.model.ServerError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import sf0.h;
import wk5.n;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f161900a;

    public f(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f161900a = serverErrorParser;
    }

    public final n a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorA = this.f161900a.a(error);
        HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
        return (httpException == null || httpException.code() != 422 || serverErrorA == null || serverErrorA.getF51362a() != 29016) ? n.NOT_RESTRICTED : n.RESTRICTED;
    }
}
