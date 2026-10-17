package yaa;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentification;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(String str, String str2) {
        int i;
        int iHashCode = str.hashCode();
        if (iHashCode == -1039565793) {
            if (str.equals("BRAZIL_ACCOUNT_TYPE")) {
                i = R$string.pix_trusted_new_review_account_type;
                return b(new TextLocalisedClause(i, null, null, 14), "ACCOUNT_FIELD_ITEM_ID_PREFIX_".concat(str), str2);
            }
            throw new IllegalArgumentException("Key is not supported for pix add trusted account");
        }
        if (iHashCode == 265463027) {
            if (str.equals("BRAZIL_BRANCH_NUMBER")) {
                i = R$string.pix_trusted_new_review_branch;
                return b(new TextLocalisedClause(i, null, null, 14), "ACCOUNT_FIELD_ITEM_ID_PREFIX_".concat(str), str2);
            }
            throw new IllegalArgumentException("Key is not supported for pix add trusted account");
        }
        if (iHashCode == 1176976827 && str.equals("ACCOUNT_NUMBER")) {
            i = R$string.pix_trusted_new_review_account_number;
            return b(new TextLocalisedClause(i, null, null, 14), "ACCOUNT_FIELD_ITEM_ID_PREFIX_".concat(str), str2);
        }
        throw new IllegalArgumentException("Key is not supported for pix add trusted account");
    }

    public static CellDetailsDelegate.Model b(Clause clause, String str, String str2) {
        return new CellDetailsDelegate.Model(str, clause, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f5j.a aVar = domainState.f311998a;
        ArrayList arrayList = new ArrayList();
        Map map = aVar.u;
        if (map != null) {
            String str = (String) map.get("BRAZIL_BRANCH_NUMBER");
            if (str != null) {
                arrayList.add(a("BRAZIL_BRANCH_NUMBER", str));
            }
            String str2 = (String) map.get("ACCOUNT_NUMBER");
            if (str2 != null) {
                arrayList.add(a("ACCOUNT_NUMBER", str2));
            }
            String str3 = (String) map.get("BRAZIL_ACCOUNT_TYPE");
            if (str3 != null) {
                arrayList.add(a("BRAZIL_ACCOUNT_TYPE", str3));
            }
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_transaction_review_item_title_to, null, null, 14);
        int i = R$drawable.uikit_icn_24_bank;
        Float fValueOf = Float.valueOf(16.0f);
        CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model("RECIPIENT_LIST_ITEM_ID", textLocalisedClause, 0, null, new CompositeClause(v.k(new ImageClause(i, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16), new TextClause(n61.j.c(aVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, false, null, null, 0, 0, 32736);
        BeneficiaryIdentification beneficiaryIdentification = aVar.B;
        qv0.i[] elements = {model, beneficiaryIdentification != null ? b(new TextClause(a0.D(beneficiaryIdentification.f99773a.name(), "BR_", "", false), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "IDENTIFICATION_LIST_ITEM_ID", beneficiaryIdentification.f99774b) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListE0 = d0.E0(arrayList, kotlin.collections.d.L(elements));
        yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        return new f(arrayListE0);
    }
}
