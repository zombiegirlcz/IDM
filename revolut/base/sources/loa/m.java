package loa;

import com.revolut.chat.ChatApi$Toggles;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.toggles.models.PublicExperimentDefinition;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        GlyphImage glyphImage;
        RowDelegate.Model model;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Map map = domainState.f197430a;
        if (map != null) {
            arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                PublicExperimentDefinition publicExperimentDefinition = (PublicExperimentDefinition) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (publicExperimentDefinition instanceof ChatApi$Toggles.AssistantExperimentDefinition) {
                    textLocalisedClause = new TextLocalisedClause(R$string.profile_experiments_assistant_title, null, null, 14);
                    textLocalisedClause2 = new TextLocalisedClause(R$string.profile_experiments_assistant_subtitle, null, null, 14);
                    glyphImage = new GlyphImage(R$drawable.uikit_icn_24_ai, null, null, 6);
                } else {
                    textLocalisedClause = null;
                    textLocalisedClause2 = null;
                    glyphImage = null;
                }
                if (textLocalisedClause == null || textLocalisedClause2 == null || glyphImage == null) {
                    model = null;
                } else {
                    publicExperimentDefinition.getClass();
                    model = new RowDelegate.Model("moneyAssistantExperiment", new RowDelegate.Model.MainImage.Image40(glyphImage, null, null, false, null, false, 62), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(zBooleanValue, true), false, null, false, null, null, null, null, null, null, publicExperimentDefinition, null, 0, 0, 0, 0, 532675544);
                }
                if (model != null) {
                    arrayList.add(model);
                }
            }
        } else {
            arrayList = null;
        }
        List list = domainState.f197431b;
        if (list != null) {
            arrayList2 = new ArrayList();
            Iterator it8 = list.iterator();
            if (it8.hasNext()) {
                throw v0.a.e(it8);
            }
        } else {
            arrayList2 = null;
        }
        boolean z = domainState.f197432c;
        aim.e eVarB = u.b();
        if (z) {
            eVarB.add(new RowDelegate.Model("FINCRIME_FLOWS_MENU_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_anonymous, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.profile_experiments_fincrime_menu_title, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, e.f197433a, null, 0, 0, 0, 0, 532675576));
        }
        List listE0 = (arrayList == null || arrayList2 == null) ? null : d0.E0(u.a(eVarB), d0.E0(arrayList2, arrayList));
        if (listE0 == null) {
            List listC = u.c(new pb0("loading"));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            listE0 = listC;
        } else if (listE0.isEmpty()) {
            List listC2 = u.c(new FullScreenStateDelegate.Model("empty", new TextLocalisedClause(R$string.profile_experiments_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d188", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            listE0 = listC2;
        } else {
            yp0.b.k(listE0, 0, 0, 0, 0, 31);
        }
        return new g(listE0);
    }
}
