package z9l;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenHeaderAction;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.Step;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import yxc.l;
import yxc.r;
import zhm.a0;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public interface i {
    static ArrayList a(i iVar, SectionContent.ProgressionSteps progressionSection, boolean z, Integer num, Integer num2, String str, boolean z3, int i) {
        String listIdPrefix;
        String str2;
        ResourceImage resourceImage;
        boolean z4 = (i & 2) != 0 ? false : z;
        LabelButtonDelegate.Model model = null;
        Integer numValueOf = null;
        model = null;
        Integer num3 = (i & 4) != 0 ? null : num;
        Integer num4 = (i & 8) != 0 ? null : num2;
        if ((i & 16) != 0) {
            m70.a.c(t0.f186434a);
            listIdPrefix = "";
        } else {
            listIdPrefix = str;
        }
        boolean z6 = (i & 32) != 0 ? false : z3;
        r rVar = (r) iVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(progressionSection, "progressionSection");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = progressionSection.f64180c;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        int i2 = 0;
        for (Object obj2 : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            arrayList3.add(rVar.c(progressionSection, (Step) obj2, i2, z4, false, listIdPrefix, z6, num3, num4));
            i2 = i3;
        }
        a0.x(arrayList3, arrayList);
        FincrimeHomeScreenHeaderAction fincrimeHomeScreenHeaderAction = progressionSection.f64179b;
        if (fincrimeHomeScreenHeaderAction != null && (str2 = fincrimeHomeScreenHeaderAction.f64152a) != null) {
            aal.b icon = fincrimeHomeScreenHeaderAction.f64153b;
            if (icon != null) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                int i5 = yxc.k.f317650a[icon.ordinal()];
                if (i5 == 11) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_arrow_rates);
                } else if (i5 == 12) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_arrow_repeat);
                } else if (i5 == 30) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_check);
                } else if (i5 == 35) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_cross);
                } else if (i5 == 40) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_exclamation_mark);
                } else if (i5 == 54) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_info_outline);
                } else if (i5 == 57) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_lightning);
                } else if (i5 == 72) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_plus);
                } else if (i5 == 79) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_question_outline);
                } else if (i5 == 85) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_shield);
                } else if (i5 == 87) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_statement);
                } else if (i5 == 89) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_time);
                } else if (i5 == 64) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_minus);
                } else if (i5 != 65) {
                    switch (i5) {
                        case 59:
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_link);
                            break;
                        case 60:
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_lock_closed);
                            break;
                        case 61:
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_lock_opened);
                            break;
                    }
                } else {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_moon);
                }
                resourceImage = new ResourceImage(numValueOf != null ? numValueOf.intValue() : l.b(icon), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            } else {
                resourceImage = null;
            }
            model = new LabelButtonDelegate.Model(com.google.android.gms.internal.mlkit_vision_face.a.o(listIdPrefix, "ID_TICKETOR_PROGRESSION_PROGRESS_ACTION_", str2), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), resourceImage, null, fincrimeHomeScreenHeaderAction.f64154c, R$attr.uikit_dp0, 0, R$attr.uikit_dp12, 1704);
        }
        arrayList.add(model);
        return d0.Z(arrayList);
    }
}
