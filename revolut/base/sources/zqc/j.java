package zqc;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.models.v2.Employer;
import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f324457a = new ListSubheaderDelegate.Model("ACTIVE_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.salary_switch_br_requests_list_section_active_requests, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f324458b = new ListSubheaderDelegate.Model("PAST_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.salary_switch_br_requests_list_section_past_requests, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f324459c = yhm.j.b(new l(0, this, j.class, "buildMenuItems", "buildMenuItems()Ljava/util/List;", 0, 0));

    public static final class a {
        private a() {
        }
    }

    public static List a(ListSubheaderDelegate.Model model, ArrayList arrayList) {
        RowDelegate.Model model2;
        String str;
        String strL;
        CircleBadgeModel successCircleBadge;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            SalarySwitchV2StatusSummary salarySwitchV2StatusSummary = (SalarySwitchV2StatusSummary) it8.next();
            Employer employer = salarySwitchV2StatusSummary.f;
            kqc.g gVar = salarySwitchV2StatusSummary.i;
            bqc.k kVar = salarySwitchV2StatusSummary.f85261b;
            if (employer == null || (str = employer.f85240b) == null || (strL = m70.a.l(str)) == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "SalaryRequestsStateMapper", "Missing employer name", null, h0Var);
                model2 = null;
            } else {
                TextClause textClause = new TextClause(strL, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String strQ = j6.a.q("SALARY_REQUEST_ROW_ID_", salarySwitchV2StatusSummary.f85260a);
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_24_salary;
                int i2 = R$attr.uikit_colorAccentNeutral;
                LayeredImage layeredImageH = y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2));
                int[] iArr = k.f324461b;
                int i3 = iArr[kVar.ordinal()];
                if (i3 == 1) {
                    successCircleBadge = new SuccessCircleBadge(dw0.a.Checked);
                } else if (i3 == 2) {
                    successCircleBadge = null;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    successCircleBadge = (gVar == null ? -1 : k.f324460a[gVar.ordinal()]) == 1 ? new InactiveCircleBadge(dw0.a.Cancelled) : new DangerCircleBadge(dw0.a.Error);
                }
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(layeredImageH, successCircleBadge, null, false, null, false, 60);
                int i5 = iArr[kVar.ordinal()];
                if (i5 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_br_requests_list_status_completed, null, null, 14);
                } else if (i5 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_br_requests_list_status_in_progress, null, null, 14);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i6 = gVar != null ? k.f324460a[gVar.ordinal()] : -1;
                    if (i6 == 1) {
                        textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_br_requests_list_status_cancelled, null, null, 14);
                    } else if (i6 != 2) {
                        textLocalisedClause2 = null;
                        yy0.i iVar = yy0.l.Companion;
                        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        iVar.getClass();
                        model2 = new RowDelegate.Model(strQ, image40, textClause, null, 0, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, salarySwitchV2StatusSummary, null, 0, 0, 0, 0, 532675544);
                    } else {
                        textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_br_requests_list_status_rejected, null, null, 14);
                    }
                }
                textLocalisedClause2 = textLocalisedClause;
                yy0.i iVar2 = yy0.l.Companion;
                ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                iVar2.getClass();
                model2 = new RowDelegate.Model(strQ, image40, textClause, null, 0, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage2)), false, null, false, null, null, null, null, null, null, salarySwitchV2StatusSummary, null, 0, 0, 0, 0, 532675544);
            }
            if (model2 != null) {
                arrayList2.add(model2);
            }
        }
        List list = (List) ue0.e.M(arrayList2);
        ArrayList arrayListG = list != null ? yp0.b.g(list, model, null, 0, 0, 126) : null;
        return arrayListG == null ? f0.f322471a : arrayListG;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f324452a, new zhf.f(this, 26), new zo2.h(this, 7), new ymk.y(this, 21));
    }
}
