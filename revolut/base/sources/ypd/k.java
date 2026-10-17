package ypd;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.l0;
import tx0.n0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onh.b f315843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final end.d f315844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pqd.a f315845c;
    public final j9l.a d;

    public k(onh.b chartMapper, end.d destinationUIMapper, pqd.a destinationSubtitleMapper, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(destinationUIMapper, "destinationUIMapper");
        Intrinsics.checkNotNullParameter(destinationSubtitleMapper, "destinationSubtitleMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f315843a = chartMapper;
        this.f315844b = destinationUIMapper;
        this.f315845c = destinationSubtitleMapper;
        this.d = moneyCalculator;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.d;
        xi0.b bVar = dVar.f115083b;
        List list = domainState.f315828a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((IncomeSorterHomeContract$DestinationValue) it8.next()).f87826b);
        }
        dj0.d dVarA = this.d.a(bVar, arrayList, domainState.e);
        if (dVarA == null) {
            dVarA = new dj0.d(0L, dVar.f115083b);
        }
        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = domainState.f315829b;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue2 = (IncomeSorterHomeContract$DestinationValue) obj2;
            IncomeSorterDestinationInfo incomeSorterDestinationInfo = incomeSorterHomeContract$DestinationValue2.f87825a;
            IncomeSorterDestinationInfo incomeSorterDestinationInfo2 = incomeSorterHomeContract$DestinationValue2.f87825a;
            String str = "EXECUTION_DESTINATION_" + incomeSorterDestinationInfo.getId();
            end.d dVar2 = this.f315844b;
            arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(dVar2.b(incomeSorterDestinationInfo2), d8l.d.b(true), null, false, null, false, 60), dmd.e.a(dVar2, incomeSorterDestinationInfo2, dmd.d.ACCOUNT_WITH_CURRENCY, 4), null, 0, this.f315845c.a(incomeSorterHomeContract$DestinationValue2, dVar), null, null, 0, new RowDelegate.Model.c.b(otd.f.c(3, null, null, incomeSorterHomeContract$DestinationValue2.f87826b), null, null, false, 126), false, null, incomeSorterHomeContract$DestinationValue2.equals(incomeSorterHomeContract$DestinationValue), null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536859608));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        List list2 = domainState.f315828a;
        dj0.d dVar3 = domainState.f315830c;
        aim.e eVarG = this.f315843a.g(list2, pyd.c.H(dVar3, dVarA), false, domainState.e, null);
        TextLocalisedClause textLocalisedClause = dVarA.equals(dVar3) ? new TextLocalisedClause(R$string.analytics_income_sorter_execution_animation_top_label_sorted, null, null, 14) : new TextLocalisedClause(R$string.analytics_income_sorter_execution_animation_top_label_sorting, null, null, 14);
        return new d(arrayList2, new c(textLocalisedClause, new l0(textLocalisedClause, new MoneyClause(pyd.c.H(dVar3, dVarA), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, eVarG, n0.ENABLED)));
    }
}
