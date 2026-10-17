package com.revolut.feature.freelancer.impl.ui.onboarding.flow;

import aii.u;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import et6.y1;
import gr6.p;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jr6.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx2.f;
import nz6.c;
import oki.h;
import qki.d;
import skm.a2;
import til.m;
import vkm.j2;
import yki.i;
import zfe.e;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements nz6.b, oz6.a {
    public final AtomicBoolean A;
    public final Set B;
    public final d C;
    public final i D;
    public final gr6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qz6.i f73993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y1 f73994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f73995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f73996s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FreelancerOnboardingFlowContract$InputData f73997t;
    public final rz6.a u;
    public final m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jf1.a f73998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f73999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gr6.m f74000y;
    public a2 z;

    public b(gr6.a freelancerAccountDetailsInteractor, qz6.i freelancerOnboardingEligibilityChecker, y1 freelancerOnboardingInteractor, r freelancerPendingPromptFactory, p freelancerProductArticleInteractor, FreelancerOnboardingFlowContract$InputData inputData, rz6.a itemMapper, m workflowFlowProvider, jf1.a merchantTogglesInteractor, e newAccountDestinationResolver, gr6.m freelancerPocketsInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerOnboardingEligibilityChecker, "freelancerOnboardingEligibilityChecker");
        Intrinsics.checkNotNullParameter(freelancerOnboardingInteractor, "freelancerOnboardingInteractor");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(merchantTogglesInteractor, "merchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        this.o = freelancerAccountDetailsInteractor;
        this.f73993p = freelancerOnboardingEligibilityChecker;
        this.f73994q = freelancerOnboardingInteractor;
        this.f73995r = freelancerPendingPromptFactory;
        this.f73996s = freelancerProductArticleInteractor;
        this.f73997t = inputData;
        this.u = itemMapper;
        this.v = workflowFlowProvider;
        this.f73998w = merchantTogglesInteractor;
        this.f73999x = newAccountDestinationResolver;
        this.f74000y = freelancerPocketsInteractor;
        this.A = new AtomicBoolean(false);
        yja.b[] elements = {yja.b.NEXT_CLICK, yja.b.NOT_FOUND};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.B = kotlin.collections.d.y0(elements);
        this.C = hx7.e.b(this, new FreelancerOnboardingFlowContract$DomainState(0));
        this.D = d8l.d.a(this, new f(this, 7));
    }

    public static final void I2(b bVar) {
        i iVar = bVar.D;
        FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy = bVar.f73997t.f73980c;
        if (freelancerOnboardingNavStrategy instanceof FreelancerOnboardingNavStrategy.NavigateToCustom) {
            bVar.C1(u0.b(((FreelancerOnboardingNavStrategy.NavigateToCustom) freelancerOnboardingNavStrategy).f73260a));
            h.D2(iVar);
            return;
        }
        if (!(freelancerOnboardingNavStrategy instanceof FreelancerOnboardingNavStrategy.NavigateToMain)) {
            bVar.C2(c.f220956a);
            Unit unit = Unit.f186387a;
            h.D2(iVar);
            return;
        }
        u uVarB = ((FreelancerOnboardingFlowContract$DomainState) ((j2) bVar.C.f22677a).getValue()).f;
        if (uVarB == null) {
            MainScreenTab mainScreenTab = ibb.c.f160140a;
            ProductId productId = ProductId.PRO;
            sha.b.Companion.getClass();
            uVarB = u0.b(jbb.a.a(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(sha.a.f263448b, null), productId), null), null, null, 12));
        }
        bVar.C1(uVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof nz6.i
            if (r0 == 0) goto L16
            r0 = r8
            nz6.i r0 = (nz6.i) r0
            int r1 = r0.f220965y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f220965y = r1
            goto L1b
        L16:
            nz6.i r0 = new nz6.i
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f220963w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220965y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.u
            yhm.o.b(r8)
            return r7
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            int r2 = r0.v
            java.lang.Object r4 = r0.u
            yhm.o.b(r8)
            goto L6c
        L42:
            yhm.o.b(r8)
            goto L56
        L46:
            yhm.o.b(r8)
            gr6.a r8 = r7.o
            r0.f220965y = r5
            et6.g r8 = (et6.g) r8
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r1) goto L56
            goto L8a
        L56:
            r2 = r8
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState r2 = (com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState) r2
            boolean r2 = r2 instanceof com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.NotOnboarded
            if (r2 != 0) goto L8c
            r0.u = r8
            r2 = 0
            r0.v = r2
            r0.f220965y = r4
            java.lang.Object r4 = r7.N2(r0)
            if (r4 != r1) goto L6b
            goto L8a
        L6b:
            r4 = r8
        L6c:
            jf1.a r7 = r7.f73998w
            r0.u = r4
            r0.v = r2
            r0.f220965y = r3
            zfc.d r7 = (zfc.d) r7
            o7.b r8 = r7.f321922a
            kotlin.Unit r2 = kotlin.Unit.f186387a
            zfc.c r3 = new zfc.c
            r5 = 2
            r6 = 0
            r3.<init>(r7, r6, r5)
            java.lang.Object r7 = r8.x(r2, r3, r0)
            if (r7 != r1) goto L88
            r2 = r7
        L88:
            if (r2 != r1) goto L8b
        L8a:
            return r1
        L8b:
            return r4
        L8c:
            com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerNotOnboardedException r7 = new com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerNotOnboardedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.J2(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof nz6.k
            if (r0 == 0) goto L13
            r0 = r8
            nz6.k r0 = (nz6.k) r0
            int r1 = r0.f220969w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220969w = r1
            goto L18
        L13:
            nz6.k r0 = new nz6.k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220969w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L64
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L49
        L37:
            yhm.o.b(r8)
            nz6.g r8 = new nz6.g
            r2 = 3
            r8.<init>(r7, r3, r2)
            r0.f220969w = r5
            java.lang.Object r8 = r7.p2(r0, r8)
            if (r8 != r1) goto L49
            goto L63
        L49:
            com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$InputData r8 = r7.f73997t
            com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig r8 = r8.f73978a
            boolean r8 = r8 instanceof com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig.ShowArticle
            if (r8 == 0) goto L67
            r0.f220969w = r4
            com.revolut.feature.freelancer.impl.ui.onboarding.flow.a r8 = new com.revolut.feature.freelancer.impl.ui.onboarding.flow.a
            r8.<init>(r7, r3)
            java.lang.Object r7 = r7.p2(r0, r8)
            if (r7 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L61:
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L67:
            yki.i r1 = r7.D
            com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step r2 = r7.L2()
            r5 = 0
            r6 = 12
            r3 = 1
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.K2(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b, gim.c):java.lang.Object");
    }

    public final FreelancerOnboardingFlowContract$Step L2() {
        String str = ((FreelancerOnboardingFlowContract$DomainState) ((j2) this.C.f22677a).getValue()).e;
        return str != null ? new FreelancerOnboardingFlowContract$Step.WorkflowOnboarding(str) : this.f73997t.f73979b;
    }

    @Override // yki.j
    public final void M0() {
        l2(new nz6.h(this, null, 2), new yi5.b(26));
    }

    public final KompotDestination M2() {
        KompotDestination kompotDestination = ((FreelancerOnboardingFlowContract$DomainState) ((j2) this.C.f22677a).getValue()).f;
        return kompotDestination != null ? kompotDestination : new MainContainerScreenDestination.JustShow(ibb.c.f160140a.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof nz6.j
            if (r0 == 0) goto L13
            r0 = r11
            nz6.j r0 = (nz6.j) r0
            int r1 = r0.f220968y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220968y = r1
            goto L18
        L13:
            nz6.j r0 = new nz6.j
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f220966w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220968y
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L2b
            goto L87
        L2b:
            r11 = move-exception
            goto L98
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            int r2 = r0.v
            int r3 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L2b
            goto L5e
        L3d:
            yhm.o.b(r11)
            gr6.m r11 = r10.f74000y     // Catch: java.lang.Exception -> L2b
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Exception -> L2b
            et6.i2 r11 = (et6.i2) r11     // Catch: java.lang.Exception -> L2b
            vkm.d r11 = r11.c(r2)     // Catch: java.lang.Exception -> L2b
            r2 = 3
            jhi.b r11 = mo3.a.g(r11, r5, r5, r2)     // Catch: java.lang.Exception -> L2b
            r2 = 0
            r0.u = r2     // Catch: java.lang.Exception -> L2b
            r0.v = r2     // Catch: java.lang.Exception -> L2b
            r0.f220968y = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = vkm.q.x(r11, r0)     // Catch: java.lang.Exception -> L2b
            if (r11 != r1) goto L5d
            goto L86
        L5d:
            r3 = r2
        L5e:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L2b
            zfe.e r6 = r10.f73999x     // Catch: java.lang.Exception -> L2b
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r7 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main     // Catch: java.lang.Exception -> L2b
            com.revolut.feature.tab.accounts.models.ProductId r8 = com.revolut.feature.tab.accounts.models.ProductId.PRO     // Catch: java.lang.Exception -> L2b
            com.revolut.feature.tab.accounts.models.ProductAccountId r9 = new com.revolut.feature.tab.accounts.models.ProductAccountId     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = zhm.d0.b0(r11)     // Catch: java.lang.Exception -> L2b
            io3.d r11 = (io3.d) r11     // Catch: java.lang.Exception -> L2b
            java.lang.String r11 = r11.f163145a     // Catch: java.lang.Exception -> L2b
            r9.<init>(r11, r5)     // Catch: java.lang.Exception -> L2b
            r7.<init>(r9, r8)     // Catch: java.lang.Exception -> L2b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r11 = ibb.c.f160140a     // Catch: java.lang.Exception -> L2b
            r0.u = r3     // Catch: java.lang.Exception -> L2b
            r0.v = r2     // Catch: java.lang.Exception -> L2b
            r0.f220968y = r4     // Catch: java.lang.Exception -> L2b
            cge.e r6 = (cge.e) r6     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = r6.b(r7, r11, r5, r0)     // Catch: java.lang.Exception -> L2b
            if (r11 != r1) goto L87
        L86:
            return r1
        L87:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r11 = (com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.JustShow) r11     // Catch: java.lang.Exception -> L2b
            qki.d r0 = r10.C     // Catch: java.lang.Exception -> L2b
            nya.b0 r1 = new nya.b0     // Catch: java.lang.Exception -> L2b
            r2 = 11
            r1.<init>(r11, r2)     // Catch: java.lang.Exception -> L2b
            r10.H2(r0, r1)     // Catch: java.lang.Exception -> L2b
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2b
            goto La1
        L98:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r5, r5, r11, r0)
        La1:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.N2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nz6.l
            if (r0 == 0) goto L13
            r0 = r6
            nz6.l r0 = (nz6.l) r0
            int r1 = r0.f220970w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220970w = r1
            goto L18
        L13:
            nz6.l r0 = new nz6.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220970w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            skm.a2 r6 = r5.z
            r2 = 0
            if (r6 == 0) goto L3a
            r6.f(r2)
        L3a:
            nz6.h r6 = new nz6.h
            r4 = 3
            r6.<init>(r5, r2, r4)
            yi5.b r2 = new yi5.b
            r4 = 26
            r2.<init>(r4)
            skm.a2 r6 = r5.l2(r6, r2)
            r5.z = r6
            r0.f220970w = r3
            java.lang.Object r6 = r6.u(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.O2(gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final d getState() {
        return this.C;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.D;
    }
}
