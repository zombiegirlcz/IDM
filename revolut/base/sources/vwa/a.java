package vwa;

import com.revolut.feature.referrals.common.data.impl.network.services.IncentivesService;
import com.revolut.feature.referrals.common.data.impl.network.services.InviteCampaignService;
import com.revolut.feature.referrals.common.data.impl.network.services.InviteFriendsMessagingService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import uwa.q;
import vc.s;
import vtc.p0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f292666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292667b;

    public a(b bVar, int i) {
        this.f292666a = bVar;
        this.f292667b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f292666a;
        ee0.a aVar = bVar.f292668a;
        r9l.a aVar2 = bVar.d;
        nj0.a aVar3 = bVar.f292670c;
        int i = this.f292667b;
        switch (i) {
            case 0:
                return new ne0.d();
            case 1:
                je0.d mapper = aVar.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = bVar.f292669b.b();
                s.j(databaseSessionProvider);
                xe0.f fVarF = aVar.f();
                s.j(fVarF);
                g.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                return xe0.f.f(fVarF, databaseSessionProvider, "INVITE_CAMPAIGN_REFERRALS_FILE", mapper, 4, v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 0)), 32);
            case 2:
                ue0.c cVar = (ue0.c) bVar.k.get();
                InviteCampaignService inviteCampaignService = (InviteCampaignService) bVar.f292674l.get();
                IncentivesService incentivesService = (IncentivesService) bVar.f292675m.get();
                j jVar = (j) bVar.f292673j.get();
                l80.e eVarH = bVar.f.h();
                s.j(eVarH);
                fxa.e inviteStateKeyPartProvider = new fxa.e();
                fxa.d campaignTypeKeyPartProviderImpl = new fxa.d();
                fxa.g sortKeyPartProvider = new fxa.g();
                Intrinsics.checkNotNullParameter(inviteStateKeyPartProvider, "inviteStateKeyPartProvider");
                Intrinsics.checkNotNullParameter(campaignTypeKeyPartProviderImpl, "campaignTypeKeyPartProviderImpl");
                Intrinsics.checkNotNullParameter(sortKeyPartProvider, "sortKeyPartProvider");
                fxa.b bVar2 = new fxa.b();
                mk0.a aVarA = bVar.f292671g.a();
                s.j(aVarA);
                sf0.h hVarB = bVar.f292672h.b();
                s.j(hVarB);
                return new q(cVar, inviteCampaignService, incentivesService, jVar, eVarH, bVar2, aVarA, hVarB);
            case 3:
                ik0.b retrofitFactory = ((nj0.d) aVar3).m();
                s.j(retrofitFactory);
                p9l.a referralsNetworkConfiguration = aVar2.a();
                s.j(referralsNetworkConfiguration);
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(referralsNetworkConfiguration, "referralsNetworkConfiguration");
                Object objCreate = ik0.b.a(retrofitFactory, null, referralsNetworkConfiguration.getHostUrl(), null, null, 29).create(InviteCampaignService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                InviteCampaignService inviteCampaignService2 = (InviteCampaignService) objCreate;
                s.k(inviteCampaignService2);
                return inviteCampaignService2;
            case 4:
                d dVar = bVar.e;
                ik0.b bVarM = ((nj0.d) aVar3).m();
                s.j(bVarM);
                p9l.a aVarA2 = aVar2.a();
                s.j(aVarA2);
                return p0.p(dVar, bVarM, aVarA2);
            case 5:
                return new wwa.b((mwa.b) bVar.f292676n.get());
            case 6:
                return new wwa.f((dxa.e) bVar.f292678q.get());
            case 7:
                return new dxa.e((InviteFriendsMessagingService) bVar.f292677p.get());
            case 8:
                h hVar = bVar.i;
                ek.a aVarD = ((nj0.d) aVar3).d();
                ik0.b bVarM2 = ((nj0.d) aVar3).m();
                s.j(bVarM2);
                p9l.a aVarA3 = aVar2.a();
                s.j(aVarA3);
                return i.a(hVar, aVarD, bVarM2, aVarA3);
            default:
                throw new AssertionError(i);
        }
    }
}
