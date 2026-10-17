package bs9;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18107a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18108b;

    public i(ImageView imageView) {
        Intrinsics.checkNotNullExpressionValue(imageView.getContext(), "getContext(...)");
        this.f18108b = kli.a.k(r2, 8.0f);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f18107a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f18108b);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f18108b);
                break;
        }
    }

    public i(float f) {
        this.f18108b = f;
    }
}
