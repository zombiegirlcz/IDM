package cve;

import com.revolut.feature.topup_screen.impl.data.network.service.StoredMethodService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import sue.j;
import wim.z;
import yhm.o;
import yte.e;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f109335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f109336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109335w = cVar;
        this.f109336x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f109335w, this.f109336x, continuation, 0);
            default:
                return new b(this.f109335w, this.f109336x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String storedMethodId = this.f109336x;
                c cVar = this.f109335w;
                if (i == 0) {
                    o.b(obj2);
                    StoredMethodService storedMethodService = cVar.f109338b;
                    this.v = 1;
                    obj2 = storedMethodService.getIndiaStoredMethodDetail(storedMethodId, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                e eVarA = kue.a.a((j) obj2);
                cVar.f109337a.f(c.a(storedMethodId), eVarA);
                ej9.c cVar2 = cVar.f109339c;
                ive.a updatedEntity = kue.a.b(eVarA);
                Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
                Intrinsics.checkNotNullParameter(updatedEntity, "updatedEntity");
                cVar2.f126792a.G(updatedEntity, j6.a.q("INDIA_STORED_METHOD_ENTITY_KEY_storedMethodId=", storedMethodId), z.d(o0.b(ive.a.class)));
                return eVarA;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String storedMethodId2 = this.f109336x;
                c cVar3 = this.f109335w;
                if (i2 == 0) {
                    o.b(obj2);
                    StoredMethodService storedMethodService2 = cVar3.f109338b;
                    this.v = 1;
                    if (storedMethodService2.removeIndiaStoredMethodDetail(storedMethodId2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                cVar3.f109337a.remove(c.a(storedMethodId2));
                ej9.c cVar4 = cVar3.f109339c;
                Intrinsics.checkNotNullParameter(storedMethodId2, "storedMethodId");
                cVar4.f126792a.I0("INDIA_STORED_METHOD_ENTITY_KEY_storedMethodId=" + storedMethodId2);
                return Unit.f186387a;
        }
    }
}
