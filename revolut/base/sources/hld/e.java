package hld;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f153444a;

    public e(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f153444a = uiKitResources;
    }

    public final RawCutoutImageBadge a(SlotIconAsset slotIconAsset) {
        int i;
        Intrinsics.checkNotNullParameter(slotIconAsset, "slotIconAsset");
        if (!(slotIconAsset instanceof SlotIconAsset.Symbol)) {
            throw new NoWhenBranchMatchedException();
        }
        SlotIconAsset.Symbol symbol = (SlotIconAsset.Symbol) slotIconAsset;
        int iA = this.f153444a.a(symbol.f87257a);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int iIntValue = numValueOf.intValue();
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorPopoverBackground);
        int i2 = d.f153443a[symbol.f87258b.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorStatusDanger;
        } else if (i2 == 2) {
            i = R$attr.uikit_colorGreen;
        } else if (i2 == 3) {
            i = R$attr.uikit_colorStatusWarning;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorAccentNeutral;
        }
        return new RawCutoutImageBadge(LayeredImage.Companion.g(companion, iIntValue, new Color.Solid(i), new Color.Solid(R$attr.uikit_colorTransparent), solid, null, 2.0f, BitmapDescriptorFactory.HUE_RED, Float.valueOf(16.0f), SyslogConstants.LOG_LOCAL2));
    }
}
