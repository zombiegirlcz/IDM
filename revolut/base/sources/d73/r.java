package d73;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f111800w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = uVar;
        this.f111800w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, this.f111800w, continuation, 0);
            case 1:
                return new r(this.v, this.f111800w, continuation, 1);
            default:
                return new r(this.v, this.f111800w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f111800w;
        u uVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e73.a aVar2 = (e73.a) uVar.f111803a.v0(new e73.a(0), "HIDDEN_AUTO_RENEWAL_BANNER_STATE", e73.a.class);
                if (!aVar2.getCardIds().contains(str)) {
                    uVar.f111803a.G(new e73.a(d0.F0(str, aVar2.getCardIds())), "HIDDEN_AUTO_RENEWAL_BANNER_STATE", z.d(o0.b(e73.a.class)));
                }
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e73.b bVar = (e73.b) uVar.f111803a.v0(new e73.b(0), "HIDDEN_REISSUED_PHYSICAL_CARD_BANNER_STATE", e73.b.class);
                if (!bVar.getCardIds().contains(str)) {
                    uVar.f111803a.G(new e73.b(d0.F0(str, bVar.getCardIds())), "HIDDEN_REISSUED_PHYSICAL_CARD_BANNER_STATE", z.d(o0.b(e73.b.class)));
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = uVar.f111803a;
                e73.c cVar2 = (e73.c) cVar.v0(new e73.c(0), "HIDDEN_RENEWED_BANNER_STATE", e73.c.class);
                if (!cVar2.getCardIds().contains(str)) {
                    cVar.G(new e73.c(d0.F0(str, cVar2.getCardIds())), "HIDDEN_RENEWED_BANNER_STATE", z.d(o0.b(e73.c.class)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
