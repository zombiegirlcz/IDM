package drg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dkk.a0;
import efm.r;
import ip0.tm0;
import ip0.um0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jki.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import te0.s;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends bji.b implements f {
    public final ypg.d u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f117131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final erg.c f117132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.f f117133y;
    public final b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, ypg.d savingsDocumentsInteractor, j60.a bottomDialogExtension, a dialogMapper, erg.c acceptDocumentsFlowState) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(savingsDocumentsInteractor, "savingsDocumentsInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(acceptDocumentsFlowState, "acceptDocumentsFlowState");
        this.u = savingsDocumentsInteractor;
        this.v = bottomDialogExtension;
        this.f117131w = dialogMapper;
        this.f117132x = acceptDocumentsFlowState;
        this.f117133y = v0.a.d("create(...)");
        this.z = new b(new Data(null, null, true, 2, null), f0.f322471a);
    }

    public final void B2() {
        v2(d.f117125a);
        C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)))));
    }

    public final void C2() {
        List list = (List) ((b) t2()).f117122a.getContent();
        if (list != null) {
            List<SavingsDocumentToAccept> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (SavingsDocumentToAccept savingsDocumentToAccept : list2) {
                    List list3 = ((b) t2()).f117123b;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            if (Intrinsics.f((String) it8.next(), savingsDocumentToAccept.f94741a)) {
                                break;
                            }
                        }
                    }
                }
            }
            B2();
            return;
        }
        ((h) this.f117131w).getClass();
        this.v.x(new y(u.c(new um0("CONFIRMATION_DIALOG_TWIN_BUTTON_LIST_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.vaults_common_action_go_back, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.vaults.R$string.bill_accounts_common_action_confirm_copy, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_document_reacceptance_exit_alert_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_document_reacceptance_exit_alert_subtitle, null, null, 14), null, 28), null, null, null, null, 1020));
    }

    @Override // yji.l
    public final void I1() {
        zii.i.E0(this, ((erg.e) this.f117132x).w0().c(s.f270018a), new k(this, 0), null, 14);
        a0 a0Var = new a0(new k(this, 1), 10);
        ihm.f fVar = this.f117133y;
        r rVarFlatMap = fVar.flatMap(a0Var);
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        zii.i.E0(this, rVarFlatMap, new k(this, 2), null, 14);
        fVar.onNext(Unit.f186387a);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.z;
    }
}
