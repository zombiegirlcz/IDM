package xz2;

import do3.q;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.change_pin.b f309776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f309777x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.card_management.impl.ui.change_pin.b bVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f309776w = bVar;
        this.f309777x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f309776w, this.f309777x, continuation, 0);
            default:
                return new d(this.f309776w, this.f309777x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    String str = this.f309777x;
                    com.revolut.feature.card_management.impl.ui.change_pin.b bVar = this.f309776w;
                    com.revolut.feature.card_management.impl.ui.change_pin.a aVar2 = new com.revolut.feature.card_management.impl.ui.change_pin.a(bVar, str, null);
                    this.v = 1;
                    if (q.t(bVar, aVar2, this) == aVar) {
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
                    com.revolut.feature.card_management.impl.ui.change_pin.b bVar2 = this.f309776w;
                    d dVar = new d(bVar2, this.f309777x, null, 0);
                    this.v = 1;
                    if (bVar2.p2(this, dVar) == aVar3) {
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
