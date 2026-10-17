package l10;

import a83.p0;
import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f191382w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191382w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f191382w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f191382w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((wi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f191382w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n10.a aVar2 = (n10.a) data.getContent();
                Data data2 = aVar2 != null ? aVar2.f211197a : null;
                n10.a aVar3 = (n10.a) data.getContent();
                Data data3 = aVar3 != null ? aVar3.f211198b : null;
                n10.a aVar4 = (n10.a) data.getContent();
                Data data4 = aVar4 != null ? aVar4.f211199c : null;
                int i2 = k.f191381a[nVar.o.f50951b.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        data2 = data3;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        data2 = data4;
                    }
                }
                nVar.H2(nVar.f191386p, new p0(data, nVar, data2));
                return Unit.f186387a;
            default:
                wi0.b bVar = (wi0.b) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.f191386p, new a3i.w(7, bVar));
                return Unit.f186387a;
        }
    }
}
