package aqb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_consent.api.navigation.JuniorConsentRequestPromptDestination;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import fg8.c0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8304a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8306c;

    public /* synthetic */ w(c0 c0Var, String str, boolean z) {
        this.f8305b = str;
        this.f8306c = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str;
        Object next;
        switch (this.f8304a) {
            case 0:
                e content = (e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                RowDelegate.Model model = new RowDelegate.Model("SHOW_WITHDRAW_LIST_ID", null, new TextLocalisedClause(R$string.widgets_catalogue_savings_customise_sheet_cells_show_withdraw, null, null, 14), null, 0, null, null, null, 0, new vf(this.f8306c, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(oc.c.r(content.f8281b.f280366a), null, null, 14);
                String str2 = this.f8305b;
                List listK = zhm.v.k(model, new RowDelegate.Model("SAVINGS_ACCOUNT_LIST_ID", null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(oc.c.q(content.f8281b.f280366a), null, null, 14), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return d0.F0(com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b.b("CUSTOMISE_DONE_BUTTON_LIST_ID"), listK);
            default:
                List consentRequests = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(consentRequests, "consentRequests");
                Iterator it8 = consentRequests.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f8305b;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((xc8.f) next).f304105b, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next == null) {
                    throw new IllegalArgumentException(j6.a.q("Cannot find data management consent request given the juniorId = ", f0.U0(4, str)).toString());
                }
                xc8.f fVar = (xc8.f) next;
                FeatureCommand featureCommandF = gc0.c.f(new KompotOverlayFeatureConfig(new JuniorConsentRequestPromptDestination(str, new ConsentTypeId.ConsentRequestId(fVar.f304104a, fVar.f304106c), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D254", null, null, null, 30)), yhi.b.POPUP, (Integer) null, 12));
                return this.f8306c ? c0.a(featureCommandF) : featureCommandF;
        }
    }

    public /* synthetic */ w(boolean z, String str, com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b bVar) {
        this.f8306c = z;
        this.f8305b = str;
    }
}
