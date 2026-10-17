package com.revolut.feature.joint.impl.ui.deeplink;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import g48.r0;
import gim.c;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n38.q;
import oki.h;
import qki.d;
import rch.o;
import vkm.j2;
import vkm.v1;
import vmf.k;
import vq5.w;
import wsg.n;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements w48.b {
    public final JointDeeplinkFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f76547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f76548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f76549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f76550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f76551t;

    public a(JointDeeplinkFlowContract$InputData inputData, r0 jointAccountsInteractor, b jointDeeplinkPromptContentMapper, n walletInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointDeeplinkPromptContentMapper, "jointDeeplinkPromptContentMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = inputData;
        this.f76547p = jointAccountsInteractor;
        this.f76548q = jointDeeplinkPromptContentMapper;
        this.f76549r = walletInteractor;
        this.f76550s = e.b(this, new JointDeeplinkFlowContract$State(null));
        this.f76551t = d8l.d.a(this, new o(2, this, a.class, "getController", "getController(Lcom/revolut/kompot/navigable/vc/flow/FlowCoordinator;Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step;)Lcom/revolut/kompot/navigable/Controller;", 0, 19));
    }

    public final Object I2(c cVar) {
        q[] elements = {q.ACTIVE, q.OFFBOARDING, q.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return vkm.q.z(new v1(new w(new vvh.e(mo3.a.g(this.f76547p.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), null, new w2.d(17), 1), 1), (Continuation) null, this)), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (L2(r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        if (L2(r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
    
        if (L2(r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0136, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.deeplink.a.J2(java.lang.String, gim.c):java.lang.Object");
    }

    public final void K2() {
        TabAccountsLaunchConfig tabAccountsLaunchConfig;
        String str = ((JointDeeplinkFlowContract$State) ((j2) this.f76550s.f22677a).getValue()).f76543a;
        if (str != null) {
            tabAccountsLaunchConfig = new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.JOINT), null);
        } else {
            tabAccountsLaunchConfig = null;
        }
        C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a, tabAccountsLaunchConfig, (AccountCreationTransitionAnimation) null, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof w48.j
            if (r0 == 0) goto L13
            r0 = r7
            w48.j r0 = (w48.j) r0
            int r1 = r0.f294530w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294530w = r1
            goto L18
        L13:
            w48.j r0 = new w48.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294530w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L69
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L42
        L36:
            yhm.o.b(r7)
            r0.f294530w = r4
            java.lang.Object r7 = r6.I2(r0)
            if (r7 != r1) goto L42
            goto L68
        L42:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L6b
            r0.f294530w = r3
            w4l.h r7 = w4l.h.f294642c
            g48.r0 r2 = r6.f76547p
            r3 = 0
            kotlinx.coroutines.flow.Flow r7 = r2.j(r3, r7)
            w2.d r2 = new w2.d
            r5 = 18
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            vvh.e r2 = new vvh.e
            r3 = 2
            r2.<init>(r7, r3)
            java.lang.Object r7 = vkm.q.z(r2, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            java.lang.String r7 = (java.lang.String) r7
        L6b:
            vb2.r r0 = new vb2.r
            r1 = 26
            r0.<init>(r7, r1)
            qki.d r7 = r6.f76550s
            r6.H2(r7, r0)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.deeplink.a.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 24), new yi5.b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.f76550s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76551t;
    }
}
