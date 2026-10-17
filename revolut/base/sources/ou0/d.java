package ou0;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.slider.SliderView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m8b.o;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends o {
    public final /* synthetic */ int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SliderView f229755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SliderView sliderView, int i, int i2) {
        super(sliderView);
        this.e = i2;
        this.f229755g = sliderView;
        this.f = i;
    }

    @Override // m8b.o
    public final void c(List stickyPoints, float f, RectF rect, Path progressPath, Path sliderPath) {
        switch (this.e) {
            case 0:
                Intrinsics.checkNotNullParameter(stickyPoints, "stickyPoints");
                Intrinsics.checkNotNullParameter(rect, "rect");
                Intrinsics.checkNotNullParameter(progressPath, "progressPath");
                Intrinsics.checkNotNullParameter(sliderPath, "sliderPath");
                float f4 = 2;
                float fHeight = rect.height() / f4;
                float f5 = rect.left;
                float f6 = rect.right;
                int size = stickyPoints.size();
                for (int i = 0; i < size; i++) {
                    float f32 = ((cy0.b) stickyPoints.get(i)).f110018b;
                    if (f32 != BitmapDescriptorFactory.HUE_RED && f32 != 100.0f) {
                        float fE = j.e(((SliderView) this.d).f57553a, f32);
                        float f35 = this.f;
                        float f36 = fE + f35 + fHeight;
                        if (f36 > f6) {
                            f36 = f6;
                        }
                        rect.right = f36 < f6 ? (fE - f35) - fHeight : f6;
                        d(sliderPath, rect, f6);
                        if (fE <= f) {
                            d(progressPath, rect, f6);
                            f5 = f36;
                        }
                        rect.left = f36;
                    }
                }
                rect.right = f6;
                d(sliderPath, rect, f6);
                if (f5 < f) {
                    rect.right = f;
                    rect.left = f5;
                    float fHeight2 = this.f229755g.f57553a.i.height() / f4;
                    progressPath.addRoundRect(rect, fHeight2, fHeight2, Path.Direction.CW);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(stickyPoints, "stickyPoints");
                Intrinsics.checkNotNullParameter(rect, "rect");
                Intrinsics.checkNotNullParameter(progressPath, "progressPath");
                Intrinsics.checkNotNullParameter(sliderPath, "sliderPath");
                float f37 = rect.left;
                float f41 = rect.right;
                int size2 = stickyPoints.size();
                float f42 = f37;
                for (int i2 = 0; i2 < size2; i2++) {
                    float f57 = ((cy0.b) stickyPoints.get(i2)).f110018b;
                    if (f57 != BitmapDescriptorFactory.HUE_RED && f57 != 100.0f) {
                        float fE2 = j.e(((SliderView) this.d).f57553a, f57);
                        float f69 = this.f / 2;
                        float f75 = fE2 + f69;
                        if (f75 > f41) {
                            f75 = f41;
                        }
                        rect.right = f75 < f41 ? fE2 - f69 : f41;
                        e(sliderPath, rect, f37, f41);
                        if (fE2 <= f) {
                            e(progressPath, rect, f37, f41);
                            f42 = f75;
                        }
                        rect.left = f75;
                    }
                }
                rect.right = f41;
                e(sliderPath, rect, f37, f41);
                if (f42 < f) {
                    rect.right = f;
                    rect.left = f42;
                    e(progressPath, rect, f37, f41);
                }
                break;
        }
    }

    public void d(Path path, RectF rectF, float f) {
        if (rectF.left >= rectF.right) {
            return;
        }
        float f4 = 2;
        float fHeight = this.f229755g.f57553a.i.height() / f4;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fHeight, fHeight, direction);
        if (f == rectF.right) {
            return;
        }
        float fHeight2 = rectF.height() / f4;
        path.addCircle(rectF.right + this.f + fHeight2, rectF.centerY(), fHeight2, direction);
    }

    public void e(Path path, RectF rectF, float f, float f4) {
        float f5 = rectF.left;
        float f6 = rectF.right;
        if (f5 >= f6) {
            return;
        }
        if (f5 == f && f6 == f4) {
            float fHeight = this.f229755g.f57553a.i.height() / 2;
            path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        } else if (f5 == f) {
            path.addRoundRect(rectF, (float[]) this.f203466b, Path.Direction.CW);
        } else if (f6 == f4) {
            path.addRoundRect(rectF, (float[]) this.f203467c, Path.Direction.CW);
        } else {
            path.addRect(rectF, Path.Direction.CW);
        }
    }
}
