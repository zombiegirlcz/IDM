package cxi;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.u8;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import svi.g0;
import svi.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Clause textLocalisedClause3;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        y passType = domainState.f109987b;
        int i = domainState.f109986a;
        Intrinsics.checkNotNullParameter(passType, "passType");
        int[] iArr = exi.a.f130451a;
        int i2 = iArr[passType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_checkout_lounge_entries_action, null, null, 14);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_checkout_lounge_guess_entries_action, null, null, 14);
        }
        y passType2 = domainState.f109987b;
        Intrinsics.checkNotNullParameter(passType2, "passType");
        int i3 = iArr[passType2.ordinal()];
        if (i3 == 1 || i3 == 2) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.airport_lounges_entries_selector_entries, null, null, 14);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.airport_lounges_checkout_entries_cell_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause4 = textLocalisedClause2;
        g0 priceBreakdown = domainState.f109988c.f265922b;
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        dj0.d dVar = priceBreakdown.f;
        dj0.d dVar2 = priceBreakdown.e;
        e eVar = dVar != null ? new e(dVar2, dVar) : new e(null, dVar2);
        MoneyClause moneyClauseA = czi.b.a(eVar.f109990b, null, 7);
        dj0.d dVar3 = eVar.f109989a;
        if (dVar3 != null) {
            MoneyClause moneyClauseA2 = czi.b.a(dVar3, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), 5);
            int i5 = R$string.airport_lounges_checkout_entries_each;
            List listK = v.k(moneyClauseA2, moneyClauseA);
            m70.a.t(t0.f186434a);
            textLocalisedClause3 = new TextLocalisedClause(i5, u.c(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), null, 12);
        } else {
            textLocalisedClause3 = moneyClauseA;
        }
        u8 u8Var = new u8("list_id_lounge_entries", textLocalisedClause4, textLocalisedClause3, new NumberClause(i, (NumberClause.Format.Compact) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 2), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_24_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, i > 1, null, 63874);
        yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
        return new g(textLocalisedClause, u.c(u8Var));
    }
}
