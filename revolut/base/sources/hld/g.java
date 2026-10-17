package hld;

import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f153446a;

    public g(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f153446a = uiKitResources;
    }

    public final GlyphImage a(SlotIconAsset slotIconAsset) {
        GlyphImageTint glyphImageTint;
        Intrinsics.checkNotNullParameter(slotIconAsset, "slotIconAsset");
        if (!(slotIconAsset instanceof SlotIconAsset.Symbol)) {
            throw new NoWhenBranchMatchedException();
        }
        SlotIconAsset.Symbol symbol = (SlotIconAsset.Symbol) slotIconAsset;
        int iA = this.f153446a.a(symbol.f87257a);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        int i = f.f153445a[symbol.f87258b.ordinal()];
        if (i == 1) {
            glyphImageTint = GlyphImageTint.DANGER.f59929a;
        } else if (i == 2) {
            glyphImageTint = GlyphImageTint.SUCCESS.f59932a;
        } else if (i == 3) {
            glyphImageTint = GlyphImageTint.WARNING.f59933a;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            glyphImageTint = GlyphImageTint.STANDARD.f59931a;
        }
        return new GlyphImage(iIntValue, glyphImageTint, null, 4);
    }
}
