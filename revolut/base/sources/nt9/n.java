package nt9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import no.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.group_creation.b f219009w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219009w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f219009w, continuation, 0);
            default:
                return new n(this.f219009w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = this.f219009w;
                    com.revolut.feature.payments.groups.impl.ui_new.group_creation.a aVar2 = new com.revolut.feature.payments.groups.impl.ui_new.group_creation.a(bVar, null);
                    this.v = 1;
                    if (bVar.p2(this, aVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar2 = this.f219009w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    zs9.e eVar = bVar2.o;
                    this.v = 1;
                    obj2 = eVar.b(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar2.H2(bVar2.f79487w, new e0((xi0.b) obj2, bVar2, 14));
                return Unit.f186387a;
        }
    }
}
