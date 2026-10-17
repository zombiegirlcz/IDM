package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import h7c.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class v0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f182011w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(y0 y0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.v = y0Var;
        this.f182011w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v0(this.v, this.f182011w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f182011w;
        y0 y0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            RevolutPayService revolutPayService = y0Var.f182022a;
            h7c.a aVar2 = new h7c.a(null, new a.b(str), 1);
            this.u = 1;
            if (revolutPayService.updateUserPreferences(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        x4l.c cVar = y0Var.d;
        Unit unit = Unit.f186387a;
        Object obj3 = y0Var.f182023b.get("WRAPPED_SHIPPING_CONTACTS_LIST_MEMORY_CACHE_ID");
        if (obj3 != null) {
            cVar.g(unit, nec.c.a((nec.c) obj3, null, str, 1));
        }
        return unit;
    }
}
