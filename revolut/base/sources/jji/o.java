package jji;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ro0.e0;
import ro0.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements xji.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mji.a f174973a;

    public static final class a {
        private a() {
        }

        public static o a(Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (g0.b(context, e0.OVERLAY_BACKGROUND)) {
                return new o(0);
            }
            return null;
        }
    }

    public o() {
        this(0);
    }

    public static boolean c(com.revolut.kompot.navigable.a controller) {
        TransitionAnimation transitionAnimation = controller.q2().f206461b;
        qo0.f fVar = transitionAnimation instanceof qo0.f ? (qo0.f) transitionAnimation : null;
        if (!(controller instanceof kji.e)) {
            com.revolut.kompot.navigable.a aVarA = controller.q2().a(false);
            if (aVarA == null) {
                if (fVar == null || !fVar.E0()) {
                    lji.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    Intrinsics.checkNotNullParameter("SNAPSHOT_BITMAP_META_KEY", "key");
                    if (controller.f98398a.a() != null) {
                    }
                }
                return true;
            }
            aVarA.q2().b();
        }
        return false;
    }

    @Override // xji.b
    public final void P1(com.revolut.kompot.navigable.a aVar, com.revolut.kompot.navigable.a aVar2, TransitionAnimation transition, boolean z) {
        lji.c cVarL;
        Intrinsics.checkNotNullParameter(transition, "transition");
        com.revolut.kompot.navigable.a aVar3 = z ? aVar : aVar2;
        View viewD2 = aVar3 != null ? aVar3.D2() : null;
        if (viewD2 == null || (cVarL = ksj.b.l(viewD2)) == null) {
            return;
        }
        if (z) {
            aVar = aVar2;
        }
        View anotherView = aVar != null ? aVar.D2() : null;
        qo0.f fVar = transition instanceof qo0.f ? (qo0.f) transition : null;
        if (fVar == null || !fVar.E0()) {
            cVarL.c(1.0f);
        } else if (anotherView != null) {
            Intrinsics.checkNotNullParameter(anotherView, "anotherView");
            cVarL.f195675c = new WeakReference(anotherView);
        }
    }

    @Override // xji.a
    public final void U0(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        lji.c cVarL = ksj.b.l(controller.D2());
        if (cVarL == null) {
            return;
        }
        cVarL.c(z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        cVarL.f195675c = null;
    }

    public final void a() {
        nhi.k.a(this);
    }

    public final void b() {
        nhi.k.b(this);
    }

    @Override // xji.a
    public final void d2(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        lji.c cVarL = ksj.b.l(controller.D2());
        if (cVarL == null) {
            return;
        }
        cVarL.c(!z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        cVarL.f195675c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    @Override // xji.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(com.revolut.kompot.navigable.a r17) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jji.o.q1(com.revolut.kompot.navigable.a):void");
    }

    public o(int i) {
        mji.a applicatorFactory = new mji.a(0);
        Intrinsics.checkNotNullParameter(applicatorFactory, "applicatorFactory");
        this.f174973a = applicatorFactory;
    }
}
