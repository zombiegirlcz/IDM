package re4;

import blj.t;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements y44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PluginFlowContract$Input f253517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final px3.a f253518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f253519c;

    public e(PluginFlowContract$Input inputData, px3.a mortgageSignatureInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mortgageSignatureInteractor, "mortgageSignatureInteractor");
        this.f253517a = inputData;
        this.f253518b = mortgageSignatureInteractor;
        this.f253519c = m72.b.y(null, null, true, 3, null);
    }

    @Override // y44.a
    public final Object a(String str, Continuation continuation) {
        Object objCollect = n.K(new c(this, null)).collect(new t(this, 21), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    @Override // y44.a
    public final j2 b() {
        return this.f253519c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (a(null, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof re4.d
            if (r0 == 0) goto L13
            r0 = r13
            re4.d r0 = (re4.d) r0
            int r1 = r0.f253516w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253516w = r1
            goto L1a
        L13:
            re4.d r0 = new re4.d
            gim.c r13 = (gim.c) r13
            r0.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253516w
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r13)
            goto L70
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            yhm.o.b(r13)
            goto L67
        L39:
            yhm.o.b(r13)
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r13 = r11.f253517a
            ft3.h1 r7 = r13.a9()
            r0.f253516w = r4
            px3.a r13 = r11.f253518b
            t34.e r6 = r13.f240564a
            r6.getClass()
            t34.c r5 = new t34.c
            r10 = 2
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5f:
            if (r12 != r1) goto L62
            goto L64
        L62:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L64:
            if (r12 != r1) goto L67
            goto L6f
        L67:
            r0.f253516w = r3
            java.lang.Object r12 = r11.a(r9, r0)
            if (r12 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: re4.e.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
