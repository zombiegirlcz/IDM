package byc;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import eii.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.m0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;
import wli.x;
import yji.n;
import yxc.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends y9l.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bal.a f19808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f80.a f19809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z9l.d f19810n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f19811p;

    public j(bal.a entityConfigRepository, f80.a uriHelper, z9l.d entityConfigActionDialogUiMapper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(entityConfigRepository, "entityConfigRepository");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(entityConfigActionDialogUiMapper, "entityConfigActionDialogUiMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f19808l = entityConfigRepository;
        this.f19809m = uriHelper;
        this.f19810n = entityConfigActionDialogUiMapper;
        this.o = deeplinkHandler;
        this.f19811p = q.b(0, 7, null);
    }

    @Override // y9l.a
    public final void Z2(FincrimeHomeScreenAction action) {
        u1 w1Var;
        String str;
        m0 j0Var;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof FincrimeHomeScreenAction.Dismiss) {
            t2();
            return;
        }
        if (action instanceof FincrimeHomeScreenAction.Deeplink) {
            String str6 = ((FincrimeHomeScreenAction.Deeplink) action).f64132a;
            t2();
            V2(new c(this, str6, null), new yi5.b(29));
            return;
        }
        boolean z = action instanceof FincrimeHomeScreenAction.Dialog.Bottom;
        z9l.d dVar = this.f19810n;
        if (z) {
            FincrimeHomeScreenAction.Dialog.Bottom dialog = (FincrimeHomeScreenAction.Dialog.Bottom) action;
            yxc.e eVar = (yxc.e) dVar;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            TextClause textClause = new TextClause(dialog.f64133a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str7 = dialog.f64134b;
            lw0.a aVar = new lw0.a(textClause, str7 != null ? new HtmlClause(0, 30, (Integer) null, (Object) null, str7) : null, null, null, false, 28);
            ArrayList arrayList = dialog.d;
            int size = arrayList.size();
            if (size < 0 || size >= 3) {
                throw new IllegalArgumentException(a0.d.n("Unsupported buttons count: ", arrayList.size()).toString());
            }
            int size2 = arrayList.size();
            aw0.i hVar = size2 != 0 ? size2 != 1 ? new aw0.h(false, eVar.a((FincrimeHomeScreenActionButton) arrayList.get(0)), eVar.a((FincrimeHomeScreenActionButton) arrayList.get(1)), null, null, null, 121) : new aw0.e(false, null, null, eVar.a((FincrimeHomeScreenActionButton) arrayList.get(0)), null, null, 55) : null;
            List<SectionContent.TransactionCell> list = dialog.f64135c;
            z9l.k kVar = eVar.f317644b;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (SectionContent.TransactionCell transactionCell : list) {
                u uVar = (u) kVar;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(transactionCell, "transactionCell");
                TextClause textClause2 = new TextClause(transactionCell.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                CompositeClause compositeClauseC = u.c(transactionCell);
                RowDelegate.Model.MainImage.Image40 image40A = uVar.a(transactionCell);
                RowDelegate.Model.c.b bVarB = u.b(transactionCell);
                String str8 = transactionCell.f64193j;
                arrayList2.add(new l((Clause) textClause2, (Clause) compositeClauseC, (RowDelegate.Model.MainImage) image40A, !(str8 == null || d0.W(str8)), false, (RowDelegate.Model.c) bVarB, (Object) transactionCell, 168));
            }
            N2(new RowActionsBottomSheetController(new eii.c(aVar, hVar, arrayList2, AnalyticsProduct.Shared.FinCrime.f, null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new a(this, dialog, 0));
            return;
        }
        if (!(action instanceof FincrimeHomeScreenAction.Dialog.Status)) {
            if (action instanceof FincrimeHomeScreenAction.Request) {
                t2();
                V2(new f(this, (FincrimeHomeScreenAction.Request) action, null), new yi5.b(29));
                return;
            } else {
                if (!(action instanceof FincrimeHomeScreenAction.PopupMenu)) {
                    throw new NoWhenBranchMatchedException();
                }
                hx7.e.n(new IllegalStateException("Unsupported action " + action + " for EntityConfigActionControllerExtensionImpl"));
                return;
            }
        }
        FincrimeHomeScreenAction.Dialog.Status dialog2 = (FincrimeHomeScreenAction.Dialog.Status) action;
        ArrayList arrayList3 = dialog2.d;
        t2();
        ((yxc.e) dVar).getClass();
        Intrinsics.checkNotNullParameter(dialog2, "dialog");
        Intrinsics.checkNotNullParameter(dialog2, "dialog");
        com.revolut.feature.be_driven_design.models.domain.a aVar2 = dialog2.f64136a;
        String str9 = dialog2.f64138c;
        int i = yxc.f.f317645a[aVar2.ordinal()];
        if (i == 1) {
            TextClause textClause3 = new TextClause(dialog2.f64137b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause4 = str9 != null ? new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            if (arrayList3.isEmpty()) {
                w1Var = u1.b.f216225a;
            } else {
                Intrinsics.checkNotNullParameter(dialog2, "<this>");
                FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton = (FincrimeHomeScreenActionButton) zhm.d0.e0(0, arrayList3);
                if (fincrimeHomeScreenActionButton == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                TextClause textClause5 = new TextClause(fincrimeHomeScreenActionButton.f64147a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(dialog2, "<this>");
                FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton2 = (FincrimeHomeScreenActionButton) zhm.d0.e0(1, arrayList3);
                w1Var = new w1(2, textClause5, (fincrimeHomeScreenActionButton2 == null || (str = fincrimeHomeScreenActionButton2.f64147a) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            j0Var = new j0((Clause) textClause3, (Clause) textClause4, (StatusDialogDescriptionProgress) null, (Parcelable) dialog2, w1Var, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4068);
        } else if (i == 2) {
            TextClause textClause6 = new TextClause(dialog2.f64137b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause7 = str9 != null ? new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            Intrinsics.checkNotNullParameter(dialog2, "<this>");
            FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton3 = (FincrimeHomeScreenActionButton) zhm.d0.e0(0, arrayList3);
            TextClause textClause8 = (fincrimeHomeScreenActionButton3 == null || (str3 = fincrimeHomeScreenActionButton3.f64147a) == null) ? null : new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(dialog2, "<this>");
            FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton4 = (FincrimeHomeScreenActionButton) zhm.d0.e0(1, arrayList3);
            j0Var = new l0(textClause6, textClause7, null, textClause8, (fincrimeHomeScreenActionButton4 == null || (str2 = fincrimeHomeScreenActionButton4.f64147a) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), dialog2, false, null, 964);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            TextClause textClause9 = new TextClause(dialog2.f64137b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause10 = str9 != null ? new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            Intrinsics.checkNotNullParameter(dialog2, "<this>");
            FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton5 = (FincrimeHomeScreenActionButton) zhm.d0.e0(0, arrayList3);
            TextClause textClause11 = (fincrimeHomeScreenActionButton5 == null || (str5 = fincrimeHomeScreenActionButton5.f64147a) == null) ? null : new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(dialog2, "<this>");
            FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton6 = (FincrimeHomeScreenActionButton) zhm.d0.e0(1, arrayList3);
            j0Var = new z(textClause9, textClause10, textClause11, (fincrimeHomeScreenActionButton6 == null || (str4 = fincrimeHomeScreenActionButton6.f64147a) == null) ? null : new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, dialog2, false, null, null, null, null, null, null, 32596);
        }
        n.l2(this, new i((rv6.e) L2(new y0(null, j0Var, false, 5)), 0), null, new g(this, null), 3);
    }

    @Override // y9l.a
    public final z1 b3() {
        return this.f19811p;
    }
}
