package i1c;

import aim.e;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NameClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TextWithHighlightsClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.models.RevPointsTransactionIconsUrl;
import ez0.h;
import fub.k;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import m1c.r1;
import org.jmrtd.cbeff.ISO781611;
import pyb.s;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final boolean a(RowDelegate.Model model, String searchQuery, String domainSearchKey) throws IOException {
        String strK0;
        Clause clause;
        Intrinsics.checkNotNullParameter(model, "<this>");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(domainSearchKey, "domainSearchKey");
        if (searchQuery.length() == 0) {
            return true;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = searchQuery.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (d0.J(domainSearchKey, lowerCase, false)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(model, "<this>");
        Clause clause2 = model.f53230c;
        RowDelegate.Model.c cVar = model.k;
        String strG = g(clause2);
        Clause clause3 = model.f;
        String strG2 = null;
        String strG3 = clause3 != null ? g(clause3) : null;
        RowDelegate.Model.c.b bVar = cVar instanceof RowDelegate.Model.c.b ? (RowDelegate.Model.c.b) cVar : null;
        if (bVar != null) {
            Clause clause4 = bVar.f53272a;
            String strG4 = clause4 != null ? g(clause4) : null;
            Clause clause5 = bVar.f53273b;
            String[] elements = {strG4, clause5 != null ? g(clause5) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            strK0 = zhm.d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62);
        } else {
            strK0 = null;
        }
        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
        if (pfVar != null && (clause = pfVar.f54591a) != null) {
            strG2 = g(clause);
        }
        String[] elements2 = {strG, strG3, strK0, strG2};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        String lowerCase2 = zhm.d0.k0(kotlin.collections.d.L(elements2), " ", null, null, 0, null, 62).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        String lowerCase3 = searchQuery.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        return d0.J(lowerCase2, lowerCase3, false);
    }

    public static final ArrayList b(k kVar, ArrayList transactionContentList, q extraData, String searchQuery) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(transactionContentList, "transactionContentList");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        if (searchQuery.length() == 0) {
            ArrayList arrayList = new ArrayList(w.t(transactionContentList, 10));
            Iterator it8 = transactionContentList.iterator();
            while (it8.hasNext()) {
                arrayList.add(((r1) it8.next()).f201449a);
            }
            return arrayList;
        }
        ArrayList arrayListH = ((s) kVar).h(transactionContentList, extraData);
        int iB = q0.b(w.t(arrayListH, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayListH) {
            linkedHashMap.put(((RowDelegate.Model) obj2).f53228a, obj2);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = transactionContentList.iterator();
        while (it9.hasNext()) {
            RevPointsTransaction revPointsTransaction = ((r1) it9.next()).f201449a;
            RowDelegate.Model model = (RowDelegate.Model) linkedHashMap.get("TransactionListItem_" + revPointsTransaction.f84054a);
            if (model == null || !a(model, searchQuery, revPointsTransaction.f84064q)) {
                revPointsTransaction = null;
            }
            if (revPointsTransaction != null) {
                arrayList2.add(revPointsTransaction);
            }
        }
        return arrayList2;
    }

    public static final LayeredImage c(RevPointsTransaction revPointsTransaction) {
        Float fValueOf = Float.valueOf(40.0f);
        Intrinsics.checkNotNullParameter(revPointsTransaction, "<this>");
        dj0.d dVar = revPointsTransaction.f84056c.f83960a;
        dj0.d.Companion.getClass();
        if (dVar.i(dj0.d.e)) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$drawable.uikit_icn_24_rev_points;
            int i2 = R$attr.uikit_colorGreyTone50;
            return LayeredImage.Companion.b(companion, i, Integer.valueOf(i2), R$attr.uikit_colorGreyTone50_10, 8.0f, fValueOf, null, 32);
        }
        LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
        int i3 = R$drawable.uikit_icn_24_rev_points;
        int i5 = R$attr.uikit_colorAccent;
        return LayeredImage.Companion.b(companion2, i3, Integer.valueOf(i5), R$attr.uikit_colorAccent_10, 8.0f, fValueOf, null, 32);
    }

    public static Image d(RevPointsTransaction revPointsTransaction) {
        Intrinsics.checkNotNullParameter(revPointsTransaction, "<this>");
        RevPointsTransactionIconsUrl revPointsTransactionIconsUrl = revPointsTransaction.f84059j;
        if (revPointsTransactionIconsUrl == null) {
            return c(revPointsTransaction);
        }
        String str = revPointsTransactionIconsUrl.f84073b;
        if (str == null) {
            String str2 = revPointsTransactionIconsUrl.f84072a;
            ImageTransformations imageTransformations = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG);
            Intrinsics.checkNotNullParameter(revPointsTransaction, "<this>");
            return new UrlImage(str2, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(c(revPointsTransaction)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) null, false, false, imageTransformations, (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
        }
        String str3 = revPointsTransactionIconsUrl.f84072a;
        ImageTransformations imageTransformations2 = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG);
        Intrinsics.checkNotNullParameter(revPointsTransaction, "<this>");
        UrlImage urlImage = new UrlImage(str3, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(c(revPointsTransaction)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) null, false, false, imageTransformations2, (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
        ImageTransformations imageTransformations3 = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG);
        Intrinsics.checkNotNullParameter(revPointsTransaction, "<this>");
        return new PairedImage(new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(c(revPointsTransaction)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) null, false, false, imageTransformations3, (Integer) null, (Integer) null, false, false, (Clause) null, 516090), urlImage, R$attr.uikit_colorWidgetBackground, null);
    }

    public static final CircleIconBadge e(RevPointsTransaction revPointsTransaction) {
        Intrinsics.checkNotNullParameter(revPointsTransaction, "<this>");
        int i = a.f157605c[revPointsTransaction.f84057g.ordinal()];
        if (i == 1) {
            return new AccentCircleBadge(dw0.a.Pending);
        }
        if (i == 2) {
            return new InactiveCircleBadge(dw0.a.Cancelled);
        }
        if (i != 3) {
            return null;
        }
        int i2 = a.f157604b[revPointsTransaction.f84055b.ordinal()];
        if (i2 == 2 || i2 == 4) {
            return new AccentCircleBadge(dw0.a.Revert);
        }
        if (i2 != 6) {
            return null;
        }
        return revPointsTransaction.f84056c.e() ? new AccentCircleBadge(dw0.a.Income) : new AccentCircleBadge(dw0.a.Outgoing);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.core.ui_kit.models.Clause f(com.revolut.feature.rev_points.models.RevPointsTransaction r10, java.lang.String r11, com.revolut.core.ui_kit.models.Custom r12) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1c.b.f(com.revolut.feature.rev_points.models.RevPointsTransaction, java.lang.String, com.revolut.core.ui_kit.models.Custom):com.revolut.core.ui_kit.models.Clause");
    }

    public static final String g(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        if (clause instanceof TextClause) {
            return ((TextClause) clause).f57936a;
        }
        if (clause instanceof TextWithHighlightsClause) {
            return g(((TextWithHighlightsClause) clause).f57953a);
        }
        if (clause instanceof HtmlClause) {
            return ((HtmlClause) clause).f57779a;
        }
        if (clause instanceof NameClause) {
            NameClause nameClause = (NameClause) clause;
            String[] elements = {nameClause.f57835a, nameClause.f57836b};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return zhm.d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62);
        }
        if (clause instanceof CompositeClause) {
            CompositeClause compositeClause = (CompositeClause) clause;
            List list = compositeClause.f57747a;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(g((Clause) it8.next()));
            }
            Clause clause2 = compositeClause.f57748b;
            return zhm.d0.k0(zhm.d0.E0(v.l(clause2 != null ? g(clause2) : null), arrayList), " ", null, null, 0, null, 62);
        }
        if (clause instanceof MoneyClause) {
            dj0.d dVar = ((MoneyClause) clause).f57821a;
            BigDecimal bigDecimalJ = pyd.c.j(dVar);
            return com.google.android.gms.internal.mlkit_vision_face.a.o((bigDecimalJ.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalJ.stripTrailingZeros()).toPlainString(), " ", dVar.f115083b.f306286a);
        }
        if (clause instanceof NumberClause) {
            String string = ((NumberClause) clause).f57894a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        if (clause instanceof CharSequenceClause) {
            return ((CharSequenceClause) clause).f57741a.toString();
        }
        if (clause instanceof RateClause) {
            RateClause rateClause = (RateClause) clause;
            return rateClause.f57927a + " " + rateClause.f57928b.f306286a;
        }
        if (clause instanceof AssetClause) {
            AssetClause assetClause = (AssetClause) clause;
            return assetClause.f57731a + " " + assetClause.f57733c;
        }
        if (clause instanceof PercentageClause) {
            return String.valueOf(((PercentageClause) clause).f57904a);
        }
        if (clause instanceof TextLocalisedClause) {
            e eVarB = u.b();
            TextLocalisedClause textLocalisedClause = (TextLocalisedClause) clause;
            Clause clause3 = textLocalisedClause.d;
            if (clause3 != null) {
                eVarB.add(g(clause3));
            }
            for (Object obj2 : textLocalisedClause.f57941b) {
                eVarB.add(obj2 instanceof Clause ? g((Clause) obj2) : obj2.toString());
            }
            return zhm.d0.k0(u.a(eVarB), " ", null, null, 0, null, 62);
        }
        if (!(clause instanceof TextLocalisedQuantityClause)) {
            return "";
        }
        e eVarB2 = u.b();
        TextLocalisedQuantityClause textLocalisedQuantityClause = (TextLocalisedQuantityClause) clause;
        eVarB2.add(textLocalisedQuantityClause.f57950b.toString());
        for (Object obj3 : textLocalisedQuantityClause.f57951c) {
            eVarB2.add(obj3 instanceof Clause ? g((Clause) obj3) : obj3.toString());
        }
        return zhm.d0.k0(u.a(eVarB2), " ", null, null, 0, null, 62);
    }
}
