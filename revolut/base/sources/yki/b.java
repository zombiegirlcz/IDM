package yki;

import android.os.Bundle;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.y;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public abstract void a();

    public abstract Set b();

    public abstract boolean c();

    public abstract FlowStep d();

    public abstract boolean e(boolean z);

    public abstract zji.f f();

    public abstract void g(FlowStep flowStep, boolean z, TransitionAnimation transitionAnimation, boolean z3);

    public abstract void h();

    public abstract void i(boolean z);

    public abstract void j(FlowStep flowStep, ModalDestination.Style style);

    public abstract void k(FlowStep flowStep, ModalDestination.Style style);

    public abstract void l(ControllerKey controllerKey);

    public abstract void m(ViewController viewController);

    public abstract void n();

    public abstract void o(Bundle bundle);

    public abstract boolean p(Function1 function1);

    public abstract void q(Bundle bundle, Bundle bundle2);

    public abstract void r(y yVar, Bundle bundle);
}
