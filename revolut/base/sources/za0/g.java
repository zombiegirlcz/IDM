package za0;

import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import efm.r;
import ip0.az;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.a2;
import te0.w;
import vkm.q;
import wo2.l;
import xl2.v;
import yc0.j;
import yji.n;
import ys.i;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends xa0.b implements ua0.a {
    public final RowDelegate A;
    public final CellDetailsStandaloneNoteDelegate B;
    public final CellDetailsAccountDelegate C;
    public final SwipeToActionDelegate D;
    public final FullScreenStateDelegate E;
    public final Object F;
    public a2 G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f320549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f320550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qa0.b f320551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yy0.f f320552t;
    public final ua0.a u;
    public final c70.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LargeActionButtonDelegate f320553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ProgressStepVerticalDelegate f320554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ProgressStepVerticalV2Delegate f320555y;
    public final NotificationCentreItemDelegate z;

    public g(j60.a bottomExpandableDialogControllerExtension, j mapper, qa0.b externalNavigationExtension, yy0.f imageDisplayer, ua0.a itemsScreenControllerModelExtension, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(itemsScreenControllerModelExtension, "itemsScreenControllerModelExtension");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f320549q = bottomExpandableDialogControllerExtension;
        this.f320550r = mapper;
        this.f320551s = externalNavigationExtension;
        this.f320552t = imageDisplayer;
        this.u = itemsScreenControllerModelExtension;
        this.v = clipboard;
        this.f320553w = new LargeActionButtonDelegate();
        this.f320554x = new ProgressStepVerticalDelegate();
        this.f320555y = new ProgressStepVerticalV2Delegate();
        this.z = new NotificationCentreItemDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.A = rowDelegate;
        this.B = new CellDetailsStandaloneNoteDelegate();
        this.C = new CellDetailsAccountDelegate();
        this.D = new SwipeToActionDelegate(rowDelegate, false);
        this.E = new FullScreenStateDelegate();
        this.F = w.y0(new yq0.e(this, 22));
    }

    @Override // ua0.a
    public final void F0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.u.F0(clickData);
    }

    @Override // ua0.a
    public final void N0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.u.N0(clickData);
    }

    @Override // ua0.a
    public final void S0(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.u.S0(link);
    }

    @Override // ua0.a
    public final void U0(BackendScreen screen, LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(model, "model");
        this.u.U0(screen, model);
    }

    @Override // ua0.a
    public final void V0(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.u.V0(model);
    }

    @Override // ua0.a
    public final Flow X0(v screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.u.X0(screen);
    }

    @Override // xa0.b
    public final void b3() {
        j60.a.v(this.f320549q, false, null, 3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xa0.b
    public final void c3() {
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        CellDetailsLoadingDelegate cellDetailsLoadingDelegate = new CellDetailsLoadingDelegate();
        ProgressStepVerticalLoadingDelegate progressStepVerticalLoadingDelegate = new ProgressStepVerticalLoadingDelegate();
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
        RowDelegate rowDelegate = this.A;
        CellDetailsAccountDelegate cellDetailsAccountDelegate = this.C;
        LargeActionButtonDelegate largeActionButtonDelegate = this.f320553w;
        ProgressStepVerticalDelegate progressStepVerticalDelegate = this.f320554x;
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.f320555y;
        NotificationCentreItemDelegate notificationCentreItemDelegate = this.z;
        FullScreenStateDelegate fullScreenStateDelegate = this.E;
        ArrayList arrayListE0 = d0.E0((List) this.F.getValue(), zhm.v.k(cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsLoadingDelegate, progressStepVerticalLoadingDelegate, listSubheaderDelegate, rowLoadingDelegate, rowDelegate, this.B, cellDetailsAccountDelegate, this.D, largeActionButtonDelegate, progressStepVerticalDelegate, progressStepVerticalV2Delegate, notificationCentreItemDelegate, fullScreenStateDelegate));
        j60.a aVar = this.f320549q;
        aVar.d(arrayListE0);
        n.j2(this, rd0.e.b(aVar.C()), null, new b(this, null, 2), 3);
        n.j2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new a(2, 4, g.class, this, "onLargeButtonClick", "onLargeButtonClick$core_backend_flow_impl_release(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        n.j2(this, rd0.e.b(aVar.E()), null, new z3f.b(this, null, 5), 3);
        r rVarMergeArray = r.mergeArray(rowDelegate.f53218h, rowDelegate.f53220l, rowDelegate.k);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        n.j2(this, rd0.e.b(rVarMergeArray), null, new e(this, null), 3);
        n.j2(this, rd0.e.b(rowDelegate.f53226s), null, new b(this, null, 1), 3);
        int i = 4;
        n.j2(this, rd0.e.b(notificationCentreItemDelegate.f52865c), null, new i(2, this, g.class, "onNotificationCentreItemDelegateClick", "onNotificationCentreItemDelegateClick(Lcom/revolut/core/ui_kit/delegates/NotificationCentreItemDelegate$NotificationClickData;)V", i, 11), 3);
        n.j2(this, q.J(rd0.e.b(progressStepVerticalDelegate.f53000c), rd0.e.b(progressStepVerticalV2Delegate.e)), null, new i(2, this, g.class, "onProgressStepVerticalDelegateClauseClick", "onProgressStepVerticalDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i, 12), 3);
        n.j2(this, rd0.e.b(progressStepVerticalV2Delegate.f.f121375b), null, new d(2, 4, g.class, this, "onProgressStepVerticalDelegatePrimaryActionClick", "onProgressStepVerticalDelegatePrimaryActionClick(Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalV2Delegate$Model;)V"), 3);
        n.j2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), null, new c(this, null), 3);
        n.j2(this, rd0.e.b(cellDetailsAccountDelegate.d), null, new b(this, null, 0), 3);
    }

    public final void e3(BottomPromptScreen bottomPromptScreen) {
        this.f320549q.x(this.f320550r.b(bottomPromptScreen));
        a2 a2Var = this.G;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        if (bottomPromptScreen.f.isEmpty()) {
            return;
        }
        this.G = n.l2(this, X0(bottomPromptScreen), null, new l(this, bottomPromptScreen, continuation, 29), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xa0.b
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature.backend_flow.domain.models.BottomPromptScreen r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof za0.f
            if (r0 == 0) goto L13
            r0 = r6
            za0.f r0 = (za0.f) r0
            int r1 = r0.f320548x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320548x = r1
            goto L18
        L13:
            za0.f r0 = new za0.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320548x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.backend_flow.domain.models.BottomPromptScreen r5 = r0.u
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
            r0.f320548x = r3
            j60.a r6 = r4.f320549q
            java.lang.Object r6 = x5d.b.k(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r4.e3(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: za0.g.d3(com.revolut.feature.backend_flow.domain.models.BottomPromptScreen, gim.c):java.lang.Object");
    }

    @Override // ua0.a
    public final void j1(ProgressStepVerticalV2Delegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.u.j1(model);
    }

    @Override // ua0.a
    public final void r1(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.u.r1(clickData);
    }

    @Override // ua0.a
    public final void v0(BackendScreen screen, String summaryId, EntityType type) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(summaryId, "summaryId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.u.v0(screen, summaryId, type);
    }

    @Override // ua0.a
    public final void w1(az clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.u.w1(clickData);
    }
}
