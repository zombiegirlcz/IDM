package zvc;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wtc.g0;
import yhm.o;
import zgj.i0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a f325652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f325653x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325652w = aVar;
        this.f325653x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f325652w, this.f325653x, continuation, 0);
            default:
                return new k(this.f325652w, this.f325653x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar2 = this.f325652w;
                if (i == 0) {
                    o.b(obj2);
                    w39.b bVar = aVar2.f85703q;
                    this.v = 1;
                    obj2 = oi0.d.o(bVar, this);
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
                LocationDomain locationDomain = (LocationDomain) obj2;
                String str = this.f325653x;
                if (locationDomain != null) {
                    g0 g0Var = aVar2.o;
                    this.v = 2;
                    if (g0Var.a(str, locationDomain, this) == aVar) {
                        return aVar;
                    }
                } else {
                    aVar2.v.getClass();
                    yji.l.a1(aVar2, aVar2.X1(buc.h.a()), null, null, new i0(aVar2, str, (Continuation) null, 3), 3);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar4 = this.f325652w;
                l lVar = new l(aVar4, this.f325653x, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "remove trusted wifi", lVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
