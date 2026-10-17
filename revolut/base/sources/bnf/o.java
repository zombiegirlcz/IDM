package bnf;

import c55.l0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import hha.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import tof.a3;
import tof.e1;
import tof.e3;
import tof.i3;
import tof.i5;
import tof.p0;
import tof.q1;
import tof.w5;
import tof.w6;
import tof.y6;
import tof.z6;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements thf.d {

    @NotNull
    public static final m Companion = new m();
    public static final List o = v.k(y6.CARD_PAYMENT, y6.ATM, y6.OTP_ATM, y6.CARD_CREDIT, y6.TAX, y6.REV_PAYMENT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f17151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3j.j f17152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jr6.v f17153c;
    public final zpg.h d;
    public final dnf.b e;
    public final m38.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l6e.a f17154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f17155h;
    public final vfg.p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m35.q f17156j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f01.a f17157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f17158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dl3.f f17159n;

    public o(thf.c transactionCategoryResourcesMapper, m3j.j beneficiaryAvatarMapper, aqa.a cardOwnerAvatarMapper, jr6.v freelancerTransactionMapper, zpg.h vaultsTransactionDataMapper, dnf.b tradingTransactionDataMapper, m38.b jointTransactionDataMapper, ue8.d juniorTransactionDataMapper, l6e.a billAccountTransactionDataProvider, j transactionBadgeProvider, vfg.p roboRetailTransactionResourcesProvider, m35.q loanTransactionCategoryIconMapper, a merchantIconProvider, f01.a uiKitResources, t urlValidator, l transactionBetweenCountryProfilesIconMapper, d moveMoneyIconMapper, dl3.f contactMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(cardOwnerAvatarMapper, "cardOwnerAvatarMapper");
        Intrinsics.checkNotNullParameter(freelancerTransactionMapper, "freelancerTransactionMapper");
        Intrinsics.checkNotNullParameter(vaultsTransactionDataMapper, "vaultsTransactionDataMapper");
        Intrinsics.checkNotNullParameter(tradingTransactionDataMapper, "tradingTransactionDataMapper");
        Intrinsics.checkNotNullParameter(jointTransactionDataMapper, "jointTransactionDataMapper");
        Intrinsics.checkNotNullParameter(juniorTransactionDataMapper, "juniorTransactionDataMapper");
        Intrinsics.checkNotNullParameter(billAccountTransactionDataProvider, "billAccountTransactionDataProvider");
        Intrinsics.checkNotNullParameter(transactionBadgeProvider, "transactionBadgeProvider");
        Intrinsics.checkNotNullParameter(roboRetailTransactionResourcesProvider, "roboRetailTransactionResourcesProvider");
        Intrinsics.checkNotNullParameter(loanTransactionCategoryIconMapper, "loanTransactionCategoryIconMapper");
        Intrinsics.checkNotNullParameter(merchantIconProvider, "merchantIconProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(urlValidator, "urlValidator");
        Intrinsics.checkNotNullParameter(transactionBetweenCountryProfilesIconMapper, "transactionBetweenCountryProfilesIconMapper");
        Intrinsics.checkNotNullParameter(moveMoneyIconMapper, "moveMoneyIconMapper");
        Intrinsics.checkNotNullParameter(contactMapper, "contactMapper");
        this.f17151a = transactionCategoryResourcesMapper;
        this.f17152b = beneficiaryAvatarMapper;
        this.f17153c = freelancerTransactionMapper;
        this.d = vaultsTransactionDataMapper;
        this.e = tradingTransactionDataMapper;
        this.f = jointTransactionDataMapper;
        this.f17154g = billAccountTransactionDataProvider;
        this.f17155h = transactionBadgeProvider;
        this.i = roboRetailTransactionResourcesProvider;
        this.f17156j = loanTransactionCategoryIconMapper;
        this.k = merchantIconProvider;
        this.f17157l = uiKitResources;
        this.f17158m = moveMoneyIconMapper;
        this.f17159n = contactMapper;
    }

    public static Image f(z6 z6Var) {
        String strC;
        return (z6Var == null || (strC = z6Var.c()) == null || !(d0.W(strC) ^ true)) ? t(R$drawable.uikit_icn_24_arrow_right_left, R$attr.uikit_colorBlue) : new ContactImage(z6Var.f273196a, (String) null, z6Var.i, z6Var.f273199g, (String) null, z6Var.c(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4050);
    }

    public static LayeredImage g(uof.c cVar) {
        int i = cVar == null ? -1 : n.f17148a[cVar.ordinal()];
        if (i == 1) {
            return t(R$drawable.uikit_icn_24_premium, R$attr.uikit_colorAccent);
        }
        if (i != 2) {
            return null;
        }
        return t(R$drawable.uikit_icn_24_price_tag, R$attr.uikit_colorAccent);
    }

    public static LayeredImage i() {
        return t(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorLightGreen);
    }

    public static PairedImage l(a3 a3Var, xi0.b bVar, xi0.b bVar2, Function1 function1) {
        Set set = k71.k.f181789a;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Pair pair = a3Var.z == p0.SELL ? new Pair(bVar, bVar2) : new Pair(bVar2, bVar);
        return new PairedImage((Image) function1.invoke((xi0.b) pair.f186385a), (Image) function1.invoke((xi0.b) pair.f186386b));
    }

    public static Image m(String str) {
        return str != null ? new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063) : t(R$drawable.uikit_icn_24_bank, R$attr.uikit_colorColdBlue);
    }

    public static PairedImage p(a3 a3Var) {
        String str = a3Var.k.f115083b.f306286a;
        int i = R$drawable.uikit_icn_24_revpoints;
        int i2 = R$drawable.uikit_icn_circle_gradient_background;
        int i3 = R$attr.uikit_colorWhite;
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        Float fValueOf = Float.valueOf(40.0f);
        return new PairedImage(currencyImage, new LayeredImage(v.k(new LayeredImage.Layer.Drawable(i2, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126), new LayeredImage.Layer.Drawable(i, Integer.valueOf(i3), 5.0f, 5.0f, 5.0f, 5.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), fValueOf, fValueOf, 8), R$attr.uikit_colorWidgetBackground, null);
    }

    public static LayeredImage s(q1 q1Var) {
        int i;
        Float fValueOf = Float.valueOf(24.0f);
        String str = q1Var.f273004b;
        w0 w0Var = null;
        if (str != null) {
            w0[] w0VarArrValues = w0.values();
            int length = w0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                w0 w0Var2 = w0VarArrValues[i2];
                if (a0.z(w0Var2.name(), str, true)) {
                    w0Var = w0Var2;
                    break;
                }
                i2++;
            }
        }
        int i3 = w0Var == null ? -1 : n.f17149b[w0Var.ordinal()];
        if (i3 == 1) {
            i = R$attr.uikit_colorPlanPlus;
        } else if (i3 == 2) {
            i = R$attr.uikit_colorPlanPremiumDark;
        } else if (i3 == 3) {
            i = R$attr.uikit_colorPlanMetalDark;
        } else if (i3 == 4) {
            i = R$attr.uikit_colorPlanUltraDark;
        } else {
            if (i3 != 5) {
                return LayeredImage.INSTANCE.d(R$drawable.uikit_icn_24_logo_revolut, R$attr.uikit_colorWhite, R$attr.uikit_colorGroupedBackground, Integer.valueOf(R$attr.uikit_colorBlack), 7.0f, 1.0f, fValueOf);
            }
            i = R$attr.uikit_colorBackground;
        }
        return LayeredImage.INSTANCE.d(R$drawable.uikit_icn_24_premium, i, R$attr.uikit_colorGroupedBackground, Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, BitmapDescriptorFactory.HUE_RED, fValueOf);
    }

    public static LayeredImage t(int i, int i2) {
        return LayeredImage.INSTANCE.j(i, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(i2));
    }

    public static PairedImage u(a3 a3Var) {
        return new PairedImage(new CurrencyImage(a3Var.k.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(a3Var.k.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
    }

    public static boolean y(a3 a3Var, Map map, Map map2) {
        io3.d dVar;
        if (a3Var.y0 == null) {
            return false;
        }
        Collection collectionValues = map2.values();
        ArrayList arrayList = new ArrayList(w.t(collectionValues, 10));
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            arrayList.add(((jf8.a) it8.next()).d);
        }
        ArrayList arrayListU = w.u(arrayList);
        tof.a[] elements = {a3Var.S0, a3Var.R0};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listL) {
            if (zhm.d0.T(arrayListU, ((tof.a) obj2).f272573b)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            String str = ((tof.a) it9.next()).f272573b;
            if (((str == null || (dVar = (io3.d) map.get(str)) == null) ? null : dVar.e) != io3.l.CURRENT) {
                return false;
            }
        }
        return true;
    }

    public final Image e(a3 a3Var, Map map) {
        List list;
        ContactImage contactImageA;
        e3 e3Var = a3Var.I.d;
        f5j.a aVar = (f5j.a) map.get(e3Var != null ? e3Var.f272726a : null);
        if (aVar != null && (contactImageA = this.f17152b.a(aVar)) != null) {
            return contactImageA;
        }
        i5 i5Var = a3Var.Z;
        ContactImage contactImageC = m3j.j.c((i5Var == null || (list = i5Var.f272802b) == null) ? null : (String) zhm.d0.d0(list));
        return contactImageC == null ? f(null) : contactImageC;
    }

    public final AvatarModel.Default h(a3 transaction, k71.q extraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Image imageB = b(transaction, extraData);
        AvatarModel.Border.StaticGradient staticGradientV = v(transaction, extraData.f181810y);
        do3.n nVar = extraData.f181794a;
        CircleIconBadge circleIconBadgeW = w(transaction, nVar != null ? nVar.f116408a : null, extraData.k, extraData.f181795b, extraData.f181806s);
        return new AvatarModel.Default(imageB, null, staticGradientV, null, circleIconBadgeW != null ? new AvatarModel.BadgeModel(circleIconBadgeW, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, 106);
    }

    public final Image j(a3 a3Var) {
        switch (n.d[a3Var.e.ordinal()]) {
            case 1:
            case 2:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_atm, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return q(k71.k.Q(a3Var), a3Var.Q);
            case 21:
            case 22:
            case 23:
            case 24:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_arrow_exchange, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorDeepGrey_10);
            case 25:
            case 26:
            case 27:
                return t(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorLightGreen);
            case 28:
                return t(R$drawable.uikit_icn_24_cashback, R$attr.uikit_colorLime);
            case 29:
            case 30:
            case 31:
                w6 w6Var = a3Var.f272602n0;
                return (w6Var == null ? -1 : n.f17150c[w6Var.ordinal()]) == 1 ? t(R$drawable.uikit_icn_24_cash, R$attr.uikit_colorBlue) : t(R$drawable.uikit_icn_24_cash_income, R$attr.uikit_colorDeepGrey);
            case 32:
                return t(R$drawable.uikit_icn_24_percent, R$attr.uikit_colorTerracotta);
            case 33:
            case 34:
            case 35:
                return t(R$drawable.uikit_icn_24_arrow_right_left, R$attr.uikit_colorBlue);
            case 36:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wealth, R$attr.uikit_colorPink, R$attr.uikit_colorPink_10);
            case 37:
                return t(R$drawable.uikit_icn_24_percent, R$attr.uikit_colorLime);
            case 38:
            case 39:
            case 40:
                e1 e1Var = a3Var.f272580a0;
                return ((l0) this.f17156j).a(e1Var != null ? e1Var.f272721y : null);
            case 41:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorDeepGrey_10);
            case 42:
            case 43:
                return t(R$drawable.uikit_icn_24_cashback, R$attr.uikit_colorLime);
            case 44:
            case 45:
                return t(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorLightGreen);
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                return t(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorGrey50);
            case 57:
                return t(R$drawable.uikit_icn_24_pnl, R$attr.uikit_colorAccentNeutral_10);
            case 58:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorIndigo);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Image k(a3 a3Var) {
        return k71.k.Q(a3Var) != null ? q(k71.k.Q(a3Var), a3Var.Q) : t(R$drawable.uikit_icn_24_bank, R$attr.uikit_colorColdBlue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:411:0x08d1, code lost:
    
        if (r3 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x091e, code lost:
    
        if (r3 == null) goto L426;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0c9a  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0d20  */
    /* JADX WARN: Type inference failed for: r13v100 */
    /* JADX WARN: Type inference failed for: r13v102, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v103, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v17, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v18, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.revolut.core.ui_kit_core.displayers.image.models.PairedImage] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v22, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v23, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v26, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v31, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v32, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v33, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v34, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v35, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v36, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v37, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v38, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v39, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.revolut.core.ui_kit_core.displayers.image.models.PairedImage] */
    /* JADX WARN: Type inference failed for: r13v42, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v44, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v45, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v46, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v47, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v48, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v49, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v52, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v54, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v55, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v56, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v57, types: [com.revolut.core.ui_kit_core.displayers.image.models.PairedImage] */
    /* JADX WARN: Type inference failed for: r13v58, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v60, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v61, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v62, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v63, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v64, types: [com.revolut.core.ui_kit_core.displayers.image.models.PairedImage] */
    /* JADX WARN: Type inference failed for: r13v67, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v68, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v71, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v72, types: [com.revolut.core.ui_kit_core.displayers.image.models.PairedImage] */
    /* JADX WARN: Type inference failed for: r13v73, types: [com.revolut.core.ui_kit_core.displayers.image.models.PairedImage] */
    /* JADX WARN: Type inference failed for: r13v74, types: [com.revolut.core.ui_kit_core.displayers.image.models.PairedImage] */
    /* JADX WARN: Type inference failed for: r13v77, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v79, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v80 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v82, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v83, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v86, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v87, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v88, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v89, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r13v98, types: [com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage] */
    /* JADX WARN: Type inference failed for: r13v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit_core.displayers.image.Image n(tof.a3 r59, java.util.Map r60, java.util.Map r61, r61.c r62, java.util.Map r63, do3.n r64, java.util.Map r65, java.util.Map r66, java.util.Map r67, java.util.Map r68, java.util.Map r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.o.n(tof.a3, java.util.Map, java.util.Map, r61.c, java.util.Map, do3.n, java.util.Map, java.util.Map, java.util.Map, java.util.Map, java.util.Map):com.revolut.core.ui_kit_core.displayers.image.Image");
    }

    public final Image o(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return thf.d.a(this, transaction, r0.g(), r0.g(), null, null, null, null, null, null, null, null, 2040);
    }

    public final Image q(String str, i3 category) {
        Intrinsics.checkNotNullParameter(category, "category");
        LayeredImage layeredImageI = ((wjf.e) this.f17151a).i(category, null, null);
        if (str == null) {
            return layeredImageI;
        }
        return new UrlImage(this.k.a(str, false), (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(layeredImageI), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
    }

    public final Image r(a3 a3Var) {
        return k71.k.Q(a3Var) == null ? LayeredImage.INSTANCE.i(wh9.a.f297445a, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal) : q(k71.k.Q(a3Var), a3Var.Q);
    }

    public final AvatarModel.Border.StaticGradient v(a3 transaction, Map paidPlanContactsMap) {
        zm3.a aVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(paidPlanContactsMap, "paidPlanContactsMap");
        z6 z6VarL0 = k71.k.l0(transaction);
        if (transaction.e != y6.TRANSFER || z6VarL0 == null || (aVar = (zm3.a) paidPlanContactsMap.get(z6VarL0.i)) == null) {
            return null;
        }
        return ((xl3.d) this.f17159n).g(aVar);
    }

    public final CircleIconBadge w(a3 transaction, String str, Map cryptoActionRequiredDeposits, Map pockets, Map juniorTransactionData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposits, "cryptoActionRequiredDeposits");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(juniorTransactionData, "juniorTransactionData");
        return this.f17155h.c(str, cryptoActionRequiredDeposits, transaction, y(transaction, pockets, juniorTransactionData));
    }

    public final Image x(a3 transaction, Map map, String str, Map proBackgroundIcons, Map map2, Map map3) {
        boolean zO0 = k71.k.O0(transaction);
        String str2 = transaction.f272611s;
        dj0.d dVar = transaction.k;
        if (zO0) {
            return ((k48.c) this.f).b(transaction, map2, str);
        }
        if (k71.k.j0(transaction)) {
            if (transaction.I.d != null) {
                return e(transaction, map);
            }
            ContactImage contactImageA = k71.k.P0(transaction) ? ue8.d.a(transaction) : null;
            return contactImageA == null ? LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_link, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorDeepGrey_10) : contactImageA;
        }
        if (k71.k.m(transaction)) {
            return new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (!k71.k.p(transaction)) {
            Intrinsics.checkNotNullParameter(transaction, "<this>");
            if (!Intrinsics.f(str2, "credit_card_forced_minimum_repayment")) {
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (!Intrinsics.f(str2, "credit_card_topup") && !k71.k.v0(transaction)) {
                    if (k71.k.k0(transaction)) {
                        return e(transaction, map);
                    }
                    if (!k71.k.e1(transaction)) {
                        if (k71.k.P0(transaction)) {
                            return ue8.d.a(transaction);
                        }
                        if (k71.k.k0(transaction) || k71.k.j0(transaction) || k71.k.l0(transaction) == null) {
                            return j(transaction);
                        }
                        z6 z6VarL0 = k71.k.l0(transaction);
                        zm3.a aVar = (zm3.a) map3.get(z6VarL0 != null ? z6VarL0.i : null);
                        return aVar != null ? ((xl3.d) this.f17159n).h(aVar) : f(k71.k.l0(transaction));
                    }
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    Intrinsics.checkNotNullParameter(proBackgroundIcons, "proBackgroundIcons");
                    z6 z6Var = transaction.H;
                    w5 w5Var = transaction.f272624y;
                    String str3 = w5Var.f273143a;
                    io3.l lVar = w5Var.f273144b;
                    if (z6Var != null && lVar == io3.l.CURRENT) {
                        w5 w5Var2 = z6Var.k;
                        return new PairedImage(y47.b.b(w5Var2 != null ? w5Var2.f273143a : null, proBackgroundIcons), new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14));
                    }
                    z6 z6Var2 = transaction.G;
                    if (z6Var2 != null && lVar == io3.l.MERCHANT) {
                        return new PairedImage(y47.b.b(str3, proBackgroundIcons), new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14));
                    }
                    if (z6Var != null && lVar == io3.l.MERCHANT) {
                        return new PairedImage(new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), y47.b.b(str3, proBackgroundIcons), R$attr.uikit_colorWidgetBackground, null);
                    }
                    if (z6Var2 == null || lVar != io3.l.CURRENT) {
                        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4054);
                    }
                    w5 w5Var3 = z6Var2.k;
                    return new PairedImage(new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), y47.b.b(w5Var3 != null ? w5Var3.f273143a : null, proBackgroundIcons), R$attr.uikit_colorWidgetBackground, null);
                }
            }
        }
        return t(R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorTeal);
    }
}
