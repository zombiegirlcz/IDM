package dzb;

import com.revolut.data.model.Data;
import do8.t;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f121305w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121305w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f121305w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f121305w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((g) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            default:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f121305w;
        switch (i) {
            case 0:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RevPointsChallengeDetailsScreen", null, th10, h0Var);
                i.I2(iVar);
                return Boolean.TRUE;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (data.getError() != null && data.getContent() == null && !data.getLoading()) {
                    i.I2(iVar);
                }
                iVar.H2(iVar.u, new t(data, 18));
                return Unit.f186387a;
        }
    }
}
