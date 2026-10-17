package ay2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import h93.j0;
import h93.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements j10.a {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11049c = R$attr.uikit_colorGrey50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f11050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f11051b;

    public p(j0 productType, l0 subProductType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        this.f11050a = productType;
        this.f11051b = subProductType;
    }

    public final RowDelegate.Model.MainImage.Image40 a(int i) {
        int i2 = R$drawable.uikit_icn_rounded_background;
        int i3 = o.f11048b[this.f11050a.ordinal()];
        int i5 = f11049c;
        switch (i3) {
            case 1:
                switch (o.f11047a[this.f11051b.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i5 = R$attr.uikit_colorColdBlue;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        i5 = R$attr.uikit_colorTeal;
                        break;
                    case 10:
                        i5 = R$attr.uikit_colorDeepGrey;
                        break;
                    case 11:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                break;
            case 2:
                i5 = R$attr.uikit_colorTeal;
                break;
            case 3:
                i5 = R$attr.uikit_colorPink;
                break;
            case 4:
                i5 = R$attr.uikit_colorGrey50;
                break;
            case 5:
                i5 = R$attr.uikit_colorPurple;
                break;
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new RowDelegate.Model.MainImage.Image40(new LayeredImage(v.k(new LayeredImage.Layer.Drawable(i2, Integer.valueOf(i5), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(i, Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), null, null, false, null, false, 62);
    }
}
