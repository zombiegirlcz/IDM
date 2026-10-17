package ob4;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.pc;
import xu3.r;
import xu3.s;
import xu3.t;
import xu3.w;
import xu3.x;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceTypeSelectionScreenContract$InputData f223885a;

    public l(EvidenceTypeSelectionScreenContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f223885a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        CompositeClause compositeClause;
        Image imageD;
        cli.k domainState = (cli.k) jVar;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData = this.f223885a;
        ResourceImage resourceImageA = q74.b.a(evidenceTypeSelectionScreenContract$InputData.f67704a);
        int i = R$string.financial_evidence_evidence_type_selection_title;
        x xVar = evidenceTypeSelectionScreenContract$InputData.f67705b;
        String str = xVar.f308948a;
        w wVar = xVar.f308950c;
        Style style = null;
        int i2 = 12;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(str), null, 12);
        String str2 = xVar.f308949b;
        if (str2 == null && wVar == null) {
            compositeClause = null;
        } else {
            TextLocalisedClause textLocalisedClause3 = str2 != null ? new TextLocalisedClause(R$string.financial_evidence_evidence_type_selection_description, u.c(str2), null, 12) : null;
            if (wVar != null) {
                int i3 = R$string.financial_evidence_evidence_type_selection_second_description;
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_question, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16);
                m70.a.t(t0.f186434a);
                textLocalisedClause = new TextLocalisedClause(i3, u.c(new CompositeClause(v.k(imageClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(wVar.f308946a, (Style) new Click(28, (Integer) null, (Object) wVar.f308947b, "second_description", false), (Integer) null, false, (o9) null, (List) null, 124)), null, null, null, 14)), null, 12);
            } else {
                textLocalisedClause = null;
            }
            TextLocalisedClause[] elements = {textLocalisedClause3, textLocalisedClause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        String str3 = xVar.d;
        TextLocalisedClause textLocalisedClause4 = str3 != null ? new TextLocalisedClause(R$string.financial_evidence_evidence_type_selection_disclaimer, u.c(str3), null, 12) : null;
        ArrayList arrayList = xVar.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            xu3.v vVar = (xu3.v) it8.next();
            String str4 = vVar.f308943a;
            t tVar = vVar.f308945c;
            if (tVar instanceof r) {
                imageD = com.revolut.core.ui_kit_core.displayers.image.models.b.b(((r) tVar).f308939a);
            } else {
                if (!(tVar instanceof s)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageD = ((s) tVar).f308940a.d();
            }
            dc dcVar = new dc(imageD);
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.financial_evidence_evidence_type_selection_cell_title, u.c(vVar.f308943a), style, i2);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.financial_evidence_evidence_type_selection_cell_description, u.c(vVar.f308944b), style, i2);
            List list = vVar.d;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                xu3.u uVar = (xu3.u) it9.next();
                String str5 = uVar.f308941a;
                a1 a1Var = uVar.f308942b;
                arrayList3.add(new pc(str5, new TagViewData(a1Var != null ? new ResourceImage(a1Var.c(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, new TextLocalisedClause(R$string.financial_evidence_evidence_type_selection_cell_tag, u.c(uVar.f308941a), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new Color.Solid(R$attr.uikit_colorForeground_20), R$attr.uikit_colorTransparent, null, 1000), null));
                it9 = it9;
                it8 = it8;
                textLocalisedClause4 = textLocalisedClause4;
            }
            ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(str4, dcVar, textLocalisedClause5, textLocalisedClause6, arrayList3, vVar.e, null, false, false, false, 960);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
            style = null;
            i2 = 12;
        }
        return new k(arrayList2, resourceImageA, textLocalisedClause2, compositeClause, textLocalisedClause4);
    }
}
