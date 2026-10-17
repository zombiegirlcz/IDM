package mae;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements a9e.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f204000a = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorColdBlue, 8.0f, Float.valueOf(24.0f), null, 32);

    public static final class a {
        private a() {
        }
    }

    public static Image a(ibd.a aVar) {
        switch (g.f204001a[aVar.f160147c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return new CurrencyImage(aVar.f160146b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return fpg.a.a();
            case 12:
            case 13:
            case 14:
                return nib.a.a();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Image b(qua.p recurringPayment) {
        ibd.a aVar;
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        ibd.a aVar2 = recurringPayment.F;
        return (aVar2 == null || (aVar = recurringPayment.A) == null) ? this.f204000a : new PairedImage(a(aVar2), a(aVar), R$attr.uikit_colorWidgetBackground, null);
    }
}
