package com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import xya.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj2, b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = obj2;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ActiveOrPastInviteeDetails activeOrPastInviteeDetails = (ActiveOrPastInviteeDetails) this.u;
        pwa.b bVar = activeOrPastInviteeDetails.f81695m;
        pwa.b bVar2 = pwa.b.INELIGIBLE;
        b bVar3 = this.v;
        if (bVar == bVar2) {
            h.v2(bVar3.f81930x, new AllReferralsScreenContract$ModalStep.IneligibilityDialog(activeOrPastInviteeDetails.u), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            bVar3.C2(new n(activeOrPastInviteeDetails));
        }
        return Unit.f186387a;
    }
}
