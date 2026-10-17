package pfk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f235626w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235626w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f235626w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f235626w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((d) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                return ((d) create((b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw null;
            default:
                b bVar = (b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = this.f235626w.f235629c;
                String strA = e.a(bVar);
                e.Companion.getClass();
                kfk.b bVar2 = (kfk.b) eVar.T2(strA, e.e);
                if (bVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                return new kha.d(bVar2.getCreditCardIdPendingActivation());
        }
    }
}
