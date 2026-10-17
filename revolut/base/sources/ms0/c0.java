package ms0;

import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.AnimatedDrawable;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208199a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(String str, int i, Class cls) {
        super(cls, str);
        this.f208199a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj2) {
        switch (this.f208199a) {
            case 0:
                CircleProgressBar view = (CircleProgressBar) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                return Integer.valueOf(view.getProgress());
            case 1:
                sp0.e layer = (sp0.e) obj2;
                Intrinsics.checkNotNullParameter(layer, "layer");
                return Float.valueOf(layer.f264864g);
            case 2:
                sp0.e layer2 = (sp0.e) obj2;
                Intrinsics.checkNotNullParameter(layer2, "layer");
                return Float.valueOf(layer2.e);
            default:
                sp0.e layer3 = (sp0.e) obj2;
                Intrinsics.checkNotNullParameter(layer3, "layer");
                return Float.valueOf(layer3.f);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj2, Object obj3) {
        switch (this.f208199a) {
            case 0:
                CircleProgressBar view = (CircleProgressBar) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(view, "view");
                view.setProgress(iIntValue);
                break;
            case 1:
                sp0.e layer = (sp0.e) obj2;
                float fFloatValue = ((Number) obj3).floatValue();
                Intrinsics.checkNotNullParameter(layer, "layer");
                layer.getClass();
                layer.f264864g = kotlin.ranges.f.f(fFloatValue, BitmapDescriptorFactory.HUE_RED, 1.0f);
                AnimatedDrawable animatedDrawable = layer.d;
                if (animatedDrawable != null) {
                    animatedDrawable.invalidateSelf();
                }
                break;
            case 2:
                sp0.e layer2 = (sp0.e) obj2;
                float fFloatValue2 = ((Number) obj3).floatValue();
                Intrinsics.checkNotNullParameter(layer2, "layer");
                layer2.e = fFloatValue2;
                AnimatedDrawable animatedDrawable2 = layer2.d;
                if (animatedDrawable2 != null) {
                    animatedDrawable2.invalidateSelf();
                }
                break;
            default:
                sp0.e layer3 = (sp0.e) obj2;
                float fFloatValue3 = ((Number) obj3).floatValue();
                Intrinsics.checkNotNullParameter(layer3, "layer");
                layer3.f = fFloatValue3;
                AnimatedDrawable animatedDrawable3 = layer3.d;
                if (animatedDrawable3 != null) {
                    animatedDrawable3.invalidateSelf();
                }
                break;
        }
    }
}
