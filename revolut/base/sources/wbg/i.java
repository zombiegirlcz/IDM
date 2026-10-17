package wbg;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f296178w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296178w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f296178w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f296178w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f296178w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                ((i) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return vkm.i.f290039a;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        s sVar = this.f296178w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVar = (f) data.component1();
                if ((fVar != null ? fVar.f296166b : null) != rei.h.WALLET) {
                    j2 j2Var = sVar.f296202j;
                    Data data2 = new Data(null, null, false, 7, null);
                    j2Var.getClass();
                    j2Var.g(null, data2);
                }
                return Unit.f186387a;
            case 1:
                f fVar2 = (f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ecg.e eVar = fVar2.f296165a;
                rei.h hVar = fVar2.f296166b;
                if (eVar instanceof ecg.c) {
                    return new go.g(new Data(ecg.h.f124734a, null, false, 6, null), 2);
                }
                if (eVar instanceof ecg.a) {
                    return new go.g(new Data(ecg.f.f124731a, null, false, 6, null), 2);
                }
                if (eVar instanceof ecg.d) {
                    return new go.g(new Data(ecg.i.f124735a, null, false, 6, null), 2);
                }
                if (!(eVar instanceof ecg.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = j.f296181a[hVar.ordinal()];
                int i3 = 1;
                if (i2 != 1) {
                    if (i2 == 2) {
                        return vkm.q.Q(sVar.i, new sdi.a(continuation, (ecg.b) eVar, sVar, 28));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                r10.t tVar = sVar.f296197a;
                dj0.d priceInBaseCurrency = ((ecg.b) eVar).f124728a;
                Intrinsics.checkNotNullParameter(priceInBaseCurrency, "priceInBaseCurrency");
                return new ax9.o(yh5.b.d(zh9.u0.i(rd0.e.b(nim.a.w(kli.a.h(nim.a.w(l93.f.k((l93.f) tVar.f250857a, null, null, true, 11), new i9g.e0(4)), pd.b.r(osg.b.g((wsg.n) tVar.f250858b, w4l.h.f294642c, io3.l.CURRENT, null, null, null, null, null, 124), new i9g.o0(tVar, priceInBaseCurrency))), new i9g.o0(priceInBaseCurrency, tVar))), rd0.e.b(sVar.f296198b.a(false)), new wa3.d(rd0.e.b(sh3.a.c(sVar.f296199c, zhm.u.c(pi3.s.CARD), null, null, 6)), i3)), sVar.f296201h), 18);
            default:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PaymentMethod paymentMethod = (PaymentMethod) iVar.f224257a;
                if (paymentMethod == null || (paymentMethod instanceof PaymentMethod.Pocket)) {
                    j2 j2Var2 = sVar.i;
                    od0.i.Companion.getClass();
                    od0.i iVarA = od0.h.a(paymentMethod);
                    j2Var2.getClass();
                    j2Var2.g(null, iVarA);
                } else {
                    String strM = kotlin.jvm.internal.o0.f186429a.b(e.class).m();
                    if (strM == null) {
                        strM = "Stays";
                    }
                    foh.i.p(paymentMethod, strM);
                }
                return vkm.i.f290039a;
        }
    }
}
