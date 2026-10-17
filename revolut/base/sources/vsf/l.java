package vsf;

import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer_reasons.api.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        j jVar2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ttf.a aVar = domainState.f291777a;
        aim.e eVarB = u.b();
        int i = R$drawable.uikit_icn_24_eye;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 62);
        int i3 = R$drawable.uikit_icn_24_edit;
        int i5 = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i5), 0.1f, companion, i3, new Color.Solid(i5)), null, null, false, null, false, 62);
        RowDelegate.Model model = new RowDelegate.Model("DECLARATION_ACTION_VIEW_ROW_ID", image40, new TextLocalisedClause(R$string.transfer_reasons_declaration_actions_view, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        ArrayList<ttf.d> arrayList = aVar.f274316b;
        ArrayList<j> arrayList2 = new ArrayList();
        for (ttf.d dVar : arrayList) {
            int i6 = k.f291790a[dVar.ordinal()];
            if (i6 == 1) {
                jVar2 = new j(new TextLocalisedClause(R$string.transfer_reasons_declaration_actions_modification_title, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_declaration_actions_modification_description, null, null, 14), dVar);
            } else if (i6 == 2) {
                jVar2 = new j(new TextLocalisedClause(R$string.transfer_reasons_declaration_actions_correction_title, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_declaration_actions_correction_description, null, null, 14), dVar);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar2 = null;
            }
            if (jVar2 != null) {
                arrayList2.add(jVar2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (j jVar3 : arrayList2) {
            RowDelegate.Model.MainImage.Image40 image403 = image402;
            arrayList3.add(new RowDelegate.Model(j6.a.q("DECLARATION_ACTION_OPERATION_ROW_ID_", jVar3.f291789c.name()), image403, jVar3.f291787a, null, 0, jVar3.f291788b, null, null, 0, null, false, null, false, null, null, null, null, null, null, jVar3.f291789c, null, 0, 0, 0, 0, 532676568));
            image402 = image403;
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList3);
        return new g(u.a(eVarB));
    }
}
