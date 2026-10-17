package i06;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.rf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.customer_present.tips.impl.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f157308a = v.k(new TextLocalisedClause(R$string.customer_present_tipping_rates_first_rate_title, null, null, 14), new TextLocalisedClause(R$string.customer_present_tipping_rates_second_rate_title, null, null, 14), new TextLocalisedClause(R$string.customer_present_tipping_rates_third_rate_title, null, null, 14));

    public static RowDelegate.Model a(int i, int i2, RowDelegate.Model.MainImage.Image24 image24, boolean z) {
        String strN = a0.d.n("RATE_LIST_ID_", i);
        return new RowDelegate.Model(strN, image24, (Clause) f157308a.get(i), null, 0, null, null, null, 0, new rf(Long.valueOf(i2), i2 > 0 ? new TextClause("%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, z, false, null, 52), false, null, false, null, null, null, null, null, null, new i(strN, i, i2 > 0 ? h.DELETE : h.ADD), null, 0, 0, 0, 0, 532675576);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final cli.o c(cli.j jVar) throws Throwable {
        boolean z;
        boolean z3;
        int i;
        Throwable th10;
        Iterator it8;
        Throwable th11;
        boolean z4;
        RowDelegate.Model.MainImage.Image24 image24;
        Object obj2;
        RowDelegate.Model.MainImage.Image24 image242;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.customer_present_tipping_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.customer_present_tipping_toggle_subtitle, null, null, 14);
        boolean z6 = domainState.f157290a;
        List list = domainState.f157291b;
        boolean z11 = domainState.f157292c;
        RowDelegate.Model model = new RowDelegate.Model("TIPPING_SWITCH_LIST_ID", null, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(z6, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        boolean z12 = false;
        if (domainState.f157290a) {
            Throwable th12 = null;
            z = z11;
            eVarB.add(new ListSubheaderDelegate.Model("RATES_EDIT_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.customer_present_tipping_rates_subheader_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (!z ? new TextLocalisedClause(R$string.customer_present_tipping_common_action_edit, null, null, 14) : null), !z, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
            if (z) {
                aim.e eVarB2 = u.b();
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                int i2 = 0;
                while (it9.hasNext()) {
                    Object next = it9.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th13 = th12;
                        v.s();
                        throw th13;
                    }
                    int iIntValue = ((Number) next).intValue();
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it10 = list2.iterator();
                        i = 0;
                        while (it10.hasNext()) {
                            if (((Number) it10.next()).intValue() > 0 && (i = i + 1) < 0) {
                                v.r();
                                throw th12;
                            }
                        }
                    }
                    if (z) {
                        if (iIntValue > 0 && i == 1) {
                            image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_minus_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 4);
                        } else if (iIntValue > 0 && i > 1) {
                            image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_minus_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), true, false, 4);
                        } else if (iIntValue == 0) {
                            th11 = th12;
                            it8 = it9;
                            z4 = true;
                            image242 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_16_plus_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, new ImageTransformations(null, null, null, null, null, 24, 24, 31), (Clause) null, 182), true, false, 4);
                        } else {
                            th10 = th12;
                            it8 = it9;
                            obj2 = th12;
                            z4 = true;
                            image242 = obj2;
                            th11 = th10;
                        }
                        th10 = th12;
                        it8 = it9;
                        obj2 = image24;
                        z4 = true;
                        image242 = obj2;
                        th11 = th10;
                    } else {
                        th11 = th12;
                        it8 = it9;
                        z4 = true;
                        image242 = th12;
                    }
                    i iVar = domainState.d;
                    arrayList.add(a(i2, iIntValue, image242, (iVar == null || i2 != iVar.f157294b) ? false : z4));
                    it9 = it8;
                    i2 = i3;
                    th12 = th11;
                }
                z3 = true;
                eVarB2.addAll(arrayList);
                aim.e eVarA = u.a(eVarB2);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                eVarB.addAll(eVarA);
            } else {
                z3 = true;
                aim.e eVarB3 = u.b();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((Number) obj3).intValue() > 0) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                int i5 = 0;
                for (Object obj4 : arrayList2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList3.add(a(i5, ((Number) obj4).intValue(), null, false));
                    i5 = i6;
                }
                eVarB3.addAll(arrayList3);
                aim.e eVarA2 = u.a(eVarB3);
                yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
                eVarB.addAll(eVarA2);
            }
        } else {
            z = z11;
            z3 = true;
        }
        aim.e eVarA3 = u.a(eVarB);
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it11 = list3.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    break;
                }
                if (((Number) it11.next()).intValue() > 0) {
                    z12 = z3;
                    break;
                }
            }
        }
        return new k(eVarA3, z, z12);
    }
}
