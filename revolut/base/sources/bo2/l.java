package bo2;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.TextInputMask;
import fo2.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static koi.j a(String str, String str2, String str3) {
        String str4;
        String strP = p.a.p("[", a0.C("0", 5), "]");
        TextClause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        if (str3 == null) {
            m70.a.c(t0.f186434a);
            str4 = "";
        } else {
            str4 = str3;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause, new TextClause(r.a(strP), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, null, resourceImage, null, null, null, false, null, null, false, false, 2, 0, null, false, false, null, true, null, false, false, false, new TextInputMask(strP), null, 0, -538969120, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        wn2.a aVar = domainState.f17273b;
        CardDigits cardDigits = domainState.f17272a;
        FormData formData = domainState.d;
        wn2.a aVar2 = wn2.a.JOINT;
        eVarB.add(a("ID_MAIN_HOLDER_CARD_DIGITS", aVar == aVar2 ? formData.f63912c : null, cardDigits.f63894a));
        if (aVar == aVar2) {
            eVarB.add(a("ID_JOINT_PEER_HOLDER_CARD_DIGITS", formData.d, cardDigits.f63895b));
        }
        aim.e eVarA = u.a(eVarB);
        int i = m.f17281a[aVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.account_switch_card_details_subtitle, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.account_switch_card_details_joint_subtitle, null, null, 14);
        }
        return new g(eVarA, textLocalisedClause, domainState.f17274c);
    }
}
