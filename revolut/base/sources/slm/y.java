package slm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes14.dex */
public final class y extends gim.h implements Function3 {
    public int u;
    public /* synthetic */ yhm.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jx.e f264293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(jx.e eVar, Continuation continuation) {
        super(3, continuation);
        this.f264293w = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        y yVar = new y(this.f264293w, (Continuation) obj4);
        yVar.v = (yhm.b) obj2;
        return yVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        jx.e eVar = this.f264293w;
        a aVar = (a) eVar.f179036c;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            yhm.b bVar = this.v;
            byte bW = aVar.w();
            if (bW == 1) {
                return eVar.g(true);
            }
            if (bW == 0) {
                return eVar.g(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return eVar.f();
                }
                a.r(aVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.u = 1;
            obj2 = jx.e.a(eVar, bVar, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (JsonElement) obj2;
    }
}
