package az0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11366c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v0(int i, int i2, MutableObjectIntMap mutableObjectIntMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f11364a = 1;
        this.f11365b = i;
        this.f11366c = i2;
        this.d = mutableObjectIntMap;
        this.e = nearestRangeKeyIndexMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f11364a) {
            case 0:
                Function1 function1 = (Function1) this.d;
                Function0 function0 = (Function0) this.e;
                com.bumptech.glide.j render = (com.bumptech.glide.j) obj2;
                Intrinsics.checkNotNullParameter(render, "$this$render");
                ((com.bumptech.glide.j) v04.b.b(render, function1, function0).w(this.f11365b, this.f11366c)).c0();
                return Unit.f186387a;
            case 1:
                return NearestRangeKeyIndexMap.lambda$1$0(this.f11365b, this.f11366c, (MutableObjectIntMap) this.d, (NearestRangeKeyIndexMap) this.e, (IntervalList.Interval) obj2);
            default:
                ro0.u uVar = (ro0.u) this.d;
                Drawable drawable = (Drawable) this.e;
                float fFloatValue = ((Float) obj2).floatValue();
                uVar.getClass();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.ceil(this.f11365b * fFloatValue), (int) Math.ceil(this.f11366c * fFloatValue), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                float fMax = Math.max(bitmapCreateBitmap.getWidth() / drawable.getIntrinsicWidth(), bitmapCreateBitmap.getHeight() / drawable.getIntrinsicHeight());
                int iCeil = (int) Math.ceil(drawable.getIntrinsicWidth() * fMax);
                int iCeil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * fMax);
                int width = (bitmapCreateBitmap.getWidth() - iCeil) / 2;
                int height = (bitmapCreateBitmap.getHeight() - iCeil2) / 2;
                Rect rect = new Rect(drawable.getBounds());
                try {
                    drawable.setBounds(width, height, iCeil + width, iCeil2 + height);
                    drawable.draw(new Canvas(bitmapCreateBitmap));
                    return bitmapCreateBitmap;
                } finally {
                    drawable.setBounds(rect);
                }
        }
    }

    public /* synthetic */ v0(int i, Object obj2, Object obj3, int i2, int i3) {
        this.f11364a = i3;
        this.d = obj2;
        this.e = obj3;
        this.f11365b = i;
        this.f11366c = i2;
    }
}
