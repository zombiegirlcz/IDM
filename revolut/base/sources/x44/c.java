package x44;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import v20.c0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements y44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PluginFlowContract$Input f302789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw3.a f302790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hw3.e f302791c;
    public final j2 d;

    public c(PluginFlowContract$Input inputData, lw3.a creditApplicationAgreementsInteractor, hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationAgreementsInteractor, "creditApplicationAgreementsInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        this.f302789a = inputData;
        this.f302790b = creditApplicationAgreementsInteractor;
        this.f302791c = creditApplicationConfigInteractor;
        this.d = m72.b.y(null, null, true, 3, null);
    }

    @Override // y44.a
    public final Object a(String str, Continuation continuation) {
        Object objCollect = n.K(new a(this, null)).collect(new c0(this, 4), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    @Override // y44.a
    public final j2 b() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof x44.b
            if (r0 == 0) goto L13
            r0 = r7
            x44.b r0 = (x44.b) r0
            int r1 = r0.f302788w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302788w = r1
            goto L18
        L13:
            x44.b r0 = new x44.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302788w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L7f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r7 = r6.f302789a
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r7 = r7.getF68159a()
            ft3.h1 r7 = kp0.w0.F(r7)
            lw3.a r2 = r6.f302790b
            r2.getClass()
            java.lang.String r4 = "productPayload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            p24.p r2 = r2.f200404a
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService r4 = r2.f232057c
            java.lang.String r7 = r7.f137835a
            efm.d0 r7 = r4.signAgreements(r7)
            p24.e r4 = new p24.e
            r5 = 12
            r4.<init>(r2, r5)
            p24.b r2 = new p24.b
            r5 = 17
            r2.<init>(r5, r4)
            r7.getClass()
            ufm.i r4 = new ufm.i
            r5 = 1
            r4.<init>(r7, r2, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            ufm.n r7 = te0.w.i0(r4)
            r0.f302788w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L7f
            return r1
        L7f:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x44.c.c(gim.c):java.lang.Object");
    }
}
