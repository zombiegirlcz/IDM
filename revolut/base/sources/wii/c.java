package wii;

import com.revolut.core.ui_kit.views.o;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import jb3.l;
import js0.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nhi.k;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements xji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f297905a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xji.a
    public final void O0(com.revolut.kompot.navigable.a controller, boolean z) {
        Boolean o;
        Intrinsics.checkNotNullParameter(controller, "controller");
        c(controller, z);
        b bVar = controller instanceof b ? (b) controller : null;
        if (bVar == null || (o = bVar.getV()) == null) {
            return;
        }
        boolean zBooleanValue = o.booleanValue();
        o oVarL = l.l(f.Companion, controller.D2());
        if (oVarL != null) {
            s.x(oVarL.getNonCancelableActivator(), controller, z && !zBooleanValue);
        }
    }

    @Override // xji.a
    public final void U0(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (z) {
            return;
        }
        c(controller, false);
    }

    public final void a() {
        k.a(this);
    }

    public final void b() {
        k.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(com.revolut.kompot.navigable.a aVar, boolean z) {
        o oVarL;
        Set set = this.f297905a;
        if (set.contains(aVar)) {
            set.remove(aVar);
            b bVar = aVar instanceof b ? (b) aVar : null;
            if (bVar == null || !Intrinsics.f(bVar.getK(), ModalTransitionAnimation.Style.POPUP.f98391a) || (oVarL = l.l(f.Companion, aVar.D2())) == null) {
                return;
            }
            s.x(oVarL.getPopupStyleActivator(), aVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xji.a
    public final void d2(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (!(controller instanceof b) || ((b) controller).getK() == null) {
            return;
        }
        this.f297905a.add(controller);
    }

    @Override // xji.a
    public final void m0(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (z) {
            c(controller, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xji.a
    public final void q0(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (!(controller instanceof b) || ((b) controller).getK() == null) {
            return;
        }
        this.f297905a.add(controller);
    }
}
