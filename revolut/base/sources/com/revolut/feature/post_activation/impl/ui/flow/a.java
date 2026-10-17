package com.revolut.feature.post_activation.impl.ui.flow;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import d8l.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mfa.b;
import oki.h;
import pfa.i;
import pfa.l;
import qfa.e;
import retrofit2.HttpException;
import rfa.c;
import skm.h0;
import wim.z;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements c {
    public final PostActivationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f80941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f80942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cwj.a f80943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f80944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fwj.b f80945t;
    public final com.revolut.retail.feature.api.userauth.navigation.a u;
    public final sf0.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f80946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h0 f80947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yki.i f80948y;

    public a(PostActivationFlowContract$InputData inputData, b postActivationStatusInteractor, l postActivationOnLoginCommandProvider, cwj.a userActivationAnimationCoordinator, i postActivationNavigationProvider, fwj.b userAuthLogoutInteractor, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, sf0.h serverErrorParser, e repository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(postActivationStatusInteractor, "postActivationStatusInteractor");
        Intrinsics.checkNotNullParameter(postActivationOnLoginCommandProvider, "postActivationOnLoginCommandProvider");
        Intrinsics.checkNotNullParameter(userActivationAnimationCoordinator, "userActivationAnimationCoordinator");
        Intrinsics.checkNotNullParameter(postActivationNavigationProvider, "postActivationNavigationProvider");
        Intrinsics.checkNotNullParameter(userAuthLogoutInteractor, "userAuthLogoutInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = inputData;
        this.f80941p = postActivationStatusInteractor;
        this.f80942q = postActivationOnLoginCommandProvider;
        this.f80943r = userActivationAnimationCoordinator;
        this.f80944s = postActivationNavigationProvider;
        this.f80945t = userAuthLogoutInteractor;
        this.u = userOnboardingNavigationProvider;
        this.v = serverErrorParser;
        this.f80946w = repository;
        this.f80948y = d.a(this, new r6f.i(this, 17));
    }

    public static final Object I2(a aVar, gim.i iVar) {
        PostActivationFlowDescriptor.Configuration configuration = aVar.o.f80938a;
        if (configuration instanceof PostActivationFlowDescriptor.Configuration.Login) {
            return aVar.f80942q.a(u0.b(((PostActivationFlowDescriptor.Configuration.Login) configuration).f80935a), iVar);
        }
        if (!(configuration instanceof PostActivationFlowDescriptor.Configuration.Onboarding)) {
            throw new NoWhenBranchMatchedException();
        }
        PostActivationFlowDescriptor.Configuration.Onboarding onboarding = (PostActivationFlowDescriptor.Configuration.Onboarding) configuration;
        return aVar.f80944s.c(onboarding.f80937b, onboarding.f80936a, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r12 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r12 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        if (r0.K2(r11, r2) != r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[PHI: r0
      0x00ab: PHI (r0v4 com.revolut.feature.post_activation.impl.ui.flow.a) = (r0v3 com.revolut.feature.post_activation.impl.ui.flow.a), (r0v5 com.revolut.feature.post_activation.impl.ui.flow.a) binds: [B:37:0x009c, B:42:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.post_activation.impl.ui.flow.a r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.post_activation.impl.ui.flow.a.J2(com.revolut.feature.post_activation.impl.ui.flow.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(aii.u r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof rfa.h
            if (r0 == 0) goto L13
            r0 = r10
            rfa.h r0 = (rfa.h) r0
            int r1 = r0.f253745x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253745x = r1
            goto L18
        L13:
            rfa.h r0 = new rfa.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253745x
            cwj.a r3 = r8.f80943r
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            aii.u r9 = r0.u
            yhm.o.b(r10)
            goto L99
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            aii.u r9 = r0.u
            yhm.o.b(r10)
            goto L82
        L3d:
            yhm.o.b(r10)
            r0.u = r9
            r0.f253745x = r5
            vkm.z1 r10 = r3.f109829a
            kotlinx.coroutines.flow.StateFlow r2 = r10.l()
            wkm.y r2 = (wkm.y) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L7d
            skm.r r2 = r3.f109831c
            if (r2 == 0) goto L6d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r5 = "Expected animationCompleted to be null"
            r2.<init>(r5)
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r7 = 0
            rd0.d.a(r6, r7, r7, r2, r5)
        L6d:
            skm.r r2 = skm.e0.b()
            r3.f109831c = r2
            kotlin.Unit r2 = kotlin.Unit.f186387a
            java.lang.Object r10 = r10.emit(r2, r0)
            if (r10 != r1) goto L7f
            r2 = r10
            goto L7f
        L7d:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L7f:
            if (r2 != r1) goto L82
            goto L98
        L82:
            r0.u = r9
            r0.f253745x = r4
            skm.r r10 = r3.f109831c
            if (r10 == 0) goto L94
            java.lang.Object r10 = r10.y(r0)
            if (r10 != r1) goto L91
            goto L96
        L91:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            goto L96
        L94:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L96:
            if (r10 != r1) goto L99
        L98:
            return r1
        L99:
            r8.C1(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.post_activation.impl.ui.flow.a.K2(aii.u, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        PostActivationFlowDescriptor.Configuration configuration = this.o.f80938a;
        if ((configuration instanceof PostActivationFlowDescriptor.Configuration.Onboarding) && ((PostActivationFlowDescriptor.Configuration.Onboarding) configuration).f80937b) {
            ue0.c cVar = this.f80946w.f245284c;
            cVar.G(Boolean.TRUE, "POST_ACTIVATION_NEEDED_KEY", z.d(o0.b(Boolean.TYPE)));
            cVar.I0("POST_ACTIVATION_COMPLETED_KEY");
        }
        l2(new rfa.i(this, configuration, null), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        ServerError serverErrorC;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            if (httpException.code() == 401 && (serverErrorC = this.v.c(httpException)) != null && serverErrorC.f51362a == q89.a.UNAUTHORISED_ERROR_CODE.a()) {
                l2(new rfa.e(this, null, 2), new yi5.b(26));
                return true;
            }
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP))));
        h.D2(this.f80948y);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80948y;
    }
}
