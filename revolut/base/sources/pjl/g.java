package pjl;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm.e f236811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm.e f236812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm.e f236813c;
    public final voi.f d;
    public final lm.e e;
    public final voi.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a2 f236814g;

    public g(lm.e coroutineScope, lm.e revolutAccountsManager, lm.e revolutSsoDependenciesProvider, voi.f navigator, lm.e userLogoutInteractor, voi.f featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f236811a = coroutineScope;
        this.f236812b = revolutAccountsManager;
        this.f236813c = revolutSsoDependenciesProvider;
        this.d = navigator;
        this.e = userLogoutInteractor;
        this.f = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(pjl.g r8, java.util.List r9, gim.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof pjl.f
            if (r0 == 0) goto L13
            r0 = r10
            pjl.f r0 = (pjl.f) r0
            int r1 = r0.f236810y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236810y = r1
            goto L18
        L13:
            pjl.f r0 = new pjl.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f236808w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236810y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            goto L8a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            bjl.p0 r9 = r0.v
            java.util.List r2 = r0.u
            java.util.List r2 = (java.util.List) r2
            yhm.o.b(r10)
            com.revolut.feature.identity.auth.domain.model.IndividualIdentityId r10 = (com.revolut.feature.identity.auth.domain.model.IndividualIdentityId) r10
            if (r10 == 0) goto L43
            java.lang.String r10 = r10.f74763a
            goto L66
        L43:
            r10 = r5
            goto L66
        L45:
            yhm.o.b(r10)
            lm.e r10 = r8.f236813c
            java.lang.Object r10 = r10.get()
            bjl.p0 r10 = (bjl.p0) r10
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            r0.u = r2
            r0.v = r10
            r0.f236810y = r4
            rqk.k r10 = (rqk.k) r10
            java.lang.Object r2 = r10.a(r0)
            if (r2 != r1) goto L62
            goto L89
        L62:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L66:
            java.lang.String r10 = (java.lang.String) r10
            rqk.k r9 = (rqk.k) r9
            asi.d r9 = r9.o
            asi.c r9 = r9.a()
            asi.c r6 = asi.c.ABSENT
            if (r9 == r6) goto L76
            r9 = r4
            goto L77
        L76:
            r9 = 0
        L77:
            cjl.b r6 = cjl.b.RETAIL
            if (r9 == 0) goto Lb9
            if (r10 == 0) goto Lb9
            r0.u = r5
            r0.v = r5
            r0.f236810y = r3
            java.lang.Object r10 = r8.b(r2, r10, r6, r0)
            if (r10 != r1) goto L8a
        L89:
            return r1
        L8a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto Lb9
            lm.e r9 = r8.e
            java.lang.Object r9 = r9.get()
            mli.e r9 = (mli.e) r9
            efm.b r9 = mli.e.b(r9)
            r9.getClass()
            ofm.f r10 = new ofm.f
            r10.<init>(r4)
            r9.d(r10)
            r10.a()
            voi.f r8 = r8.d
            java.lang.Object r8 = r8.get()
            sri.m r8 = (sri.m) r8
            com.revolut.retail.core.navigation.RestartApplicationCommand r9 = com.revolut.retail.core.navigation.RestartApplicationCommand.f98667a
            r8.c(r9)
        Lb9:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.g.a(pjl.g, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r11 != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ac -> B:28:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r18, java.lang.String r19, cjl.b r20, gim.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.g.b(java.util.List, java.lang.String, cjl.b, gim.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        if (((jte.d) ((gte.a) this.f.get())).c(RevolutSsoApi$Toggles.ForceLogoutOnAccountDeleteFeatureEnabled.f105877c)) {
            a2 a2Var = this.f236814g;
            Continuation continuation = null;
            if (a2Var != null) {
                a2Var.f(null);
            }
            CoroutineScope coroutineScope = (CoroutineScope) this.f236811a.get();
            skm.p0 p0Var = skm.p0.f264001a;
            this.f236814g = skm.e0.C(coroutineScope, elm.f.f127540b, null, new pe2.l(this, continuation, 11), 2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        a2 a2Var = this.f236814g;
        if (a2Var != null) {
            a2Var.f(null);
        }
        super.onStop(owner);
    }
}
