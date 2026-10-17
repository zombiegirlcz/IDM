package androidx.view;

import androidx.content.NavBackStackEntry;
import androidx.content.fragment.FragmentNavigator;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6764c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f6762a = i;
        this.f6763b = obj2;
        this.f6764c = obj3;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f6762a) {
            case 0:
                ComponentActivity.addObserverForBackInvoker$lambda$0((OnBackPressedDispatcher) this.f6763b, (ComponentActivity) this.f6764c, lifecycleOwner, event);
                break;
            case 1:
                ((MenuHostHelper) this.f6763b).lambda$addMenuProvider$0((MenuProvider) this.f6764c, lifecycleOwner, event);
                break;
            case 2:
                LifecycleController.observer$lambda$0((LifecycleController) this.f6763b, (Job) this.f6764c, lifecycleOwner, event);
                break;
            default:
                FragmentNavigator.fragmentViewObserver$lambda$3$lambda$2((FragmentNavigator) this.f6763b, (NavBackStackEntry) this.f6764c, lifecycleOwner, event);
                break;
        }
    }
}
