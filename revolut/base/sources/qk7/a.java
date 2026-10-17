package qk7;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C1351a Companion = new C1351a();

    /* JADX INFO: renamed from: qk7.a$a, reason: collision with other inner class name */
    public static final class C1351a {
        private C1351a() {
        }
    }

    public static LayeredImage a(CFACClaimStatus status) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(status, "status");
        switch (b.f246971a[status.ordinal()]) {
            case 1:
                i = R$drawable.uikit_icn_16_cross;
                i2 = R$attr.uikit_colorRed;
                break;
            case 2:
            case 3:
            case 4:
                i = R$drawable.uikit_icn_16_sand_watch;
                i2 = R$attr.uikit_colorOrange;
                break;
            case 5:
                i = R$drawable.uikit_icn_24_reverted;
                i2 = R$attr.uikit_colorDeepGrey;
                break;
            case 6:
                i = R$drawable.uikit_icn_16_check;
                i2 = R$attr.uikit_colorGreen;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, i, i2, R$attr.uikit_colorBackground, null, 4.0f, 2.0f, null, 72);
    }
}
