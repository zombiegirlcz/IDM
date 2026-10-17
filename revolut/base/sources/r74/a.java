package r74;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import aw0.x4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.x9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import ip0.m4;
import ip0.wy;
import ip0.xy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.s4;
import mx0.v5;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static AccentCircleBadge a(ht3.a0 a0Var) {
        if (a0Var instanceof ht3.z) {
            if (((ht3.z) a0Var).f155320c) {
                return new AccentCircleBadge(dw0.a.Checked);
            }
            return null;
        }
        if ((a0Var instanceof ht3.x) || (a0Var instanceof ht3.y)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Image b(ht3.a0 a0Var) {
        if (a0Var instanceof ht3.x) {
            return ((ht3.x) a0Var).f155316a.T1();
        }
        if (a0Var instanceof ht3.y) {
            return com.revolut.core.ui_kit_core.displayers.image.models.a.b(((ht3.y) a0Var).f155317a, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8);
        }
        if (!(a0Var instanceof ht3.z)) {
            throw new NoWhenBranchMatchedException();
        }
        ht3.z zVar = (ht3.z) a0Var;
        return new ContactImage(zVar.f155318a, (String) null, (String) null, (String) null, (String) null, zVar.f155319b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062);
    }

    public static aim.e c(List items) {
        Iterator it8;
        qv0.o oVarD;
        s4 s4Var;
        List listC;
        Intrinsics.checkNotNullParameter(items, "items");
        aim.e eVarB = zhm.u.b();
        Iterator it9 = items.iterator();
        while (it9.hasNext()) {
            ht3.d0 d0Var = (ht3.d0) it9.next();
            if (d0Var instanceof ht3.r) {
                ht3.r rVar = (ht3.r) d0Var;
                aim.e eVarB2 = zhm.u.b();
                String str = rVar.f155303a;
                if (str != null) {
                    eVarB2.add(new ListSubheaderDelegate.Model("carousel_header_list_id", (Image) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                }
                ArrayList arrayList = rVar.f155304b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    ht3.q qVar = (ht3.q) obj2;
                    String strN = a0.d.n("carousel_image_", i);
                    m4 m4Var = m4.SQUARE;
                    ht3.p pVar = qVar.f155302b;
                    if (pVar != null) {
                        a1 a1Var = pVar.f155300b;
                        if (a1Var == null || (listC = zhm.u.c(new ResourceImage(a1Var.c(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246))) == null) {
                            listC = f0.f322471a;
                        }
                        s4Var = new s4(listC, new TextLocalisedClause(R$string.credit_prompt_items_carousel_hint_text, zhm.u.c(pVar.f155299a), null, 12), 2, 24);
                    } else {
                        s4Var = null;
                    }
                    BigTileDelegate.Model model = new BigTileDelegate.Model(strN, null, null, null, new UrlImage(qVar.f155301a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), s4Var, null, null, null, false, false, null, null, null, m4Var, null, 66584264);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(model);
                    i = i2;
                }
                eVarB2.add(new hg("images_carousel_item_list_id", arrayList2, 1, x4.c.f10604a, null, new gg.b(false, 2), false, false, null, null, 0, 0, 0, 0, 32720));
                eVarB.addAll(zhm.u.a(eVarB2));
                it8 = it9;
            } else if (d0Var instanceof ht3.t) {
                ht3.t tVar = (ht3.t) d0Var;
                aim.e eVarB3 = zhm.u.b();
                ArrayList<ht3.d0> arrayList3 = tVar.f155308b;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (ht3.d0 d0Var2 : arrayList3) {
                    if (d0Var2 instanceof ht3.t) {
                        throw new UnsupportedOperationException("GroupItem is not supported inside another GroupItem");
                    }
                    if (d0Var2 instanceof ht3.r) {
                        throw new UnsupportedOperationException("CarouselItem is not supported inside GroupItem");
                    }
                    if (d0Var2 instanceof ht3.b0) {
                        oVarD = f((ht3.b0) d0Var2);
                    } else if (d0Var2 instanceof ht3.v) {
                        oVarD = e((ht3.v) d0Var2);
                    } else if (d0Var2 instanceof ht3.c0) {
                        oVarD = g((ht3.c0) d0Var2);
                    } else {
                        if (!(d0Var2 instanceof ht3.s)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oVarD = d((ht3.s) d0Var2);
                    }
                    arrayList4.add(oVarD);
                }
                String str2 = tVar.f155307a;
                if (str2 == null) {
                    yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                    eVarB3.addAll(arrayList4);
                    it8 = it9;
                } else {
                    it8 = it9;
                    eVarB3.addAll(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(str2, (Image) null, (Clause) new TextLocalisedClause(R$string.credit_prompt_items_title, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                }
                eVarB.addAll(zhm.u.a(eVarB3));
            } else {
                it8 = it9;
                if (d0Var instanceof ht3.b0) {
                    eVarB.add(f((ht3.b0) d0Var));
                } else if (d0Var instanceof ht3.v) {
                    eVarB.add(e((ht3.v) d0Var));
                } else if (d0Var instanceof ht3.c0) {
                    eVarB.add(g((ht3.c0) d0Var));
                } else {
                    if (!(d0Var instanceof ht3.s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVarB.add(d((ht3.s) d0Var));
                }
            }
            it9 = it8;
        }
        return zhm.u.a(eVarB);
    }

    public static CellDetailsDelegate.Model d(ht3.s sVar) {
        String str = sVar.f155305a;
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(R$string.credit_prompt_items_cell_details_title, zhm.u.c(str), null, 12), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.credit_prompt_items_cell_details_value, zhm.u.c(sVar.f155306b), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static EsimDelegate.Model e(ht3.v vVar) {
        String str = vVar.f155311a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_prompt_items_labeled_row_title, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_prompt_items_labeled_row_value, zhm.u.c(new TextClause(vVar.f155312b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        ht3.u uVar = vVar.f155313c;
        return new EsimDelegate.Model(str, new ContactImage(uVar.f155309a, (String) null, (String) null, (String) null, (String) null, uVar.f155310b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), null, textLocalisedClause, textLocalisedClause2, null, null, null, false, null, false, null, null, 14308);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$MainImage] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r20v4, types: [com.revolut.core.ui_kit.models.badge.AccentCircleBadge] */
    public static qv0.i f(ht3.b0 b0Var) {
        ?? image40;
        x9 x9Var;
        ht3.w wVar = b0Var.d;
        String str = b0Var.f155254b;
        ht3.a0 a0Var = b0Var.f155255c;
        if (wVar == null) {
            String str2 = b0Var.f155253a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_prompt_items_row_title, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.credit_prompt_items_row_description, prk.o.v(0, 30, null, null, str), null, 12) : null;
            if (a0Var instanceof ht3.z) {
                image40 = new RowDelegate.Model.MainImage.Image40(b(a0Var), a(a0Var), null, false, null, false, 60);
            } else {
                if ((a0Var instanceof ht3.x) || (a0Var instanceof ht3.y)) {
                    image24 = new RowDelegate.Model.MainImage.Image24(b(a0Var), false, false, 6);
                } else if (a0Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                image40 = image24;
            }
            return new RowDelegate.Model(str2, image40, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        }
        String str3 = b0Var.f155253a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_prompt_items_row_title, zhm.u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause4 = str != null ? new TextLocalisedClause(R$string.credit_prompt_items_row_description, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        Image imageB = a0Var != null ? b(a0Var) : null;
        wy wyVar = new wy(new TextLocalisedClause(R$string.credit_prompt_items_row_button, zhm.u.c(new TextClause(wVar.f155315b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), xy.SECONDARY_ACTIVE, null);
        if (a0Var instanceof ht3.z) {
            x9Var = x9.DP_40;
        } else {
            if (!(a0Var instanceof ht3.x) && !(a0Var instanceof ht3.y) && a0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            x9Var = x9.DP_24;
        }
        return new NotificationCentreItemDelegate.Model(str3, textLocalisedClause3, textLocalisedClause4, wyVar, imageB, x9Var, a0Var != null ? a(a0Var) : null, wVar.f155314a, 255072);
    }

    public static PlainTextDelegate.Model g(ht3.c0 c0Var) {
        String str = c0Var.f155259a;
        return new PlainTextDelegate.Model(str, (Clause) null, (Clause) new TextLocalisedClause(R$string.credit_prompt_items_text_text, prk.o.v(1, 28, null, null, str), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
    }
}
