package dd5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import mii.h;
import mii.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0673a Companion = new C0673a();

    /* JADX INFO: renamed from: dd5.a$a, reason: collision with other inner class name */
    public static final class C0673a {
        private C0673a() {
        }
    }

    public final h a(boolean z) {
        return new h(new TextLocalisedClause(z ? R$string.crypto_asset_details_section_investment_holding_auto_earn_enable_error : R$string.crypto_asset_details_section_investment_holding_auto_earn_disable_error, null, null, 14), "ERROR_SHOT_DIALOG_ID");
    }

    public final k b(boolean z) {
        return new k("SUCCESS_SHOT_DIALOG_ID", new TextLocalisedClause(z ? R$string.crypto_asset_details_section_investment_holding_auto_earn_enable_success : R$string.crypto_asset_details_section_investment_holding_auto_earn_disable_success, null, null, 14), null, null, null, 28);
    }
}
