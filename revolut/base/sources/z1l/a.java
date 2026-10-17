package z1l;

import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f318890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f318891x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f318890w = dVar;
        this.f318891x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f318890w, this.f318891x, continuation, 0);
            default:
                return new a(this.f318890w, this.f318891x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f318891x;
        d dVar = this.f318890w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                if (i2 == 0) {
                    o.b(obj2);
                    u1l.e eVar = (u1l.e) dVar.f318897a;
                    this.v = 1;
                    Object objAcknowledge = eVar.f276437a.acknowledge(str, this);
                    if (objAcknowledge != aVar) {
                        objAcknowledge = Unit.f186387a;
                    }
                    if (objAcknowledge == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                u1l.e eVar2 = (u1l.e) dVar.f318897a;
                this.v = 2;
                Object objD = eVar2.d.d(str, false, this);
                if (objD != aVar) {
                    objD = Unit.f186387a;
                }
                if (objD == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                u1l.e eVar3 = (u1l.e) dVar.f318897a;
                this.v = 1;
                Object objA = eVar3.a(str, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }
}
