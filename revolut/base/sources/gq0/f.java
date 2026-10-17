package gq0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f145493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f145494b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f145495c;
    public WeakReference d;

    public final void a(boolean z) {
        View contentRootForAccessibility;
        WeakReference weakReference = this.d;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (z == this.f145495c || view == null) {
            return;
        }
        this.f145495c = z;
        if (!z) {
            WeakHashMap weakHashMap = this.f145493a;
            if (weakHashMap != null && !weakHashMap.isEmpty()) {
                for (Map.Entry entry : weakHashMap.entrySet()) {
                    ((View) entry.getKey()).setImportantForAccessibility(((Number) entry.getValue()).intValue());
                }
                this.f145493a = null;
            }
            this.f145494b = false;
            return;
        }
        if (!view.isAttachedToWindow()) {
            this.f145494b = true;
            return;
        }
        e eVar = view instanceof e ? (e) view : null;
        if (eVar != null && eVar.getUpdateImportantForAccessibilityOnSiblings() && (contentRootForAccessibility = eVar.getContentRootForAccessibility()) != null) {
            WeakHashMap weakHashMap2 = new WeakHashMap();
            ViewParent parent = contentRootForAccessibility.getParent();
            Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt == contentRootForAccessibility) {
                    break;
                }
                weakHashMap2.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                childAt.setImportantForAccessibility(4);
            }
            this.f145493a = weakHashMap2;
        }
        view.sendAccessibilityEvent(8);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.f145494b) {
            a(this.f145495c);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        a(false);
    }
}
