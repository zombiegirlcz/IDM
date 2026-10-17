package tl5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.spare.change.api.R$string;
import java.util.List;
import mii.f;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements jl5.a {

    @NotNull
    public static final C1516a Companion = new C1516a();

    /* JADX INFO: renamed from: tl5.a$a, reason: collision with other inner class name */
    public static final class C1516a {
        private C1516a() {
        }
    }

    public final f a() {
        return w.a("CRYPTO_SPARE_CHANGE_SAVE_ID", new TextLocalisedClause(R$string.crypto_settings_sparechange_tooltip_activated_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG);
    }

    public final f b() {
        return w.a("CRYPTO_SPARE_CHANGE_REMOVE_ID", new TextLocalisedClause(R$string.crypto_settings_sparechange_tooltip_removed_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG);
    }

    public final f c() {
        return w.a("CRYPTO_SPARE_CHANGE_UPDATE_ID", new TextLocalisedClause(R$string.crypto_settings_sparechange_tooltip_updated_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG);
    }
}
