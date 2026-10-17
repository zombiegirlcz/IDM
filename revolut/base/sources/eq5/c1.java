package eq5;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j f128259w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i, com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f128259w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c1 c1Var = new c1(0, this.f128259w, continuation);
                c1Var.v = obj2;
                return c1Var;
            case 1:
                c1 c1Var2 = new c1(1, this.f128259w, continuation);
                c1Var2.v = obj2;
                return c1Var2;
            case 2:
                c1 c1Var3 = new c1(2, this.f128259w, continuation);
                c1Var3.v = obj2;
                return c1Var3;
            case 3:
                c1 c1Var4 = new c1(3, this.f128259w, continuation);
                c1Var4.v = obj2;
                return c1Var4;
            case 4:
                c1 c1Var5 = new c1(4, this.f128259w, continuation);
                c1Var5.v = obj2;
                return c1Var5;
            case 5:
                c1 c1Var6 = new c1(5, this.f128259w, continuation);
                c1Var6.v = obj2;
                return c1Var6;
            case 6:
                c1 c1Var7 = new c1(6, this.f128259w, continuation);
                c1Var7.v = obj2;
                return c1Var7;
            case 7:
                c1 c1Var8 = new c1(7, this.f128259w, continuation);
                c1Var8.v = obj2;
                return c1Var8;
            case 8:
                c1 c1Var9 = new c1(8, this.f128259w, continuation);
                c1Var9.v = obj2;
                return c1Var9;
            default:
                c1 c1Var10 = new c1(9, this.f128259w, continuation);
                c1Var10.v = obj2;
                return c1Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c1) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c1) create((h0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c1) create((FundingSource) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c1) create((PaymentPocketInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        char c2 = 1;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = this.f128259w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new epd.m(data, 1));
                return Unit.f186387a;
            case 1:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = (Data) rVar.f314201a;
                xi0.b bVar = (xi0.b) rVar.f314202b;
                wk5.a aVar3 = (wk5.a) rVar.f314203c;
                boolean z = data2.getContent() == null && !data2.getLoading() && data2.getError() == null;
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar2 = this.f128259w;
                if (z) {
                    jVar2.l2(new ac8.h(jVar2, new Pair(bVar, aVar3), (Continuation) null, aVar3, bVar), new yi5.b(26));
                }
                jVar2.H2(jVar2.F, new a09.z(data2, z, aVar3, 23));
                return Unit.f186387a;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new epd.m(data3, 2));
                return Unit.f186387a;
            case 3:
                h0 h0Var = (h0) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!(h0Var instanceof h0)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.K2();
                return Unit.f186387a;
            case 4:
                FundingSource fundingSource = (FundingSource) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new a32.z(fundingSource, i2));
                return Unit.f186387a;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new epd.m(data4, 3));
                return Unit.f186387a;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new epd.m(data5, 4));
                return Unit.f186387a;
            case 7:
                Data data6 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new epd.m(data6, 5));
                return Unit.f186387a;
            case 8:
                PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new bg2.w(paymentPocketInfo, c2 == true ? 1 : 0));
                return Unit.f186387a;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.H2(jVar.F, new epd.m(data7, 6));
                return Unit.f186387a;
        }
    }
}
