package cv7;

import aw0.o9;
import bu7.b0;
import bu7.i0;
import bu7.l0;
import bu7.o0;
import bu7.t0;
import bu7.u0;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import cul.n0;
import cul.n2;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import wli.x;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EmbeddedInsuranceDetailScreenContract$InputData f109313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f109314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tr7.a f109315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hu7.j f109316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f109317t;
    public final ang.f u;
    public final j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, EmbeddedInsuranceDetailScreenContract$InputData inputData, j60.a bottomExpandableDialogControllerExtension, tr7.a copyToClipboardHelper, hu7.j detailRepository, x deeplinkHandler, ang.f userInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(detailRepository, "detailRepository");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f109313p = inputData;
        this.f109314q = bottomExpandableDialogControllerExtension;
        this.f109315r = copyToClipboardHelper;
        this.f109316s = detailRepository;
        this.f109317t = deeplinkHandler;
        this.u = userInteractor;
        this.v = new j(0);
    }

    public final void A2(Clause clause, TextClause textClause) {
        rp0.l lVar = rp0.l.WINDOW;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
        int i = R$attr.uikit_dp16;
        this.f109314q.x(new y(u.c(new LargeActionButtonDelegate.Model("ID_DIALOG_GOT_IT_BUTTON", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i, i, 496)), new t(textClause, clause, null, 28), lVar, null, null, null, 1016));
    }

    @Override // yji.l
    public final void I1() {
        EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData = this.f109313p;
        yji.l.a1(this, this.f109316s.b(embeddedInsuranceDetailScreenContract$InputData.f76091a, embeddedInsuranceDetailScreenContract$InputData.f76092b), null, null, new n(this, null, 0), 3);
        yji.l.a1(this, nim.a.v(rd0.e.b(this.u.k(false)), new n2(17)), null, null, new n(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2(String listId) {
        dl7.a aVar;
        String str;
        Intrinsics.checkNotNullParameter(listId, "listId");
        BridgeDestination bridgeDestination = null;
        if (!Intrinsics.f(listId, "ID_MENU_ITEM_HELP")) {
            if (Intrinsics.f(listId, "ID_ACTION_ALL_DOCUMENTS")) {
                EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData = this.f109313p;
                yji.l.g2(this, new AllPolicyDocumentsScreen(new AllPolicyDocumentsScreenContract$InputData(embeddedInsuranceDetailScreenContract$InputData.f76091a, embeddedInsuranceDetailScreenContract$InputData.f76092b)), ModalDestination.Style.POPUP.f98311a, null, 2);
                return;
            }
            return;
        }
        b0 b0Var = (b0) ((j) t2()).f109304a.getContent();
        if (b0Var == null || (aVar = b0Var.f18694b) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (nu7.e.f219222a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                str = "topic.everyday-protection-insurance";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                str = "topic.travel-insurance";
                break;
            case 10:
            case 11:
            case 12:
                str = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            bridgeDestination = new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter(str, 2)));
        }
        if (bridgeDestination != null) {
            C1(bridgeDestination);
        }
    }

    public final void z2(Object obj2) {
        String str;
        Click click;
        Continuation continuation = null;
        if (!(obj2 instanceof i0)) {
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                ou7.a.a(this, nu7.l.a(iVar.f109303b, iVar.f109302a), new n0(this, 7));
                return;
            } else if (obj2 instanceof h) {
                tr7.a.b(this.f109315r, ((h) obj2).f109301a, null, 6);
                return;
            } else {
                if (obj2 instanceof t0) {
                    j60.a.v(this.f109314q, false, null, 3);
                    n2(new cn0.d(this, (t0) obj2, continuation, 18), new whi.b(6));
                    return;
                }
                return;
            }
        }
        i0 i0Var = (i0) obj2;
        if (!(i0Var instanceof l0)) {
            if (!(i0Var instanceof o0)) {
                throw new NoWhenBranchMatchedException();
            }
            o0 o0Var = (o0) i0Var;
            A2(sr7.c.a(o0Var.f18729c, null), sr7.c.a(o0Var.f18728b, null));
            return;
        }
        l0 l0Var = (l0) i0Var;
        TextClause textClauseA = sr7.c.a(l0Var.f18723b, null);
        List<u0> list = l0Var.f18724c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (u0 u0Var : list) {
            String str2 = u0Var.f18740a;
            t0 t0Var = u0Var.f18741b;
            if (t0Var != null) {
                str = str2;
                click = new Click(28, (Integer) null, (Object) t0Var, str, false);
            } else {
                str = str2;
                click = null;
            }
            arrayList.add(new TextClause(str, (Style) click, (Integer) null, false, (o9) null, (List) null, 124));
        }
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        A2(new CompositeClause(arrayList, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), textClauseA);
    }
}
