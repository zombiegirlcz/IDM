package pxc;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements n {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr0.i f240615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f240616b;

    public r(qr0.i warrantDetailsRepository, sri.m navigator) {
        Intrinsics.checkNotNullParameter(warrantDetailsRepository, "warrantDetailsRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f240615a = warrantDetailsRepository;
        this.f240616b = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        CharSequence charSequence;
        return (!y.D(cVar, "deeplink", 1, "warrant-details") || d0.W(cVar.e(2)) || (charSequence = (CharSequence) cVar.d.get("formKey")) == null || d0.W(charSequence)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, java.util.HashMap r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof pxc.p
            if (r0 == 0) goto L13
            r0 = r8
            pxc.p r0 = (pxc.p) r0
            int r1 = r0.f240613y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240613y = r1
            goto L18
        L13:
            pxc.p r0 = new pxc.p
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f240611w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240613y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.HashMap r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            r0.u = r6
            r0.v = r7
            r0.f240613y = r3
            qr0.i r8 = r4.f240615a
            java.io.Serializable r8 = r8.f(r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r5 = "formKey"
            java.util.Map r5 = zhm.r0.l(r5, r7)
            java.util.LinkedHashMap r5 = zhm.r0.p(r5, r8)
            com.revolut.core.backend_flow.api.navigation.BackendFlowDestination r7 = new com.revolut.core.backend_flow.api.navigation.BackendFlowDestination
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput$a r8 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.INSTANCE
            r0 = 0
            r1 = 4
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput r5 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.Companion.a(r8, r6, r5, r0, r1)
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pxc.r.b(java.lang.String, java.lang.String, java.util.HashMap, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pxc.q
            if (r0 == 0) goto L13
            r0 = r8
            pxc.q r0 = (pxc.q) r0
            int r1 = r0.f240614w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240614w = r1
            goto L1a
        L13:
            pxc.q r0 = new pxc.q
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240614w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L5f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            r0.f240614w = r3
            r8 = 2
            java.lang.String r8 = r7.e(r8)
            java.util.HashMap r7 = r7.d
            java.lang.String r2 = "formKey"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = kotlin.text.d0.W(r8)
            if (r3 != 0) goto L5b
            if (r2 == 0) goto L5b
            boolean r3 = kotlin.text.d0.W(r2)
            if (r3 == 0) goto L55
            goto L5b
        L55:
            java.lang.Object r7 = r6.b(r8, r2, r7, r0)
            r8 = r7
            goto L5c
        L5b:
            r8 = r4
        L5c:
            if (r8 != r1) goto L5f
            return r1
        L5f:
            com.revolut.core.backend_flow.api.navigation.BackendFlowDestination r8 = (com.revolut.core.backend_flow.api.navigation.BackendFlowDestination) r8
            if (r8 == 0) goto L7c
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r2 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            yhi.b r3 = yhi.b.SOLID
            r5 = 12
            r2.<init>(r8, r3, r4, r5)
            r1.<init>(r2)
            r0.<init>(r1)
            r7.<init>(r0, r4)
            return r7
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pxc.r.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        String str = (String) deeplink.d.get("formKey");
        if (str == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        return ue0.e.F(w.o0(kotlin.coroutines.g.f186406a, new of6.d(25, this, strE, str, deeplink, null)), Boolean.FALSE);
    }
}
