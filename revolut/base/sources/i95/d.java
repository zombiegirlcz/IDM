package i95;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f159578w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f159578w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f159578w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f159578w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = this.f159578w;
        switch (i) {
            case 0:
                String facilityId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rx4.b agreements = (rx4.b) eVar.d.a(new t95.a(facilityId));
                if (agreements == null) {
                    return null;
                }
                d0 d0Var = eVar.f159580b;
                Intrinsics.checkNotNullParameter(agreements, "agreements");
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return tx4.a.a(agreements, new c55.b(((ij0.a) d0Var.f226551b).getBaseUrl(), facilityId, 2));
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r95.a aVar3 = (r95.a) eVar.d.a(new t95.b(str));
                if (aVar3 != null) {
                    return s95.a.a(aVar3);
                }
                return null;
        }
    }
}
