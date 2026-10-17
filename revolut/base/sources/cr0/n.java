package cr0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f108184c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp7.k f108185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f108186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108185a = new cp7.k(this, 15);
        setId(R$id.internal_bottom_dialog_dim_container);
        setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            this.f108186b = new WeakReference(viewGroup);
            u.b(viewGroup, true, this.f108185a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        WeakReference weakReference = this.f108186b;
        ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
        if (viewGroup != null) {
            u.q(viewGroup, this.f108185a);
            this.f108186b = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        setVisibility(getChildCount() == 0 ? 4 : 0);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        setVisibility(getChildCount() == 0 ? 4 : 0);
    }
}
