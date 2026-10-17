package qoh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import poh.j;
import poh.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {
    @Override // poh.j
    public final poh.i a(zel.f instrumentGroup) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        int[] iArr = a.f248211a;
        int i = iArr[instrumentGroup.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_most_traded_title, null, null, 14);
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_most_traded_title, null, null, 14);
        }
        int i2 = iArr[instrumentGroup.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_margin_most_traded_description, null, null, 14);
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_most_traded_stocks_description_v2, null, null, 14);
        }
        return new poh.i(textLocalisedClause, textLocalisedClause2, v.k(poh.h.f237998a, i.f248218a, s.f238010a));
    }
}
