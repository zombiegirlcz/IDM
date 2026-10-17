package ok8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f225943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f225944x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f225943w = mVar;
        this.f225944x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.f225943w, this.f225944x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (skm.k0.b(500, r10) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r0.K2(r1, r10) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005d -> B:14:0x0031). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0073 -> B:11:0x0025). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            ok8.m r0 = r10.f225943w
            qki.d r1 = r0.f225947r
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L2d
            if (r3 == r6) goto L27
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r11)
            goto L85
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            int r3 = r10.u
            yhm.o.b(r11)
        L25:
            r11 = r3
            goto L31
        L27:
            int r3 = r10.u
            yhm.o.b(r11)
            goto L53
        L2d:
            yhm.o.b(r11)
            r11 = 0
        L31:
            if (r11 != 0) goto L76
            java.lang.Object r3 = r1.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlowContract$State r3 = (com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlowContract$State) r3
            int r3 = r3.f77153b
            r7 = 30
            if (r3 >= r7) goto L76
            kk8.k r3 = r0.o
            r10.u = r11
            r10.v = r6
            java.lang.Object r3 = r3.a(r10)
            if (r3 != r2) goto L50
            goto L84
        L50:
            r9 = r3
            r3 = r11
            r11 = r9
        L53:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r7 = r10.f225944x
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r7, r11)
            if (r11 == 0) goto L5f
            r11 = r6
            goto L31
        L5f:
            ojk.a r11 = new ojk.a
            r7 = 8
            r11.<init>(r7)
            r0.H2(r1, r11)
            r10.u = r3
            r10.v = r5
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r11 = skm.k0.b(r7, r10)
            if (r11 != r2) goto L25
            goto L84
        L76:
            if (r11 == 0) goto L88
            com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage$FeaturesReloading r1 = com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.FeaturesReloading.INSTANCE
            r10.u = r11
            r10.v = r4
            java.lang.Object r11 = r0.K2(r1, r10)
            if (r11 != r2) goto L85
        L84:
            return r2
        L85:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L88:
            ojk.a r11 = new ojk.a
            r2 = 9
            r11.<init>(r2)
            r0.H2(r1, r11)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "plan update polling: too many attempts (30)"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ok8.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
