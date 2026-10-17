package wji;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lki.z;
import org.jetbrains.annotations.NotNull;
import wji.e;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements z {

    @NotNull
    public static final b Companion = new b();
    public static final a k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f298133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f298134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.b f298135c;
    public final boolean d;
    public final boolean e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f298136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f298137h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f298138j;

    public c(com.revolut.kompot.navigable.a aVar, com.revolut.kompot.navigable.a aVar2, com.revolut.kompot.navigable.b controllerManager, boolean z, boolean z3, e postponedTransitionInfo) {
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(postponedTransitionInfo, "postponedTransitionInfo");
        this.f298133a = aVar;
        this.f298134b = aVar2;
        this.f298135c = controllerManager;
        this.d = z;
        this.e = z3;
        this.f298137h = postponedTransitionInfo instanceof e.a;
        boolean z4 = postponedTransitionInfo instanceof f;
        this.i = z4;
        this.f298138j = z4 ? (f) postponedTransitionInfo : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.revolut.kompot.navigable.TransitionAnimation r21) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wji.c.a(com.revolut.kompot.navigable.TransitionAnimation):void");
    }

    public final void b(com.revolut.kompot.navigable.a aVar, com.revolut.kompot.navigable.a aVar2) {
        Function2 function2;
        Function2 function22;
        if (aVar == null && aVar2 == null) {
            return;
        }
        if (Intrinsics.f(aVar, aVar2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean z = aVar2 != null && aVar2.o;
        boolean z3 = (aVar == null || aVar.o) ? false : true;
        if (z && aVar2 != null) {
            aVar2.I2();
        }
        if (z3 && aVar != null) {
            aVar.H2();
        }
        com.revolut.kompot.navigable.b bVar = this.f298135c;
        if (z && aVar2 != null && (function22 = bVar.f) != null) {
            function22.invoke(aVar2, bVar);
        }
        if (!z3 || aVar == null || (function2 = bVar.e) == null) {
            return;
        }
        function2.invoke(aVar, bVar);
    }

    @Override // lki.z
    public final void n() throws aki.e {
        com.revolut.kompot.navigable.b bVar = this.f298135c;
        ViewParent viewParentA = bVar.d.a();
        hli.e eVar = viewParentA instanceof hli.e ? (hli.e) viewParentA : null;
        if (eVar != null) {
            eVar.N0();
        }
        com.revolut.kompot.navigable.a aVar = this.f298134b;
        if (aVar != null) {
            aVar.n();
        }
        if (aVar != null) {
            aVar.J0(false);
        }
        com.revolut.kompot.navigable.a aVar2 = this.f298133a;
        if (aVar2 != null) {
            aVar2.n();
        }
        if (aVar2 != null) {
            aVar2.J0(true);
        }
        b(aVar2, aVar);
        boolean z = this.d;
        if (aVar != null) {
            View view = this.f298136g;
            if (view != null) {
                bVar.d.remove(view);
            }
            if (!z) {
                aVar.onDestroy();
            }
        }
        bVar.k = aVar2;
        Function1 function1 = bVar.f98421g;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        this.f = null;
        this.f298136g = null;
    }

    @Override // lki.z
    public final void o() {
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f298136g;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (this.f298135c.f98424l) {
            b(this.f298134b, !this.e ? this.f298133a : null);
        }
    }

    @Override // lki.z
    public final void p() {
        ViewParent viewParentA = this.f298135c.d.a();
        hli.e eVar = viewParentA instanceof hli.e ? (hli.e) viewParentA : null;
        if (eVar != null) {
            eVar.c0(this.e);
        }
        com.revolut.kompot.navigable.a aVar = this.f298133a;
        if (aVar != null) {
            aVar.u(false);
        }
        com.revolut.kompot.navigable.a aVar2 = this.f298134b;
        if (aVar2 != null) {
            aVar2.u(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @Override // lki.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() throws aki.e {
        /*
            r6 = this;
            com.revolut.kompot.navigable.a r0 = r6.f298133a
            if (r0 == 0) goto L8
            r1 = 0
            r0.J0(r1)
        L8:
            com.revolut.kompot.navigable.a r1 = r6.f298134b
            if (r1 == 0) goto L10
            r2 = 1
            r1.J0(r2)
        L10:
            boolean r1 = r6.e
            r2 = 0
            if (r1 == 0) goto L17
            r1 = r0
            goto L18
        L17:
            r1 = r2
        L18:
            r6.b(r2, r1)
            android.view.View r1 = r6.f
            com.revolut.kompot.navigable.b r3 = r6.f298135c
            boolean r4 = r6.d
            if (r1 == 0) goto L2e
            boolean r5 = r6.f298137h
            if (r5 == 0) goto L29
            if (r4 == 0) goto L2e
        L29:
            wji.d r5 = r3.d
            r5.remove(r1)
        L2e:
            if (r0 == 0) goto L4c
            if (r4 != 0) goto L49
            aki.c r1 = r3.f98420c
            com.revolut.kompot.navigable.ControllerKey r3 = r0.u2()
            aki.f r1 = (aki.f) r1
            r1.getClass()
            java.lang.String r4 = "controllerKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            com.revolut.kompot.navigable.a r1 = r1.d(r3)
            if (r1 == 0) goto L49
            goto L4c
        L49:
            r0.onDestroy()
        L4c:
            r6.f = r2
            r6.f298136g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wji.c.q():void");
    }

    @Override // lki.z
    public final void r() {
        ViewParent viewParentA = this.f298135c.d.a();
        hli.e eVar = viewParentA instanceof hli.e ? (hli.e) viewParentA : null;
        if (eVar != null) {
            eVar.J0();
        }
        com.revolut.kompot.navigable.a aVar = this.f298133a;
        if (aVar != null) {
            aVar.g1(false);
        }
        com.revolut.kompot.navigable.a aVar2 = this.f298134b;
        if (aVar2 != null) {
            aVar2.g1(true);
        }
    }
}
