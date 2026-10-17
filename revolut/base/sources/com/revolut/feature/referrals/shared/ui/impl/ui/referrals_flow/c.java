package com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InviteDetailsCampaignType;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import xya.n;
import xya.p;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ p u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yki.b f81944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ReferralsFlowContract$Step f81945x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, e eVar, yki.b bVar, ReferralsFlowContract$Step referralsFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.u = pVar;
        this.v = eVar;
        this.f81944w = bVar;
        this.f81945x = referralsFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, this.v, this.f81944w, this.f81945x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        p pVar = this.u;
        boolean z = pVar instanceof n;
        e eVar = this.v;
        ReferralsFlowContract$Step referralsFlowContract$Step = this.f81945x;
        InviteDetailsCampaignType.General general = InviteDetailsCampaignType.General.f81866a;
        if (z) {
            h.t2(eVar, this.f81944w, new ReferralsFlowContract$Step.InviteDetails(new InvitesDetailsContract$InputData.ByInviteeDetails(((n) pVar).f309691a, DetailsScope.HelpCenter.f81865a, general, ((ReferralsFlowContract$Step.AllReferralsTroubleshooter) referralsFlowContract$Step).f81932a.f81920a)), true, null, false, 12);
        } else {
            if (!(pVar instanceof xya.o)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(eVar, this.f81944w, new ReferralsFlowContract$Step.InviteDetails(new InvitesDetailsContract$InputData.ByInviteId(((xya.o) pVar).f309692a, false, (InviteDetailsCampaignType) general, ((ReferralsFlowContract$Step.AllReferralsTroubleshooter) referralsFlowContract$Step).f81932a.f81920a, 2)), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
