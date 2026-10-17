package s16;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.defi.accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = false;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_crypto_brick, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info1_title, null, null, 14);
        of ofVar = of.SMALL;
        int i = 6;
        List listK = v.k(new RowDelegate.Model("INFO_ITEM_CONTROL_LIST_ID", image24, textLocalisedClause, ofVar, 0, new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info1_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816), new RowDelegate.Model("INFO_ITEM_REGULATORY_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info2_title, null, null, 14), ofVar, 0, new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info2_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816), new RowDelegate.Model("INFO_ITEM_KEY_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_key, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info3_title, null, null, 14), ofVar, 0, new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info3_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816), new RowDelegate.Model("INFO_ITEM_FEES_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_crypto_stablecoin, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info4_title, null, null, 14), ofVar, 0, new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_info4_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816));
        int i2 = R$attr.uikit_dp12;
        yp0.b.k(listK, i2, i2, 0, 0, 28);
        return new b(listK);
    }
}
