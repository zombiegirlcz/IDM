package d8l;

import android.os.Parcelable;
import com.google.common.io.BaseEncoding;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.insurance_car.impl.data.model.QuestionnaireAnswer;
import com.revolut.feature.insurance_credit.impl.data.model.action.Button;
import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.ProductGroupOptions;
import com.revolut.feature.shared.savings.models.product.SavingsOnboardingData;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shared.savings.models.product.ScreensConfig;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import defpackage.v1;
import ecd.a3;
import ecd.b2;
import ecd.d6;
import ecd.g6;
import ecd.i2;
import ecd.m;
import ecd.n;
import ecd.o;
import ecd.t2;
import ecd.w2;
import ecd.x2;
import ggk.g1;
import ggk.h1;
import hl7.j8;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kl7.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nif.j0;
import nif.k0;
import nii.u1;
import org.joda.time.DateTime;
import qib.j;
import ujb.k;
import ujb.q;
import ujb.r;
import v20.c1;
import v20.i1;
import v20.l0;
import v20.l1;
import v20.m2;
import v20.n2;
import v20.o0;
import v20.o2;
import v20.p0;
import v20.r0;
import v20.r2;
import v20.s0;
import v20.s2;
import v20.y0;
import yji.l;
import zh9.p;
import zh9.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static final SavingsOnboardingData A(a3 a3Var) {
        OnboardingConfig onboardingConfig;
        List list;
        ArrayList arrayList;
        ScreensConfig screensConfig;
        SavingsProductData savingsProductData;
        Object next;
        ProductGroupOptions productGroupOptions;
        ArrayList arrayList2;
        ?? arrayList3;
        OnboardingConfig.DiscoverItems discoverItems;
        OnboardingConfig.ReviewDetailsScreenConfig reviewDetailsScreenConfig;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        List list2 = a3Var.f124489b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it8 = list2.iterator();
        while (true) {
            ProductGroup productGroupC = null;
            if (!it8.hasNext()) {
                break;
            }
            try {
                productGroupC = fcd.a.c((i2) it8.next());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
            if (productGroupC != null) {
                arrayList4.add(productGroupC);
            }
        }
        List list3 = a3Var.f124488a;
        f0 f0Var = f0.f322471a;
        o oVar = a3Var.f124490c;
        if (oVar != null) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            b2 b2Var = oVar.f124629a;
            ProductGroup.TextWithExplanation textWithExplanationB = b2Var != null ? fcd.a.b(b2Var) : null;
            Boolean bool = oVar.f124630b;
            ecd.h hVar = oVar.f124631c;
            if (hVar != null) {
                ecd.g gVar = hVar.f124558a;
                discoverItems = new OnboardingConfig.DiscoverItems(gVar != null ? new OnboardingConfig.DiscoverItems.Protection(gVar.f124548a, gVar.f124549b) : null);
            } else {
                discoverItems = null;
            }
            n nVar = oVar.d;
            if (nVar != null) {
                m mVar = nVar.f124622a;
                reviewDetailsScreenConfig = new OnboardingConfig.ReviewDetailsScreenConfig(mVar != null ? new OnboardingConfig.ReviewDetailsScreenConfig.Header(pd.b.k(mVar.f124613a)) : null);
            } else {
                reviewDetailsScreenConfig = null;
            }
            onboardingConfig = new OnboardingConfig(textWithExplanationB, bool, discoverItems, reviewDetailsScreenConfig);
        } else {
            onboardingConfig = null;
        }
        g6 g6Var = a3Var.d;
        if (g6Var != null) {
            Intrinsics.checkNotNullParameter(g6Var, "<this>");
            x2 x2Var = g6Var.f124557a;
            if (x2Var != null) {
                String str = x2Var.f124704a;
                String str2 = x2Var.f124705b;
                String str3 = x2Var.f124706c;
                List list4 = x2Var.e;
                if (list4 != null) {
                    List<w2> list5 = list4;
                    ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                    for (w2 w2Var : list5) {
                        String str4 = w2Var.f124697a;
                        List list6 = w2Var.f124698b;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it9 = list6.iterator();
                        while (it9.hasNext()) {
                            List list7 = list3;
                            ArrayList arrayList7 = arrayList4;
                            ProductGroupOptions.GroupOption groupOptionA = fcd.d.a((t2) it9.next(), w2Var.f124697a);
                            if (groupOptionA != null) {
                                arrayList6.add(groupOptionA);
                            }
                            arrayList4 = arrayList7;
                            list3 = list7;
                        }
                        arrayList5.add(new ProductGroupOptions.GroupSection(str4, arrayList6));
                        list3 = list3;
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                list = list3;
                arrayList = arrayList4;
                List<t2> list8 = x2Var.d;
                if (list8 != null) {
                    arrayList3 = new ArrayList();
                    for (t2 t2Var : list8) {
                        ProductGroupOptions.GroupOption groupOptionA2 = fcd.d.a(t2Var, t2Var.f124677b);
                        if (groupOptionA2 != null) {
                            arrayList3.add(groupOptionA2);
                        }
                    }
                } else {
                    arrayList3 = f0.f322471a;
                }
                productGroupOptions = new ProductGroupOptions(str, str2, str3, arrayList3, arrayList2);
            } else {
                list = list3;
                arrayList = arrayList4;
                productGroupOptions = null;
            }
            screensConfig = new ScreensConfig(productGroupOptions);
        } else {
            list = list3;
            arrayList = arrayList4;
            screensConfig = null;
        }
        SavingsOnboardingData savingsOnboardingData = new SavingsOnboardingData(f0Var, onboardingConfig, screensConfig);
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            try {
                SavingsProduct savingsProductA = fcd.c.a((d6) it10.next());
                Iterator it11 = arrayList.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it11.next();
                    if (((ProductGroup) next).f86521a == savingsProductA.f86619c) {
                        break;
                    }
                }
                ProductGroup productGroup = (ProductGroup) next;
                if (productGroup == null) {
                    throw new IllegalStateException("group is empty");
                }
                savingsProductData = new SavingsProductData(savingsProductA, productGroup);
                fcd.b.a(savingsProductData);
            } catch (Exception e2) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                savingsProductData = null;
            }
            if (savingsProductData != null) {
                ArrayList productsData = d0.F0(savingsProductData, savingsOnboardingData.f86614a);
                Intrinsics.checkNotNullParameter(productsData, "productsData");
                savingsOnboardingData = new SavingsOnboardingData(productsData, savingsOnboardingData.f86615b, savingsOnboardingData.f86616c);
            }
        }
        return savingsOnboardingData;
    }

    public static final ChargeBreakdown B(e8l.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Amount amountF = mif.a.F(dVar.getTotal());
        e8l.a aVarC = dVar.getTotalConverted();
        Amount amountF2 = aVarC != null ? mif.a.F(aVarC) : null;
        List<e8l.c> listA = dVar.getBreakdown();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (e8l.c cVar : listA) {
            String strG = cVar.getTitle();
            String strF = cVar.getShortDescription();
            String strD = cVar.getDescription();
            e8l.b bVarE = cVar.getDetails();
            ChargeEntryDetails chargeEntryDetails = bVarE != null ? new ChargeEntryDetails(bVarE.getTitle(), bVarE.getUrl()) : null;
            Amount amountF3 = mif.a.F(cVar.getAmount());
            e8l.a aVarC2 = cVar.getAmountInBaseCurrency();
            Amount amountF4 = aVarC2 != null ? mif.a.F(aVarC2) : null;
            e8l.a aVarB = cVar.getAmountConverted();
            arrayList.add(new ChargeEntry(strG, strF, strD, chargeEntryDetails, amountF3, amountF4, aVarB != null ? mif.a.F(aVarB) : null));
        }
        e8l.a aVarD = dVar.getTotalInBaseCurrency();
        return new ChargeBreakdown(amountF, arrayList, amountF2, aVarD != null ? mif.a.F(aVarD) : null);
    }

    public static final dj0.d C(jo3.b bVar) {
        long amount = bVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = bVar.getCurrency();
        aVar.getClass();
        return new dj0.d(amount, xi0.b.a(xi0.a.a(currency), 9));
    }

    public static final qib.i D(r rVar) {
        qib.a aVar;
        Iterator it8;
        j jVar;
        String str;
        qib.e eVar;
        Iterator it9;
        qib.c cVar;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String str2 = rVar.f280581a;
        String str3 = rVar.f280582b;
        ujb.n nVar = rVar.f280583c;
        String str4 = nVar.f280571a;
        String str5 = nVar.f280572b;
        dj0.d dVar = nVar.f280573c;
        List list = nVar.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            ujb.g gVar = (ujb.g) it10.next();
            LocalDateTime localDateTimeY = oi0.d.Y(gVar.f280559a);
            String str6 = gVar.f280560b;
            qib.c[] cVarArrValues = qib.c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    it9 = it10;
                    cVar = null;
                    break;
                }
                qib.c cVar2 = cVarArrValues[i];
                it9 = it10;
                if (a0.z(cVar2.name(), str6, true)) {
                    cVar = cVar2;
                    break;
                }
                i++;
                it10 = it9;
            }
            if (cVar == null) {
                cVar = qib.c.UNKNOWN;
            }
            arrayList.add(new qib.d(localDateTimeY, cVar));
            it10 = it9;
        }
        List list2 = nVar.e;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it11 = list2.iterator();
        while (it11.hasNext()) {
            q qVar = (q) it11.next();
            String str7 = qVar.f280578a;
            j[] jVarArrValues = j.values();
            int length2 = jVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    it8 = it11;
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i2];
                it8 = it11;
                if (a0.z(jVar.name(), str7, true)) {
                    break;
                }
                i2++;
                it11 = it8;
            }
            if (jVar == null) {
                jVar = j.UNKNOWN;
            }
            j jVar2 = jVar;
            String str8 = qVar.f280579b;
            LocalDateTime localDateTimeY2 = oi0.d.Y(qVar.f280580c);
            LocalDateTime localDateTimeY3 = oi0.d.Y(qVar.d);
            k kVar = qVar.e;
            String str9 = kVar.f280564a;
            qib.e[] eVarArrValues = qib.e.values();
            int length3 = eVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    str = str8;
                    eVar = null;
                    break;
                }
                eVar = eVarArrValues[i3];
                str = str8;
                if (a0.z(eVar.name(), str9, true)) {
                    break;
                }
                i3++;
                str8 = str;
            }
            if (eVar == null) {
                eVar = qib.e.UNKNOWN;
            }
            arrayList2.add(new qib.h(jVar2, str, localDateTimeY2, localDateTimeY3, new qib.f(eVar, kVar.f280565b, kVar.f280566c, kVar.d)));
            it11 = it8;
        }
        qib.g gVar2 = new qib.g(str4, str5, dVar, arrayList, arrayList2);
        ujb.d dVar2 = rVar.d;
        LocalDateTime localDateTimeY4 = oi0.d.Y(dVar2.f280545a);
        LocalDateTime localDateTimeY5 = oi0.d.Y(dVar2.f280546b);
        LocalDateTime localDateTimeY6 = oi0.d.Y(dVar2.f280547c);
        dj0.d dVar3 = dVar2.d;
        String str10 = dVar2.e;
        qib.a[] aVarArrValues = qib.a.values();
        int length4 = aVarArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length4) {
                aVar = null;
                break;
            }
            qib.a aVar2 = aVarArrValues[i5];
            if (a0.z(aVar2.name(), str10, true)) {
                aVar = aVar2;
                break;
            }
            i5++;
        }
        if (aVar == null) {
            aVar = qib.a.UNKNOWN;
        }
        return new qib.i(str2, str3, gVar2, new qib.b(localDateTimeY4, localDateTimeY5, localDateTimeY6, dVar3, aVar, dVar2.f));
    }

    public static final qta.b E(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        DateTime dateTime = ((jpk.e) d0.b0(list)).f177315a;
        DateTime dateTime2 = ((jpk.e) d0.b0(list)).f177316b;
        dj0.d dVarC = C(((jpk.e) d0.b0(list)).f177317c);
        dj0.d dVarC2 = C(((jpk.e) d0.b0(list)).d);
        List<jpk.e> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (jpk.e eVar : list2) {
            arrayList.add(new qta.j(C(eVar.f177318g), C(eVar.f177319h), C(eVar.i), C(eVar.f177320j), eVar.e, eVar.f));
        }
        return new qta.b(dVarC, dVarC2, arrayList, dateTime, dateTime2);
    }

    public static final vu3.e F(a14.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!(dVar instanceof a14.c)) {
            if (!(dVar instanceof a14.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a14.b bVar = (a14.b) dVar;
            return new vu3.c(bVar.getLabel(), bVar.getDeeplink());
        }
        a14.c cVar = (a14.c) dVar;
        String strD = cVar.getLabel();
        String strC = cVar.getIntendedPlanId();
        it3.j jVar = it3.k.Companion;
        String strF = cVar.getProductMetadata();
        jVar.getClass();
        it3.k kVarA = it3.j.a(strF);
        String strA = cVar.getAppType();
        String strG = cVar.getSubtype();
        String strB = cVar.getBillingOption();
        hha.i iVar = null;
        Object obj2 = null;
        if (strB != null) {
            Iterator<E> it8 = hha.i.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((hha.i) next).name(), strB)) {
                    obj2 = next;
                    break;
                }
            }
            iVar = (hha.i) obj2;
        }
        return new vu3.d(strD, strC, kVarA, strA, strG, iVar, cVar.getOfferToken());
    }

    public static final as7.c G(Button button) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        String str = button.f75752a;
        ps7.a aVar = button.f75753b;
        String strName = aVar != null ? aVar.name() : null;
        ps7.b bVar = button.f75754c;
        String strName2 = bVar != null ? bVar.name() : null;
        if (strName2 == null) {
            strName2 = "";
        }
        return new as7.c(str, strName, strName2);
    }

    public static final ArrayList H(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            QuestionnaireAnswer questionnaireAnswer = (QuestionnaireAnswer) it8.next();
            Intrinsics.checkNotNullParameter(questionnaireAnswer, "<this>");
            arrayList2.add(new j8(questionnaireAnswer.f75297a, questionnaireAnswer.f75298b));
        }
        return arrayList2;
    }

    public static final k0 I(tof.h hVar) {
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String str = hVar.f272774a;
        dj0.d dVar = hVar.f272776c;
        j0 j0Var = null;
        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
        String str2 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
        int i = hif.a.f152602a[hVar.f272775b.ordinal()];
        if (i == 1) {
            j0Var = j0.FULLY_EXCLUDED;
        } else if (i == 2) {
            j0Var = j0.PARTIALLY_EXCLUDED;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new k0(str, lValueOf, str2, j0Var);
    }

    public static final vmh.f J(xnh.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (umh.b.f281318a[aVar.ordinal()]) {
            case 1:
                return vmh.f.STOCKS;
            case 2:
                return vmh.f.BONDS;
            case 3:
                return vmh.f.ETFS;
            case 4:
                return vmh.f.CFD;
            case 5:
                return vmh.f.COMMODITY;
            case 6:
                return vmh.f.PRIVATE_MARKETS;
            case 7:
                return vmh.f.MUTUAL_FUNDS;
            case 8:
                return vmh.f.STRUCTURED_NOTES;
            case 9:
                return vmh.f.STRATEGIES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final g29.f K(f19.g gVar, i19.f refreshStrategyType) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(refreshStrategyType, "refreshStrategyType");
        List list = gVar.f131192b;
        ArrayList<j19.k> arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            i19.g gVarB = ((j19.k) next).b();
            if ((gVarB != null ? gVarB.f157597a : null) == refreshStrategyType) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (j19.k kVar : arrayList) {
            j19.a aVarA = kVar.a();
            g29.e eVar = aVarA != null ? new g29.e(kVar.getId(), aVarA) : null;
            if (eVar != null) {
                arrayList2.add(eVar);
            }
        }
        return new g29.f(arrayList2);
    }

    public static final dj0.d L(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        dj0.d.Companion.getClass();
        dj0.d dVarV = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarV = i == 0 ? czi.c.v(((y) obj2).f322366b) : pyd.c.O(dVarV, czi.c.v(((y) obj2).f322366b));
            i = i2;
        }
        return dVarV;
    }

    public static final ArrayList M(List list, i19.c cVar) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            j19.k kVar = (j19.k) it8.next();
            if (kVar.b() != null) {
                Iterator it9 = cVar.f157594b.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (Intrinsics.f(((j19.k) next).getId(), kVar.getId())) {
                        break;
                    }
                }
                j19.k kVar2 = (j19.k) next;
                if (kVar2 == null) {
                    kVar = null;
                } else if (kVar2.getContent() != null) {
                    kVar = kVar2;
                }
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yki.i a(l lVar, Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        return new yki.i((yki.j) lVar, controllersFactory);
    }

    public static final AccentCircleBadge b(boolean z) {
        if (z) {
            return new AccentCircleBadge(dw0.a.Checked);
        }
        return null;
    }

    public static KeyStore c(String str, char[] cArr) {
        try {
            byte[] bArrDecode = BaseEncoding.base64().decode(str.split("-----BEGIN CERTIFICATE-----")[1].split("-----END CERTIFICATE-----")[0].replaceAll("[\\r\\n]", ""));
            byte[] bArrDecode2 = BaseEncoding.base64().decode(str.split("-----BEGIN PRIVATE KEY-----")[1].split("-----END PRIVATE KEY-----")[0].replaceAll("[\\r\\n]", ""));
            X509Certificate x509CertificateD = d(bArrDecode);
            RSAPrivateKey rSAPrivateKeyF = f(bArrDecode2);
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(null, null);
            keyStore.setKeyEntry("MDM-client", rSAPrivateKeyF, cArr, new X509Certificate[]{x509CertificateD});
            return keyStore;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException | InvalidKeySpecException e) {
            v1.b("Error to create keystore ", e);
            return null;
        }
    }

    public static X509Certificate d(byte[] bArr) {
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static byte[] e(byte[] bArr) {
        byte b4;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            byte b5 = bArr[i2];
            if (b5 != 12) {
                if (b5 != 14) {
                    i = i3 + 1;
                    arrayList.add(i3, Byte.valueOf(b5));
                } else {
                    i2++;
                    if (i2 < bArr.length && (b4 = bArr[i2]) != 14 && b4 != 15) {
                        i = i3 + 1;
                        arrayList.add(i3, Byte.valueOf((byte) (b4 & 15)));
                    }
                }
                i3 = i;
            } else {
                arrayList.add(i3, (byte) 0);
                i3++;
            }
            i2++;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            bArr2[i5] = ((Byte) arrayList.get(i5)).byteValue();
        }
        return bArr2;
    }

    public static RSAPrivateKey f(byte[] bArr) {
        return (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static final xjb.b h(qib.i iVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        qib.b bVar = iVar.d;
        qib.g gVar = iVar.f246693c;
        ArrayList arrayList = gVar.d;
        int i = xjb.a.f306506a[bVar.e.ordinal()];
        if (i == 1) {
            return xjb.b.PAUSED;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        qib.c[] elements = {qib.c.FAILED, qib.c.AT_RISK};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = true;
                break;
            }
            if (setY0.contains(((qib.d) arrayList.get(i2)).f246681b)) {
                z = false;
                break;
            }
            i2++;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            if (((qib.d) arrayList.get(i5)).f246681b == qib.c.FAILED) {
                i3++;
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        for (int i21 = 0; i21 < size3; i21++) {
            if (((qib.d) arrayList.get(i21)).f246681b == qib.c.AT_RISK) {
                i6++;
            }
        }
        return (gVar.f246687c == null || z) ? xjb.b.ON_TRACK : (i3 == 0 && i6 == 1) ? xjb.b.WEEK_IN_DANGER : (i3 == 1 && i6 == 1) ? xjb.b.TWO_WEEKS_IN_DANGER : xjb.b.NOT_ELIGIBLE_FOR_PRIZES;
    }

    public static final nii.j0 i(List titleArgs, boolean z, List descriptionArgs) {
        Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
        Intrinsics.checkNotNullParameter(descriptionArgs, "descriptionArgs");
        return new nii.j0((Clause) new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_title, titleArgs, null, 12), (Clause) (z ? new TextLocalisedClause(R$string.trade_rev_points_top_up_status_sheet_success_description, descriptionArgs, null, 12) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
    }

    public static final ArrayList j(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (czi.c.B(((y) obj2).f322366b)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final ArrayList k(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            p pVar = ((y) obj2).f322366b;
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            if (czi.c.C(pVar) || czi.c.D(pVar)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final g1 l(h1 h1Var, String planId) {
        Object next;
        Intrinsics.checkNotNullParameter(h1Var, "<this>");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Iterator it8 = h1Var.f143727b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((g1) next).f143718a, planId)) {
                break;
            }
        }
        return (g1) next;
    }

    public static final List m(n0[] n0VarArr, boolean z) {
        Intrinsics.checkNotNullParameter(n0VarArr, "<this>");
        return z ? kotlin.collections.d.v0(n0VarArr) : v.k(n0.CURRENT_INSURANCE_EXPIRED_30_OR_MORE, n0.DISQUALIFICATIONS, n0.CONVICTIONS, n0.REFUSED_CAR_INSURANCE, n0.INCREASED_EXCESS_AND_REDUCED_COVER_LEVEL, n0.DRIVER_DISABILITY, n0.NO_OR_RECENT_RESIDENCY_IRELAND);
    }

    public static final boolean n(q9k.a aVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        List list = aVar.f243915b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (z92.f.l((io3.d) it8.next()).equals(currency)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o(f19.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        List list = gVar.f131192b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((j19.k) it8.next()).b() != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean p(v20.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if ((nVar instanceof v20.c) || (nVar instanceof v20.e) || (nVar instanceof v20.j) || (nVar instanceof v20.i) || (nVar instanceof r2) || (nVar instanceof o2) || (nVar instanceof n2) || (nVar instanceof s0) || (nVar instanceof m2) || (nVar instanceof y0.a) || (nVar instanceof p0) || (nVar instanceof r0) || (nVar instanceof v20.h1) || (nVar instanceof l0) || (nVar instanceof o0) || (nVar instanceof v20.g1) || (nVar instanceof c1) || (nVar instanceof v20.j0) || (nVar instanceof s2) || (nVar instanceof i1)) {
            return true;
        }
        if (nVar instanceof l1) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean q(List list, xzg.a type) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof xzg.b) {
                break;
            }
        }
        xzg.b bVar = (xzg.b) next;
        if (bVar != null) {
            List list2 = bVar.f309972a;
            if (list2.size() == 1 && list2.contains(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(imh.n nVar, vmh.g filterState) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        Set set = nVar.f162480a;
        xnh.a aVar = nVar.f162481b;
        vmh.f fVar = filterState.f290586b;
        if (!set.contains(fVar != null ? x(fVar) : null)) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        Data data = filterState.f290585a;
        List list = data != null ? (List) data.getContent() : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return list.contains(J(aVar));
    }

    public static final ArrayList s(ArrayList layouts, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(layouts, "layouts");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = layouts.iterator();
        while (it8.hasNext()) {
            g1 g1Var = (g1) it8.next();
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((hha.d) next).f152287a, g1Var.f143718a)) {
                    break;
                }
            }
            hha.d dVar = (hha.d) next;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public static final void t(l lVar, FeatureCommand command) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(command, "command");
        lVar.C1(new BridgeDestination(command));
    }

    public static final List u(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return d0.P0(list, new oh3.e(zh9.q.Ascending));
    }

    public static final jpk.a v(qta.b bVar, String symbol, String duration) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new jpk.a(symbol, duration, bVar.f249043a, bVar.f249044b, hx7.a.A(bVar.f249045c), hx7.a.A(bVar.d));
    }

    public static final jpk.b w(qta.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new jpk.b(jVar.e, jVar.f, hx7.a.A(jVar.f249059a), hx7.a.A(jVar.f249060b), hx7.a.A(jVar.f249061c), hx7.a.A(jVar.d), 0L);
    }

    public static final xnh.a x(vmh.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (umh.b.f281319b[fVar.ordinal()]) {
            case 1:
                return xnh.a.STOCKS;
            case 2:
                return xnh.a.BONDS;
            case 3:
                return xnh.a.ETFS;
            case 4:
                return xnh.a.CFD;
            case 5:
                return xnh.a.COMMODITY;
            case 6:
                return xnh.a.PRIVATE_MARKETS;
            case 7:
                return xnh.a.MUTUAL_FUNDS;
            case 8:
                return xnh.a.STRUCTURED_NOTES;
            case 9:
                return xnh.a.STRATEGIES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final DefiCurrency y(d26.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f110725a;
        String str2 = fVar.f110726b;
        String str3 = fVar.e;
        int i = fVar.f110727c;
        Integer num = fVar.d;
        return new DefiCurrency(i, num != null ? num.intValue() : i, str, str2, str3, fVar.f);
    }

    public static final Button z(as7.c cVar) {
        ps7.a aVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f8826a;
        String str2 = cVar.f8827b;
        int i = 0;
        ps7.b bVar = null;
        if (str2 != null) {
            ps7.a[] aVarArrValues = ps7.a.values();
            int length = aVarArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVar = aVarArrValues[i2];
                if (a0.z(aVar.name(), str2, true)) {
                    break;
                }
            }
            aVar = null;
        } else {
            aVar = null;
        }
        String str3 = cVar.f8828c;
        ps7.b[] bVarArrValues = ps7.b.values();
        int length2 = bVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            ps7.b bVar2 = bVarArrValues[i];
            if (a0.z(bVar2.name(), str3, true)) {
                bVar = bVar2;
                break;
            }
            i++;
        }
        return new Button(str, aVar, bVar);
    }
}
