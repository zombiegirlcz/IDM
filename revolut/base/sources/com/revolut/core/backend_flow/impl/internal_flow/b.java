package com.revolut.core.backend_flow.impl.internal_flow;

import a5h.g;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlowContract$Step;
import com.revolut.core.backend_flow.impl.ui.entities_selection.EntitiesSelectionController;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.backend_flow.impl.ui.stories.StoriesScreenController;
import com.revolut.core.backend_flow.impl.ui.transactions.TransactionsSelectionController;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.uicomponent.R$drawable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import la0.f;
import la0.k;
import la0.l;
import la0.m;
import lb0.p0;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.u1;
import nii.v1;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import xl2.a0;
import xl2.d0;
import xl2.y;
import yc0.p;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b extends h implements uki.b {

    @NotNull
    private static final la0.e Companion = new la0.e();
    public BackendFlow o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f51245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ra0.h f51246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.a f51247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ga0.a f51248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qa0.b f51249t;
    public final m u;
    public final la0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f51250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qki.d f51251x;

    public b(UUID sessionId, BackendFlow backendFlow, g controllerProvider, ra0.h repository, n60.a keyboardControllerExtension, ga0.a errorHandlerExtension, qa0.b externalNavigationExtension, m statusDialogMapper, la0.b modalScreenExtension, k screenInputDataMapper) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(modalScreenExtension, "modalScreenExtension");
        Intrinsics.checkNotNullParameter(screenInputDataMapper, "screenInputDataMapper");
        this.o = backendFlow;
        this.f51245p = controllerProvider;
        this.f51246q = repository;
        this.f51247r = keyboardControllerExtension;
        this.f51248s = errorHandlerExtension;
        this.f51249t = externalNavigationExtension;
        this.u = statusDialogMapper;
        this.v = modalScreenExtension;
        this.f51250w = screenInputDataMapper;
        this.f51251x = hx7.e.b(this, new InternalBackendFlowContract$State(sessionId));
    }

    @Override // yji.l
    public final void I1() {
        Iterator it8 = this.v.f193303a.values().iterator();
        while (it8.hasNext()) {
            ((xa0.b) it8.next()).c3();
        }
        if (c.a(s())) {
            J2(this.o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if ((r8 != null ? r8.f63557c : null) == xl2.y.META_SSO) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(com.revolut.feature.backend_flow.domain.models.BackendScreen r8) {
        /*
            r7 = this;
            com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlowContract$Step$Screen r2 = new com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlowContract$Step$Screen
            java.lang.String r0 = r8.getId()
            r2.<init>(r0)
            boolean r0 = uc0.b.r(r8)
            if (r0 != 0) goto L62
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8 instanceof com.revolut.feature.backend_flow.domain.models.FormScreen
            if (r0 == 0) goto L3a
            com.revolut.feature.backend_flow.domain.models.FormScreen r8 = (com.revolut.feature.backend_flow.domain.models.FormScreen) r8
            java.util.List r8 = r8.f63468b
            java.lang.Object r0 = zhm.d0.d0(r8)
            boolean r0 = r0 instanceof com.revolut.feature.backend_flow.domain.models.PermissionInputItem
            if (r0 == 0) goto L3a
            java.lang.Object r8 = zhm.d0.d0(r8)
            boolean r0 = r8 instanceof com.revolut.feature.backend_flow.domain.models.PermissionInputItem
            r1 = 0
            if (r0 == 0) goto L30
            com.revolut.feature.backend_flow.domain.models.PermissionInputItem r8 = (com.revolut.feature.backend_flow.domain.models.PermissionInputItem) r8
            goto L31
        L30:
            r8 = r1
        L31:
            if (r8 == 0) goto L35
            xl2.y r1 = r8.f63557c
        L35:
            xl2.y r8 = xl2.y.META_SSO
            if (r1 != r8) goto L3a
            goto L62
        L3a:
            yki.b r8 = r7.s()
            boolean r8 = com.revolut.core.backend_flow.impl.internal_flow.c.a(r8)
            if (r8 == 0) goto L53
            yki.b r1 = r7.s()
            com.revolut.kompot.navigable.TransitionAnimation$FADE r4 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r5 = 0
            r6 = 8
            r3 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            return
        L53:
            yki.b r1 = r7.s()
            com.revolut.kompot.navigable.TransitionAnimation$SLIDE_END_TO_START r4 = com.revolut.kompot.navigable.TransitionAnimation.SLIDE_END_TO_START.f98395a
            r5 = 0
            r6 = 8
            r3 = 1
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            return
        L62:
            yki.b r8 = r7.s()
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r0 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            oki.h.w2(r8, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.backend_flow.impl.internal_flow.b.I2(com.revolut.feature.backend_flow.domain.models.BackendScreen):void");
    }

    public final void J2(BackendFlow backendFlow) {
        Continuation continuation;
        m0 j0Var;
        la0.b bVar = this.v;
        Iterator it8 = bVar.f193303a.values().iterator();
        while (true) {
            continuation = null;
            if (!it8.hasNext()) {
                break;
            }
            xa0.b bVar2 = (xa0.b) it8.next();
            a2 a2Var = bVar2.o;
            if (a2Var != null) {
                a2Var.f(null);
            }
            bVar2.o = null;
            bVar2.b3();
        }
        this.f51247r.Q();
        if (backendFlow.e.isEmpty()) {
            K2(backendFlow);
            return;
        }
        BackendScreen screen = ta6.a.r(backendFlow);
        if (screen instanceof DeeplinkScreen) {
            DeeplinkScreen deeplinkScreen = (DeeplinkScreen) screen;
            String str = deeplinkScreen.f63391b;
            if (!deeplinkScreen.f63392c) {
                this.f51249t.Z2(str);
                return;
            } else {
                K2(backendFlow);
                l2(new f(this, str, null, 1), new yi5.b(26));
                return;
            }
        }
        if (screen instanceof StatusDialogScreen) {
            StatusDialogScreen screen2 = (StatusDialogScreen) screen;
            this.u.getClass();
            Intrinsics.checkNotNullParameter(screen2, "screen");
            d0 d0Var = screen2.d;
            String str2 = screen2.e;
            String str3 = screen2.f63660c;
            int i = l.f193314a[d0Var.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                j0Var = new j0((Clause) new TextClause(screen2.f63659b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) (str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, str2 != null ? new v1(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null) : u1.b.f216225a, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                j0Var = new g0(new TextClause(screen2.f63659b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, null, null, false, null, false, null, 16372);
            }
            yji.l.a1(this, X1(new y0(null, j0Var, false, 5)), null, null, new im9.h(screen2, this, backendFlow, continuation, 27), 3);
            return;
        }
        if (screen instanceof StoriesScreen) {
            this.o = backendFlow;
            h.w2(s(), new InternalBackendFlowContract$Step.Screen(((StoriesScreen) screen).f63663a), ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (!(screen instanceof HtmlPromptScreen) && !(screen instanceof BottomPromptScreen)) {
            if (screen instanceof PromptScreen) {
                this.o = backendFlow;
                I2(screen);
                return;
            } else if (screen instanceof FormScreen) {
                this.o = backendFlow;
                I2(screen);
                return;
            } else {
                if (!(screen instanceof SummaryScreen) && !(screen instanceof TutorialScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Deprecated screen types");
            }
        }
        this.o = backendFlow;
        l3l.m onResult = new l3l.m(1, this, b.class, "handleScreenResult", "handleScreenResult(Lcom/revolut/core/backend_flow/impl/ui/base_screen/BackendScreenResult;)V", 0, 13);
        kob.a onCancel = new kob.a(this, 22);
        Intrinsics.checkNotNullParameter(screen, "backendScreen");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Object obj2 = bVar.f193303a.get(screen.getClass());
        if (obj2 == null) {
            throw new IllegalStateException(a0.d.q("Have you forgotten to provide ModalScreenExtension for ", screen.getClass(), "?").toString());
        }
        xa0.b bVar3 = (xa0.b) obj2;
        Intrinsics.checkNotNullParameter(onResult, "<set-?>");
        bVar3.f303769m = onResult;
        Intrinsics.checkNotNullParameter(onCancel, "<set-?>");
        bVar3.f303770n = onCancel;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screen, "<set-?>");
        bVar3.f303768l = screen;
        bVar3.T2(new xa0.a(bVar3, null, 1), new yi5.b(27));
    }

    public final com.revolut.kompot.navigable.a K0(String id10) {
        Image resourceImage;
        PromptMarketingContentDelegate.Model modelB2;
        Intrinsics.checkNotNullParameter(id10, "id");
        BackendScreen screen = ta6.a.m(this.o, id10);
        if (screen == null) {
            throw new IllegalStateException(a0.d.s("flow (id=", this.o.f63264b, ") has no screen with id = ", id10).toString());
        }
        boolean zC = s().c();
        BackendFlowInput backendFlowInput = this.f51250w.f193313a;
        Intrinsics.checkNotNullParameter(screen, "screen");
        ba0.f inputData = new ba0.f(screen, zC || backendFlowInput.e, zC ? BackendFlowNavigationIcon.BackArrow.f63285a : backendFlowInput.d);
        l3l.m onResult = new l3l.m(1, this, b.class, "handleScreenResult", "handleScreenResult(Lcom/revolut/core/backend_flow/impl/ui/base_screen/BackendScreenResult;)V", 0, 12);
        g gVar = this.f51245p;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        boolean z = screen instanceof FormScreen;
        if (z) {
            if (uc0.b.p(screen)) {
                return ((oa0.a) gVar.f1407c).Z2((FormScreen) screen, onResult);
            }
            Intrinsics.checkNotNullParameter(screen, "<this>");
            if (z && (zhm.d0.d0(((FormScreen) screen).f63468b) instanceof EntitiesSelectionItem)) {
                EntitiesSelectionController entitiesSelectionController = new EntitiesSelectionController((FormScreen) screen);
                Intrinsics.checkNotNullParameter(onResult, "block");
                entitiesSelectionController.H = onResult;
                return entitiesSelectionController;
            }
            if (uc0.b.t(screen)) {
                TransactionsSelectionController transactionsSelectionController = new TransactionsSelectionController((FormScreen) screen);
                Intrinsics.checkNotNullParameter(onResult, "block");
                transactionsSelectionController.H = onResult;
                return transactionsSelectionController;
            }
            FormScreen screen2 = (FormScreen) screen;
            List list = screen2.f63468b;
            Intrinsics.checkNotNullParameter(screen2, "<this>");
            Object objD0 = zhm.d0.d0(list);
            PermissionInputItem permissionInputItem = objD0 instanceof PermissionInputItem ? (PermissionInputItem) objD0 : null;
            if ((permissionInputItem != null ? permissionInputItem.f63557c : null) == y.META_SSO) {
                Object objB0 = zhm.d0.b0(list);
                Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.PermissionInputItem");
                return ((oa0.c) gVar.d).Z2(screen2, (PermissionInputItem) objB0, onResult);
            }
            if (uc0.b.r(screen)) {
                return ((oa0.h) ((oa0.e) gVar.e)).a(screen2, onResult);
            }
            if (!uc0.b.q(screen)) {
                FormController formController = new FormController(screen2);
                Intrinsics.checkNotNullParameter(onResult, "block");
                formController.H = onResult;
                return formController;
            }
            lal.a aVar = (lal.a) gVar.f;
            Intrinsics.checkNotNullParameter(screen2, "screen");
            Intrinsics.checkNotNullParameter(onResult, "onResult");
            Object objB02 = zhm.d0.b0(list);
            Intrinsics.i(objB02, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.CountrySelectionItem");
            CountrySelectionItem countrySelectionItem = (CountrySelectionItem) objB02;
            g5k.e eVar = (g5k.e) aVar.f193426b;
            p0 p0Var = (p0) aVar.d;
            PickerController pickerControllerA = eVar.a(countrySelectionItem, p0Var.e(screen2), p0Var.b(screen2));
            ja3.d block = new ja3.d(aVar, countrySelectionItem, screen2, onResult, 22);
            Intrinsics.checkNotNullParameter(block, "block");
            pickerControllerA.H = block;
            return pickerControllerA;
        }
        if (screen instanceof StoriesScreen) {
            StoriesScreenController storiesScreenController = new StoriesScreenController((StoriesScreen) screen);
            Intrinsics.checkNotNullParameter(onResult, "block");
            storiesScreenController.H = onResult;
            return storiesScreenController;
        }
        if (!(screen instanceof PromptScreen)) {
            if ((screen instanceof HtmlPromptScreen) || (screen instanceof BottomPromptScreen)) {
                throw new IllegalStateException("Launched by BackendFlowModalScreenExtension");
            }
            if ((screen instanceof SummaryScreen) || (screen instanceof TutorialScreen)) {
                throw new IllegalStateException("Deprecated screen types");
            }
            if ((screen instanceof DeeplinkScreen) || (screen instanceof StatusDialogScreen)) {
                throw new IllegalStateException("Terminal screens can't be added to coordinator");
            }
            throw new NoWhenBranchMatchedException();
        }
        vb0.b bVar = (vb0.b) gVar.f1406b;
        PromptScreen screen3 = (PromptScreen) screen;
        Intrinsics.checkNotNullParameter(screen3, "screen");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        vb0.a aVar2 = bVar.f287347a;
        yc0.g gVar2 = aVar2.f287345b;
        Intrinsics.checkNotNullParameter(screen3, "screen");
        String str = screen3.f63585a;
        TextClause textClause = new TextClause(screen3.f63586b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        HtmlClause htmlClauseA = p.a(aVar2.d, screen3.f63587c);
        ResourceImage resourceImageA = aVar2.f287346c.a(screen3);
        ImageItem imageItem = screen3.d;
        if (imageItem == null || (resourceImage = aVar2.f287344a.a(imageItem, null)) == null) {
            resourceImage = new ResourceImage(R$drawable.empty, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        PromptMarketingContentDelegate.Model model = new PromptMarketingContentDelegate.Model(str, textClause, htmlClauseA, new PromptMarketingContentDelegate.Model.Content.MediaContent(resourceImage, null), null, null, resourceImageA, null, null, null, null, null, null, screen3, new AnalyticsContext(gVar2.a(screen3)), null, null, null, null, null, null, 2072496);
        if (hb9.b.p(screen3) == null || screen3.f != a0.HORIZONTAL) {
            id idVar = id.VERTICAL;
            Action actionO = hb9.b.o(screen3);
            PromptMarketingContentDelegate.Model.Button buttonA = actionO != null ? vb0.a.a(actionO, LargeActionButton.ButtonStyle.f58725a) : null;
            Action actionP = hb9.b.p(screen3);
            modelB2 = PromptMarketingContentDelegate.Model.b2(model, buttonA, actionP != null ? vb0.a.a(actionP, LargeActionButton.ButtonStyle.f58726b) : null, idVar);
        } else {
            id idVar2 = id.HORIZONTAL;
            Action actionP2 = hb9.b.p(screen3);
            PromptMarketingContentDelegate.Model.Button buttonA2 = actionP2 != null ? vb0.a.a(actionP2, LargeActionButton.ButtonStyle.f58726b) : null;
            Action actionO2 = hb9.b.o(screen3);
            modelB2 = PromptMarketingContentDelegate.Model.b2(model, buttonA2, actionO2 != null ? vb0.a.a(actionO2, LargeActionButton.ButtonStyle.f58725a) : null, idVar2);
        }
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(modelB2, gVar2.f312422a.getN(), false, aVar2.e.p0(), null, 20));
        sc7.b block2 = new sc7.b(bVar, screen3, promptMarketingScreen, onResult, 14);
        Intrinsics.checkNotNullParameter(block2, "block");
        promptMarketingScreen.H = block2;
        return promptMarketingScreen;
    }

    public final void K2(BackendFlow backendFlow) {
        C2(new m90.a(c.a(s()), backendFlow.i));
    }

    @Override // yji.l
    public final void P1() {
        this.f51246q.b(((InternalBackendFlowContract$State) ((j2) this.f51251x.f22677a).getValue()).f51242a, this.o);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f51251x;
    }
}
