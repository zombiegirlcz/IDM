package kr1;

import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$Destination;
import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f188630w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f188630w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f188630w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            jr1.e eVar = this.v.f188632a;
            String str = this.f188630w.f188629a;
            this.u = 1;
            obj2 = eVar.c(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return u0.f(new PostalCheckNavigation$Destination(new PostalCheckNavigation$InputData.ScannedData((PostalCheckQrScanResult) obj2)));
    }
}
