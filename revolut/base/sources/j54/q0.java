package j54;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 extends gim.i implements Function1 {
    public aii.o u;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f171546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c84.p f171547x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r0 f171548y;
    public final /* synthetic */ PluginPayload z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(c84.p pVar, PluginPayload pluginPayload, r0 r0Var, Continuation continuation) {
        super(1, continuation);
        this.f171547x = pVar;
        this.f171548y = r0Var;
        this.z = pluginPayload;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        r0 r0Var = this.f171548y;
        return new q0(this.f171547x, this.z, r0Var, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r5.c3(r7, r1, true, r6) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f171546w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r7)
            goto L7a
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            it3.d r0 = r6.v
            aii.o r1 = r6.u
            yhm.o.b(r7)
            goto L44
        L20:
            yhm.o.b(r7)
            c84.p r7 = r6.f171547x
            c84.o r7 = (c84.o) r7
            it3.d r1 = r7.f22101a
            boolean r4 = r1.o
            j54.r0 r5 = r6.f171548y
            if (r4 == 0) goto L6d
            aii.o r1 = r5.r2()
            it3.d r7 = r7.f22101a
            r6.u = r1
            r6.v = r7
            r6.f171546w = r3
            java.lang.Object r2 = r5.Z2(r6)
            if (r2 != r0) goto L42
            goto L79
        L42:
            r0 = r7
            r7 = r2
        L44:
            wi0.b r7 = (wi0.b) r7
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$Workflow r2 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$Workflow
            java.lang.String r4 = "status"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            java.lang.String r4 = r0.f168323a
            java.lang.String r0 = r0.f168331n
            if (r0 == 0) goto L65
            r2.<init>(r4, r0, r7, r3)
            h54.d r7 = new h54.d
            r7.<init>(r2)
            aii.n r7 = r1.M0(r7)
            return r7
        L65:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        L6d:
            com.revolut.feature.credit.application.models.plugins.PluginPayload r7 = r6.z
            it3.d r7 = r7.f66247a
            r6.f171546w = r2
            java.lang.Object r7 = r5.c3(r7, r1, r3, r6)
            if (r7 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
