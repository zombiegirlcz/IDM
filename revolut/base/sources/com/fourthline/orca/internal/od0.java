package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bf0;
import com.fourthline.orca.internal.kf0;
import com.fourthline.orca.internal.ld0;
import com.fourthline.orca.internal.le0;
import com.fourthline.orca.internal.q80;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class od0 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f31644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c80 f31645b;

    public od0(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        this.f31644a = navigationChannel;
        this.f31645b = new c80("document");
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f31645b;
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return new q80.r.a(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof le0.a) {
            return a((le0.a) navigationEffect);
        }
        if (navigationEffect instanceof bf0.c) {
            return a((bf0.c) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f31644a.mo3647trySendJP2dKIU(a(navigationEffect));
    }

    private final q80 a(le0.a aVar) {
        if (aVar instanceof le0.a.C0241a) {
            return new q80.d(null, 1, null);
        }
        if (aVar instanceof le0.a.b) {
            return new q80.r.b(null, 1, null);
        }
        if (aVar instanceof le0.a.c) {
            le0.a.c cVar = (le0.a.c) aVar;
            ld0 ld0VarC = cVar.c();
            if (ld0VarC instanceof ld0.a) {
                return new q80.r.c(null, 1, null);
            }
            if (ld0VarC instanceof ld0.b) {
                return new q80.k(null, ly.a(cVar.c()), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(bf0.c cVar) {
        p80 p80Var = new p80(false, false, false, new sp0(new q80.r.a(null, 1, null), false, false, 4, null), 7, null);
        if (cVar instanceof bf0.c.a) {
            return new q80.b(null, 1, null);
        }
        if (cVar instanceof bf0.c.C0170c) {
            bf0.c.C0170c c0170c = (bf0.c.C0170c) cVar;
            return c0170c.c() instanceof ld0.a ? new q80.r.c(p80Var) : new q80.k(null, ly.a(c0170c.c()), 1, null);
        }
        if (cVar instanceof bf0.c.b) {
            bf0.c.b bVar = (bf0.c.b) cVar;
            ld0 ld0VarC = bVar.c();
            if (ld0VarC instanceof ld0.a) {
                return new q80.r.c(p80Var);
            }
            if (ld0VarC instanceof ld0.b) {
                return new q80.k(null, ly.a(bVar.c()), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (cVar instanceof bf0.c.d) {
            if (((bf0.c.d) cVar).c() instanceof kf0.b) {
                return new q80.d(new p80(false, false, false, new sp0(new q80.h.a(null, 1, null), false, false, 6, null), 7, null));
            }
            return new q80.d(new p80(false, false, false, new sp0(new q80.i.c(null, 1, null), false, false, 6, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
