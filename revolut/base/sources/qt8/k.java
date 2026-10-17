package qt8;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0);
            default:
                return new k(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = lVar.f249029b;
                Type type = l.f249027g;
                Intrinsics.checkNotNullExpressionValue(type, "access$getKYC_ADDRESSES_TYPE$cp(...)");
                rt8.c cVar2 = (rt8.c) cVar.T2("KYC_ADDRESSES_CACHE_KEY", type);
                if (cVar2 != null) {
                    return e0.I(cVar2);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = lVar.f249029b;
                Type type2 = l.f;
                Intrinsics.checkNotNullExpressionValue(type2, "access$getKYC_TYPE$cp(...)");
                vt8.e eVar = (vt8.e) cVar3.T2("kyc_state", type2);
                if (eVar != null) {
                    return c6d.b.I(eVar);
                }
                return null;
        }
    }
}
