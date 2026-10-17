package pnb;

import ack.n;
import com.revolut.feature.retail.savings.api.documents.models.TaxForm;
import gim.i;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import o9a.v;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f237683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TaxForm f237684x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, TaxForm taxForm, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f237683w = hVar;
        this.f237684x = taxForm;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f237683w, this.f237684x, continuation, 0);
            default:
                return new g(this.f237683w, this.f237684x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                h hVar = this.f237683w;
                if (i == 0) {
                    o.b(obj2);
                    gnb.b bVar = hVar.o;
                    String str = this.f237684x.d;
                    this.v = 1;
                    obj2 = bVar.f144952a.c(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                f9i.c cVar = new f9i.c(new f9i.d((File) obj2));
                this.v = 2;
                if (hVar.G1(cVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                n nVar = new n(19);
                v vVar = new v(5);
                h hVar2 = this.f237683w;
                g gVar = new g(hVar2, this.f237684x, null, 0);
                this.v = 1;
                Object objQ = k.Q(hVar2, null, vVar, nVar, gVar, this, 1);
                return objQ == aVar2 ? aVar2 : objQ;
        }
    }
}
