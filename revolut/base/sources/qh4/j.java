package qh4;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f246463w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = mVar;
        this.f246463w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, this.f246463w, continuation, 0);
            case 1:
                return new j(this.v, this.f246463w, continuation, 1);
            default:
                return new j(this.v, this.f246463w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.v;
        String str = this.f246463w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    return (cz3.a) mVar.f246466a.c(str, cz3.a.class);
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, j6.a.q("can't parse RolleeAnalyticsPayload from ", str), th10, h0Var);
                    return null;
                }
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    return (cz3.d) mVar.f246466a.c(str, cz3.d.class);
                } catch (Throwable th11) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, j6.a.q("can't parse RolleeErrorPayload from ", str), th11, h0Var2);
                    return new cz3.d();
                }
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    return (cz3.e) mVar.f246466a.c(str, cz3.e.class);
                } catch (Throwable th12) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, j6.a.q("can't parse RolleeLoadingPayload from ", str), th12, h0Var3);
                    return new cz3.e();
                }
        }
    }
}
