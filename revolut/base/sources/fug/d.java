package fug;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ck0;
import ip0.ut;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(hel.b bVar) {
        switch (e.f138208a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                return f0.f322471a;
            case 6:
                return v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(R$string.wealth_account_closure_terms_consent_isa_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(R$string.wealth_account_closure_terms_consent_isa_first_point, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(R$string.wealth_account_closure_terms_consent_isa_second_point, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(R$string.wealth_account_closure_terms_consent_isa_third_point, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(R$string.wealth_account_closure_terms_consent_isa_fourth_point, null, null, 14), 4, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(R$string.wealth_account_closure_terms_consent_isa_fifth_point, null, null, 14), 5, false, null, null, 1016));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ArrayList b(hel.b bVar, int i) {
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        int i22;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        int i32 = 0;
        TextDelegate.Model model = new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", textLocalisedClause, false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        int[] iArr = e.f138208a;
        switch (iArr[bVar.ordinal()]) {
            case 1:
            case 2:
                i2 = R$string.wealth_account_closure_consent_first_point_us;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i2 = R$string.wealth_account_closure_consent_first_point;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Pair pair = new Pair("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(i2, null, null, 14));
        switch (iArr[bVar.ordinal()]) {
            case 1:
            case 2:
                i3 = R$string.wealth_account_closure_consent_second_point_us;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i3 = R$string.wealth_account_closure_consent_second_point;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Pair pair2 = new Pair("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(i3, null, null, 14));
        switch (iArr[bVar.ordinal()]) {
            case 1:
            case 2:
                i5 = R$string.wealth_account_closure_consent_third_point_us;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i5 = R$string.wealth_account_closure_consent_third_point;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Pair pair3 = new Pair("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(i5, null, null, 14));
        switch (iArr[bVar.ordinal()]) {
            case 1:
                i6 = R$string.wealth_account_closure_consent_fourth_point_au;
                break;
            case 2:
                i6 = R$string.wealth_account_closure_consent_fourth_point_us;
                break;
            case 3:
                i6 = R$string.wealth_account_closure_consent_fourth_point_eea;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                i6 = R$string.wealth_account_closure_consent_fourth_point;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Pair pair4 = new Pair("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(i6, null, null, 14));
        if (bVar == hel.b.MX) {
            pair4 = null;
        }
        switch (iArr[bVar.ordinal()]) {
            case 1:
            case 2:
                i21 = R$string.wealth_account_closure_consent_fifth_point_us;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i21 = R$string.wealth_account_closure_consent_fifth_point;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Pair pair5 = new Pair("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(i21, null, null, 14));
        Pair pair6 = pair4;
        switch (iArr[bVar.ordinal()]) {
            case 1:
                i22 = R$string.wealth_account_closure_consent_sixth_point_au;
                break;
            case 2:
                i22 = R$string.wealth_account_closure_consent_sixths_point_us;
                break;
            case 3:
                i22 = R$string.wealth_account_closure_consent_sixth_point_eea;
                break;
            case 4:
            case 6:
            case 7:
                i22 = R$string.wealth_account_closure_consent_sixth_point;
                break;
            case 5:
                i22 = R$string.wealth_account_closure_consent_sixth_point_mx;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Pair[] elements = {pair, pair2, pair3, pair6, pair5, new Pair("CLOSURE_CONSENT_SIXTHS_POINT", new TextLocalisedClause(i22, null, null, 14))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = (ArrayList) kotlin.collections.d.L(elements);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        while (i32 < size) {
            Pair pair7 = (Pair) arrayList.get(i32);
            int i33 = i32 + 1;
            arrayList2.add(new ut((String) pair7.f186385a, (TextLocalisedClause) pair7.f186386b, i33, false, null, null, 1016));
            i32 = i33;
        }
        return d0.E0(arrayList2, u.c(model));
    }
}
