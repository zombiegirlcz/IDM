package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.internal.a4;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d4 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f27639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f27640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f27641c;
    private final q80 d;

    public d4(o80 navigationChannel, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f27639a = navigationChannel;
        this.f27640b = popupHandler;
        this.f27641c = new c80("bav");
        this.d = q80.c.b.f32236b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final q80 c() {
        aq0.a(this.f27640b, hq0.b.f29374a, new gj1(this, 14), null, 4, null);
        return new q80.o(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f27641c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof l5) {
            return c();
        }
        if (navigationEffect instanceof n5) {
            a4 a4VarC = ((n5) navigationEffect).c();
            return a4VarC instanceof a4.d ? q80.c.d.f32240b : a4VarC instanceof a4.a ? q80.c.a.f32234b : q80.c.C0271c.f32238b;
        }
        int i = 1;
        p80 p80Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (navigationEffect instanceof w6) {
            return new q80.b(p80Var, i, objArr5 == true ? 1 : 0);
        }
        if (navigationEffect instanceof y6) {
            return ((y6) navigationEffect).c() instanceof a4.a ? q80.c.a.f32234b : q80.c.C0271c.f32238b;
        }
        if (navigationEffect instanceof l3) {
            return new q80.b(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        }
        if (navigationEffect instanceof n3) {
            return q80.c.C0271c.f32238b;
        }
        if (navigationEffect instanceof l6) {
            return new q80.b(new p80(false, false, false, new sp0(q80.c.b.f32236b, false, false, 6, null), 7, null));
        }
        if (navigationEffect instanceof j6) {
            return new q80.l(((j6) navigationEffect).c());
        }
        if (navigationEffect instanceof k6) {
            return new q80.k(objArr2 == true ? 1 : 0, ly.a(((k6) navigationEffect).c()), i, objArr == true ? 1 : 0);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(b5 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f27639a.mo3647trySendJP2dKIU(a((ee1) navigationEffect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(d4 d4Var) {
        d4Var.f27639a.mo3647trySendJP2dKIU(new q80.l(BavError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
