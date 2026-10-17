package t38;

import g48.r0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends pfe.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f267698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f267699n;
    public final cnh.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jt0.b f267700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zca.a f267701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xea.c f267702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cfa.g f267703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s38.n f267704t;
    public final r38.b u;
    public final ua7.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w38.t f267705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f267706x;

    public p(j60.a bottomDialogExtension, r0 jointAccountsInteractor, cnh.f pocketExtension, jt0.b pocketsWithTotalBalanceProvider, zca.a deactivateDialogModelProvider, xea.c pocketItemMapper, cfa.g removePocketExtension, s38.n openJointProductEventHandler, r38.b jointProductInteractor, ua7.f hiddenAccountsActionsExtension, w38.t pendingAccountBottomSheetProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(pocketsWithTotalBalanceProvider, "pocketsWithTotalBalanceProvider");
        Intrinsics.checkNotNullParameter(deactivateDialogModelProvider, "deactivateDialogModelProvider");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        Intrinsics.checkNotNullParameter(removePocketExtension, "removePocketExtension");
        Intrinsics.checkNotNullParameter(openJointProductEventHandler, "openJointProductEventHandler");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f267698m = bottomDialogExtension;
        this.f267699n = jointAccountsInteractor;
        this.o = pocketExtension;
        this.f267700p = pocketsWithTotalBalanceProvider;
        this.f267701q = deactivateDialogModelProvider;
        this.f267702r = pocketItemMapper;
        this.f267703s = removePocketExtension;
        this.f267704t = openJointProductEventHandler;
        this.u = jointProductInteractor;
        this.v = hiddenAccountsActionsExtension;
        this.f267705w = pendingAccountBottomSheetProvider;
        this.f267706x = featureToggleInteractor;
    }

    @Override // pfe.a
    public final Set Z2() {
        yji.n[] elements = {this.f267703s, this.v};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0243, code lost:
    
        if (r0 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0261, code lost:
    
        if (i3(r0, r3) != r4) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bf, code lost:
    
        if (r0 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0312, code lost:
    
        if (r0 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0451, code lost:
    
        if (j3(r0, r3) == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0499, code lost:
    
        if (f3(com.revolut.feature.joint.api.data.JointAccountCloseReason.ForceOffBoarding.f76465a, r3) == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:
    
        if (r0 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        if (d3(r0, r3) != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        if (e3(r3) == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (g3(r10, r3) == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c1, code lost:
    
        if (r0 == r4) goto L248;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a3  */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.m r35, kotlin.coroutines.Continuation r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.b3(sfe.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(io3.d r17, kotlin.coroutines.Continuation r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof t38.h
            if (r2 == 0) goto L17
            r2 = r1
            t38.h r2 = (t38.h) r2
            int r3 = r2.f267684y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f267684y = r3
            goto L1c
        L17:
            t38.h r2 = new t38.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f267682w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f267684y
            g48.r0 r5 = r0.f267699n
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L47
            if (r4 == r7) goto L3e
            if (r4 != r6) goto L36
            com.revolut.core.model.account.AccountId$Joint r3 = r2.v
            io3.d r2 = r2.u
            yhm.o.b(r1)
            r4 = r3
            r3 = r2
            goto L68
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            io3.d r4 = r2.u
            yhm.o.b(r1)
            r15 = r4
            r4 = r1
            r1 = r15
            goto L57
        L47:
            yhm.o.b(r1)
            r1 = r17
            r2.u = r1
            r2.f267684y = r7
            java.lang.Object r4 = t38.s.c(r5, r2)
            if (r4 != r3) goto L57
            goto L65
        L57:
            com.revolut.core.model.account.AccountId$Joint r4 = (com.revolut.core.model.account.AccountId.Joint) r4
            r2.u = r1
            r2.v = r4
            r2.f267684y = r6
            java.lang.Object r2 = r5.o(r2)
            if (r2 != r3) goto L66
        L65:
            return r3
        L66:
            r3 = r1
            r1 = r2
        L68:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
            com.revolut.feature.pockets.api.navigation.PocketDetailsDestination r1 = new com.revolut.feature.pockets.api.navigation.PocketDetailsDestination
            com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData r2 = new com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData
            r13 = 0
            r14 = 4016(0xfb0, float:5.628E-42)
            r5 = 1
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.<init>(r2)
            r0.A2(r1)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.c3(io3.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(xi0.b r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t38.i
            if (r0 == 0) goto L13
            r0 = r6
            t38.i r0 = (t38.i) r0
            int r1 = r0.f267686x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267686x = r1
            goto L18
        L13:
            t38.i r0 = new t38.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267686x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xi0.b r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f267686x = r3
            g48.r0 r6 = r4.f267699n
            java.lang.Object r6 = t38.s.c(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.core.model.account.AccountId$Joint r6 = (com.revolut.core.model.account.AccountId.Joint) r6
            com.revolut.feature.topup_screen.api.destination.InitTopUpDestination r0 = new com.revolut.feature.topup_screen.api.destination.InitTopUpDestination
            com.revolut.feature.topup_screen.api.config.TopUpConfig$a r1 = com.revolut.feature.topup_screen.api.config.TopUpConfig.INSTANCE
            com.revolut.feature.topup_screen.common.TopUpTarget$Joint r2 = new com.revolut.feature.topup_screen.common.TopUpTarget$Joint
            r2.<init>(r6)
            r1.getClass()
            com.revolut.feature.topup_screen.api.config.TopUpConfig r5 = com.revolut.feature.topup_screen.api.config.TopUpConfig.Companion.b(r5, r2)
            r0.<init>(r5)
            r4.A2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.d3(xi0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (Y2(r0, r2) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof t38.j
            if (r0 == 0) goto L13
            r0 = r7
            t38.j r0 = (t38.j) r0
            int r1 = r0.f267688x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267688x = r1
            goto L18
        L13:
            t38.j r0 = new t38.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267688x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r7)
            goto L9c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            j60.a r0 = r0.u
            yhm.o.b(r7)
            goto L85
        L3c:
            yhm.o.b(r7)
            goto L4e
        L40:
            yhm.o.b(r7)
            r0.f267688x = r5
            g48.r0 r7 = r6.f267699n
            java.lang.Object r7 = t38.s.c(r7, r0)
            if (r7 != r1) goto L4e
            goto L9b
        L4e:
            com.revolut.core.model.account.AccountId$Joint r7 = (com.revolut.core.model.account.AccountId.Joint) r7
            com.revolut.feature.statements.api.StatementsApi$FeatureToggles$DocumentsHub r2 = com.revolut.feature.statements.api.StatementsApi$FeatureToggles.DocumentsHub.f88209c
            gte.a r5 = r6.f267706x
            jte.d r5 = (jte.d) r5
            boolean r2 = r5.c(r2)
            if (r2 != 0) goto L8d
            com.revolut.feature.statements.api.StatementsApi$FeatureToggles$DocumentsHubMvp r2 = com.revolut.feature.statements.api.StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c
            boolean r2 = r5.c(r2)
            if (r2 == 0) goto L65
            goto L8d
        L65:
            j60.a r2 = r6.f267698m
            r0.u = r2
            r0.f267688x = r4
            jt0.b r3 = r6.f267700p
            tfm.n4 r7 = r3.m0(r7)
            vkm.d r7 = rd0.e.b(r7)
            t38.e r3 = new t38.e
            r4 = 0
            java.lang.String r5 = "STATEMENT_ACTION"
            r3.<init>(r7, r4, r6, r5)
            java.lang.Object r7 = vkm.q.x(r3, r0)
            if (r7 != r1) goto L84
            goto L9b
        L84:
            r0 = r2
        L85:
            rp0.y r7 = (rp0.y) r7
            r0.x(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L8d:
            t38.k r2 = new t38.k
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f267688x = r3
            java.lang.Object r7 = r6.Y2(r0, r2)
            if (r7 != r1) goto L9c
        L9b:
            return r1
        L9c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.e3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(com.revolut.feature.joint.api.data.JointAccountCloseReason.ForceOffBoarding r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t38.l
            if (r0 == 0) goto L13
            r0 = r6
            t38.l r0 = (t38.l) r0
            int r1 = r0.f267691x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267691x = r1
            goto L18
        L13:
            t38.l r0 = new t38.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267691x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.joint.api.data.JointAccountCloseReason$ForceOffBoarding r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f267691x = r3
            g48.r0 r6 = r4.f267699n
            java.lang.Object r6 = t38.s.c(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.core.model.account.AccountId$Joint r6 = (com.revolut.core.model.account.AccountId.Joint) r6
            com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$Close$Destination r0 = new com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$Close$Destination
            r0.<init>(r6, r5)
            r4.A2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.f3(com.revolut.feature.joint.api.data.JointAccountCloseReason$ForceOffBoarding, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(io3.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t38.m
            if (r0 == 0) goto L13
            r0 = r6
            t38.m r0 = (t38.m) r0
            int r1 = r0.f267693x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267693x = r1
            goto L18
        L13:
            t38.m r0 = new t38.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267693x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            io3.d r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f267693x = r3
            g48.r0 r6 = r4.f267699n
            java.lang.Object r6 = t38.s.c(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.core.model.account.AccountId$Joint r6 = (com.revolut.core.model.account.AccountId.Joint) r6
            com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig$AccountsStatementDestination r0 = new com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig$AccountsStatementDestination
            xi0.b r5 = z92.f.l(r5)
            java.util.Set r5 = zhm.y0.b(r5)
            com.revolut.feature.statements.api.navigation.AccountStatementProduct$JointCurrent r1 = new com.revolut.feature.statements.api.navigation.AccountStatementProduct$JointCurrent
            r1.<init>(r6)
            r0.<init>(r5, r1)
            r4.A2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.g3(io3.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(xi0.b r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof t38.n
            if (r0 == 0) goto L13
            r0 = r10
            t38.n r0 = (t38.n) r0
            int r1 = r0.f267695x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267695x = r1
            goto L18
        L13:
            t38.n r0 = new t38.n
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267695x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            xi0.b r9 = r0.u
            yhm.o.b(r10)
        L28:
            r3 = r9
            goto L42
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            r0.u = r9
            r0.f267695x = r3
            g48.r0 r10 = r8.f267699n
            java.lang.Object r10 = t38.s.c(r10, r0)
            if (r10 != r1) goto L28
            return r1
        L42:
            com.revolut.core.model.account.AccountId$Joint r10 = (com.revolut.core.model.account.AccountId.Joint) r10
            com.revolut.feature.topup_screen.api.destination.InitTopUpDestination r9 = new com.revolut.feature.topup_screen.api.destination.InitTopUpDestination
            com.revolut.feature.topup_screen.api.config.TopUpConfig$a r2 = com.revolut.feature.topup_screen.api.config.TopUpConfig.INSTANCE
            com.revolut.feature.topup_screen.common.TopUpTarget$Joint r5 = new com.revolut.feature.topup_screen.common.TopUpTarget$Joint
            r5.<init>(r10)
            r6 = 0
            r7 = 10
            r4 = 0
            com.revolut.feature.topup_screen.api.config.TopUpConfig r10 = com.revolut.feature.topup_screen.api.config.TopUpConfig.Companion.c(r2, r3, r4, r5, r6, r7)
            r9.<init>(r10)
            r8.A2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.h3(xi0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(io3.d r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t38.o
            if (r0 == 0) goto L13
            r0 = r8
            t38.o r0 = (t38.o) r0
            int r1 = r0.f267697x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267697x = r1
            goto L18
        L13:
            t38.o r0 = new t38.o
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267697x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            io3.d r7 = r0.u
            yhm.o.b(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            r0.u = r7
            r0.f267697x = r3
            g48.r0 r8 = r6.f267699n
            java.lang.Object r8 = t38.s.c(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            com.revolut.core.model.account.AccountId$Joint r8 = (com.revolut.core.model.account.AccountId.Joint) r8
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$WithdrawFlow r2 = new com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$WithdrawFlow
            xi0.b r3 = new xi0.b
            java.lang.String r7 = r7.f163147c
            r4 = 0
            r5 = 6
            r3.<init>(r5, r7, r4)
            r2.<init>(r3, r8)
            r1.<init>(r2)
            r0.<init>(r1)
            r6.A2(r0)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.p.i3(io3.d, gim.c):java.lang.Object");
    }

    public final Object j3(String str, Continuation continuation) {
        Object objY2 = Y2(continuation, new sb4.i(this, str, null, 12));
        return objY2 == fim.a.COROUTINE_SUSPENDED ? objY2 : Unit.f186387a;
    }
}
