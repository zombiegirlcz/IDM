package com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow;

import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nya.m;
import nya.n;
import nya.p;
import nya.q;
import nya.r;
import nya.s;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f81939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yki.b f81940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ReferralsFlowContract$Step f81941y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s sVar, e eVar, yki.b bVar, ReferralsFlowContract$Step referralsFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f81939w = eVar;
        this.f81940x = bVar;
        this.f81941y = referralsFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f81939w, this.f81940x, this.f81941y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            r rVar = this.v.f220757a;
            boolean z = rVar instanceof p;
            e eVar = this.f81939w;
            if (z) {
                h.t2(eVar, this.f81940x, new ReferralsFlowContract$Step.InvitesList(((p) rVar).f220754a), true, null, false, 12);
                return Unit.f186387a;
            }
            if (rVar instanceof nya.o) {
                h.t2(eVar, this.f81940x, new ReferralsFlowContract$Step.InviteDetails(((nya.o) rVar).f220753a), true, null, false, 12);
                return Unit.f186387a;
            }
            if (rVar instanceof q) {
                q qVar = (q) rVar;
                h.t2(eVar, this.f81940x, new ReferralsFlowContract$Step.ReferralsTroubleshooter(new ReferralsTroubleshooterTopLevelScreenContract$InputData(((ReferralsFlowContract$Step.InviteCampaignHome) this.f81941y).f81935a.f81844c, qVar.f220755a, qVar.f220756b, 1)), true, null, false, 12);
                return Unit.f186387a;
            }
            if (!rVar.equals(m.f220746a)) {
                if (rVar instanceof n) {
                    return eVar.C1(eVar.f81950s.a(((n) rVar).f220749a));
                }
                throw new NoWhenBranchMatchedException();
            }
            this.u = 1;
            if (e.I2(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
