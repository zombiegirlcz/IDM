package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bf0;
import com.fourthline.orca.internal.le0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.rc0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yb0 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f35250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c80 f35251b;

    public yb0(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        this.f35250a = navigationChannel;
        this.f35251b = new c80("document");
    }

    private final p80 c() {
        return new p80(false, false, false, new sp0(new q80.q.c(null, 1, null), true, false, 4, null), 7, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f35251b;
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return q80.q.a.f32292b;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof rc0) {
            return a((rc0) navigationEffect);
        }
        if (navigationEffect instanceof bf0.c) {
            return a((bf0.c) navigationEffect);
        }
        if (navigationEffect instanceof le0.a) {
            return a((le0.a) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f35250a.mo3647trySendJP2dKIU(a(navigationEffect));
    }

    private final q80 a(rc0 rc0Var) {
        if (rc0Var instanceof rc0.a) {
            return new q80.d(null, 1, null);
        }
        if (rc0Var instanceof rc0.b) {
            return new q80.q.b(null, 1, null);
        }
        if (rc0Var instanceof rc0.c) {
            return new q80.k(null, ly.a(((rc0.c) rc0Var).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(le0.a aVar) {
        if (aVar instanceof le0.a.C0241a) {
            return new q80.b(null, 1, null);
        }
        if (aVar instanceof le0.a.b) {
            return new q80.q.c(null, 1, null);
        }
        if (aVar instanceof le0.a.c) {
            return new q80.k(null, ly.a(((le0.a.c) aVar).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(bf0.c cVar) {
        if (cVar instanceof bf0.c.a) {
            return new q80.b(null, 1, null);
        }
        if (cVar instanceof bf0.c.C0170c) {
            return new q80.k(c(), ly.a(((bf0.c.C0170c) cVar).c()));
        }
        if (cVar instanceof bf0.c.b) {
            return new q80.k(c(), ly.a(((bf0.c.b) cVar).c()));
        }
        if (cVar instanceof bf0.c.d) {
            return new q80.b(new p80(false, false, false, new sp0(q80.q.a.f32292b, false, false, 4, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
