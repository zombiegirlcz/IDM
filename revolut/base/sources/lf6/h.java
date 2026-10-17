package lf6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lb0.b0;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f194646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f194647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c f194648y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z, j jVar, String str, com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c cVar, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f194646w = jVar;
        this.f194647x = str;
        this.f194648y = cVar;
        this.z = z3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, this.f194646w, this.f194647x, this.f194648y, this.z, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c cVar = this.f194648y;
        j jVar = this.f194646w;
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new b0(8, jVar, cVar, this.f194647x, continuation), 3);
        if (this.v) {
            e0.C(coroutineScope, null, null, new af3.f(this.z, jVar, continuation, 27), 3);
        }
        return Unit.f186387a;
    }
}
