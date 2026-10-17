package ukk;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import ggc.g0;
import ggc.h0;
import ggc.y;
import ip0.xk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static void a(aim.e eVar, List list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        if (z) {
            eVar.add(new ListSubheaderDelegate.Model("id_subheader_all", (Image) null, (Clause) new TextLocalisedClause(R$string.plan_partner_offers_subheader_all_subscriptions, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338));
        }
        eVar.addAll(d("id_partner_grid_all", list));
    }

    public static void b(aim.e eVar, ArrayList arrayList) {
        ListSubheaderDelegate.Model model;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((g0) obj2).a().f) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            model = new ListSubheaderDelegate.Model("id_subheader_student", (Image) null, (Clause) new TextLocalisedClause(R$string.plan_partner_offers_subheader_student_extras, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338);
        } else {
            int size = arrayList2.size();
            model = new ListSubheaderDelegate.Model("id_subheader_student_blocked", (Image) null, (Clause) new TextLocalisedQuantityClause(R$plurals.plan_partner_offers_subheader_unlock_student, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24), (Image) null, (Clause) new TextLocalisedClause(R$string.plan_partner_offers_subheader_unlock_student_learn_more, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57258);
        }
        eVar.add(model);
        eVar.addAll(d("id_partner_grid_student", arrayList));
    }

    public static List d(String str, List list) {
        LayeredImage layeredImageA;
        List<g0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (g0 g0Var : list2) {
            h0 h0VarA = g0Var.a();
            String str2 = h0VarA.f143631a;
            y yVar = g0Var.f143629c;
            String strQ = j6.a.q("id_partner_", str2);
            String str3 = yVar.f143672a;
            if (str3 == null) {
                str3 = "";
            }
            TextClause textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (g0Var.b()) {
                int i = R$drawable.uikit_icn_24_student;
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i2 = R$attr.uikit_colorPopoverBackground;
                layeredImageA = LayeredImage.Companion.f(companion, i, R$attr.uikit_colorForeground, i2, Integer.valueOf(i2), 4.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
            } else if (h0VarA.f) {
                layeredImageA = h0VarA.f143634g ? LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_info_sign, new Color.Solid(R$attr.uikit_colorPopoverBackground), new Color.Solid(R$attr.uikit_colorStatusWarning), 4.0f, null, 48) : null;
            } else {
                int i3 = R$drawable.uikit_icn_24_premium;
                LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                int i5 = R$attr.uikit_colorPopoverBackground;
                layeredImageA = LayeredImage.Companion.f(companion2, i3, R$attr.uikit_colorForeground, i5, Integer.valueOf(i5), 4.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
            }
            LayeredImage layeredImage = layeredImageA;
            Intrinsics.checkNotNullParameter(g0Var, "<this>");
            String str4 = yVar.f143673b;
            LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_gift, Integer.valueOf(R$attr.uikit_colorPink), R$attr.uikit_colorPink_10, 16.0f, null, null, 48);
            arrayList.add(new CenteredContentTileDelegate.Model(strQ, str4 != null ? new UrlImage(str4, null, null, null, 0L, null, null, null, null, layeredImageB, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), Integer.valueOf(R$attr.uikit_colorBlack_5), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878) : layeredImageB, textClause, layeredImage, true, new AnalyticsContext(v0.a.b(str2, AnalyticsContext.INSTANCE)), g0Var));
        }
        return u.c(new xk(str, arrayList, null, null, null, 60));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f280775b;
        Data data2 = domainState.f280774a;
        j jVar2 = null;
        if (data.getContent() != null && data2.getContent() != null) {
            List list = (List) zi0.c.I(data2);
            if (!list.isEmpty()) {
                int size = list.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = true;
                        break;
                    }
                    if (((g0) list.get(i2)).a().f) {
                        z = false;
                        break;
                    }
                    i2++;
                }
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        g0 g0Var = (g0) list.get(i3);
                        if (!g0Var.b() && g0Var.a().f) {
                            break;
                        }
                        i3++;
                    } else {
                        int size3 = list.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            g0 g0Var2 = (g0) list.get(i5);
                            if (g0Var2.b() && g0Var2.a().f) {
                                List<g0> list2 = list;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    for (g0 g0Var3 : list2) {
                                        if (g0Var3.b() && g0Var3.a().f && (i = i + 1) < 0) {
                                            v.r();
                                            throw null;
                                        }
                                    }
                                }
                                jVar2 = new j(new TextLocalisedQuantityClause(R$plurals.plan_partner_offers_subtitle_student, Integer.valueOf(i), v.k(Integer.valueOf(i), dok.g.d((hha.d) zi0.c.I(data), null)), (Style) null, 24), new TextLocalisedClause(R$string.plan_partner_offers_title_explore, null, null, 14));
                            }
                        }
                    }
                }
                if (z) {
                    jVar2 = new j(null, new TextLocalisedClause(R$string.plan_partner_offers_title_upgrade, null, null, 14));
                } else {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.plan_partner_offers_title_explore, null, null, 14);
                    int i6 = R$string.plan_partner_offers_subtitle_explore;
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            if (((g0) it8.next()).a().f && (i = i + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                    }
                    jVar2 = new j(new TextLocalisedClause(i6, v.k(Integer.valueOf(i), dok.g.d((hha.d) zi0.c.I(data), null)), null, 12), textLocalisedClause);
                }
            }
        }
        return new k((List) iii.c.f(data2, new uj6.v(this, 11), new uj8.j(8), new uk2.w(this, domainState, 3)), jVar2, (Clause) iii.c.f(data2, new uj6.v(12), new uj8.j(9), new u3b.h(this, 16)));
    }
}
