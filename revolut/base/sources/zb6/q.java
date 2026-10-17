package zb6;

import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a f320821w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f320821w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(0, this.f320821w, continuation);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(1, this.f320821w, continuation);
                qVar2.v = obj2;
                return qVar2;
            default:
                q qVar3 = new q(2, this.f320821w, continuation);
                qVar3.v = obj2;
                return qVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar = this.f320821w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
                    aVar.B2();
                } else {
                    int i2 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 1:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ba6.l lVar = (ba6.l) rVar.f314201a;
                nqi.c cVar = (nqi.c) rVar.f314202b;
                xi0.b bVar = (xi0.b) rVar.f314203c;
                long j2 = cVar.f218471a.f115082a;
                xi0.b bVar2 = lVar.i.f115083b;
                String str = lVar.f13938a;
                if (Intrinsics.f(bVar2, bVar) || j2 <= 0) {
                    return zi0.c.i(i.f320809a);
                }
                DonationQuoteRequest donationQuoteRequest = new DonationQuoteRequest(new dj0.d(j2, bVar), str);
                return nim.a.v(((sa6.t) aVar.f72091s).c(donationQuoteRequest), new fb6.o(donationQuoteRequest, 1));
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    aVar.l2(new mt8.b(aVar, true, null, 21), new yi5.b(26));
                } else if (n1Var2 instanceof m1) {
                    aVar.s1();
                } else {
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }
}
