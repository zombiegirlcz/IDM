package y05;

import android.os.Parcelable;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        int i;
        int i2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CreditScoreInsight creditScoreInsight = domainState.f310145a;
        v05.e eVarA = v05.g.a(creditScoreInsight);
        s05.b bVar = creditScoreInsight.f69963b;
        aim.e eVarB = u.b();
        Clause clause = eVarA.f284745c;
        ArrayList arrayList = eVarA.d;
        if (clause != null) {
            TextDelegate.Model model = new TextDelegate.Model("ID_INSIGHT_DESCRIPTION", clause, false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2036);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            boolean z = false;
            int i3 = 0;
            for (Object obj2 : arrayList) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                v05.d dVar = (v05.d) obj2;
                arrayList2.add(new RowDelegate.Model(a0.d.n("ID_INSIGHT_ACTION_", i3), new RowDelegate.Model.MainImage.Image24(new ResourceImage(dVar.f284742c, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), dVar.f284740a, null, 0, dVar.f284741b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                i3 = i5;
            }
            eVarB.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("ID_INSIGHT_ACTIONS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_score_insight_detail_take_action, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124));
        }
        aim.e eVarA2 = u.a(eVarB);
        Clause clause2 = eVarA.f284743a;
        NavBarLargeCentred.Model model2 = new NavBarLargeCentred.Model(clause2 != null ? new l(clause2) : null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 990);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        int[] iArr = g.f310149a;
        int i6 = iArr[bVar.ordinal()];
        if (i6 == 1) {
            i = R$drawable.uikit_icn_24_check;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_exclamation_mark;
        }
        int i21 = i;
        int i22 = iArr[bVar.ordinal()];
        if (i22 == 1) {
            i2 = R$attr.uikit_colorStatusSuccess;
        } else {
            if (i22 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$attr.uikit_colorStatusWarning;
        }
        return new e(eVarA2, model2, new ResourceImage(i21, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246), eVar);
    }
}
