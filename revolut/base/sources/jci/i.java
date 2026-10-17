package jci;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<RiskItem> list = domainState.f172815a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (RiskItem riskItem : list) {
            arrayList.add(new InputChecklistDelegate.Model(riskItem.getF97735a(), riskItem.getF97736b(), domainState.f172816b.contains(riskItem.getF97735a()), false, new InputChecklistDelegate.a.b(null), iq.CHECK_BUTTON, null, riskItem.getF97737c() ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, riskItem, null, 0, 0, 0, 523848));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new g(arrayList, domainState.f172817c);
    }
}
