package dq0;

import android.graphics.Rect;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f116905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f116907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, boolean z) {
        super(WindowInsetsCompat.Type.systemBars(), WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullParameter(view, "view");
        this.f116905a = view;
        this.f116906b = z;
        this.f116907c = new Rect();
    }

    @Override // dq0.b
    public final void a() {
        View view = this.f116905a;
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        if (this.f116906b) {
            view.setClipBounds(null);
        }
    }

    @Override // dq0.b
    public final void c(Insets diff, float f) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        int i = diff.top - diff.bottom;
        float f4 = diff.left - diff.right;
        View view = this.f116905a;
        view.setTranslationX(f4);
        view.setTranslationY(i);
        if (this.f116906b) {
            Rect rect = this.f116907c;
            if (i < 0) {
                rect.set(0, -i, view.getWidth(), view.getBottom());
            } else {
                rect.set(0, 0, view.getWidth(), view.getBottom() - i);
            }
            view.setClipBounds(rect);
        }
    }

    @Override // dq0.b
    public final void d() {
    }
}
