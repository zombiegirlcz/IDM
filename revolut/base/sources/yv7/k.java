package yv7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EmbeddedInsuranceGetHelpScreenContract$InputData f317133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hu7.j f317134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f317135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f317136s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, EmbeddedInsuranceGetHelpScreenContract$InputData inputData, hu7.j detailRepository, j60.a bottomExpandableDialogControllerExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(detailRepository, "detailRepository");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f317133p = inputData;
        this.f317134q = detailRepository;
        this.f317135r = bottomExpandableDialogControllerExtension;
        this.f317136s = new f(0);
    }

    @Override // yji.l
    public final void I1() {
        EmbeddedInsuranceGetHelpScreenContract$InputData embeddedInsuranceGetHelpScreenContract$InputData = this.f317133p;
        yji.l.a1(this, this.f317134q.b(embeddedInsuranceGetHelpScreenContract$InputData.f76138a, embeddedInsuranceGetHelpScreenContract$InputData.f76139b), null, null, new yk6.m(this, (Continuation) null, 19), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f317136s;
    }

    public final void y2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!(obj2 instanceof bu7.g)) {
            if (Intrinsics.f(listId, "ID_BANNER")) {
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null) {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter(str, 2))));
                    return;
                }
                return;
            }
            return;
        }
        bu7.g gVar = (bu7.g) obj2;
        bu7.f fVar = gVar.f18713a;
        String str2 = gVar.f18714b;
        int i = i.f317131a[fVar.ordinal()];
        if (i == 1) {
            C1(nu7.a.b(str2));
            return;
        }
        if (i == 2) {
            C1(nu7.a.c(str2));
            return;
        }
        if (i == 3) {
            C1(nu7.a.a(str2));
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        rp0.l lVar = rp0.l.WINDOW;
        String str3 = gVar.d;
        t tVar = str3 != null ? new t(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30) : null;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextClause textClause = new TextClause(gVar.f18714b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
        int i2 = R$attr.uikit_dp24;
        int i3 = R$attr.uikit_dp16;
        this.f317135r.x(new y(u.c(new LargeActionButtonDelegate.Model("ID_DIALOG_LARGE_BUTTON", defaultFilledButton, resourceImage, textClause, false, null, gVar, i2, i2, i3, i3, 368)), tVar, lVar, null, null, null, 1016));
        Unit unit = Unit.f186387a;
    }
}
