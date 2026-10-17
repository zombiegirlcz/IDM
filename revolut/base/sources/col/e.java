package col;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import skm.l;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Throwable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f25573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f25573w = lVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Throwable th10 = (Throwable) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(this.f25573w, continuation, 0);
                eVar.v = th10;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(this.f25573w, continuation, 1);
                eVar2.v = th10;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f25573w;
        switch (i) {
            case 0:
                Throwable th10 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (lVar.d() && th10 != null) {
                    m.Companion companion = m.INSTANCE;
                    lVar.resumeWith(null);
                }
                break;
            default:
                Throwable th11 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (lVar.d() && th11 != null) {
                    m.Companion companion2 = m.INSTANCE;
                    lVar.resumeWith(null);
                }
                break;
        }
        return Unit.f186387a;
    }
}
