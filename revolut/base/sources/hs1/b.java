package hs1;

import com.revolut.feature.apm.bizum.impl.data.network.BizumService;
import gim.i;
import js1.j;
import js1.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f154857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b02.i f154858x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, b02.i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f154857w = cVar;
        this.f154858x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f154857w, this.f154858x, continuation, 0);
            default:
                return new b(this.f154857w, this.f154858x, continuation, 1);
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
                if (i == 0) {
                    o.b(obj2);
                    c cVar = this.f154857w;
                    BizumService bizumService = cVar.f154859a;
                    b02.i iVar = this.f154858x;
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    jo3.a aVarP = mo3.a.p(iVar.f11547a);
                    String str = iVar.f11548b;
                    if (d0.W(str)) {
                        str = null;
                    }
                    js1.i iVar2 = new js1.i(str, iVar.f11549c.f62207a, iVar.d, iVar.e, aVarP);
                    wj0.b bVarA = c.a(cVar);
                    this.v = 1;
                    obj2 = bizumService.postTransfer(iVar2, bVarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return gc0.c.s((l) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    c cVar2 = this.f154857w;
                    BizumService bizumService2 = cVar2.f154859a;
                    b02.i iVar3 = this.f154858x;
                    Intrinsics.checkNotNullParameter(iVar3, "<this>");
                    jo3.a aVarP2 = mo3.a.p(iVar3.f11547a);
                    String str2 = iVar3.f11548b;
                    if (d0.W(str2)) {
                        str2 = null;
                    }
                    j jVar = new j(oc.c.B(iVar3.f11549c), aVarP2, str2, iVar3.d, iVar3.e);
                    wj0.b bVarA2 = c.a(cVar2);
                    this.v = 1;
                    obj2 = bizumService2.postTransferFx(jVar, bVarA2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return gc0.c.s((l) obj2);
        }
    }
}
