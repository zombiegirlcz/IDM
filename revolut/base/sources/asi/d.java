package asi;

import cn0.g;
import kotlin.jvm.internal.Intrinsics;
import mm0.m;
import mm0.n;
import mm0.o;
import mm0.p;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm0.b f8931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yri.a f8932b;

    public d(zm0.b sessionController, yri.a screensInteractor, a sleepTimeConfiguration) {
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(screensInteractor, "screensInteractor");
        Intrinsics.checkNotNullParameter(sleepTimeConfiguration, "sleepTimeConfiguration");
        this.f8931a = sessionController;
        this.f8932b = screensInteractor;
    }

    public final c a() {
        o oVarD = ((g) this.f8931a).d();
        if (oVarD instanceof m) {
            return c.ABSENT;
        }
        if (oVarD instanceof p) {
            return c.SCOPED;
        }
        if (!(oVarD instanceof n)) {
            return c.UNAUTHORIZED;
        }
        yri.a aVar = this.f8932b;
        if (aVar.d()) {
            return c.EXIST;
        }
        return aVar.i() > ((long) (aVar.h() ? 120000 : 15000)) ? c.EXPIRED : c.EXIST;
    }
}
