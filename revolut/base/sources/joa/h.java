package joa;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f176905w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f176905w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f176905w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f176905w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((vf0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f176905w;
        switch (i) {
            case 0:
                vf0.g gVar = (vf0.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Data data = (Data) gVar.f288428a;
                Data data2 = (Data) gVar.f288429b;
                Data data3 = (Data) gVar.f288430c;
                iVar.x2(new aqd.f((od0.i) gVar.d, (Boolean) gVar.e, (Boolean) gVar.f, (kn2.a) gVar.f288432h, data, data2, data3, (Data) gVar.f288431g));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.x2(new jkh.h(data4, 7));
                break;
        }
        return Unit.f186387a;
    }
}
