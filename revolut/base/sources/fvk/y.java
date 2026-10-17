package fvk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vrl.i0;
import z0h.q1;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3h.e f138478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4h.h f138479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vsk.h f138480c;
    public final uvl.a d;
    public final e3h.f e;
    public final atk.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final btk.o f138481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q4h.g f138482h;
    public final fsl.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dtk.a f138483j;
    public final ctk.t k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jtk.l f138484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q1 f138485m;

    public y(n3h.e automationsWidgetMapper, e4h.h etfExposureOverviewMapper, vsk.h etfVariantsWidgetMapper, uvl.a freeTradesIncentiveMapper, e3h.f historicalChartMapper, atk.a investmentNoticeWidgetMapper, btk.o investmentPlanMapper, q4h.g investmentsWidgetMapper, fsl.k investOrdersWidgetMapper, dtk.a keyStatsMapper, ctk.t similarToWidgetMapper, jtk.l warningGroupMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(automationsWidgetMapper, "automationsWidgetMapper");
        Intrinsics.checkNotNullParameter(etfExposureOverviewMapper, "etfExposureOverviewMapper");
        Intrinsics.checkNotNullParameter(etfVariantsWidgetMapper, "etfVariantsWidgetMapper");
        Intrinsics.checkNotNullParameter(freeTradesIncentiveMapper, "freeTradesIncentiveMapper");
        Intrinsics.checkNotNullParameter(historicalChartMapper, "historicalChartMapper");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetMapper, "investmentNoticeWidgetMapper");
        Intrinsics.checkNotNullParameter(investmentPlanMapper, "investmentPlanMapper");
        Intrinsics.checkNotNullParameter(investmentsWidgetMapper, "investmentsWidgetMapper");
        Intrinsics.checkNotNullParameter(investOrdersWidgetMapper, "investOrdersWidgetMapper");
        Intrinsics.checkNotNullParameter(keyStatsMapper, "keyStatsMapper");
        Intrinsics.checkNotNullParameter(similarToWidgetMapper, "similarToWidgetMapper");
        Intrinsics.checkNotNullParameter(warningGroupMapper, "warningGroupMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f138478a = automationsWidgetMapper;
        this.f138479b = etfExposureOverviewMapper;
        this.f138480c = etfVariantsWidgetMapper;
        this.d = freeTradesIncentiveMapper;
        this.e = historicalChartMapper;
        this.f = investmentNoticeWidgetMapper;
        this.f138481g = investmentPlanMapper;
        this.f138482h = investmentsWidgetMapper;
        this.i = investOrdersWidgetMapper;
        this.f138483j = keyStatsMapper;
        this.k = similarToWidgetMapper;
        this.f138484l = warningGroupMapper;
        this.f138485m = wealthDisclaimersMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        List list2;
        List list3;
        char c2;
        List list4;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listA = this.f138484l.a(domainState.f138448n);
        List listA2 = this.e.a(domainState.f138440a);
        List list5 = domainState.f138441b;
        List listA3 = this.f.a(domainState.f138442c);
        List listA4 = this.d.a(domainState.k);
        btk.d domainState2 = domainState.d;
        Intrinsics.checkNotNullParameter(domainState2, "domainState");
        Data data = domainState2.f18627a;
        List list6 = data != null ? (List) iii.c.f(data, new bt9.t(2), new bn4.y(21), new b0c.a(this.f138481g, 15)) : null;
        if (list6 == null) {
            list6 = f0.f322471a;
        }
        List listA5 = this.f138482h.a(domainState.e);
        List listB = ((fsl.u) this.i).b(domainState, new fsl.j(null, 3));
        List listA6 = this.f138478a.a(domainState);
        dtk.c cVar = (dtk.c) domainState.f138443g.getContent();
        List listA7 = cVar != null ? this.f138483j.a(cVar) : null;
        List listA8 = this.f138479b.a(domainState.f138444h);
        List list7 = domainState.f138446l;
        List list8 = domainState.f;
        vsk.g state = domainState.i;
        List list9 = list6;
        Intrinsics.checkNotNullParameter(state, "state");
        Data data2 = state.f291843a;
        if (data2 != null) {
            c2 = 3;
            list = listA2;
            list2 = list5;
            list3 = listA3;
            list4 = (List) iii.c.f(data2, new i0(3), new vo8.t(22), new vjh.c(this.f138480c, 7));
        } else {
            list = listA2;
            list2 = list5;
            list3 = listA3;
            c2 = 3;
            list4 = null;
        }
        if (list4 == null) {
            list4 = f0.f322471a;
        }
        List list10 = domainState.f138447m;
        List listA9 = this.k.a(domainState.f138445j);
        List list11 = domainState.f138453t;
        List listB2 = ((aah.m) this.f138485m).b(domainState.o);
        List[] elements = new List[18];
        elements[0] = listA;
        elements[1] = list;
        elements[2] = list2;
        elements[c2] = list3;
        elements[4] = listA4;
        elements[5] = list9;
        elements[6] = listA5;
        elements[7] = listB;
        elements[8] = listA6;
        elements[9] = listA7;
        elements[10] = listA8;
        elements[11] = list7;
        elements[12] = list8;
        elements[13] = list4;
        elements[14] = list10;
        elements[15] = listA9;
        elements[16] = list11;
        elements[17] = listB2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new n(zhm.w.u(kotlin.collections.d.L(elements)));
    }
}
