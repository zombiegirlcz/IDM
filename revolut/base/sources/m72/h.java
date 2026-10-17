package m72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f203291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MultibancoRegistrationStatus.Registered f203292x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, MultibancoRegistrationStatus.Registered registered, Continuation continuation) {
        super(2, continuation);
        this.f203291w = kVar;
        this.f203292x = registered;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f203291w, this.f203292x, continuation);
        hVar.v = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L4d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L21
            goto L35
        L21:
            r7 = move-exception
            goto L38
        L23:
            yhm.o.b(r7)
            m72.k r7 = r6.f203291w     // Catch: java.lang.Exception -> L21
            com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered r2 = r6.f203292x     // Catch: java.lang.Exception -> L21
            r6.v = r0     // Catch: java.lang.Exception -> L21
            r6.u = r4     // Catch: java.lang.Exception -> L21
            java.lang.Object r7 = r7.a(r2, r6)     // Catch: java.lang.Exception -> L21
            if (r7 != r1) goto L35
            goto L4c
        L35:
            z92.j r7 = (z92.j) r7     // Catch: java.lang.Exception -> L21
            goto L42
        L38:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r5, r5, r7, r2)
            r7 = r5
        L42:
            r6.v = r5
            r6.u = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L4d
        L4c:
            return r1
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m72.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
