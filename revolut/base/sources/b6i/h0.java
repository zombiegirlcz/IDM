package b6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dfj.q3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nfj.s1;
import nfj.v1;
import skm.h2;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends gim.i implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f12789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f12790y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature_move_money.impl.amount.c cVar, oim.o oVar, Continuation continuation) {
        super(1, continuation);
        this.A = cVar;
        this.B = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h0((com.revolut.feature_move_money.impl.amount.c) this.A, (oim.o) this.B, continuation);
            default:
                return new h0((q3) this.f12789x, (String) this.f12790y, (String) this.z, (String) this.A, (String) this.B, this.f12788w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        long jT2;
        j8l.d dVarP2;
        AccountWrapper accountWrapper;
        AccountWrapper accountWrapper2;
        com.revolut.feature_move_money.impl.amount.c cVar;
        Object objD;
        int i = this.u;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (i) {
            case 0:
                com.revolut.feature_move_money.impl.amount.c cVar2 = (com.revolut.feature_move_money.impl.amount.c) obj4;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    s6i.e eVar = cVar2.Q2().f12783a;
                    if (eVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    jT2 = cVar2.T2(eVar);
                    Pair pairS2 = com.revolut.feature_move_money.impl.amount.c.S2(cVar2.Q2().f12785c, eVar);
                    AccountWrapper accountWrapper3 = (AccountWrapper) pairS2.f186385a;
                    AccountWrapper accountWrapper4 = (AccountWrapper) pairS2.f186386b;
                    dVarP2 = cVar2.P2(cVar2.Q2().f12784b);
                    this.f12789x = accountWrapper3;
                    this.f12790y = accountWrapper4;
                    this.z = dVarP2;
                    this.f12788w = jT2;
                    this.v = 1;
                    accountWrapper = accountWrapper3;
                    accountWrapper2 = accountWrapper4;
                    cVar = cVar2;
                    objD = h2.d(10000L, new d0(cVar, accountWrapper, accountWrapper2, jT2, dVarP2, (Continuation) null), this);
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = this.f12788w;
                    j8l.d dVar = (j8l.d) this.z;
                    accountWrapper2 = (AccountWrapper) this.f12790y;
                    AccountWrapper accountWrapper5 = (AccountWrapper) this.f12789x;
                    yhm.o.b(obj2);
                    accountWrapper = accountWrapper5;
                    jT2 = j2;
                    dVarP2 = dVar;
                    cVar = cVar2;
                    objD = obj2;
                }
                OrderQuote orderQuote = (OrderQuote) objD;
                if (orderQuote == null) {
                    return cVar.X1(new nii.y0(null, cVar.f97291w.a(), false, 5));
                }
                return cVar.C1((aii.u) ((oim.o) obj3).invoke(accountWrapper, accountWrapper2, new Long(jT2), dVarP2, orderQuote));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v1 v1Var = ((q3) this.f12789x).f114082a;
                long j3 = this.f12788w;
                this.v = 1;
                v1Var.getClass();
                s1 s1Var = new s1(v1Var, (String) this.f12790y, (String) this.z, (String) obj4, j3, (String) obj3, null);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, s1Var, this);
                return objJ == aVar2 ? aVar2 : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q3 q3Var, String str, String str2, String str3, String str4, long j2, Continuation continuation) {
        super(1, continuation);
        this.f12789x = q3Var;
        this.f12790y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.f12788w = j2;
    }
}
