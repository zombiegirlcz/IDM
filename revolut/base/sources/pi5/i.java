package pi5;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.onboarding.impl.R$string;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreenContract$Parcel$Link;
import ip0.ak0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // cli.n
    public final o c(j jVar) {
        Iterable iterable;
        Iterable iterable2;
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        int i;
        ?? r142;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new g(R$string.crypto_fca_onboarding_learn_v2_disclaimer_1_title, R$string.crypto_fca_onboarding_learn_v2_disclaimer_1_description), new g(R$string.crypto_fca_onboarding_learn_v2_disclaimer_2_title, R$string.crypto_fca_onboarding_learn_v2_disclaimer_2_description, v.k(new h("FSCS_LINK_CLICK_LIST_ID", R$string.crypto_fca_onboarding_learn_v2_disclaimer_2_link, d.FSCS), new h("FOS_LINK_CLICK_LIST_ID", R$string.crypto_fca_onboarding_learn_v2_disclaimer_2_link, d.FOS))), new g(R$string.crypto_fca_onboarding_learn_v2_disclaimer_3_title, R$string.crypto_fca_onboarding_learn_v2_disclaimer_3_description), new g(R$string.crypto_fca_onboarding_learn_v2_disclaimer_4_title, R$string.crypto_fca_onboarding_learn_v2_disclaimer_4_description), new g(R$string.crypto_fca_onboarding_learn_v2_disclaimer_5_title, R$string.crypto_fca_onboarding_learn_v2_disclaimer_5_description, u.c(new h("FCA_INVEST_LINK_CLICK_LIST_ID", R$string.crypto_fca_onboarding_learn_v2_disclaimer_5_link, d.FCA_INVEST))), new g(R$string.crypto_fca_onboarding_learn_v2_disclaimer_6_title, R$string.crypto_fca_onboarding_learn_v2_disclaimer_6_description, u.c(new h("CRYPTO_ASSETS_LINK_CLICK_LIST_ID", R$string.crypto_fca_onboarding_learn_v2_disclaimer_6_link, d.RISK_SUMMARY))));
        Data data = domainState.f236422a;
        if (data == null || (iterable = (List) iii.c.f(data, new phc.e(18), new pch.f(21), new p2b.a(this, 9))) == null) {
            iterable = f0.f322471a;
        }
        Object obj2 = null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_fca_onboarding_learn_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.crypto_fca_onboarding_learn_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.crypto_fca_onboarding_learn_secondary_subtitle, null, null, 14);
        List list = listK;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        int i3 = 0;
        while (it9.hasNext()) {
            Object next = it9.next();
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            g gVar = (g) next;
            List list2 = gVar.f236431c;
            int i6 = gVar.f236430b;
            if (list2.isEmpty()) {
                iterable2 = iterable;
                it8 = it9;
                ?? r143 = obj2;
                i = 14;
                textLocalisedClause = new TextLocalisedClause(i6, r143, r143, 14);
                r142 = r143;
            } else {
                List<h> list3 = gVar.f236431c;
                ArrayList arrayList2 = new ArrayList(w.t(list3, i2));
                for (h hVar : list3) {
                    arrayList2.add(new TextLocalisedClause(hVar.f236433b, null, new Click(28, (Integer) null, (Object) new CryptoFcaLearnScreenContract$Parcel$Link(hVar.f236434c), hVar.f236432a, false), 10));
                    obj2 = null;
                    it9 = it9;
                    iterable = iterable;
                }
                iterable2 = iterable;
                it8 = it9;
                ?? r144 = obj2;
                textLocalisedClause = new TextLocalisedClause(i6, arrayList2, r144, 12);
                i = 14;
                r142 = r144;
            }
            RowDelegate.Model model = new RowDelegate.Model(a0.d.n("LEARN_ROW_LIST_ID_", i3), null, new TextLocalisedClause(gVar.f236429a, r142, r142, i), null, 0, textLocalisedClause, null, null, Integer.MAX_VALUE, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868570);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i3 = i5;
            it9 = it8;
            iterable = iterable2;
            obj2 = null;
            i2 = 10;
        }
        return new e(textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, d0.F0(new TextDelegate.Model("FOOTER_LIST_ID", new TextLocalisedClause(R$string.crypto_fca_onboarding_learn_footer_description, v.k(new TextLocalisedClause(R$string.crypto_fca_onboarding_learn_footer_link_fca_website, null, new Click(28, (Integer) null, (Object) new CryptoFcaLearnScreenContract$Parcel$Link(d.FCA_QUESTIONS), "FCA_QUESTIONS_LINK_CLICK_LIST_ID", false), 10), new TextLocalisedClause(R$string.crypto_fca_onboarding_learn_footer_link_fca_website, null, new Click(28, (Integer) null, (Object) new CryptoFcaLearnScreenContract$Parcel$Link(d.FCA_CRYPTO_BASICS), "FCA_CRYPTO_BASIC_LINK_CLICK_LIST_ID", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2032), d0.E0(iterable, arrayList)));
    }
}
