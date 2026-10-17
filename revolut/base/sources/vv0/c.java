package vv0;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AppCompatActivity;
import ht0.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292432a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f292433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f292434c;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("accessibility");
        this.f292433b = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
    }

    @Override // vv0.a
    public final boolean a() {
        switch (this.f292432a) {
            case 0:
                Context context = ((Window) this.f292433b).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return !(kli.a.m(context) != null ? r0.isInMultiWindowMode() : false);
            default:
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.f292433b;
                return (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) ? false : true;
        }
    }

    @Override // vv0.a
    public final void b(final b0 onStateChanged) {
        switch (this.f292432a) {
            case 0:
                Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
                a70.a aVar = new a70.a(onStateChanged, 6);
                this.f292434c = aVar;
                Context context = ((Window) this.f292433b).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Activity activityM = kli.a.m(context);
                AppCompatActivity appCompatActivity = activityM instanceof AppCompatActivity ? (AppCompatActivity) activityM : null;
                if (appCompatActivity != null) {
                    appCompatActivity.addOnMultiWindowModeChangedListener(aVar);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: vv0.d
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        onStateChanged.invoke();
                    }
                };
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.f292433b;
                if (accessibilityManager != null) {
                    accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                }
                this.f292434c = touchExplorationStateChangeListener;
                break;
        }
    }

    @Override // vv0.a
    public final void detach() {
        AccessibilityManager accessibilityManager;
        switch (this.f292432a) {
            case 0:
                a70.a aVar = (a70.a) this.f292434c;
                if (aVar != null) {
                    Context context = ((Window) this.f292433b).getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Activity activityM = kli.a.m(context);
                    AppCompatActivity appCompatActivity = activityM instanceof AppCompatActivity ? (AppCompatActivity) activityM : null;
                    if (appCompatActivity != null) {
                        appCompatActivity.removeOnMultiWindowModeChangedListener(aVar);
                    }
                }
                this.f292434c = null;
                break;
            default:
                d dVar = (d) this.f292434c;
                if (dVar != null && (accessibilityManager = (AccessibilityManager) this.f292433b) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(dVar);
                }
                this.f292434c = null;
                break;
        }
    }

    public c(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f292433b = window;
    }
}
