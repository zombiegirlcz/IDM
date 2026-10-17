package uwa;

import bxa.y;
import com.revolut.feature.referrals.common.data.api.domain.model.BenefitItem;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteTransactionWidget;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeStatus;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.common.data.impl.network.services.IncentivesService;
import com.revolut.feature.referrals.common.data.impl.network.services.InviteCampaignService;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.w;
import zwa.r;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements mwa.b {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f283589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InviteCampaignService f283590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncentivesService f283591c;
    public final ne0.j d;
    public final l80.e e;
    public final fxa.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mk0.a f283592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f283593h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f283594j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f283595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f283596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x4l.c f283597n;
    public final x4l.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x4l.c f283598p;

    static {
        Intrinsics.checkNotNullParameter("INVITE_DETAILS_CONFETTI", "id");
    }

    public q(ue0.c storage, InviteCampaignService service, IncentivesService incentivesService, ne0.j memoryCache, l80.e dateProvider, fxa.b activeOrPastInvitesKeyProvider, mk0.a personalisationStorage, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(incentivesService, "incentivesService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(activeOrPastInvitesKeyProvider, "activeOrPastInvitesKeyProvider");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f283589a = storage;
        this.f283590b = service;
        this.f283591c = incentivesService;
        this.d = memoryCache;
        this.e = dateProvider;
        this.f = activeOrPastInvitesKeyProvider;
        this.f283592g = personalisationStorage;
        final int i = 0;
        final int i2 = 12;
        final int i3 = 16;
        this.f283593h = new w4l.f(new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 5), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 13), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i5 = 17;
        this.i = new x4l.c(new th6.p(this, continuation, 9), new b(this, 14), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new m(this, continuation, 0), new sne.e(this, continuation, 14));
        final int i6 = 18;
        Function2 function2 = new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        };
        b bVar = new b(this, 15);
        final int i21 = 19;
        Function2 function22 = new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 1;
        this.f283594j = new w4l.f(function2, bVar, function22, new b(this, i22), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i32 = 2;
        Function2 function23 = new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        };
        b bVar2 = new b(this, i32);
        final int i33 = 3;
        Function2 function24 = new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        };
        b bVar3 = new b(this, i33);
        final int i43 = 4;
        this.k = new w4l.f(function23, bVar2, function24, bVar3, new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i59 = 5;
        Function2 function25 = new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        };
        b bVar4 = new b(this, 4);
        final int i66 = 6;
        Function2 function26 = new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        };
        b bVar5 = new b(this, i66);
        final int i74 = 7;
        this.f283595l = new w4l.f(function25, bVar4, function26, bVar5, new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i92 = 8;
        new x4l.c(new o(this, null), new b(this, 7), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new p(this, null), new sne.e(this, continuation, 16));
        final int i96 = 9;
        final int i99 = 10;
        final int i100 = 11;
        this.f283596m = new w4l.f(new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i96) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 8), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i99) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 9), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i100) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i101 = 13;
        this.f283597n = new x4l.c(new th6.p(this, continuation, 11), new b(this, 10), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i101) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new m(this, continuation, 2), new sne.e(this, continuation, 17));
        final int i102 = 14;
        this.o = new x4l.c(new th6.p(this, continuation, 10), new b(this, 11), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i102) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new m(this, continuation, 1), new sne.e(this, continuation, 15));
        final int i103 = 15;
        this.f283598p = new x4l.c(new th6.p(this, continuation, 12), new b(this, 12), new Function2(this) { // from class: uwa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f283569b;

            {
                this.f283569b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i103) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g campaignV4RequestParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams, "campaignV4RequestParams");
                        d0<r> currentCampaignV4 = this.f283569b.f283590b.getCurrentCampaignV4(u1.g(campaignV4RequestParams.f283577a, pwa.l.a()), null);
                        up5.d0 d0Var = new up5.d0(24, new uv1.c(14));
                        currentCampaignV4.getClass();
                        ufm.i iVar = new ufm.i(currentCampaignV4, d0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "activeOrPastInvitesInfo");
                        q qVar = this.f283569b;
                        qVar.f283589a.G(c6d.b.P(activeOrPastInvitesInfo), qVar.f.a(params), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<swa.b> allInvites = this.f283569b.f283590b.getAllInvites(true, u1.g(params2.f283573a, pwa.l.a()));
                        up5.d0 d0Var2 = new up5.d0(25, new uv1.c(15));
                        allInvites.getClass();
                        ufm.i iVar2 = new ufm.i(allInvites, d0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params3 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo2, "activeOrPastInvitesInfo");
                        this.f283569b.d.f(q.f(params3), activeOrPastInvitesInfo2);
                        return Unit.f186387a;
                    case 4:
                        e params4 = (e) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo3, "activeOrPastInvitesInfo");
                        this.f283569b.f283589a.G(c6d.b.P(activeOrPastInvitesInfo3), q.f(params4), z.d(o0.b(bxa.c.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params5 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<swa.a> inviteDetails = this.f283569b.f283590b.getInviteDetails(params5.f283578a, true);
                        up5.d0 d0Var3 = new up5.d0(23, new uv1.c(18));
                        inviteDetails.getClass();
                        ufm.i iVar3 = new ufm.i(inviteDetails, d0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        i params6 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails, "activeOrPastInvitesDetails");
                        this.f283569b.d.f(q.n(params6), activeOrPastInvitesDetails);
                        return Unit.f186387a;
                    case 7:
                        i params7 = (i) obj2;
                        ActiveOrPastInviteeDetails activeOrPastInvitesDetails2 = (ActiveOrPastInviteeDetails) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesDetails2, "activeOrPastInvitesDetails");
                        this.f283569b.f283589a.G(c6d.b.O(activeOrPastInvitesDetails2), q.n(params7), z.d(o0.b(bxa.b.class)));
                        return Unit.f186387a;
                    case 8:
                        pwa.n campaignType = (pwa.n) obj2;
                        InviteeStatus status = (InviteeStatus) obj3;
                        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f283569b.d.f(q.j(campaignType), status);
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        pwa.n referralCampaignType = (pwa.n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(referralCampaignType, "referralCampaignType");
                        d0<zwa.d> referralBenefits = this.f283569b.f283590b.getReferralBenefits(u1.g(referralCampaignType, pwa.l.a()));
                        up5.d0 d0Var4 = new up5.d0(26, new uv1.c(16));
                        referralBenefits.getClass();
                        ufm.i iVar4 = new ufm.i(referralBenefits, d0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        pwa.n referralCampaignType2 = (pwa.n) obj2;
                        owa.b benefits = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType2, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        this.f283569b.d.f(q.h(referralCampaignType2), benefits);
                        return Unit.f186387a;
                    case 11:
                        pwa.n referralCampaignType3 = (pwa.n) obj2;
                        owa.b benefits2 = (owa.b) obj3;
                        Intrinsics.checkNotNullParameter(referralCampaignType3, "referralCampaignType");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        ue0.c cVar = this.f283569b.f283589a;
                        String strH = q.h(referralCampaignType3);
                        Intrinsics.checkNotNullParameter(benefits2, "<this>");
                        ArrayList<BenefitItem> arrayList2 = benefits2.f230433a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (BenefitItem benefitItem : arrayList2) {
                            Intrinsics.checkNotNullParameter(benefitItem, "<this>");
                            arrayList3.add(new bxa.f(u1.g(benefitItem.f81685a, a.f283564b), benefitItem.f81686b, benefitItem.f81687c));
                        }
                        cVar.G(new bxa.g(arrayList3), strH, z.d(o0.b(bxa.g.class)));
                        return Unit.f186387a;
                    case 12:
                        g campaignV4RequestParams2 = (g) obj2;
                        ReferralCampaignV4 value = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams2, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f283569b.d;
                        campaignV4RequestParams2.getClass();
                        jVar.f(q.g(null, campaignV4RequestParams2.a()), value);
                        return Unit.f186387a;
                    case 13:
                        j params8 = (j) obj2;
                        pwa.k page = (pwa.k) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        this.f283569b.d.f(q.k(params8), page);
                        return Unit.f186387a;
                    case 14:
                        pwa.n campaignType2 = (pwa.n) obj2;
                        pwa.g summary = (pwa.g) obj3;
                        Intrinsics.checkNotNullParameter(campaignType2, "campaignType");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f283569b.d.f(q.i(campaignType2), summary);
                        return Unit.f186387a;
                    case 15:
                        k params9 = (k) obj2;
                        InviteTransactionWidget widget = (InviteTransactionWidget) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f283569b.d.f(q.m(params9), widget);
                        return Unit.f186387a;
                    case 16:
                        g campaignV4RequestParams3 = (g) obj2;
                        ReferralCampaignV4 campaign = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignV4RequestParams3, "campaignV4RequestParams");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        ue0.c cVar2 = this.f283569b.f283589a;
                        campaignV4RequestParams3.getClass();
                        cVar2.G(cxa.b.b(campaign), q.g(null, campaignV4RequestParams3.a()), z.d(o0.b(y.class)));
                        return Unit.f186387a;
                    case 17:
                        f campaignRequestParams = (f) obj2;
                        ReferralCampaignV4 value2 = (ReferralCampaignV4) obj3;
                        Intrinsics.checkNotNullParameter(campaignRequestParams, "campaignRequestParams");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f283569b.d.f(q.l(campaignRequestParams), value2);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        d params10 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        InviteCampaignService inviteCampaignService = this.f283569b.f283590b;
                        String strA = params10.f283570a.a();
                        String strG = u1.g(params10.f283571b, pwa.l.a());
                        List list = params10.f283572c;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                String strH2 = u1.h((pwa.d) it8.next(), a.a());
                                if (strH2 != null) {
                                    arrayList.add(strH2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        pwa.h hVar = params10.d;
                        d0<swa.b> activeOrPastInvites = inviteCampaignService.getActiveOrPastInvites(strA, strG, true, arrayList, hVar != null ? u1.g(hVar, axa.b.f10912b) : null);
                        up5.d0 d0Var5 = new up5.d0(27, new uv1.c(17));
                        activeOrPastInvites.getClass();
                        ufm.i iVar5 = new ufm.i(activeOrPastInvites, d0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        d params11 = (d) obj2;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = (ActiveOrPastInvitesInfo) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo4, "activeOrPastInvitesInfo");
                        q qVar2 = this.f283569b;
                        qVar2.d.f(qVar2.f.a(params11), activeOrPastInvitesInfo4);
                        return Unit.f186387a;
                }
            }
        }, new m(this, continuation, 3), new sne.e(this, continuation, 18));
    }

    public static final void d(q qVar, String str) {
        qVar.getClass();
        i iVar = new i(str);
        String strN = n(iVar);
        ActiveOrPastInviteeDetails activeOrPastInviteeDetailsF = (ActiveOrPastInviteeDetails) qVar.d.get(strN);
        if (activeOrPastInviteeDetailsF == null) {
            bxa.b bVar = (bxa.b) j6.a.k(bxa.b.class, qVar.f283589a, strN);
            activeOrPastInviteeDetailsF = bVar != null ? c6d.b.F(bVar) : null;
        }
        if (activeOrPastInviteeDetailsF != null) {
            qVar.f283595l.j(iVar, ActiveOrPastInviteeDetails.a(activeOrPastInviteeDetailsF));
        }
    }

    public static String f(e eVar) {
        String str;
        switch (l.f283584a[eVar.a().ordinal()]) {
            case 1:
                str = "";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                str = "_" + eVar.a();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return p.a.p("ALL_INVITES_KEY", str, "_redesigned");
    }

    public static String g(Integer num, pwa.n nVar) {
        String str;
        if (num == null) {
            str = "";
        } else {
            str = "_" + num;
        }
        return l.f283584a[nVar.ordinal()] == 1 ? "REF_CAMPAIGN_PARAMS_V4_KEY" : p.a.p("REF_CAMPAIGN_PARAMS_V4_KEY_", u1.g(nVar, pwa.l.a()), str);
    }

    public static String h(pwa.n nVar) {
        return j6.a.q("BENEFITS_KEY", l.f283584a[nVar.ordinal()] == 1 ? "" : "_".concat(u1.g(nVar, pwa.l.a())));
    }

    public static String i(pwa.n nVar) {
        return "INVITE_SUMMARY_".concat(u1.g(nVar, pwa.l.a()));
    }

    public static String j(pwa.n nVar) {
        return "INVITEE_STATUS_KEY_".concat(u1.g(nVar, pwa.l.a()));
    }

    public static String k(j jVar) {
        String strG = u1.g(jVar.a(), pwa.l.a());
        String strB = jVar.b();
        if (strB == null) {
            strB = "initial";
        }
        return a0.d.s("PAGINATED_INVITES_", strG, "_", strB);
    }

    public static String l(f fVar) {
        String strConcat;
        fVar.getClass();
        String strB = fVar.b();
        if (strB == null || (strConcat = "_youth_".concat(strB)) == null) {
            strConcat = "";
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(g(fVar.a(), fVar.c()), "_v_5", strConcat);
    }

    public static String m(k kVar) {
        return a0.d.s("TRANSACTION_WIDGET_", u1.g(kVar.b(), pwa.l.a()), "_", kVar.a());
    }

    public static String n(i iVar) {
        return p.a.p("INVITE_DETAILS_", iVar.a(), "_true");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(pwa.n r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof uwa.n
            if (r0 == 0) goto L13
            r0 = r6
            uwa.n r0 = (uwa.n) r0
            int r1 = r0.f283587x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283587x = r1
            goto L18
        L13:
            uwa.n r0 = new uwa.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283587x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            pwa.n r5 = r0.u
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            goto L6b
        L29:
            r6 = move-exception
            goto L52
        L2b:
            r5 = move-exception
            goto L6e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r6)
            xwa.a r6 = new xwa.a
            java.util.Map r2 = pwa.l.a()
            java.lang.String r2 = le.u1.g(r5, r2)
            r6.<init>(r2)
            com.revolut.feature.referrals.common.data.impl.network.services.IncentivesService r2 = r4.f283591c     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            r0.u = r5     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f283587x = r3     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r2.forceCompleteStep(r6, r0)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            if (r5 != r1) goto L6b
            return r1
        L52:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Force complete step failed for campaign "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "InviteCampaignRepositoryImpl"
            rd0.d.a(r1, r2, r5, r6, r0)
        L6b:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L6e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uwa.q.e(pwa.n, gim.c):java.lang.Object");
    }
}
