package gw1;

import com.revolut.core.error.data.model.ServerError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f147260a;

    public b(sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f147260a = serverErrorParser;
    }

    public final j a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f147260a.a(throwable);
        return (serverErrorA == null || serverErrorA.f51362a != 80002) ? new h(zz1.e.FAILED) : i.f147272a;
    }
}
