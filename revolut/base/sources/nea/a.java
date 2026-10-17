package nea;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pockets.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements n {

    @NotNull
    public static final C1198a Companion = new C1198a();

    /* JADX INFO: renamed from: nea.a$a, reason: collision with other inner class name */
    public static final class C1198a {
        private C1198a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.account_detail_details_list_dialog_add_new_iban_title, u.c(domainState.f214424a.f306286a), null, 12), null, new lw0.b(new PairedImage(new CurrencyImage(domainState.f214424a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CountryImage(domainState.f214425b.f297794a, (Integer) null, (ez0.e) null, 14), R$attr.uikit_colorWidgetBackground, null), null), null, false, 26);
        boolean z = false;
        int i = 6;
        List listK = v.k(new RowDelegate.Model("ROW_ITEM_ADD_ACCOUNT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_flag, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.bank_account_account_details_countries_info_add_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("ROW_ITEM_USE_ACCOUNT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.bank_account_account_details_countries_info_use_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.account_detail_details_list_dialog_add_new_button_add_iban, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.account_detail_details_list_dialog_add_new_button_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), listK, aVar);
    }
}
