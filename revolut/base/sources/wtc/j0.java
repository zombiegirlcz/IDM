package wtc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f299875w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, Continuation continuation) {
        super(2, continuation);
        this.f299875w = k0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j0 j0Var = new j0(this.f299875w, continuation);
        j0Var.v = obj2;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.u
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            wtc.k0 r7 = r11.f299875w
            r8 = 0
            if (r2 == 0) goto L32
            if (r2 == r6) goto L2e
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1e
            yhm.o.b(r12)
            goto Lab
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            yhm.o.b(r12)
            goto L6d
        L2a:
            yhm.o.b(r12)
            goto L5c
        L2e:
            yhm.o.b(r12)
            goto L4e
        L32:
            yhm.o.b(r12)
            gte.a r12 = r7.d
            com.revolut.feature.security_hub.api.SecurityHubApi$Toggles$StreetModeWifi r2 = com.revolut.feature.security_hub.api.SecurityHubApi$Toggles.StreetModeWifi.f85371c
            jte.d r12 = (jte.d) r12
            boolean r12 = r12.c(r2)
            if (r12 != 0) goto L51
            zhm.f0 r12 = zhm.f0.f322471a
            r11.v = r8
            r11.u = r6
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L4e
            goto Laa
        L4e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L51:
            r11.v = r0
            r11.u = r5
            java.lang.Object r12 = wtc.k0.a(r7, r11)
            if (r12 != r1) goto L5c
            goto Laa
        L5c:
            com.revolut.feature.security_hub.impl.interactor.ConnectedWifi r12 = (com.revolut.feature.security_hub.impl.interactor.ConnectedWifi) r12
            if (r12 != 0) goto L70
            zhm.f0 r12 = zhm.f0.f322471a
            r11.v = r8
            r11.u = r4
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L6d
            goto Laa
        L6d:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L70:
            wtc.g0 r2 = r7.f299878c
            kotlinx.coroutines.flow.Flow r2 = r2.e()
            vkm.j2 r4 = r7.f
            amf.k r9 = new amf.k
            r10 = 12
            r9.<init>(r7, r12, r8, r10)
            r11.v = r8
            r11.u = r3
            vkm.q.w(r0)
            kotlinx.coroutines.flow.Flow[] r12 = new kotlinx.coroutines.flow.Flow[r5]
            r3 = 0
            r12[r3] = r2
            r12[r6] = r4
            vdl.c1 r2 = new vdl.c1
            r3 = 15
            r2.<init>(r9, r8, r3)
            vkm.s1 r3 = vkm.s1.f290118a
            java.lang.Object r12 = mif.e0.g(r11, r3, r2, r0, r12)
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r12 != r0) goto L9f
            goto La1
        L9f:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        La1:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r12 != r0) goto La6
            goto La8
        La6:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        La8:
            if (r12 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
