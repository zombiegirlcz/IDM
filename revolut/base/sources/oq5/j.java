package oq5;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import ip0.iq;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        oq5.a domainState = (oq5.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        InputTextDelegate.Model model = new InputTextDelegate.Model("ADDRESS_HOSTING_ADD_PROVIDER_NAME_INPUT_ID", new TextClause(domainState.f227741a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.crypto_withdrawals_screen_add_address_hosting_input_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, true, false, false, null, 0, null, null, false, true, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -604241928, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        eVarB.add(new ListSubheaderDelegate.Model("ADDRESS_HOSTING_ADD_PROVIDER_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_withdrawals_screen_add_address_hosting_wallet_type_subheader, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262114));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_add_address_hosting_wallet_type_wallet, null, null, 14);
        String str = domainState.f227742b;
        boolean zF = Intrinsics.f(str, "ADDRESS_HOSTING_ADD_PROVIDER_TYPE_WALLET_ID");
        iq iqVar = iq.RADIO_BUTTON;
        List listK = v.k(new InputChecklistDelegate.Model("ADDRESS_HOSTING_ADD_PROVIDER_TYPE_WALLET_ID", textLocalisedClause, zF, false, null, iqVar, null, null, null, null, 0, 0, 0, 524248), new InputChecklistDelegate.Model("ADDRESS_HOSTING_ADD_PROVIDER_TYPE_EXCHANGE_ID", new TextLocalisedClause(R$string.crypto_withdrawals_screen_add_address_hosting_wallet_type_exchange, null, null, 14), Intrinsics.f(str, "ADDRESS_HOSTING_ADD_PROVIDER_TYPE_EXCHANGE_ID"), false, null, iqVar, null, null, null, null, 0, 0, 0, 524248));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new d(u.a(eVarB), (d0.W(str) || d0.W(domainState.f227741a)) ? false : true);
    }
}
