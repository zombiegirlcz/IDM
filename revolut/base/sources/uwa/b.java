package uwa;

import bxa.y;
import com.revolut.feature.referrals.common.data.api.domain.model.BenefitItem;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteTransactionWidget;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeStatus;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f283567b;

    public /* synthetic */ b(q qVar, int i) {
        this.f283566a = i;
        this.f283567b = qVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f283566a;
        q qVar = this.f283567b;
        switch (i) {
            case 0:
                ReferralCampaignV4 campaign = (ReferralCampaignV4) obj2;
                Intrinsics.checkNotNullParameter(campaign, "campaign");
                Instant fromInstant = ((l80.f) qVar.e).b();
                Object obj3 = pwa.l.f240369a;
                Intrinsics.checkNotNullParameter(campaign, "<this>");
                Intrinsics.checkNotNullParameter(fromInstant, "fromInstant");
                Instant instant = campaign.f81759m;
                return Boolean.valueOf((instant != null ? Math.max(0L, Duration.between(fromInstant, instant).toMinutes()) : 0L) <= 0);
            case 1:
                d params = (d) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                bxa.c cVar = (bxa.c) j6.a.k(bxa.c.class, qVar.f283589a, qVar.f.a(params));
                if (cVar != null) {
                    return c6d.b.G(cVar);
                }
                return null;
            case 2:
                e params2 = (e) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (ActiveOrPastInvitesInfo) qVar.d.get(q.f(params2));
            case 3:
                e params3 = (e) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                bxa.c cVar2 = (bxa.c) j6.a.k(bxa.c.class, qVar.f283589a, q.f(params3));
                if (cVar2 != null) {
                    return c6d.b.G(cVar2);
                }
                return null;
            case 4:
                i params4 = (i) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                return (ActiveOrPastInviteeDetails) qVar.d.get(q.n(params4));
            case 5:
                g campaignV4RequestParams = (g) obj2;
                Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                ne0.j jVar = qVar.d;
                campaignV4RequestParams.getClass();
                return (ReferralCampaignV4) jVar.get(q.g(null, campaignV4RequestParams.a()));
            case 6:
                i params5 = (i) obj2;
                Intrinsics.checkNotNullParameter(params5, "params");
                bxa.b bVar = (bxa.b) j6.a.k(bxa.b.class, qVar.f283589a, q.n(params5));
                if (bVar != null) {
                    return c6d.b.F(bVar);
                }
                return null;
            case 7:
                pwa.n campaignType = (pwa.n) obj2;
                Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                return (InviteeStatus) qVar.d.get(q.j(campaignType));
            case 8:
                pwa.n referralCampaignType = (pwa.n) obj2;
                Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                return (owa.b) qVar.d.get(q.h(referralCampaignType));
            case 9:
                pwa.n referralCampaignType2 = (pwa.n) obj2;
                Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                bxa.g gVar = (bxa.g) j6.a.k(bxa.g.class, qVar.f283589a, q.h(referralCampaignType2));
                if (gVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                List<bxa.f> benefits = gVar.getBenefits();
                ArrayList arrayList = new ArrayList(w.t(benefits, 10));
                for (bxa.f fVar : benefits) {
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    arrayList.add(new BenefitItem((owa.a) u1.u(fVar.getCode(), a.f283564b), fVar.getTitle(), fVar.getDescription()));
                }
                return new owa.b(arrayList);
            case 10:
                j params6 = (j) obj2;
                Intrinsics.checkNotNullParameter(params6, "params");
                return (pwa.k) qVar.d.get(q.k(params6));
            case 11:
                pwa.n campaignType2 = (pwa.n) obj2;
                Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                return (pwa.g) qVar.d.get(q.i(campaignType2));
            case 12:
                k params7 = (k) obj2;
                Intrinsics.checkNotNullParameter(params7, "params");
                return (InviteTransactionWidget) qVar.d.get(q.m(params7));
            case 13:
                g campaignV4RequestParams2 = (g) obj2;
                Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                ue0.c cVar3 = qVar.f283589a;
                campaignV4RequestParams2.getClass();
                y yVar = (y) j6.a.k(y.class, cVar3, q.g(null, campaignV4RequestParams2.a()));
                if (yVar != null) {
                    return cxa.b.a(yVar);
                }
                return null;
            case 14:
                f campaignRequestParams = (f) obj2;
                Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                return (ReferralCampaignV4) qVar.d.get(q.l(campaignRequestParams));
            default:
                d params8 = (d) obj2;
                Intrinsics.checkNotNullParameter(params8, "params");
                return (ActiveOrPastInvitesInfo) qVar.d.get(qVar.f.a(params8));
        }
    }
}
