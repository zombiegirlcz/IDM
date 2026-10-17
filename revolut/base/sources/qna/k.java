package qna;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f247916w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Continuation continuation, s sVar) {
        super(2, continuation);
        this.u = i;
        this.f247916w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(0, continuation, this.f247916w);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(1, continuation, this.f247916w);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(2, continuation, this.f247916w);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k(3, continuation, this.f247916w);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k(4, continuation, this.f247916w);
                kVar5.v = obj2;
                return kVar5;
            default:
                k kVar6 = new k(5, continuation, this.f247916w);
                kVar6.v = obj2;
                return kVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final int i2 = 0;
        s sVar = this.f247916w;
        switch (i) {
            case 0:
                final e eVar = (e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f247932x, new Function1() { // from class: qna.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                        }
                        return f.a((f) obj3, null, null, null, null, null, eVar, false, 95);
                    }
                });
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f247932x, new q2j.j(list, 13));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f247932x, new q65.l(data, 29));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f247932x, new p(data2, 0));
                break;
            case 4:
                xi0.b bVar = (xi0.b) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f247932x, new ou5.a(11, bVar));
                break;
            default:
                final e eVar2 = (e) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final int i3 = 1;
                sVar.H2(sVar.f247932x, new Function1() { // from class: qna.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                        }
                        return f.a((f) obj3, null, null, null, null, null, eVar2, false, 95);
                    }
                });
                break;
        }
        return Unit.f186387a;
    }
}
