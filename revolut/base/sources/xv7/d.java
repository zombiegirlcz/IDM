package xv7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.data.model.c0;
import com.revolut.feature.insurance_embedded.impl.data.model.d0;
import com.revolut.feature.insurance_embedded.impl.data.model.v;
import com.revolut.feature.insurance_embedded.impl.data.model.x;
import com.revolut.feature.insurance_embedded.impl.data.model.y;
import gu7.f1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f309216a;

    public d(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f309216a = uiKitResources;
    }

    public final List a(f1 section) {
        Clause clauseA;
        c0 c0Var;
        String str;
        int iT;
        Intrinsics.checkNotNullParameter(section, "section");
        List list = section.f146745b;
        String str2 = section.f146744a;
        List<d0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (d0 d0Var : list2) {
            String strQ = j6.a.q("CONTACT_ITEM_ID_", d0Var.f75982b);
            String str3 = d0Var.f75981a;
            TextClause textClauseA = null;
            RowDelegate.Model.MainImage.Image24 image24A = str3 != null ? xu7.d.a(this.f309216a, str3, null) : null;
            tf tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            v vVar = d0Var.d;
            tf tfVar2 = ((vVar instanceof x) || (vVar instanceof y)) ? tfVar : null;
            String str4 = d0Var.f75982b;
            if (!(vVar instanceof c0) || (iT = kotlin.text.d0.T(str4, (str = (c0Var = (c0) vVar).f75979b), 0, false, 6)) < 0) {
                clauseA = sr7.c.a(str4, null);
            } else {
                String strSubstring = str4.substring(0, iT);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (strSubstring.length() <= 0) {
                    strSubstring = null;
                }
                TextClause textClauseA2 = strSubstring != null ? sr7.c.a(strSubstring, null) : null;
                String str5 = c0Var.f75979b;
                TextClause textClauseA3 = sr7.c.a(str5, new Click(30, (Integer) null, (Object) null, str5, false));
                String strSubstring2 = str4.substring(str.length() + iT);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                if (strSubstring2.length() <= 0) {
                    strSubstring2 = null;
                }
                TextClause[] elements = {textClauseA2, textClauseA3, strSubstring2 != null ? sr7.c.a(strSubstring2, null) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.c(t0.f186434a);
                clauseA = yoj.b.m(sr7.c.a("", null), listL);
            }
            String str6 = d0Var.f75983c;
            if (str6 != null) {
                textClauseA = sr7.c.a(str6, null);
            }
            arrayList.add(new RowDelegate.Model(strQ, image24A, clauseA, null, 0, textClauseA, null, null, 0, tfVar2, false, null, false, null, null, null, null, null, null, d0Var, null, 0, 0, 0, 0, 532675544));
        }
        return xu7.b.a(R$attr.uikit_dp16, j6.a.q("CONTACT_HEADER_ID_", str2), str2, arrayList);
    }
}
