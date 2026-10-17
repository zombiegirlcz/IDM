package d78;

import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import rp0.k1;
import zh9.u0;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends pfe.c {
    public final f88.k A;
    public final f88.e B;
    public final LinkedHashSet C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wsg.n f111846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t78.i f111847n;
    public final f88.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oqk.k f111848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c84.c f111849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rc8.k f111850r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rc8.e f111851s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r10.f f111852t;
    public final t78.f u;
    public final ob8.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k1 f111853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final nxk.a f111854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ua7.f f111855y;
    public final r78.c z;

    public k(wsg.n walletInteractor, t78.i juniorDashboardSectionClickHandler, f88.f juniorPendingProductAccountClickHandler, oqk.k transactionsWidgetActionExtension, c84.c juniorDashboardCloseAccountHandler, c84.c juniorDashboardAllowanceItemClickHandler, rc8.k juniorAccountClosureModelExtension, rc8.e closeConfirmationModelExtension, cc7.l juniorDashboardBottomSheetDelegate, c84.c juniorDashboardPrefetchHandler, t78.k juniorDashboardStatusWidgetClickHandler, r10.f juniorGraduationUiInteractor, t78.f juniorDashboardGraduationDialogHandler, ob8.a juniorAllowanceControllerModelExtension, k1 homeShotDialogDisplayer, nxk.a productCommsCommandProvider, ua7.f hiddenAccountsActionsExtension, r78.c removeJuniorPocketControllerExtension, f88.k juniorStatementAccountClickHandler, f88.e juniorAddMoneyClickHandler) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorDashboardSectionClickHandler, "juniorDashboardSectionClickHandler");
        Intrinsics.checkNotNullParameter(juniorPendingProductAccountClickHandler, "juniorPendingProductAccountClickHandler");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(juniorDashboardCloseAccountHandler, "juniorDashboardCloseAccountHandler");
        Intrinsics.checkNotNullParameter(juniorDashboardAllowanceItemClickHandler, "juniorDashboardAllowanceItemClickHandler");
        Intrinsics.checkNotNullParameter(juniorAccountClosureModelExtension, "juniorAccountClosureModelExtension");
        Intrinsics.checkNotNullParameter(closeConfirmationModelExtension, "closeConfirmationModelExtension");
        Intrinsics.checkNotNullParameter(juniorDashboardBottomSheetDelegate, "juniorDashboardBottomSheetDelegate");
        Intrinsics.checkNotNullParameter(juniorDashboardPrefetchHandler, "juniorDashboardPrefetchHandler");
        Intrinsics.checkNotNullParameter(juniorDashboardStatusWidgetClickHandler, "juniorDashboardStatusWidgetClickHandler");
        Intrinsics.checkNotNullParameter(juniorGraduationUiInteractor, "juniorGraduationUiInteractor");
        Intrinsics.checkNotNullParameter(juniorDashboardGraduationDialogHandler, "juniorDashboardGraduationDialogHandler");
        Intrinsics.checkNotNullParameter(juniorAllowanceControllerModelExtension, "juniorAllowanceControllerModelExtension");
        Intrinsics.checkNotNullParameter(homeShotDialogDisplayer, "homeShotDialogDisplayer");
        Intrinsics.checkNotNullParameter(productCommsCommandProvider, "productCommsCommandProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(removeJuniorPocketControllerExtension, "removeJuniorPocketControllerExtension");
        Intrinsics.checkNotNullParameter(juniorStatementAccountClickHandler, "juniorStatementAccountClickHandler");
        Intrinsics.checkNotNullParameter(juniorAddMoneyClickHandler, "juniorAddMoneyClickHandler");
        this.f111846m = walletInteractor;
        this.f111847n = juniorDashboardSectionClickHandler;
        this.o = juniorPendingProductAccountClickHandler;
        this.f111848p = transactionsWidgetActionExtension;
        this.f111849q = juniorDashboardAllowanceItemClickHandler;
        this.f111850r = juniorAccountClosureModelExtension;
        this.f111851s = closeConfirmationModelExtension;
        this.f111852t = juniorGraduationUiInteractor;
        this.u = juniorDashboardGraduationDialogHandler;
        this.v = juniorAllowanceControllerModelExtension;
        this.f111853w = homeShotDialogDisplayer;
        this.f111854x = productCommsCommandProvider;
        this.f111855y = hiddenAccountsActionsExtension;
        this.z = removeJuniorPocketControllerExtension;
        this.A = juniorStatementAccountClickHandler;
        this.B = juniorAddMoneyClickHandler;
        yji.n[] elements = {juniorDashboardSectionClickHandler, juniorDashboardAllowanceItemClickHandler, transactionsWidgetActionExtension, juniorPendingProductAccountClickHandler, juniorAccountClosureModelExtension, closeConfirmationModelExtension, juniorDashboardCloseAccountHandler, juniorDashboardBottomSheetDelegate, juniorDashboardPrefetchHandler, juniorDashboardStatusWidgetClickHandler, juniorDashboardGraduationDialogHandler, juniorAllowanceControllerModelExtension, hiddenAccountsActionsExtension, removeJuniorPocketControllerExtension, juniorStatementAccountClickHandler, juniorAddMoneyClickHandler};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.C = a1.l(kotlin.collections.d.y0(elements), removeJuniorPocketControllerExtension.f252048r);
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.C;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c5, code lost:
    
        if (r2.Z2(r6, r3) == r4) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0209, code lost:
    
        if (r1 == r4) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x022e, code lost:
    
        if (r1 == r4) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0552, code lost:
    
        if (r1 == r4) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0582, code lost:
    
        if (r19.u.Z2((com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload.GraduationPendingDialog) r2, r3) == r4) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0607, code lost:
    
        if (nim.a.a(r1, r3) == r4) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:
    
        if (r1 == r4) goto L324;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
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
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d78.k.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c3(Object obj2) {
        if (obj2 instanceof n88.f) {
            n88.f fVar = (n88.f) obj2;
            if (!(fVar instanceof n88.d)) {
                if (!(fVar instanceof n88.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                A2(u0.b(new FeatureCommand(new CardOrderNewFeatureConfig(SelectedTab.JUNIOR, null, null, null, null, false, null, null, null, null, null, null, 16382))));
                return;
            }
            n88.d dVar = (n88.d) obj2;
            String walletId = dVar.f213280a;
            String str = dVar.f213281b;
            n63.a animation = n63.a.ZoomWidgets;
            t78.i iVar = this.f111847n;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (d0.W(walletId)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("wallet Id shouldn't be blank");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
            iVar.A2(new CardsCarouselFlowDestination(walletId, n63.b.JUNIOR, null, null, str == null ? CardScreenAction.Idle.f65329a : new CardScreenAction.Select(str, 6, false, false), animation, 12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(sfe.m r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d78.k.d3(sfe.m, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d78.j
            if (r0 == 0) goto L13
            r0 = r6
            d78.j r0 = (d78.j) r0
            int r1 = r0.f111845x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111845x = r1
            goto L18
        L13:
            d78.j r0 = new d78.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111845x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
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
            r0.f111845x = r3
            r10.f r6 = r4.f111852t
            java.lang.Object r6 = r6.w0(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload$GraduationPendingDialog r6 = new com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload$GraduationPendingDialog
            r6.<init>(r5)
            return r6
        L4f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d78.k.e3(java.lang.String, gim.c):java.lang.Object");
    }

    public final void f3(sfe.m mVar) {
        Object obj2 = mVar.f262421c;
        p78.c cVar = obj2 instanceof p78.c ? (p78.c) obj2 : null;
        if (cVar == null) {
            return;
        }
        A2(new JuniorSettingsKompotFeatureConfig.DefaultDestination(cVar.a().f262361b, JuniorSettingsKompotFeatureConfig.InitialStep.Home.f77261a));
    }
}
