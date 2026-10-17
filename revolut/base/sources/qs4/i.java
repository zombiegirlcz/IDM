package qs4;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationDiscount;
import com.youTransactor.uCube.rpc.Constants;
import ip0.b50;
import ip0.c50;
import ip0.f50;
import ip0.h50;
import ip0.j50;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = domainState.f248747b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            CreditCardInstalmentAnticipationDiscount creditCardInstalmentAnticipationDiscount = (CreditCardInstalmentAnticipationDiscount) obj2;
            LocalDate localDate = domainState.f248746a;
            b50 b50Var = c50.Companion;
            int size = domainState.f248747b.size();
            b50Var.getClass();
            c50 c50VarA = b50.a(i, size);
            boolean z = i == 0;
            String strN = a0.d.n("id_credit_card_anticipation_prepay_item_", i);
            List listK = v.k(sx4.f.b(3, null, null, creditCardInstalmentAnticipationDiscount.f), sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), null, creditCardInstalmentAnticipationDiscount.e));
            t0 t0Var = t0.f186434a;
            m70.a.t(t0Var);
            CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            d dVar = domainState;
            List listK2 = v.k(sx4.g.b(localDate, new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254)), sx4.g.b(creditCardInstalmentAnticipationDiscount.f68780c, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), true, null, false, null, Constants.TAG_FC_SPEED_MODE)));
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            arrayList2.add(new ProgressStepVerticalV2Delegate.Model(strN, compositeClause, new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), c50VarA == c50.LAST ? new f50(j50.NORMAL, c50VarA, false) : new h50(j50.NORMAL, c50VarA), false, null, z ? R$attr.uikit_dp12 : R$attr.uikit_dp4, 0, 0, null, false, false, 32624));
            i = i2;
            domainState = dVar;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new g(arrayList2);
    }
}
