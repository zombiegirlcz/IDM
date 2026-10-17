package mx4;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dx4.a2;
import dx4.b3;
import dx4.b4;
import dx4.b5;
import dx4.c5;
import dx4.d4;
import dx4.e5;
import dx4.f4;
import dx4.g2;
import dx4.g4;
import dx4.h4;
import dx4.h5;
import dx4.i2;
import dx4.i4;
import dx4.i5;
import dx4.j2;
import dx4.j5;
import dx4.k3;
import dx4.l2;
import dx4.l3;
import dx4.l4;
import dx4.m4;
import dx4.n3;
import dx4.p3;
import dx4.p5;
import dx4.r3;
import dx4.r4;
import dx4.s3;
import dx4.t3;
import dx4.u3;
import dx4.v3;
import dx4.w1;
import dx4.w3;
import dx4.x1;
import dx4.x3;
import dx4.x4;
import dx4.x5;
import dx4.y4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx4.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f210198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f210199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f210200c;
    public final f d;
    public final c1 e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f210201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f210202h;
    public final j1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f210203j;
    public final d1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k0 f210204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f210205m;

    public x(y documentListItemsMapper, v0 rowItemContentItemMapper, x0 rowNoteItemContentItemMapper, p0 pocketItemContentItemMapper, s0 rowActionItemContentItemMapper, f actionCellItemContentItemMapper, p cellItemContentItemMapper, c1 sliderItemContentItemMapper, h1 tileItemContentItemMapper, b0 expandableItemContentItemMapper, l bannerItemContentItemMapper, g1 textItemContentItemMapper, n cardItemContentItemMapper, j0 imageItemContentItemMapper, r checkboxItemContentItemMapper, l1 warningItemContentItemMapper, a0 expandableCheckboxItemContentItemMapper, i1 twinCounterItemContentItemMapper, l0 inputItemContentItemMapper, f1 switchItemContentItemMapper, y0 rowSwitchItemContentItemMapper, j1 twinImageTileItemContentItemMapper, i actionWidgetItemMapper, z0 singleActionItemMapper, k1 variantSelectionItemMapper, a actionButtonItemMapper, o0 planHeaderItemContentItemMapper, n0 planAmountHeaderItemContentItemMapper, h0 highlightItemMapper, d0 footerItemContentItemMapper, d1 smallCellItemMapper, m0 listCellItemContentItemMapper, k0 infoActionCellItemContentItemMapper, e1 stepperVerticalItemMapper, q0 radioOptionItemMapper, s conditionalInputItemMapper, q centerAmountHeaderItemMapper) {
        Intrinsics.checkNotNullParameter(documentListItemsMapper, "documentListItemsMapper");
        Intrinsics.checkNotNullParameter(rowItemContentItemMapper, "rowItemContentItemMapper");
        Intrinsics.checkNotNullParameter(rowNoteItemContentItemMapper, "rowNoteItemContentItemMapper");
        Intrinsics.checkNotNullParameter(pocketItemContentItemMapper, "pocketItemContentItemMapper");
        Intrinsics.checkNotNullParameter(rowActionItemContentItemMapper, "rowActionItemContentItemMapper");
        Intrinsics.checkNotNullParameter(actionCellItemContentItemMapper, "actionCellItemContentItemMapper");
        Intrinsics.checkNotNullParameter(cellItemContentItemMapper, "cellItemContentItemMapper");
        Intrinsics.checkNotNullParameter(sliderItemContentItemMapper, "sliderItemContentItemMapper");
        Intrinsics.checkNotNullParameter(tileItemContentItemMapper, "tileItemContentItemMapper");
        Intrinsics.checkNotNullParameter(expandableItemContentItemMapper, "expandableItemContentItemMapper");
        Intrinsics.checkNotNullParameter(bannerItemContentItemMapper, "bannerItemContentItemMapper");
        Intrinsics.checkNotNullParameter(textItemContentItemMapper, "textItemContentItemMapper");
        Intrinsics.checkNotNullParameter(cardItemContentItemMapper, "cardItemContentItemMapper");
        Intrinsics.checkNotNullParameter(imageItemContentItemMapper, "imageItemContentItemMapper");
        Intrinsics.checkNotNullParameter(checkboxItemContentItemMapper, "checkboxItemContentItemMapper");
        Intrinsics.checkNotNullParameter(warningItemContentItemMapper, "warningItemContentItemMapper");
        Intrinsics.checkNotNullParameter(expandableCheckboxItemContentItemMapper, "expandableCheckboxItemContentItemMapper");
        Intrinsics.checkNotNullParameter(twinCounterItemContentItemMapper, "twinCounterItemContentItemMapper");
        Intrinsics.checkNotNullParameter(inputItemContentItemMapper, "inputItemContentItemMapper");
        Intrinsics.checkNotNullParameter(switchItemContentItemMapper, "switchItemContentItemMapper");
        Intrinsics.checkNotNullParameter(rowSwitchItemContentItemMapper, "rowSwitchItemContentItemMapper");
        Intrinsics.checkNotNullParameter(twinImageTileItemContentItemMapper, "twinImageTileItemContentItemMapper");
        Intrinsics.checkNotNullParameter(actionWidgetItemMapper, "actionWidgetItemMapper");
        Intrinsics.checkNotNullParameter(singleActionItemMapper, "singleActionItemMapper");
        Intrinsics.checkNotNullParameter(variantSelectionItemMapper, "variantSelectionItemMapper");
        Intrinsics.checkNotNullParameter(actionButtonItemMapper, "actionButtonItemMapper");
        Intrinsics.checkNotNullParameter(planHeaderItemContentItemMapper, "planHeaderItemContentItemMapper");
        Intrinsics.checkNotNullParameter(planAmountHeaderItemContentItemMapper, "planAmountHeaderItemContentItemMapper");
        Intrinsics.checkNotNullParameter(highlightItemMapper, "highlightItemMapper");
        Intrinsics.checkNotNullParameter(footerItemContentItemMapper, "footerItemContentItemMapper");
        Intrinsics.checkNotNullParameter(smallCellItemMapper, "smallCellItemMapper");
        Intrinsics.checkNotNullParameter(listCellItemContentItemMapper, "listCellItemContentItemMapper");
        Intrinsics.checkNotNullParameter(infoActionCellItemContentItemMapper, "infoActionCellItemContentItemMapper");
        Intrinsics.checkNotNullParameter(stepperVerticalItemMapper, "stepperVerticalItemMapper");
        Intrinsics.checkNotNullParameter(radioOptionItemMapper, "radioOptionItemMapper");
        Intrinsics.checkNotNullParameter(conditionalInputItemMapper, "conditionalInputItemMapper");
        Intrinsics.checkNotNullParameter(centerAmountHeaderItemMapper, "centerAmountHeaderItemMapper");
        this.f210198a = documentListItemsMapper;
        this.f210199b = rowItemContentItemMapper;
        this.f210200c = pocketItemContentItemMapper;
        this.d = actionCellItemContentItemMapper;
        this.e = sliderItemContentItemMapper;
        this.f = cardItemContentItemMapper;
        this.f210201g = imageItemContentItemMapper;
        this.f210202h = checkboxItemContentItemMapper;
        this.i = twinImageTileItemContentItemMapper;
        this.f210203j = actionWidgetItemMapper;
        this.k = smallCellItemMapper;
        this.f210204l = infoActionCellItemContentItemMapper;
        this.f210205m = centerAmountHeaderItemMapper;
    }

    public final ArrayList a(g2 g2Var, ax4.b bVar) {
        int i;
        ResourceImage resourceImage;
        List listB;
        List listA;
        List list = g2Var.d;
        List list2 = list;
        boolean z = false;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it8 = list2.iterator();
            i = 0;
            while (it8.hasNext()) {
                if ((((dx4.e1) it8.next()) instanceof h5) && (i = i + 1) < 0) {
                    zhm.v.r();
                    throw null;
                }
            }
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        Iterator it9 = list3.iterator();
        int i2 = 0;
        while (true) {
            if (!it9.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof List) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it10 = arrayList2.iterator();
                while (it10.hasNext()) {
                    yp0.b.q((List) it10.next(), 0, 0, 0, 0, 15);
                }
                ArrayList arrayListU = zhm.w.u(arrayList2);
                String str = g2Var.f120603b;
                if (str == null) {
                    yp0.b.k(arrayListU, 0, 0, 0, 0, 31);
                    return arrayListU;
                }
                String str2 = g2Var.f120602a;
                if (str2 == null) {
                    str2 = "id_group";
                }
                TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = g2Var.f120604c;
                TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                dx4.q qVar = g2Var.e;
                if (qVar != null) {
                    Intrinsics.checkNotNullParameter(qVar, "<this>");
                    resourceImage = new ResourceImage(c8g.c.v(qVar), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 246);
                } else {
                    resourceImage = null;
                }
                dx4.l lVar = g2Var.f;
                return yp0.b.g(arrayListU, new ListSubheaderDelegate.Model(str2, (Image) null, (Clause) textClause, (Image) resourceImage, (Clause) textClause2, (String) null, (ListSubheaderDelegate.Model.a) (lVar != null ? new ListSubheaderDelegate.Model.a.b(z, z, z, 6) : null), false, false, (Object) lVar, (Parcelable) null, 0, 0, 0, 0, 64418), null, 0, 0, 126);
            }
            Object next = it9.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            dx4.e1 e1Var = (dx4.e1) next;
            if (e1Var instanceof h5) {
                listA = h1.a((h5) e1Var, i);
            } else if (e1Var instanceof l4) {
                listA = x0.a((l4) e1Var, i2 == list.size() - 1);
            } else {
                listB = b(e1Var, bVar);
                arrayList.add(listB);
                i2 = i3;
            }
            listB = listA;
            arrayList.add(listB);
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List b(dx4.e1 item, ax4.b constructorDomainState) {
        b c1184b;
        RowDelegate.Model.MainImage.Image40 image40;
        TextLocalisedClause textLocalisedClause;
        Custom custom;
        CircleBadgeModel circleBadgeModel;
        CircleBadgeModel accentCircleBadge;
        Custom custom2;
        ResourceImage resourceImage;
        io3.d dVarA;
        CompositeClause compositeClause;
        Object model;
        h4 h4Var;
        CompositeClause compositeClause2;
        Clause textClause;
        ResourceImage resourceImage2;
        ResourceImage resourceImage3;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        if (item instanceof i4) {
            i4 item2 = (i4) item;
            u uVar = this.f210199b.f210196a;
            Intrinsics.checkNotNullParameter(item2, "item");
            b4 b4Var = item2.o;
            dx4.l lVar = item2.f120632h;
            String str = item2.f120633j;
            h4 h4Var2 = item2.f120636n;
            dx4.q qVar = item2.e;
            dx4.q qVar2 = item2.d;
            dx4.l lVar2 = item2.f120631g;
            dx4.d1 d1Var = item2.f;
            boolean z = item2.f120635m;
            String str2 = item2.f120628a;
            String str3 = item2.f120630c;
            String str4 = item2.i;
            String str5 = item2.f120634l;
            if (b4Var != null) {
                if (str4 != null) {
                    Clause[] elements = {new TextClause(item2.f120629b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), c8g.c.n(z)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    TextLocalisedClause textLocalisedClauseA = v0.a(new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14));
                    Image imageA = d1Var != null ? uVar.a(d1Var) : null;
                    CompositeClause compositeClause3 = new CompositeClause(d4.a(b4Var), null, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_constructor_row_info, zhm.u.c(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                    boolean z3 = lVar2 != null;
                    if (qVar2 != null) {
                        Intrinsics.checkNotNullParameter(qVar2, "<this>");
                        resourceImage3 = new ResourceImage(c8g.c.v(qVar2), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 246);
                    } else {
                        resourceImage3 = null;
                    }
                    model = new CellDetailsNoteDelegate.Model(str2, textLocalisedClauseA, null, textLocalisedClause2, resourceImage3, z3, imageA, compositeClause3, null, item2, new AnalyticsContext(zw4.a.a(str2)), 0, 124484);
                } else if (str5 != null) {
                    Clause[] elements2 = {new TextClause(item2.f120629b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qVar2 != null ? c8g.c.F(qVar2) : null, c8g.c.n(z)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    model = new CellDetailsDelegate.Model(str2, v0.a(new CompositeClause(kotlin.collections.d.L(elements2), null, null, null, 14)), lVar2 != null, new CompositeClause(zhm.d0.E0(d4.a(b4Var), zhm.v.l(qVar != null ? c8g.c.D(qVar) : null)), null, null, null, 14), new TextClause(str5, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), v0.b(h4Var2), d1Var != null ? uVar.a(d1Var) : null, false, item2, new AnalyticsContext(zw4.a.a(str2)), 0, 129981332);
                } else {
                    TextClause textClauseE = sx4.g.e(1);
                    Clause[] elements3 = {new TextClause(item2.f120629b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qVar2 != null ? c8g.c.F(qVar2) : null, c8g.c.n(z)};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    model = new CellDetailsDelegate.Model(str2, v0.a(new CompositeClause(kotlin.collections.d.L(elements3), textClauseE, null, null, 12)), lVar2 != null, new TextLocalisedClause(R$string.credit_application_constructor_row_value_info, zhm.u.c(new CompositeClause(zhm.d0.E0(d4.a(b4Var), zhm.v.l(qVar != null ? c8g.c.D(qVar) : null)), null, null, null, 14)), null, 12), null, v0.b(h4Var2), d1Var != null ? uVar.a(d1Var) : null, false, item2, new AnalyticsContext(zw4.a.a(str2)), 0, 129981396);
                }
            } else if (str3 == null) {
                model = new CellDetailsNoteDelegate.Model(str2, v0.a(new TextClause(item2.f120629b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, false, null, null, null, item2, new AnalyticsContext(zw4.a.a(str2)), 0, 124916);
            } else if (str4 != null) {
                Clause[] elements4 = {new TextClause(item2.f120629b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), c8g.c.n(z)};
                Intrinsics.checkNotNullParameter(elements4, "elements");
                TextLocalisedClause textLocalisedClauseA2 = v0.a(new CompositeClause(kotlin.collections.d.L(elements4), null, null, null, 14));
                Image imageA2 = d1Var != null ? uVar.a(d1Var) : null;
                if (str == null || str.length() == 0) {
                    textClause = new TextClause(str3, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                } else {
                    TextClause textClause2 = new TextClause(str3, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124);
                    kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
                    m70.a.t(t0Var);
                    TextClause textClause3 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause4 = new TextClause("·", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    TextClause[] elements5 = {textClause2, textClause3, textClause4, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)};
                    Intrinsics.checkNotNullParameter(elements5, "elements");
                    textClause = new CompositeClause(kotlin.collections.d.L(elements5), null, null, null, 14);
                }
                Clause clause = textClause;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_constructor_row_info, zhm.u.c(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                boolean z4 = lVar2 != null;
                if (qVar2 != null) {
                    Intrinsics.checkNotNullParameter(qVar2, "<this>");
                    resourceImage2 = new ResourceImage(c8g.c.v(qVar2), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 246);
                } else {
                    resourceImage2 = null;
                }
                model = new CellDetailsNoteDelegate.Model(str2, textLocalisedClauseA2, null, textLocalisedClause3, resourceImage2, z4, imageA2, clause, null, item2, new AnalyticsContext(zw4.a.a(str2)), 0, 124484);
            } else if (str5 != null) {
                Clause[] elements6 = {new TextClause(item2.f120629b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qVar2 != null ? c8g.c.F(qVar2) : null, c8g.c.n(z)};
                Intrinsics.checkNotNullParameter(elements6, "elements");
                TextLocalisedClause textLocalisedClauseA3 = v0.a(new CompositeClause(kotlin.collections.d.L(elements6), null, null, null, 14));
                if (str == null || str.length() == 0) {
                    h4Var = h4Var2;
                    Clause[] elements7 = {qVar != null ? c8g.c.D(qVar) : null, new TextClause(str3, (Style) (lVar != null ? new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124)};
                    Intrinsics.checkNotNullParameter(elements7, "elements");
                    compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements7), null, null, null, 14);
                } else {
                    Clause clauseD = qVar != null ? c8g.c.D(qVar) : null;
                    TextClause textClause5 = new TextClause(str3, (Style) new Custom(lVar != null ? Integer.valueOf(R$attr.uikit_colorAccent) : null, true, null, false, null, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124);
                    kotlin.jvm.internal.t0 t0Var2 = kotlin.jvm.internal.t0.f186434a;
                    m70.a.t(t0Var2);
                    TextClause textClause6 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause7 = new TextClause("·", (Style) (lVar != null ? new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124);
                    Intrinsics.checkNotNullParameter(t0Var2, "<this>");
                    h4Var = h4Var2;
                    Clause[] elements8 = {clauseD, textClause5, textClause6, textClause7, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str, (Style) (lVar != null ? new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124)};
                    Intrinsics.checkNotNullParameter(elements8, "elements");
                    compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements8), null, null, null, 14);
                }
                model = new CellDetailsDelegate.Model(str2, textLocalisedClauseA3, lVar2 != null, compositeClause2, new TextClause(str5, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), v0.b(h4Var), d1Var != null ? uVar.a(d1Var) : null, false, item2, new AnalyticsContext(zw4.a.a(str2)), 0, 129981332);
            } else {
                g4 g4Var = item2.k;
                TextClause textClauseE2 = sx4.g.e(1);
                Clause[] elements9 = {new TextClause(item2.f120629b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qVar2 != null ? c8g.c.F(qVar2) : null, c8g.c.n(z)};
                Intrinsics.checkNotNullParameter(elements9, "elements");
                TextLocalisedClause textLocalisedClauseA4 = v0.a(new CompositeClause(kotlin.collections.d.L(elements9), textClauseE2, null, null, 12));
                int i = R$string.credit_application_constructor_row_value_info;
                if (str == null || str.length() == 0) {
                    Clause[] elements10 = {qVar != null ? c8g.c.D(qVar) : null, new TextClause(str3, (Style) null, lVar != null ? Integer.valueOf(R$attr.uikit_colorAccent) : null, false, (o9) null, (List) null, 122)};
                    Intrinsics.checkNotNullParameter(elements10, "elements");
                    compositeClause = new CompositeClause(kotlin.collections.d.L(elements10), null, null, null, 14);
                } else if (g4Var == g4.HORIZONTAL) {
                    Clause clauseD2 = qVar != null ? c8g.c.D(qVar) : null;
                    TextClause textClause8 = new TextClause(str3, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124);
                    kotlin.jvm.internal.t0 t0Var3 = kotlin.jvm.internal.t0.f186434a;
                    m70.a.t(t0Var3);
                    TextClause textClause9 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause10 = new TextClause("·", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                    Intrinsics.checkNotNullParameter(t0Var3, "<this>");
                    Clause[] elements11 = {clauseD2, textClause8, textClause9, textClause10, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str, (Style) null, lVar != null ? Integer.valueOf(R$attr.uikit_colorAccent) : null, false, (o9) null, (List) null, 122)};
                    Intrinsics.checkNotNullParameter(elements11, "elements");
                    compositeClause = new CompositeClause(kotlin.collections.d.L(elements11), null, null, null, 14);
                } else {
                    Clause[] elements12 = {qVar != null ? c8g.c.D(qVar) : null, new TextClause(str, (Style) null, lVar != null ? Integer.valueOf(R$attr.uikit_colorAccent) : null, false, (o9) null, (List) null, 122)};
                    Intrinsics.checkNotNullParameter(elements12, "elements");
                    compositeClause = new CompositeClause(kotlin.collections.d.L(elements12), null, null, null, 14);
                }
                model = new CellDetailsDelegate.Model(str2, textLocalisedClauseA4, lVar2 != null, new TextLocalisedClause(i, zhm.u.c(compositeClause), null, 12), g4Var == g4.VERTICAL ? new TextClause(str3, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124) : null, v0.b(h4Var2), d1Var != null ? uVar.a(d1Var) : null, false, item2, new AnalyticsContext(zw4.a.a(str2)), 0, 129981332);
            }
            return zhm.u.c(model);
        }
        if (item instanceof l4) {
            return x0.a((l4) item, false);
        }
        int i2 = 14;
        if (item instanceof w3) {
            w3 item3 = (w3) item;
            Intrinsics.checkNotNullParameter(item3, "item");
            v3 v3Var = item3.f120818b;
            if (((v3Var instanceof u3) || (v3Var instanceof t3)) && (dVarA = v3Var.a()) != null) {
                Clause clauseB = ((d91.b) this.f210200c.f210188a).b(AccountId.Personal.f51414a, dVarA);
                xi0.b bVarL = z92.f.l(dVarA);
                String str6 = dVarA.f163145a;
                aw0.t0 t0Var4 = new aw0.t0((Clause) new TextClause(item3.f120817a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30);
                CurrencyImage currencyImage = new CurrencyImage(bVarL.f306286a, (ImageTransformations) null, (TextLocalisedClause) (null == true ? 1 : 0), i2);
                Clause[] elements13 = {clauseB, new DotDividerClause((Integer) null), new CurrencyClause(bVarL, CurrencyClause.Format.Ticker.f57756a, null, 4)};
                Intrinsics.checkNotNullParameter(elements13, "elements");
                return zhm.u.c(new CellDetailsDelegate.Model(str6, t0Var4, new CompositeClause(kotlin.collections.d.L(elements13), null, null, null, 14), null, null, null, null, 0, currencyImage, false, false, null, null, 31736));
            }
            return zhm.f0.f322471a;
        }
        if (item instanceof f4) {
            f4 item4 = (f4) item;
            Intrinsics.checkNotNullParameter(item4, "item");
            String str7 = item4.f120595a;
            int i3 = R$string.credit_application_constructor_row_action_title;
            List listC = zhm.u.c(new TextClause(item4.f120596b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            int i5 = r0.f210190a[item4.f120597c.ordinal()];
            if (i5 == 1) {
                custom2 = null;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                custom2 = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
            }
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i3, listC, custom2, 8);
            String str8 = item4.d;
            TextLocalisedClause textLocalisedClause5 = str8 != null ? new TextLocalisedClause(R$string.credit_application_constructor_row_action_description, zhm.u.c(new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.credit_application_constructor_row_action_button_title, zhm.u.c(new TextClause(item4.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            dx4.q qVar3 = item4.f;
            if (qVar3 != null) {
                Intrinsics.checkNotNullParameter(qVar3, "<this>");
                resourceImage = new ResourceImage(c8g.c.v(qVar3), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 246);
            } else {
                resourceImage = null;
            }
            return zhm.u.c(new RowDelegate.Model(str7, null, textLocalisedClause4, null, 0, textLocalisedClause5, null, null, 0, new pf(textLocalisedClause6, resourceImage, null, false, null, null, 508), false, null, false, null, null, null, null, null, null, item4, new AnalyticsContext(zw4.a.a(item4.f120595a)), 0, 0, 0, 0, 524286938));
        }
        if (item instanceof dx4.o) {
            dx4.o item5 = (dx4.o) item;
            f fVar = this.d;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(item5, "item");
            b.Companion.getClass();
            Intrinsics.checkNotNullParameter(item5, "item");
            dx4.l lVar3 = item5.e;
            if (lVar3 != null) {
                String str9 = item5.f;
                if (str9 != null) {
                    c1184b = new c(str9);
                } else {
                    dx4.a1 a1Var = item5.i;
                    c1184b = a1Var != null ? new d(a1Var, new TextClause(item5.f120695b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : lVar3 instanceof dx4.k ? new b.C1184b(true) : lVar3 instanceof dx4.c ? new d(dx4.a1.TRASH, new TextLocalisedClause(R$string.credit_common_accessibility_identifiers_document_action_delete, null, null, 14)) : b.c.f210166a;
                }
            } else {
                c1184b = new b.C1184b(false);
            }
            String str10 = item5.f120694a;
            dx4.d1 d1Var2 = item5.d;
            if (d1Var2 != null) {
                dx4.c0 c0Var = item5.f120697g;
                Image imageA3 = fVar.f210175a.a(d1Var2);
                if (c0Var != null) {
                    int i6 = dx4.b0.f120551a[c0Var.ordinal()];
                    if (i6 == 1) {
                        accentCircleBadge = new AccentCircleBadge(dw0.a.Checked);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        accentCircleBadge = RetailBadge.f58066a;
                    }
                    circleBadgeModel = accentCircleBadge;
                } else {
                    circleBadgeModel = null;
                }
                image40 = new RowDelegate.Model.MainImage.Image40(imageA3, circleBadgeModel, null, false, null, false, 60);
            } else {
                image40 = null;
            }
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_application_constructor_action_cell_title, zhm.u.c(new TextClause(item5.f120695b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            RowDelegate.Model.c cVarB = c1184b.b();
            String str11 = item5.f120696c;
            if (str11 != null) {
                int i21 = R$string.credit_application_constructor_action_cell_subtitle;
                List listC2 = zhm.u.c(new TextClause(str11, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                dx4.n nVar = item5.f120698h;
                int i22 = nVar == null ? -1 : e.f210174a[nVar.ordinal()];
                if (i22 == -1) {
                    custom = null;
                } else {
                    if (i22 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    custom = new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254);
                }
                textLocalisedClause = new TextLocalisedClause(i21, listC2, custom, 8);
            } else {
                textLocalisedClause = null;
            }
            return zhm.u.c(new RowDelegate.Model(str10, image40, textLocalisedClause7, null, 0, textLocalisedClause, null, null, 0, cVarB, c1184b.a(), null, false, null, null, null, null, null, null, item5.e, new AnalyticsContext(zw4.a.a(item5.f120694a)), 0, 0, 0, 0, 524284888));
        }
        if (item instanceof dx4.r0) {
            return p.a((dx4.r0) item);
        }
        if (item instanceof x4) {
            return zhm.u.c(this.e.a((x4) item, constructorDomainState));
        }
        if (item instanceof g2) {
            return a((g2) item, constructorDomainState);
        }
        if (item instanceof h5) {
            return h1.a((h5) item, 1);
        }
        if (item instanceof x1) {
            x1 item6 = (x1) item;
            Intrinsics.checkNotNullParameter(item6, "item");
            ExpandableCellDelegate.Model model2 = new ExpandableCellDelegate.Model(item6.f120827a, new TextClause(item6.f120828b, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), new TextClause(item6.f120829c, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, false, null, new AnalyticsContext(zw4.a.a(item6.f120827a)), 40);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model2);
        }
        if (item instanceof dx4.i0) {
            dx4.i0 item7 = (dx4.i0) item;
            Intrinsics.checkNotNullParameter(item7, "item");
            String str12 = item7.f120620a;
            String str13 = item7.d;
            BannerDelegate.Model model3 = new BannerDelegate.Model(str12, str13 != null ? new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c(str13, new ImageTransformations(null, null, null, null, null, 60, 60, 31), null, null, 28)) : null, new TextClause(item7.f120621b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(item7.f120622c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, item7, new AnalyticsContext(zw4.a.a(item7.f120620a)), null, null, null, 65296);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model3);
        }
        if (item instanceof e5) {
            return g1.a((e5) item);
        }
        if (item instanceof dx4.l0) {
            return this.f.e((dx4.l0) item, constructorDomainState.f10856a);
        }
        if (item instanceof j2) {
            return this.f210201g.a((j2) item);
        }
        if (item instanceof dx4.t0) {
            return r.a(this.f210202h, (dx4.t0) item, constructorDomainState.f10858c, 0, 0, 12);
        }
        if (item instanceof x5) {
            return l1.a((x5) item);
        }
        if (item instanceof w1) {
            w1 w1Var = (w1) item;
            return a0.b(w1Var, constructorDomainState.f10857b.contains(w1Var.f120809a));
        }
        if (item instanceof i5) {
            return i1.a((i5) item);
        }
        if (item instanceof j5) {
            return this.i.a((j5) item);
        }
        if (item instanceof k3) {
            return l0.a((k3) item, constructorDomainState);
        }
        boolean z6 = item instanceof b3;
        y yVar = this.f210198a;
        if (z6) {
            return yVar.c((b3) item);
        }
        if (item instanceof p3) {
            p3 p3Var = (p3) item;
            return yVar.e(p3Var, constructorDomainState.d.contains(p3Var.f120711a));
        }
        if (item instanceof n3) {
            return yVar.d((n3) item);
        }
        if (item instanceof c5) {
            return f1.a((c5) item, constructorDomainState);
        }
        if (item instanceof m4) {
            return y0.a((m4) item, constructorDomainState);
        }
        if (item instanceof dx4.r) {
            return this.f210203j.a((dx4.r) item);
        }
        if (item instanceof r4) {
            r4 item8 = (r4) item;
            Intrinsics.checkNotNullParameter(item8, "item");
            return zhm.u.c(new CellDetailsChevronDelegate.Model(item8.f120752a, new TextLocalisedClause(R$string.credit_application_constructor_single_action_title, zhm.u.c(item8.f120753b), null, 12), f2.INTERNAL, 0, item8.f120754c, new AnalyticsContext(zw4.a.a(item8.f120752a)), 1992));
        }
        if (item instanceof p5) {
            return k1.a((p5) item, constructorDomainState);
        }
        if (item instanceof dx4.m) {
            return a.a((dx4.m) item);
        }
        if (item instanceof s3) {
            return o0.a((s3) item);
        }
        if (item instanceof r3) {
            return n0.a((r3) item);
        }
        if (item instanceof i2) {
            return h0.a((i2) item);
        }
        if (item instanceof a2) {
            return d0.a((a2) item);
        }
        if (item instanceof y4) {
            return this.k.a((y4) item);
        }
        if (item instanceof l3) {
            return m0.a((l3) item);
        }
        if (item instanceof l2) {
            return this.f210204l.a((l2) item);
        }
        if (item instanceof b5) {
            return e1.a((b5) item);
        }
        if (item instanceof x3) {
            return q0.a((x3) item, constructorDomainState);
        }
        if (item instanceof dx4.x0) {
            return s.a((dx4.x0) item);
        }
        if (item instanceof dx4.s0) {
            return this.f210205m.a((dx4.s0) item);
        }
        throw new NoWhenBranchMatchedException();
    }
}
