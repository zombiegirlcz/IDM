package gq5;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoBeneficiaryDetailsScreenContract$InputData f145580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq5.c f145581b;

    public n(CryptoBeneficiaryDetailsScreenContract$InputData inputData, iq5.c itemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f145580a = inputData;
        this.f145581b = itemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        String str;
        String str2;
        String strA;
        String str3;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f145568a, new gn.a(29), new gp3.n(7), new fyg.b(this, domainState, 22));
        CryptoAddress cryptoAddress = (CryptoAddress) domainState.f145568a.getContent();
        lo5.g gVar = this.f145580a.f71133b;
        Clause textLocalisedClause = null;
        ko5.a aVarD = cryptoAddress != null ? cryptoAddress.d(6, false) : null;
        if (aVarD == null || (str3 = aVarD.f186223a) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = str3;
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (cryptoAddress != null && cryptoAddress.f71062g == ko5.c.ACTIVE) {
            if (cryptoAddress.f71065l == null && gVar == lo5.g.DEFAULT) {
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_exclamation_mark, new ImageClauseTint.Color(R$attr.uikit_colorOrange), (Float) null, (Float) null, 28);
                m70.a.t(t0.f186434a);
                textLocalisedClause = new CompositeClause(v.k(imageClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_action_required_title, null, new Click(30, (Integer) null, (Object) null, "LABEL_CLAUSE_ID", false), 10)), null, null, null, 14);
            } else {
                textLocalisedClause = new TextLocalisedClause(cryptoAddress.e != null ? R$string.crypto_withdrawals_screen_address_details_change_label_title : R$string.crypto_withdrawals_screen_address_details_add_label_title, null, new Click(30, (Integer) null, (Object) null, "LABEL_CLAUSE_ID", false), 10);
            }
        }
        if (aVarD == null || (strA = aVarD.a()) == null) {
            m70.a.c(t0.f186434a);
            str2 = "";
        } else {
            str2 = strA;
        }
        return new h(list, new f(textClause, textLocalisedClause, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str2, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063)));
    }
}
