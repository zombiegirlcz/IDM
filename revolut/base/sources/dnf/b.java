package dnf;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import n2l.d;
import n2l.e;
import n2l.g;
import n2l.i;
import n2l.j;
import tof.c;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f116292a;

    public b(f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f116292a = wealthAccountHeaderUiMapper;
    }

    public final PairedImage a(String currencyCode, c accountType) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        LayeredImage layeredImageB = b(accountType);
        if (layeredImageB != null) {
            return new PairedImage(new CurrencyImage(currencyCode, (ImageTransformations) null, (TextLocalisedClause) null, 14), layeredImageB, R$attr.uikit_colorWidgetBackground, null);
        }
        return null;
    }

    public final LayeredImage b(c accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        int i = a.f116291a[accountType.ordinal()];
        j cVar = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : g.f211589a : new n2l.c(null) : d.f211586a : e.f211587a : i.f211591a;
        if (cVar != null) {
            return LayeredImage.INSTANCE.j(this.f116292a.g(cVar), new Color.Solid(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorAccentNeutral_10));
        }
        return null;
    }
}
