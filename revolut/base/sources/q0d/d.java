package q0d;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oqk.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.semi_independent_activation.impl.ui.activation.b f241259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f241260x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.semi_independent_activation.impl.ui.activation.b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241259w = bVar;
        this.f241260x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f241259w, this.f241260x, continuation, 0);
            default:
                return new d(this.f241259w, this.f241260x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    String str = this.f241260x;
                    com.revolut.feature.semi_independent_activation.impl.ui.activation.b bVar = this.f241259w;
                    com.revolut.feature.semi_independent_activation.impl.ui.activation.a aVar2 = new com.revolut.feature.semi_independent_activation.impl.ui.activation.a(bVar, str, null);
                    this.v = 1;
                    if (u0.b0(bVar.X(), "LIST_ID_PRIMARY_BUTTON", aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.semi_independent_activation.impl.ui.activation.b bVar2 = this.f241259w;
                    h hVar = new h((Object) bVar2, (Object) this.f241260x, false, (Continuation) null, 9);
                    this.v = 1;
                    if (bVar2.p2(this, hVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
