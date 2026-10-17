package w75;

import cli.y;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s35.a;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f295476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ koi.j f295477x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, koi.j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f295476w = lVar;
        this.f295477x = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f295476w, this.f295477x, continuation, 0);
            default:
                return new j(this.f295476w, this.f295477x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        koi.j jVar = this.f295477x;
        l lVar = this.f295476w;
        switch (i) {
            case 0:
                y yVar = lVar.f295482t;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    s85.c cVar = lVar.o;
                    this.v = 1;
                    obj2 = cVar.Z2(jVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                s35.a aVar2 = (s35.a) obj2;
                if (aVar2 instanceof a.c) {
                    lVar.C2(new f((LoanBackupCard) zi0.c.I(((e) ((j2) yVar.f22677a).getValue()).f295471c)));
                } else if (aVar2 instanceof a.b) {
                    lVar.f295481s.a();
                } else if (Intrinsics.f(jVar.getF55091b(), "ITEM_ID_EDIT_REPAYMENT_ACCOUNTS_SUBHEADER")) {
                    lVar.f295478p.x(lVar.f295479q.a(((e) ((j2) yVar.f22677a).getValue()).d, ((e) ((j2) yVar.f22677a).getValue()).f295470b));
                } else {
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    j jVar2 = new j(lVar, jVar, null, 0);
                    this.v = 1;
                    if (lVar.p2(this, jVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
