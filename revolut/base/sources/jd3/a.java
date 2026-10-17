package jd3;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import j7b.m;
import java.util.List;
import java.util.Set;
import jcj.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import md3.a;
import nyb.o;
import oqk.g0;
import tof.i1;
import tof.i7;
import tof.q6;
import yhm.r;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f172952b;

    public /* synthetic */ a(c cVar, int i) {
        this.f172951a = i;
        this.f172952b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f172951a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Data revPointsBannerData = (Data) rVar.f314201a;
                List list = (List) rVar.f314202b;
                Data data = (Data) rVar.f314203c;
                c cVar = this.f172952b;
                md3.a aVar = cVar.f;
                Intrinsics.checkNotNullParameter(revPointsBannerData, "revPointsBannerData");
                List list2 = (List) iii.c.f(revPointsBannerData, new md0.c(aVar, 1), new j1(19), new ldj.g(aVar, 26));
                return i2b.a.o(i2b.a.o(list2, list), (List) iii.c.f(data, new n(cVar, 21), new m(20), new jb8.b(cVar, 3)));
            case 1:
                c cVar2 = this.f172952b;
                bd3.a aVar2 = cVar2.f172953a;
                Boolean showBanner = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(showBanner, "showBanner");
                if (!showBanner.booleanValue()) {
                    return zi0.c.j(a.b.C1159a.f204475a);
                }
                w4l.h hVar = w4l.h.f294642c;
                return nim.a.w(kli.a.i(aVar2.c(hVar), ((o) cVar2.f172954b).f(true), rd0.e.c(aVar2.f(hVar), kotlin.coroutines.g.f186406a)), new n(22));
            default:
                i7 transactionFilter = (i7) obj2;
                Intrinsics.checkNotNullParameter(transactionFilter, "transactionFilter");
                return ((g0) this.f172952b.f172955c).d(new Data(new ssi.n(transactionFilter, null, null, u.c(i1.f272794a), new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.cashback_box_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(transactionFilter, null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65518)), null, null, null, null, 998), null, false, 6, null), false);
        }
    }
}
