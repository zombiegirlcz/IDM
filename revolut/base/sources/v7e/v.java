package v7e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.R$string;
import ip0.jh0;
import ip0.lh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f286623a;

    public v(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f286623a = uiKitResources;
    }

    public static TextLocalisedClause b(SubaccountType subaccountType) {
        if ((subaccountType instanceof SubaccountType.Personal) || (subaccountType instanceof SubaccountType.Joint) || (subaccountType instanceof SubaccountType.Group) || (subaccountType instanceof SubaccountType.Pro) || (subaccountType instanceof SubaccountType.Teen) || (subaccountType instanceof SubaccountType.ProTax)) {
            return new TextLocalisedClause(R$string.vaults_creation_customise_pockets_rev10_title, null, null, 14);
        }
        if (subaccountType instanceof SubaccountType.Junior) {
            return new TextLocalisedClause(R$string.vaults_creation_customise_pockets_junior_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listI;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("NAME_EDIT_DELEGATE_MODEL_ID", new TextClause(domainState.f286591b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.vaults_creation_customise_pockets_rev10_text_input_title, null, null, 14), null, null, null, true, 40, false, true, 0, true, 0, true, false, true, m72.b.u(40), false, false, 0, false, false, null, 989413364, 131071);
        yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp0, 0, 0, 12);
        SubaccountType subaccountType = domainState.f286590a;
        String str = domainState.d;
        jh0 jh0Var = jh0.FLEXBOX;
        if ((subaccountType instanceof SubaccountType.Personal) || (subaccountType instanceof SubaccountType.Joint)) {
            listI = knm.b.i();
        } else if (subaccountType instanceof SubaccountType.Group) {
            listI = zhm.v.k(new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_holidays), "holidays"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_gift), "gift"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_rainy_day), "rainyDays"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_education), "education"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_renovation), "renovation"));
        } else if (subaccountType instanceof SubaccountType.Pro) {
            listI = zhm.v.k(new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_utilities), "renovation"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_bills), "education"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_stock), "gift"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_personal_name_suggestion_rainy_day), "rainyDays"));
        } else if (subaccountType instanceof SubaccountType.ProTax) {
            listI = zhm.v.k(new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.freelancer_tax_pocket_suggested_name_taxes), "renovation"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.freelancer_tax_pocket_suggested_name_vat), "holidays"), new Pair(Integer.valueOf(com.revolut.feature.vaults.R$string.freelancer_tax_pocket_suggested_name_national_insurance), "education"));
        } else {
            if (!(subaccountType instanceof SubaccountType.Junior) && !(subaccountType instanceof SubaccountType.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
            listI = knm.b.i();
        }
        List<Pair> list = listI;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Pair pair : list) {
            int iIntValue = ((Number) pair.f186385a).intValue();
            String str2 = (String) pair.f186386b;
            arrayList.add(new SuggestionsBarDelegate.Suggestion(str2, new TextLocalisedClause(iIntValue, null, null, 14), null, Intrinsics.f(str2, str) ? lh0.ACCENT : lh0.SEMIACCENT, null, false, new l(str2, a10.b.o(iIntValue, null, null, 14, this.f286623a)), null, 372));
        }
        qv0.i[] elements = {model, new nh("ITEM_ID_SUGGESTIONS_BAR", arrayList, null, jh0Var, 0, 0, 0, 0, 0, 32756)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (m) iii.c.f(domainState.e, new v25.k(domainState, this), new v48.d(domainState, this), new tvh.e(kotlin.collections.d.L(elements), this, domainState));
    }
}
