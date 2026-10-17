package or0;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f228037b;

    public /* synthetic */ t(int i, int i2) {
        this.f228036a = i2;
        this.f228037b = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f228036a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
                outline.setRoundRect(new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), kli.a.w(this.f228037b, r9));
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                int width = view.getWidth();
                int height = view.getHeight();
                int i = this.f228037b;
                outline.setRoundRect(0, 0, width, height + i, i);
                break;
        }
    }
}
