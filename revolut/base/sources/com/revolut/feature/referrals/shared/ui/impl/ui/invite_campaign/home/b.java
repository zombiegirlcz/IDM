package com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home;

import cli.y;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nxa.v;
import nya.k;
import nya.l;
import nya.n;
import nya.s;
import oki.h;
import pwa.m;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public l u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f81854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f81855x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(1, continuation);
        this.f81855x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f81855x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar;
        m mVar;
        ReferralCampaignV4 referralCampaignV4;
        d dVar = this.f81855x;
        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData = dVar.o;
        y yVar = dVar.E;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f81854w;
        if (i == 0) {
            o.b(obj2);
            dVar.H2(yVar, new v(17));
            if (pwa.l.f240370b.contains(inviteCampaignHomeControllerContract$InputData.f81844c)) {
                dVar.C2(new s(new n(inviteCampaignHomeControllerContract$InputData.f81844c)));
                return Unit.f186387a;
            }
            a aVar2 = ((k) ((j2) yVar.f22677a).getValue()).f220738a;
            lVar = aVar2 instanceof l ? (l) aVar2 : null;
            if (lVar == null || (mVar = lVar.f220743a) == null || (referralCampaignV4 = mVar.f240371a) == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "InviteCampaignHomeScreenModel", "referral campaign is null", null, h0Var);
                return Unit.f186387a;
            }
            nk9.l lVar2 = new nk9.l(dVar, referralCampaignV4, null, 13);
            this.u = lVar;
            this.v = dVar;
            this.f81854w = 1;
            obj2 = dVar.p2(this, lVar2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.v;
            lVar = this.u;
            o.b(obj2);
        }
        zxa.c cVar = (zxa.c) obj2;
        if (cVar instanceof zxa.b) {
            h.v2(dVar.F, InviteCampaignHomeControllerContract$ModalStep.InviteBottomSheetActions.f81846a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!(cVar instanceof zxa.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((cya.l) dVar.f81862x).Z2(((zxa.a) cVar).f326093a, lVar.f220745c);
        }
        return Unit.f186387a;
    }
}
