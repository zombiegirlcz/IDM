package dq0;

import android.graphics.Rect;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f116894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f116895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f116896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ScreenContentRecyclerView view, float f) {
        super(WindowInsetsCompat.Type.systemBars(), WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullParameter(view, "view");
        this.f116894a = view;
        this.f116895b = f;
        this.f116896c = new Rect();
    }

    @Override // dq0.b
    public final void a() {
        ScreenContentRecyclerView screenContentRecyclerView = this.f116894a;
        screenContentRecyclerView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        screenContentRecyclerView.setClipBounds(null);
    }

    @Override // dq0.b
    public final void c(Insets diff, float f) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        float f4 = diff.bottom;
        float f5 = this.f116895b;
        ScreenContentRecyclerView screenContentRecyclerView = this.f116894a;
        screenContentRecyclerView.setTranslationY(-(f4 * f5));
        int height = screenContentRecyclerView.getHeight() - ((int) ((1.0f - f5) * diff.bottom));
        if (height < 0) {
            height = 0;
        }
        int width = screenContentRecyclerView.getWidth();
        Rect rect = this.f116896c;
        rect.set(0, 0, width, height);
        screenContentRecyclerView.setClipBounds(rect);
    }

    @Override // dq0.b
    public final void d() {
    }
}
