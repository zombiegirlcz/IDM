package uoc;

import aw0.o9;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.d8;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f281615c = v.k(10000L, Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT), 50000L, 100000L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PenContributionScreenContract$InputData f281616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f281617b;

    public i(PenContributionScreenContract$InputData inputData, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f281616a = inputData;
        this.f281617b = amountFormatter;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PenContributionScreenContract$InputData penContributionScreenContract$InputData = this.f281616a;
        e eVar = new e(penContributionScreenContract$InputData.f85221a, penContributionScreenContract$InputData.f85222b);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f281604a;
        AmountEditDelegate.Model model = new AmountEditDelegate.Model("contribution-edit-listId", new TextClause(dVar.f115083b.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new bw0.h(this.f281617b.e(dVar), null, domainState.f281605b, null, Boolean.TRUE, false, false, false, false, null, 6100), null, null, null, null, false, new b(dVar.f115083b), null, 1688);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        List listC = u.c(model);
        xi0.b currency = penContributionScreenContract$InputData.f85223c.f115083b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        List list = f281615c;
        ArrayList<dj0.d> arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new dj0.d(((Number) it8.next()).longValue(), currency));
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (dj0.d dVar2 : arrayList) {
            arrayList2.add(new d8(p.a.n(dVar2.f115082a, "suggested-contribution-", "-listId"), new MoneyClause(dVar2, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), dVar2, 28));
        }
        return new f(eVar, listC, arrayList2, domainState.f281605b);
    }
}
