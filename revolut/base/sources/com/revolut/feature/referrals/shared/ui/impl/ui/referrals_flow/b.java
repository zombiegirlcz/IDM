package com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InviteDetailsCampaignType;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import wya.j;
import wya.k;
import wya.l;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ l u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yki.b f81942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ReferralsFlowContract$Step f81943x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, e eVar, yki.b bVar, ReferralsFlowContract$Step referralsFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
        this.v = eVar;
        this.f81942w = bVar;
        this.f81943x = referralsFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, this.f81942w, this.f81943x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = this.u;
        boolean z = lVar instanceof k;
        e eVar = this.v;
        ReferralsFlowContract$Step referralsFlowContract$Step = this.f81943x;
        if (z) {
            ReferralsTroubleshooterTopLevelScreenContract$InputData referralsTroubleshooterTopLevelScreenContract$InputData = ((ReferralsFlowContract$Step.ReferralsTroubleshooter) referralsFlowContract$Step).f81938a;
            h.t2(eVar, this.f81942w, new ReferralsFlowContract$Step.AllReferralsTroubleshooter(new AllReferralsScreenContract$InputData(referralsTroubleshooterTopLevelScreenContract$InputData.f81910b, referralsTroubleshooterTopLevelScreenContract$InputData.f81911c, referralsTroubleshooterTopLevelScreenContract$InputData.d)), true, null, false, 12);
        } else {
            boolean z3 = lVar instanceof wya.i;
            InviteDetailsCampaignType.General general = InviteDetailsCampaignType.General.f81866a;
            if (z3) {
                h.t2(eVar, this.f81942w, new ReferralsFlowContract$Step.InviteDetails(new InvitesDetailsContract$InputData.ByInviteeDetails(((wya.i) lVar).f301188a, DetailsScope.HelpCenter.f81865a, general, ((ReferralsFlowContract$Step.ReferralsTroubleshooter) referralsFlowContract$Step).f81938a.f81910b)), true, null, false, 12);
            } else {
                if (!(lVar instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.t2(eVar, this.f81942w, new ReferralsFlowContract$Step.InviteDetails(new InvitesDetailsContract$InputData.ByInviteId(((j) lVar).f301189a, false, (InviteDetailsCampaignType) general, ((ReferralsFlowContract$Step.ReferralsTroubleshooter) referralsFlowContract$Step).f81938a.f81910b, 2)), true, null, false, 12);
            }
        }
        return Unit.f186387a;
    }
}
