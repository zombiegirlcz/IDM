package uth;

import aim.e;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.x9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ProductClosurePrompt;
import ip0.tt;
import ip0.ut;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        NotificationCentreItemDelegate.Model model;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.product_obstacles_details_title, u.c(domainState.f283103a.f105596a), null, 12), null, null, null, false, 30);
        ProductClosurePrompt productClosurePrompt = domainState.f283103a;
        List list = productClosurePrompt.f105597b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new ut(a0.d.n("CLOSE_PRODUCT_INSTRUCTION_LIST_CELL_BULLET_DELEGATE_ID_", i), new TextClause((String) obj2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i2, false, tt.FILL, null, 1000));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        String str = productClosurePrompt.f105598c;
        if (str != null) {
            model = new NotificationCentreItemDelegate.Model("CLOSE_PRODUCT_DISCLAIMER_NOTIFICATION_CENTRE_DELEGATE_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, x9.DP_24, null, null, 260980);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        e eVarB = u.b();
        eVarB.addAll(arrayList);
        if (model != null) {
            eVarB.add(model);
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.product_obstacles_details_action_button, u.c(productClosurePrompt.d), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), u.a(eVarB), aVar);
    }
}
