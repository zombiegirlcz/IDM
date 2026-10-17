package ro0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f255782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f255783c;

    public /* synthetic */ v(y yVar, RecyclerView recyclerView, int i) {
        this.f255781a = i;
        this.f255782b = yVar;
        this.f255783c = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255781a) {
            case 0:
                float fFloatValue = ((Float) obj2).floatValue();
                this.f255782b.getClass();
                RecyclerView recyclerView = this.f255783c;
                if (recyclerView.getWidth() <= 0 || recyclerView.getHeight() <= 0) {
                    throw new IllegalArgumentException(a0.d.g(recyclerView.getWidth(), recyclerView.getHeight(), "dimensions of the blurred view should be positive. actual width=", ", height=").toString());
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.ceil(recyclerView.getWidth() * fFloatValue), (int) Math.ceil(recyclerView.getHeight() * fFloatValue), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(fFloatValue, fFloatValue);
                recyclerView.draw(canvas);
                return bitmapCreateBitmap;
            default:
                View child = (View) obj2;
                Intrinsics.checkNotNullParameter(child, "child");
                return Boolean.valueOf(this.f255782b.e(this.f255783c, child));
        }
    }
}
