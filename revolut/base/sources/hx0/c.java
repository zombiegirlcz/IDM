package hx0;

import android.app.Activity;
import android.transition.Transition;
import android.view.Window;
import androidx.view.ComponentActivity;
import com.revolut.core.ui_kit.R$id;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f156302a = new c();

    private c() {
    }

    public static ComponentActivity a(yp0.c0 c0Var) {
        WeakReference weakReference;
        Activity activity = c0Var != null ? c0Var.f315716a : null;
        if (!(activity instanceof ComponentActivity)) {
            return null;
        }
        d dVar = (d) c0Var.a(R$id.internal_activity_transition_manager_tag);
        return (ComponentActivity) (((dVar == null || (weakReference = ((e) dVar).e) == null) ? null : (m) weakReference.get()) != null ? activity : null);
    }

    public static d b(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = R$id.internal_activity_transition_manager_tag;
        yp0.d0 d0Var = yp0.d0.f315718a;
        yp0.c0 c0VarA = yp0.d0.a(activity);
        Object objA = c0VarA.a(i);
        Object obj2 = objA;
        if (objA == null) {
            e eVar = new e(activity);
            activity.getLifecycle().addObserver(eVar);
            eVar.a(activity.getWindow().getEnterTransition());
            eVar.b(activity.getWindow().getReenterTransition());
            Transition returnTransition = activity.getWindow().getReturnTransition();
            c cVar = d.Companion;
            cVar.getClass();
            Window window = activity.getWindow();
            if (window != null) {
                window.setReturnTransition(returnTransition);
            }
            Transition exitTransition = activity.getWindow().getExitTransition();
            cVar.getClass();
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.setExitTransition(exitTransition);
            }
            c0VarA.b(i, eVar);
            obj2 = eVar;
        }
        return (d) obj2;
    }
}
