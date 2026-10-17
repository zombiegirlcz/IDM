package aqe;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.impl.v2.models.Checkmark;
import com.revolut.retail.common.ui.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8424a;

    public e(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f8424a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b bVar = this.f8424a;
        List list = bVar.f8422c;
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            Checkmark checkmark = (Checkmark) obj2;
            String strN = a0.d.n("tin_checkmark_", i2);
            TextClause textClause = new TextClause(checkmark.f90153b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i5 = d.f8423a[checkmark.f90152a.ordinal()];
            if (i5 == 1) {
                i = R$drawable.uikit_icn_24_check;
            } else if (i5 == 2) {
                i = R$drawable.uikit_icn_24_dot;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_cross;
            }
            arrayList.add(new CellDetailsStandaloneNoteDelegate.Model(strN, null, textClause, null, new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, i2 == 0 ? R$attr.uikit_dp16 : R$attr.uikit_dp8, i2 == v.j(list) ? R$attr.uikit_dp16 : R$attr.uikit_dp8, 1642));
            i2 = i3;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), arrayList, new lw0.a(new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_input_learn_more_where_to_find_tin_title, u.c(new TextClause(bVar.f8420a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new HtmlClause(1, 28, (Integer) null, (Object) null, bVar.f8421b), null, null, false, 28));
    }
}
