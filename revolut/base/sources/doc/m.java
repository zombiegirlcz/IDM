package doc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f116509w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116509w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f116509w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f116509w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            default:
                m mVar3 = new m(this.f116509w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((hoc.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((eoc.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((eoc.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f116509w;
        switch (i) {
            case 0:
                hoc.e settings = (hoc.e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = nVar.f116510c;
                Intrinsics.h(settings);
                Intrinsics.checkNotNullParameter(settings, "settings");
                eoc.b bVar = tVar.f116520p;
                eoc.e eVar = ((j) tVar.b3()).e;
                bVar.getClass();
                tVar.f116521q.x(eoc.b.a(settings, eVar));
                break;
            case 1:
                eoc.d parcel = (eoc.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar2 = nVar.f116510c;
                Intrinsics.h(parcel);
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                tVar2.g3(parcel.f127898a);
                eoc.b bVar2 = tVar2.f116520p;
                eoc.e eVar2 = ((j) tVar2.b3()).e;
                bVar2.getClass();
                tVar2.f116521q.A(eoc.b.a(hoc.e.f154273a, eVar2));
                break;
            default:
                eoc.c cVar = (eoc.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar3 = nVar.f116510c;
                Intrinsics.h(cVar);
                tVar3.g3(cVar);
                break;
        }
        return Unit.f186387a;
    }
}
