package eql;

import com.revolut.sso.api.models.BankIdEvidence;
import com.revolut.sso.api.models.DAPEvidence;
import com.revolut.sso.api.models.UaePassEvidence;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f128515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f128516y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(c0 c0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128515x = c0Var;
        this.f128516y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f128515x, this.f128516y, continuation, 0);
                pVar.f128514w = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f128515x, this.f128516y, continuation, 1);
                pVar2.f128514w = obj2;
                return pVar2;
            default:
                p pVar3 = new p(this.f128515x, this.f128516y, continuation, 2);
                pVar3.f128514w = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        akl.l lVar = (akl.l) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(lVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                akl.l lVar = (akl.l) this.f128514w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String str = ((rqk.k) this.f128515x.u).f256593p;
                    UaePassEvidence uaePassEvidence = new UaePassEvidence(this.f128516y);
                    this.f128514w = null;
                    this.v = 1;
                    obj2 = ((akl.r) lVar).c(str, uaePassEvidence, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gkl.c0 c0Var = (gkl.c0) obj2;
                if (c0Var instanceof gkl.y) {
                    return Unit.f186387a;
                }
                throw new IllegalStateException(a10.b.s("UAE PASS confirm claim failed with ", c0Var.getClass().getName(), " result"));
            case 1:
                akl.l lVar2 = (akl.l) this.f128514w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    String str2 = ((rqk.k) this.f128515x.u).f256593p;
                    BankIdEvidence bankIdEvidence = new BankIdEvidence(this.f128516y);
                    this.f128514w = null;
                    this.v = 1;
                    obj2 = ((akl.r) lVar2).c(str2, bankIdEvidence, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gkl.c0 c0Var2 = (gkl.c0) obj2;
                if (c0Var2 instanceof gkl.y) {
                    return Unit.f186387a;
                }
                throw new IllegalStateException(a10.b.s("BankId confirm claim failed with ", c0Var2.getClass().getName(), " result"));
            default:
                akl.l lVar3 = (akl.l) this.f128514w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    String str3 = ((rqk.k) this.f128515x.u).f256593p;
                    DAPEvidence dAPEvidence = new DAPEvidence(this.f128516y);
                    this.f128514w = null;
                    this.v = 1;
                    obj2 = ((akl.r) lVar3).c(str3, dAPEvidence, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gkl.c0 c0Var3 = (gkl.c0) obj2;
                if (c0Var3 instanceof gkl.y) {
                    return Unit.f186387a;
                }
                throw new IllegalStateException(a10.b.s("DAP confirm claim failed with ", c0Var3.getClass().getName(), " result"));
        }
    }
}
