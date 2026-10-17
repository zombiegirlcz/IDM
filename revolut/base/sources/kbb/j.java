package kbb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements oim.o {
    public /* synthetic */ u19.b u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ ike.a f182558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f182559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f182560y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, Continuation continuation) {
        super(5, continuation);
        this.f182560y = oVar;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        j jVar = new j(this.f182560y, (Continuation) obj6);
        jVar.u = (u19.b) obj2;
        jVar.v = zBooleanValue;
        jVar.f182558w = (ike.a) obj4;
        jVar.f182559x = zBooleanValue2;
        return jVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            u19.b r0 = r11.u
            boolean r1 = r11.v
            ike.a r2 = r11.f182558w
            boolean r3 = r11.f182559x
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r12)
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = ibb.c.f160140a
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = ibb.c.f
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160141b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r8 = ibb.c.f160142c
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r9 = ibb.c.d
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r10 = ibb.c.e
            com.revolut.feature.rev10_main_screen.api.MainScreenTab[] r12 = new com.revolut.feature.rev10_main_screen.api.MainScreenTab[]{r5, r6, r7, r8, r9, r10}
            java.util.List r12 = zhm.v.k(r12)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r12.iterator()
        L2c:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r12.next()
            r6 = r5
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = (com.revolut.feature.rev10_main_screen.api.MainScreenTab) r6
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.e
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L49
            u19.b r6 = u19.b.NOT_AVAILABLE
            if (r0 == r6) goto L7b
        L47:
            r8 = r9
            goto L7b
        L49:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.d
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L53
            r8 = r1
            goto L7b
        L53:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160141b
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L5e
            boolean r8 = r2.f161939a
            goto L7b
        L5e:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160142c
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L67
            goto L47
        L67:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160140a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L70
            goto L47
        L70:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L81
            if (r3 == 0) goto L7b
            goto L47
        L7b:
            if (r8 == 0) goto L2c
            r4.add(r5)
            goto L2c
        L81:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.f83420a
            java.lang.String r1 = "Unsupported MainScreenTab id="
            java.lang.String r0 = j6.a.q(r1, r0)
            r12.<init>(r0)
            throw r12
        L8f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r4, r1)
            r12.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L9e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r1.next()
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r3 = (com.revolut.feature.rev10_main_screen.api.MainScreenTab) r3
            boolean r4 = r2.f161940b
            kbb.o r5 = r11.f182560y
            com.revolut.core.ui_kit.views.FloatingBottomBarView$Item r3 = kbb.o.a(r5, r3, r4, r0)
            r12.add(r3)
            goto L9e
        Lb6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
