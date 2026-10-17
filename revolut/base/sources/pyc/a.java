package pyc;

import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.revolut.feature.apm.iris.impl.ui.settings.deregister.DeregisterDialogController;
import com.revolut.feature.card_management.api.CardManagementApi$Toggles;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import com.revolut.feature.selfserve.sot.impl.ui.SotActivity;
import com.revolut.feature.shared.branding.impl.ui.preview.PaymentLinkPreviewScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreen;
import com.revolut.retail.feature.balance.picker.legacy.impl.BalanceActivity;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlow;
import com.revolut.revolut.feature_fourthline_impl.R;
import ft3.d1;
import ft3.j1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import q50.m0;
import q50.p0;
import q50.r0;
import q50.s0;
import q97.m1;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f240754b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f240753a = i;
        this.f240754b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FixedTabs.Item item;
        int i = this.f240753a;
        AnalyticsContext analyticsContext = null;
        Object obj2 = this.f240754b;
        switch (i) {
            case 0:
                SotActivity sotActivity = (SotActivity) obj2;
                return zhm.v.k(sotActivity.f85904w0, sotActivity.f85905x0);
            case 1:
                return Boolean.valueOf(((ii0.b) ((ih0.b) ((pzl.a) obj2).f241015b)).b("PM_ANDROID_CACHE_CLEANER_WORKER_ENABLED"));
            case 2:
                return CapturePipelineTorchCorrection.capturePipelineImpl_delegate$lambda$0((CapturePipelineTorchCorrection) obj2);
            case 3:
                return Boolean.valueOf(UseTorchAsFlashImpl.hasUwCameraUnderexposedFlashCaptureQuirk_delegate$lambda$0((UseTorchAsFlashImpl) obj2));
            case 4:
                return Boolean.valueOf(((jte.d) ((com.revolut.feature.card_management.impl.ui.kompot.settings.b) obj2).A).c(CardManagementApi$Toggles.NewChecksForMxMCYClosure.f64774c));
            case 5:
                KProperty[] kPropertyArr = LessonScreen.c0;
                return (q09.d0) ((f09.f) ((LessonScreen) obj2).Z.getValue()).f131066j.get();
            case 6:
                ((com.revolut.feature.semi_independent_activation.impl.ui.activation.b) obj2).I2(new til.o(3));
                return Unit.f186387a;
            case 7:
                KProperty[] kPropertyArr2 = WealthAssetTypeNewsFlow.U;
                return (q0k.b) ((l0k.e) ((WealthAssetTypeNewsFlow) obj2).S.getValue()).d.get();
            case 8:
                return TextContextMenuToolbarHandlerNode.derivedData_delegate$lambda$0((TextContextMenuToolbarHandlerNode) obj2);
            case 9:
                ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = ((q22.o) obj2).f241497a;
                if (apmNewContactNavigation$InputData.f62247b.size() == 1) {
                    return zhm.f0.f322471a;
                }
                List<ApmNewContactNavigation$Tab> list = apmNewContactNavigation$InputData.f62247b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (ApmNewContactNavigation$Tab apmNewContactNavigation$Tab : list) {
                    int i2 = 12;
                    if (apmNewContactNavigation$Tab instanceof ApmNewContactNavigation$Tab.PHONE) {
                        item = new FixedTabs.Item(apmNewContactNavigation$Tab.f62251a, new TextLocalisedClause(R$string.apm_new_contact_tab_phone_name, null, null, 14), analyticsContext, i2);
                    } else if (apmNewContactNavigation$Tab instanceof ApmNewContactNavigation$Tab.EMAIL) {
                        item = new FixedTabs.Item(apmNewContactNavigation$Tab.f62251a, new TextLocalisedClause(R$string.apm_new_contact_tab_email_name, null, null, 14), analyticsContext, i2);
                    } else {
                        if (!(apmNewContactNavigation$Tab instanceof ApmNewContactNavigation$Tab.TAX)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        item = new FixedTabs.Item(apmNewContactNavigation$Tab.f62251a, ((ApmNewContactNavigation$Tab.TAX) apmNewContactNavigation$Tab).f62254b, analyticsContext, i2);
                    }
                    arrayList.add(item);
                }
                return arrayList;
            case 10:
                KProperty[] kPropertyArr3 = TravelExperienceLocationPickerScreen.f0;
                return (q2g.f) ((z0g.a) ((TravelExperienceLocationPickerScreen) obj2).c0.getValue()).f318294c.get();
            case 11:
                return new z4l.j(7, zhm.v.k(((BalanceActivity) obj2).u0, new ListSubheaderDelegate()), false);
            case 12:
                ((q32.k) obj2).X1(new mii.f("QR_DETAILS_SHOT_DIALOG_ID", new TextLocalisedClause(R.string.common_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
                return Unit.f186387a;
            case 13:
                KProperty[] kPropertyArr4 = TravelExperiencesVisitorsSelectionScreen.f93166e0;
                return (q3g.g) ((z0g.t) ((TravelExperiencesVisitorsSelectionScreen) obj2).c0.getValue()).f318456c.get();
            case 14:
                q50.c cVar = (q50.c) obj2;
                return mra.d.c(cVar, new q50.a(cVar.c3(), null), new a54.b(cVar, 24));
            case 15:
                q50.j jVar = (q50.j) obj2;
                return mra.d.c(jVar, new q50.d(jVar.c3()), new hog.d(jVar, 5));
            case 16:
                try {
                    return zhm.d0.i1(((q50.k) ((ii0.b) ((q50.n) obj2).f242245a).f("EID_CHAT_WIDGET_DENYLIST_TYPES", new q50.k(0), q50.k.INSTANCE.serializer())).f242236a);
                } catch (Throwable th10) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ChatWidgetDenylistProviderImpl", "Failed to read chat widget denylist from remote config", th10, h0Var);
                    return h0Var;
                }
            case 17:
                q50.u uVar = (q50.u) obj2;
                return mra.d.c(uVar, new q50.v(uVar.c3(), null), new hog.d(uVar, 6));
            case 18:
                p0 p0Var = (p0) obj2;
                return mra.d.c(p0Var, new m0(p0Var.c3(), null), new a54.b(p0Var, 25));
            case 19:
                s0 s0Var = (s0) obj2;
                return mra.d.c(s0Var, new r0(s0Var.c3()), new a54.b(s0Var, 26));
            case 20:
                int i3 = DeregisterDialogController.U;
                return (q62.h) ((z52.k) ((DeregisterDialogController) obj2).S.getValue()).f319447b.get();
            case 21:
                KProperty[] kPropertyArr5 = PaymentLinkPreviewScreen.f86072a0;
                return (q6d.d) ((o6d.h) ((PaymentLinkPreviewScreen) obj2).W.getValue()).f222568c.get();
            case 22:
                lk0.g gVar = ((q6h.a) ((j2) ((com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) obj2).v.f22677a).getValue()).f242595a;
                return gVar != null ? efm.k.g(gVar) : rfm.h.f253943a;
            case 23:
                return t97.c.a(((q97.p) obj2).e());
            case 24:
                return ((xq3.u) ((q97.c0) obj2).f243661c).a(mif.a.m(d1.Companion, j1.NON_EMBEDDED_CREDIT_INSURANCE_CC, null));
            case 25:
                return ((xq3.u) ((q97.c0) obj2).f243661c).a(mif.a.m(d1.Companion, j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC, null));
            case 26:
                return ((q97.j1) obj2).e.a(new d1(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null));
            case 27:
                return ((q97.j1) obj2).e.a(new d1(j1.FIXED_TERM_CREDIT, gt3.d.REFINANCING, null));
            case 28:
                return ((xq3.u) ((q97.c0) obj2).f243661c).a(mif.a.m(d1.Companion, j1.MORTGAGE, null));
            default:
                return ((xq3.u) ((m1) obj2).f243738c).a(mif.a.m(d1.Companion, j1.REFINANCING_MORTGAGE, null));
        }
    }
}
