package s57;

import akg.n;
import et6.h3;
import et6.l0;
import et6.p1;
import et6.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r10.v;
import vkm.q;
import vkm.y;
import ypg.p;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements o57.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9k.f f260031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.e f260032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.a f260033c;
    public final u0 d;
    public final u57.e e;
    public final gr6.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1 f260034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x57.g f260035h;
    public final v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h3 f260036j;
    public final z57.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y57.e f260037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zjh.i f260038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b67.f f260039n;
    public final c67.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a67.f f260040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w57.d f260041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wwa.b f260042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hia.a f260043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jf1.a f260044t;
    public final bgc.e u;
    public final r10.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a61.a f260045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r10.f f260046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ang.f f260047y;
    public final ppg.b z;

    public m(b9k.f acquiringOrderInteractor, gr6.e freelancerAvailabilityInteractor, gr6.a freelancerAccountDetailsInteractor, u0 freelancerCapabilitiesInteractor, u57.e freelancerCashbackWidgetMapper, gr6.h freelancerCashbackInteractor, p1 freelancerInvoiceInteractor, x57.g freelancerPocketsWidgetMapper, v freelancerSaleChannelAvailabilityInteractor, h3 freelancerSaleTypeAvailabilityInteractor, z57.c freelancerSalesAnalyticsWidgetMapper, y57.e freelancerSalesWidgetMapper, zjh.i freelancerTaxPocketsInteractor, b67.f freelancerToolboxWidgetMapper, c67.d freelancerVatReminderWidgetMapper, a67.f freelancerTaxHubWidgetMapper, w57.d freelancerPerksWidgetMapper, wwa.b inviteCampaignHomeInteractor, hia.a proAnalyticsInteractor, jf1.a proMerchantTogglesInteractor, bgc.e rewardsInteractor, r10.d taxHubCalendarEventsInteractor, a61.a taxHubConfigurationInteractor, r10.f taxHubProfileInteractor, ang.f userInteractor, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCapabilitiesInteractor, "freelancerCapabilitiesInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackWidgetMapper, "freelancerCashbackWidgetMapper");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsWidgetMapper, "freelancerPocketsWidgetMapper");
        Intrinsics.checkNotNullParameter(freelancerSaleChannelAvailabilityInteractor, "freelancerSaleChannelAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerSalesAnalyticsWidgetMapper, "freelancerSalesAnalyticsWidgetMapper");
        Intrinsics.checkNotNullParameter(freelancerSalesWidgetMapper, "freelancerSalesWidgetMapper");
        Intrinsics.checkNotNullParameter(freelancerTaxPocketsInteractor, "freelancerTaxPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerToolboxWidgetMapper, "freelancerToolboxWidgetMapper");
        Intrinsics.checkNotNullParameter(freelancerVatReminderWidgetMapper, "freelancerVatReminderWidgetMapper");
        Intrinsics.checkNotNullParameter(freelancerTaxHubWidgetMapper, "freelancerTaxHubWidgetMapper");
        Intrinsics.checkNotNullParameter(freelancerPerksWidgetMapper, "freelancerPerksWidgetMapper");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(proAnalyticsInteractor, "proAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(taxHubCalendarEventsInteractor, "taxHubCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(taxHubConfigurationInteractor, "taxHubConfigurationInteractor");
        Intrinsics.checkNotNullParameter(taxHubProfileInteractor, "taxHubProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f260031a = acquiringOrderInteractor;
        this.f260032b = freelancerAvailabilityInteractor;
        this.f260033c = freelancerAccountDetailsInteractor;
        this.d = freelancerCapabilitiesInteractor;
        this.e = freelancerCashbackWidgetMapper;
        this.f = freelancerCashbackInteractor;
        this.f260034g = freelancerInvoiceInteractor;
        this.f260035h = freelancerPocketsWidgetMapper;
        this.i = freelancerSaleChannelAvailabilityInteractor;
        this.f260036j = freelancerSaleTypeAvailabilityInteractor;
        this.k = freelancerSalesAnalyticsWidgetMapper;
        this.f260037l = freelancerSalesWidgetMapper;
        this.f260038m = freelancerTaxPocketsInteractor;
        this.f260039n = freelancerToolboxWidgetMapper;
        this.o = freelancerVatReminderWidgetMapper;
        this.f260040p = freelancerTaxHubWidgetMapper;
        this.f260041q = freelancerPerksWidgetMapper;
        this.f260042r = inviteCampaignHomeInteractor;
        this.f260043s = proAnalyticsInteractor;
        this.f260044t = proMerchantTogglesInteractor;
        this.u = rewardsInteractor;
        this.v = taxHubCalendarEventsInteractor;
        this.f260045w = taxHubConfigurationInteractor;
        this.f260046x = taxHubProfileInteractor;
        this.f260047y = userInteractor;
        this.z = vaultsInteractor;
    }

    public static y b(Flow flow, Function1 function1) {
        return rd0.e.e(flow, h0.f322473a, new d(function1, null));
    }

    public final ahe.l a() {
        return new ahe.l(new t38.e(((l0) this.f260032b).m(), 24, mo3.a.g(((et6.g) this.f260033c).e(w4l.h.f294642c), null, new s20.c(22), 1), c.f260011a), 15);
    }

    public final n c() {
        return nim.a.v(rd0.e.b(((p) this.z).f(w4l.h.f294642c, pcd.g.f234858b)), new s4b.e(21));
    }

    public final Flow d() {
        return ((l0) this.f260032b).b("FREELANCER_POCKETS.vat_reminder") ? q.Q(a(), new r3k.c(null, this, 23)) : new go.g(Boolean.FALSE, 2);
    }
}
