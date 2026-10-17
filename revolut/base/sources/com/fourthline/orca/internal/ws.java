package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cv;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.ks;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.ss;
import com.fourthline.orca.internal.wv;
import com.fourthline.orca.internal.wy;
import com.fourthline.orca.internal.zt;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ws implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f34779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f34780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f34781c;
    private final q80 d;

    public ws(o80 navigationChannel, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f34779a = navigationChannel;
        this.f34780b = popupHandler;
        this.f34781c = new c80("eid");
        this.d = q80.j.c.f32272b;
    }

    private final q80 c() {
        aq0.a(this.f34780b, hq0.b.f29374a, new xr1(this, 26), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f34781c;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof k30) {
            return c();
        }
        if (navigationEffect instanceof u30) {
            return new q80.j.b(null, 1, null);
        }
        if (navigationEffect instanceof cv) {
            return a((cv) navigationEffect);
        }
        if (navigationEffect instanceof wy) {
            return a((wy) navigationEffect);
        }
        if (navigationEffect instanceof ks) {
            return a((ks) navigationEffect);
        }
        if (navigationEffect instanceof zt.c) {
            return a((zt.c) navigationEffect);
        }
        if (navigationEffect instanceof wv) {
            return a((wv) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(bt navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f34779a.mo3647trySendJP2dKIU(a((ee1) navigationEffect));
    }

    private final q80 a(wy wyVar) {
        if (wyVar instanceof wy.a) {
            return new q80.b(null, 1, null);
        }
        if (wyVar instanceof wy.c) {
            wy.c cVar = (wy.c) wyVar;
            ss ssVarC = cVar.c();
            if (ssVarC instanceof ss.b) {
                return new q80.j.e(null, 1, null);
            }
            if (ssVarC instanceof ss.a) {
                return new q80.k(null, ((ss.a) cVar.c()).a(), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wyVar instanceof wy.b) {
            return new q80.l(((wy.b) wyVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(ks ksVar) {
        if (ksVar instanceof ks.a) {
            return new q80.b(null, 1, null);
        }
        if (ksVar instanceof ks.b) {
            return q80.j.d.f32274b;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(zt.c cVar) {
        if (cVar instanceof zt.c.a) {
            return new q80.b(null, 1, null);
        }
        if (cVar instanceof zt.c.b) {
            return q80.j.d.f32274b;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(cv cvVar) {
        if (cvVar instanceof cv.a) {
            return new q80.b(null, 1, null);
        }
        if (cvVar instanceof cv.d) {
            return q80.j.f.f32278b;
        }
        if (cvVar instanceof cv.c) {
            return new q80.j.b(new p80(false, false, false, new sp0(new q80.j.b(null, 1, null), true, false, 4, null), 7, null));
        }
        if (cvVar instanceof cv.b) {
            return new q80.j.a(new p80(false, false, false, new sp0(new q80.j.e(null, 1, null), true, false, 4, null), 7, null));
        }
        if (cvVar instanceof cv.e) {
            return new q80.j.e(new p80(false, false, false, new sp0(q80.j.d.f32274b, true, false, 4, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(wv wvVar) {
        if (wvVar instanceof wv.a) {
            return new q80.l(((wv.a) wvVar).c());
        }
        if (wvVar instanceof wv.b) {
            return new q80.k(null, ly.a(((wv.b) wvVar).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ws wsVar) {
        wsVar.f34779a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
