package jq4;

import com.revolut.data.model.Data;
import i2l.e0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f177457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f177457w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f177457w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            default:
                m mVar2 = new m(this.f177457w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f177457w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.f177464w, new e0(list, 22));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.f177464w, new jkh.h(data, 10));
                break;
        }
        return Unit.f186387a;
    }
}
