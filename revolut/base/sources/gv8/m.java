package gv8;

import cli.y;
import cli.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends oki.h implements z {

    @NotNull
    public static final l Companion = new l();
    public final yx8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f147085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f61.a f147086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f147087r;

    public m(n mapper, yx8.a webKycControllerExtension, v redirectMatcher, f61.a redirectMapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(webKycControllerExtension, "webKycControllerExtension");
        Intrinsics.checkNotNullParameter(redirectMatcher, "redirectMatcher");
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        this.o = webKycControllerExtension;
        this.f147085p = redirectMatcher;
        this.f147086q = redirectMapper;
        this.f147087r = mra.d.b(this, new f(false, false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.o.d3(this.f147086q), null, null, new exe.k(2, this, m.class, "onRedirect", "onRedirect(Ljava/lang/String;)V", 4, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f147087r;
    }
}
