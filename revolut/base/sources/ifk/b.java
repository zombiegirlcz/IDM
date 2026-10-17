package ifk;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import aw0.o9;
import aw0.v1;
import ce9.m;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestPosition;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestStep;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$SearchParameters;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.LocationPoint;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimPortingStep;
import dda.u;
import dda.x;
import dej.g0;
import dej.k1;
import foa.a0;
import foa.z;
import g9f.j0;
import g9f.y;
import h93.f0;
import igm.o;
import igm.q;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kfj.r;
import kfj.s2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.e0;
import nel.k;
import nel.l;
import nel.n;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.reactivestreams.Publisher;
import tof.k2;
import uo.q0;
import wda.h;
import yp0.b0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final ArrayList A(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<de8.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (de8.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new vd8.f(cVar.getInvitationId(), cVar.getOwnerFirstName(), cVar.getOwnerLastName(), cVar.getJuniorFirstName()));
        }
        return arrayList;
    }

    public static final quj.c B(puj.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f239917a;
        String str2 = fVar.f239918b.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        Address address = fVar.f239919c;
        return new quj.c(str, str2, fVar.d, address != null ? oo3.a.d(address) : null);
    }

    public static final ArrayList C(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<vd8.f> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (vd8.f fVar : list2) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            arrayList.add(new de8.c(fVar.f287823a, fVar.f287824b, fVar.f287825c, fVar.d));
        }
        return arrayList;
    }

    public static final ArrayList D(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            soa.b bVar = (soa.b) it8.next();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new apa.a(F(bVar.f264801a), bVar.f264802b, bVar.f264803c, bVar.d, bVar.e, bVar.f));
        }
        return arrayList;
    }

    public static final FlightSearchQuery E(TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters) {
        LocationPoint locationPoint;
        LocalDate localDate;
        Intrinsics.checkNotNullParameter(travelFlightsDiscoverScreenContract$SearchParameters, "<this>");
        LocationPoint locationPoint2 = travelFlightsDiscoverScreenContract$SearchParameters.f93332a;
        if (locationPoint2 == null || (locationPoint = travelFlightsDiscoverScreenContract$SearchParameters.f93333b) == null || (localDate = travelFlightsDiscoverScreenContract$SearchParameters.f93334c) == null) {
            return null;
        }
        return new FlightSearchQuery(locationPoint2, locationPoint, localDate, travelFlightsDiscoverScreenContract$SearchParameters.d, travelFlightsDiscoverScreenContract$SearchParameters.e, travelFlightsDiscoverScreenContract$SearchParameters.f);
    }

    public static final String F(soa.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (zoa.a.f323950a[cVar.ordinal()]) {
            case 1:
                return "marketing";
            case 2:
                return "crypto_x_marketing";
            case 3:
                return "offers";
            case 4:
                return "cryptocurrencyvolatility";
            case 5:
                return "commoditiesvolatility";
            case 6:
                return "stocks_volatility";
            case 7:
                return "bank_uab";
            case 8:
                return "daily_stock_highlights";
            case 9:
                return "thirdparty";
            case 10:
                return "revpay_delivery_tracking";
            case 11:
                return "revpay_flight_tracking";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final a59.b G(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        int i = a0.f136863a[zVar.ordinal()];
        if (i == 4) {
            return a59.b.WEALTH_INSIGHTS;
        }
        if (i != 6) {
            return null;
        }
        return a59.b.CRYPTO;
    }

    public static final soa.c H(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        switch (a0.f136863a[zVar.ordinal()]) {
            case 1:
                return soa.c.MARKETING;
            case 2:
                return soa.c.REVOLUT_X_MARKETING;
            case 3:
                return soa.c.PERSONALIZED_THIRD_PARTY;
            case 4:
                return soa.c.TRADING_STOCKS_VOLATILITY;
            case 5:
                return soa.c.COMMODITY_VOLATILITY;
            case 6:
                return soa.c.CRYPTOCURRENCY_VOLATILITY;
            case 7:
                return soa.c.REVOLUT_PAY_DELIVERY_TRACKING;
            case 8:
                return soa.c.REVOLUT_PAY_FLIGHT_TRACKING;
            case 9:
                throw new IllegalStateException("Unsupported CREDIT_COLLECTION NotificationSettingType");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final xoa.b I(soa.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        boolean z = bVar.f264802b;
        boolean z3 = bVar.f264803c;
        Boolean bool = bVar.d;
        Boolean bool2 = bVar.e;
        if (bVar.f264801a != soa.c.MARKETING) {
            bool2 = null;
        }
        return new xoa.b(z, z3, bool, bool2, bVar.f);
    }

    public static final z3d.c J(SharedConverterItem sharedConverterItem) {
        Intrinsics.checkNotNullParameter(sharedConverterItem, "<this>");
        FavouritesAssetTypeKey favouritesAssetTypeKey = sharedConverterItem.f86892a;
        xi0.b bVar = sharedConverterItem.f86893b;
        dj0.d dVar = sharedConverterItem.d;
        return new z3d.c(favouritesAssetTypeKey, new dj0.d(dVar != null ? dVar.f115082a : 10000L, bVar));
    }

    public static final TextClause K(String id10, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        String text = str;
        Intrinsics.checkNotNullParameter(text, "text");
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            h hVar = (h) obj2;
            arrayList2.add(new TextClause(hVar.getValue(), (Style) new Click(28, (Integer) null, (Object) hVar, a0.d.r(id10, hVar.getValue()), false), (Integer) null, false, (o9) null, (List) null, 124));
            text = kotlin.text.a0.F(text, hVar.getValue(), j6.a.l(i2, "%", "$s"), false);
            i = i2;
        }
        return new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) arrayList2, 94);
    }

    public static final ArrayList L(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            if (jqk.h.f177756a[((qsi.c) it8.next()).ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(k2.NOT_SPARE_CHANGE);
        }
        return arrayList;
    }

    public static final h M(dda.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar instanceof u) {
            u uVar = (u) wVar;
            return new wda.c(uVar.f113199a, uVar.f113200b);
        }
        if (!(wVar instanceof dda.v)) {
            throw new NoWhenBranchMatchedException();
        }
        dda.v vVar = (dda.v) wVar;
        String str = vVar.f113201a;
        x xVar = vVar.f113202b;
        String str2 = xVar.f113203a;
        String str3 = xVar.f113204b;
        List list = xVar.f113205c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            h hVarM = M((u) it8.next());
            wda.c cVar = hVarM instanceof wda.c ? (wda.c) hVarM : null;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new wda.e(str, new wda.d(str2, str3, arrayList));
    }

    public static final ty5.a N(ty5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = ty5.b.f275487a[aVar.ordinal()];
        if (i == 1) {
            return ty5.a.ASCENDING;
        }
        if (i == 2) {
            return ty5.a.DESCENDING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean O(Publisher publisher, dom.a aVar, o oVar) {
        if (!(publisher instanceof q)) {
            return false;
        }
        try {
            Object obj2 = ((q) publisher).get();
            if (obj2 == null) {
                aVar.e(xgm.c.INSTANCE);
                aVar.onComplete();
                return true;
            }
            try {
                Object objApply = oVar.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                Publisher publisher2 = (Publisher) objApply;
                if (!(publisher2 instanceof q)) {
                    publisher2.a(aVar);
                    return true;
                }
                try {
                    Object obj3 = ((q) publisher2).get();
                    if (obj3 != null) {
                        aVar.e(new xgm.d(aVar, obj3));
                        return true;
                    }
                    aVar.e(xgm.c.INSTANCE);
                    aVar.onComplete();
                    return true;
                } catch (Throwable th10) {
                    m.F(th10);
                    xgm.c.c(th10, aVar);
                    return true;
                }
            } catch (Throwable th11) {
                m.F(th11);
                xgm.c.c(th11, aVar);
                return true;
            }
        } catch (Throwable th12) {
            m.F(th12);
            xgm.c.c(th12, aVar);
            return true;
        }
    }

    public static final zn.f P(zn.f fVar, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Set setKeySet = fVar.f323642a.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeySet) {
            zn.d dVar = (zn.d) obj2;
            if ((dVar instanceof tga.e) && !aha.a.b(featureToggleInteractor, ((tga.e) dVar).f271114a)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return fVar;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fVar.f323642a);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            concurrentHashMap.remove((zn.d) it8.next());
        }
        return new zn.f(concurrentHashMap);
    }

    public static final void a(CutoutImageView imageView, View badgeView, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(badgeView, "badgeView");
        int i = imageView.getLayoutParams().height / 2;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fL = kli.a.l(context, 2.0f);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float f = (i / 1.4142f) + fL;
        badgeView.setTranslationX(jh.d.k(context2) ? -f : f);
        if (z) {
            f = -f;
        }
        badgeView.setTranslationY(f);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jO = o(0, bArr) & 67108863;
        int i = 3;
        long jO2 = (o(3, bArr) >> 2) & 67108611;
        long jO3 = (o(6, bArr) >> 4) & 67092735;
        long jO4 = (o(9, bArr) >> 6) & 66076671;
        long jO5 = (o(12, bArr) >> 8) & 1048575;
        long j2 = jO2 * 5;
        long j3 = jO3 * 5;
        long j5 = jO4 * 5;
        long j16 = jO5 * 5;
        byte[] bArr3 = new byte[17];
        long j22 = 0;
        long j42 = 0;
        long j46 = 0;
        long j47 = 0;
        long j57 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jO6 = j57 + (o(0, bArr3) & 67108863);
            long jO7 = j22 + ((o(i, bArr3) >> 2) & 67108863);
            long jO8 = j42 + ((o(6, bArr3) >> 4) & 67108863);
            long jO9 = j46 + ((o(9, bArr3) >> 6) & 67108863);
            long j58 = jO2;
            long jO10 = j47 + (((o(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << Ascii.CAN)));
            long j65 = (jO10 * j2) + (jO9 * j3) + (jO8 * j5) + (jO7 * j16) + (jO6 * jO);
            long j69 = (jO10 * j3) + (jO9 * j5) + (jO8 * j16) + (jO7 * jO) + (jO6 * j58);
            long j76 = (jO10 * j5) + (jO9 * j16) + (jO8 * jO) + (jO7 * j58) + (jO6 * jO3);
            long j85 = (jO10 * j16) + (jO9 * jO) + (jO8 * j58) + (jO7 * jO3) + (jO6 * jO4);
            long j100 = jO9 * j58;
            long j101 = jO10 * jO;
            long j102 = j69 + (j65 >> 26);
            long j103 = j76 + (j102 >> 26);
            long j104 = j85 + (j103 >> 26);
            long j105 = j101 + j100 + (jO8 * jO3) + (jO7 * jO4) + (jO6 * jO5) + (j104 >> 26);
            long j106 = j105 >> 26;
            j47 = j105 & 67108863;
            long j107 = (j106 * 5) + (j65 & 67108863);
            i2 += 16;
            j42 = j103 & 67108863;
            j46 = j104 & 67108863;
            j57 = j107 & 67108863;
            j22 = (j102 & 67108863) + (j107 >> 26);
            jO2 = j58;
            i = 3;
        }
        long j108 = j42 + (j22 >> 26);
        long j109 = j108 & 67108863;
        long j110 = j46 + (j108 >> 26);
        long j111 = j110 & 67108863;
        long j112 = j47 + (j110 >> 26);
        long j113 = j112 & 67108863;
        long j114 = ((j112 >> 26) * 5) + j57;
        long j115 = j114 >> 26;
        long j116 = j114 & 67108863;
        long j117 = (j22 & 67108863) + j115;
        long j118 = j116 + 5;
        long j119 = j118 & 67108863;
        long j120 = j117 + (j118 >> 26);
        long j121 = j109 + (j120 >> 26);
        long j122 = j111 + (j121 >> 26);
        long j123 = j122 & 67108863;
        long j124 = (j113 + (j122 >> 26)) - 67108864;
        long j125 = j124 >> 63;
        long j126 = j116 & j125;
        long j127 = j117 & j125;
        long j128 = j109 & j125;
        long j129 = j111 & j125;
        long j130 = j113 & j125;
        long j131 = ~j125;
        long j132 = j127 | (j120 & 67108863 & j131);
        long j133 = j128 | (j121 & 67108863 & j131);
        long j134 = j129 | (j123 & j131);
        long j135 = (j126 | (j119 & j131) | (j132 << 26)) & BodyPartID.bodyIdMax;
        long j136 = ((j132 >> 6) | (j133 << 20)) & BodyPartID.bodyIdMax;
        long j137 = ((j133 >> 12) | (j134 << 14)) & BodyPartID.bodyIdMax;
        long j138 = ((j134 >> 18) | ((j130 | (j124 & j131)) << 8)) & BodyPartID.bodyIdMax;
        long jO11 = o(16, bArr) + j135;
        long j139 = jO11 & BodyPartID.bodyIdMax;
        long jO12 = o(20, bArr) + j136 + (jO11 >> 32);
        long j140 = jO12 & BodyPartID.bodyIdMax;
        long jO13 = o(24, bArr) + j137 + (jO12 >> 32);
        long j141 = jO13 & BodyPartID.bodyIdMax;
        long jO14 = (o(28, bArr) + j138 + (jO13 >> 32)) & BodyPartID.bodyIdMax;
        byte[] bArr4 = new byte[16];
        s(j139, 0, bArr4);
        s(j140, 4, bArr4);
        s(j141, 8, bArr4);
        s(jO14, 12, bArr4);
        return bArr4;
    }

    public static final vzh.d c(com.revolut.kompot.navigable.a controller, xvi.g brightnessObserver, q0 screenNameFinder, uo.b activeScreenHolder, xvi.b brightnessAnalyticsTracker) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(brightnessObserver, "brightnessObserver");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(brightnessAnalyticsTracker, "brightnessAnalyticsTracker");
        return new vzh.d(brightnessObserver, new xvi.c(controller, screenNameFinder, activeScreenHolder, brightnessAnalyticsTracker));
    }

    public static final ArrayList d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            apa.a aVar = (apa.a) it8.next();
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            soa.c cVarP = p(aVar.getId());
            soa.b bVar = cVarP != null ? new soa.b(cVarP, aVar.getEmail(), aVar.getPush(), aVar.getAiCalls(), aVar.getInApp(), aVar.getAiProactiveInsights()) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static final String e(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        nel.a aVar = nVar.f214599h;
        nel.d dVar = aVar instanceof nel.d ? (nel.d) aVar : null;
        if (dVar != null) {
            return dVar.f214564c;
        }
        return null;
    }

    public static final nel.d f(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        nel.a aVar = nVar.f214599h;
        if (aVar instanceof nel.d) {
            return (nel.d) aVar;
        }
        return null;
    }

    public static final LocalDate g(hxf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        LocalDate localDate = aVar.f156586h;
        return localDate == null ? aVar.e : localDate;
    }

    public static final LocalDateTime h(hxf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        LocalDate localDate = aVar.e;
        LocalTime localTime = aVar.f156585g;
        if (localTime == null) {
            localTime = localDate.atStartOfDay().toLocalTime();
        }
        LocalDateTime localDateTimeOf = LocalDateTime.of(localDate, localTime);
        Intrinsics.checkNotNullExpressionValue(localDateTimeOf, "of(...)");
        return localDateTimeOf;
    }

    public static final jel.w i(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        nel.a aVar = nVar.f214599h;
        l lVar = aVar instanceof l ? (l) aVar : null;
        if (lVar != null) {
            return lVar.f;
        }
        return null;
    }

    public static final k j(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        nel.a aVar = nVar.f214599h;
        l lVar = aVar instanceof l ? (l) aVar : null;
        if (lVar != null) {
            return lVar.f214590g;
        }
        return null;
    }

    public static final e0 k(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        nel.a aVar = nVar.f214599h;
        if (aVar instanceof e0) {
            return (e0) aVar;
        }
        return null;
    }

    public static final TextClause l(String content, String id10, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(id10, "id");
        return arrayList.isEmpty() ? new TextClause(content, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : K(id10, content, arrayList);
    }

    public static final boolean m(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return Intrinsics.f(f0Var.f150110a, "retail_disposable");
    }

    public static final boolean n(gte.a aVar, FeatureDefinition feature, FeatureDefinition... features) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(features, "features");
        jte.d dVar = (jte.d) aVar;
        if (dVar.c(feature)) {
            for (FeatureDefinition featureDefinition : features) {
                if (dVar.c(featureDefinition)) {
                }
            }
            return true;
        }
        return false;
    }

    public static long o(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16))) & BodyPartID.bodyIdMax;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final soa.c p(String str) {
        switch (str.hashCode()) {
            case -1858766125:
                if (str.equals("bank_uab")) {
                    return soa.c.BANK_UAB;
                }
                return null;
            case -1845193353:
                if (str.equals("cryptocurrencyvolatility")) {
                    return soa.c.CRYPTOCURRENCY_VOLATILITY;
                }
                return null;
            case -1264281490:
                if (str.equals("daily_stock_highlights")) {
                    return soa.c.DAILY_STOCK_HIGHLIGHTS;
                }
                return null;
            case -1251161721:
                if (str.equals("stocks_volatility")) {
                    return soa.c.TRADING_STOCKS_VOLATILITY;
                }
                return null;
            case -1224227679:
                if (str.equals("crypto_x_marketing")) {
                    return soa.c.REVOLUT_X_MARKETING;
                }
                return null;
            case -1019793001:
                if (str.equals("offers")) {
                    return soa.c.OFFERS;
                }
                return null;
            case -940384801:
                if (str.equals("thirdparty")) {
                    return soa.c.PERSONALIZED_THIRD_PARTY;
                }
                return null;
            case -933770714:
                if (str.equals("marketing")) {
                    return soa.c.MARKETING;
                }
                return null;
            case 191382024:
                if (str.equals("revpay_delivery_tracking")) {
                    return soa.c.REVOLUT_PAY_DELIVERY_TRACKING;
                }
                return null;
            case 693764848:
                if (str.equals("commoditiesvolatility")) {
                    return soa.c.COMMODITY_VOLATILITY;
                }
                return null;
            case 1916749452:
                if (str.equals("revpay_flight_tracking")) {
                    return soa.c.REVOLUT_PAY_FLIGHT_TRACKING;
                }
                return null;
            default:
                return null;
        }
    }

    public static void q(ShimmerFrameLayout shimmerFrameLayout, v1 v1Var, int i) {
        int i2;
        int iS;
        b0 type = b0.REGULAR;
        if ((i & 2) != 0) {
            v1Var = null;
        }
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Context context = shimmerFrameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = v1Var == null ? -1 : yp0.z.f315761b[v1Var.ordinal()];
        if (i3 == -1) {
            int i5 = yp0.z.f315760a[type.ordinal()];
            if (i5 == 1) {
                i2 = R$attr.uikit_colorShimmer;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$attr.uikit_colorOnShimmer;
            }
            iS = kli.a.s(i2, context);
        } else if (i3 == 1) {
            int i6 = yp0.z.f315760a[type.ordinal()];
            if (i6 == 1) {
                iS = context.getColor(R$color.internal_shimmer);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iS = context.getColor(R$color.internal_onShimmer);
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i21 = yp0.z.f315760a[type.ordinal()];
            if (i21 == 1) {
                iS = context.getColor(R$color.internal_shimmer_night);
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iS = context.getColor(R$color.internal_onShimmer_night);
            }
        }
        int alphaComponent = ColorUtils.setAlphaComponent(iS, 255) == -1 ? ColorUtils.setAlphaComponent(iS, Math.min(Color.alpha(iS) + 30, 255)) : ColorUtils.setAlphaComponent(ColorUtils.blendARGB(iS, -1, 0.5f), Color.alpha(iS));
        c9.d dVar = new c9.d();
        dVar.o(iS);
        c9.d dVar2 = (c9.d) ((c9.d) ((c9.d) dVar.j(Color.alpha(iS) / 255.0f)).i(true)).k(1000L);
        ((c9.e) dVar2.f22248b).d = alphaComponent;
        c9.e eVarC = ((c9.d) dVar2.l(Color.alpha(alphaComponent) / 255.0f)).c();
        Intrinsics.checkNotNullExpressionValue(eVarC, "build(...)");
        shimmerFrameLayout.d(eVarC);
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "setShimmer(...)");
    }

    public static final void r(ShimmerFrameLayout shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "<this>");
        shimmerFrameLayout.d(yp0.a0.b());
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "setShimmer(...)");
    }

    public static void s(long j2, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j2);
            i2++;
            j2 >>= 8;
        }
    }

    public static final eo.c t(hn0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (Intrinsics.f(cVar, hn0.d.f154015a)) {
            return eo.c.CIPHER_DEFAULT;
        }
        if (Intrinsics.f(cVar, hn0.a.f154013a)) {
            return eo.c.CIPHER_BIOMETRIC;
        }
        if (Intrinsics.f(cVar, hn0.b.f154014a)) {
            return eo.c.CIPHER_CARDS;
        }
        if (Intrinsics.f(cVar, hn0.h.f154021a)) {
            return eo.c.CIPHER_SSO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TransferRequest u(y yVar) throws Throwable {
        u8f.f fVar;
        u8f.e eVar;
        String str;
        ej0.b bVar;
        u8f.g gVar;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        String str2 = yVar.f141579a;
        switch (e9f.c.f123982a[yVar.f141580b.ordinal()]) {
            case 1:
                fVar = u8f.f.CREATED;
                break;
            case 2:
                fVar = u8f.f.SUBMITTED;
                break;
            case 3:
                fVar = u8f.f.COMPLETED;
                break;
            case 4:
                fVar = u8f.f.CANCELLED;
                break;
            case 5:
                fVar = u8f.f.FAILED;
                break;
            case 6:
                fVar = u8f.f.UNKNOWN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        u8f.f fVar2 = fVar;
        int i = e9f.c.f123983b[yVar.e.ordinal()];
        int i2 = 1;
        if (i == 1) {
            eVar = u8f.e.IN;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = u8f.e.OUT;
        }
        ZonedDateTime zonedDateTime = yVar.f141581c;
        String str3 = yVar.f;
        String str4 = yVar.f141582g;
        u8f.h hVarH = io3.h.H(yVar.d);
        String str5 = yVar.f141583h;
        jo3.a aVar = yVar.i;
        dj0.d dVarO = aVar != null ? mo3.a.o(aVar) : null;
        List<j0> list = yVar.f141584j;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (j0 j0Var : list) {
            int i3 = e9f.c.f123984c[j0Var.f141560a.ordinal()];
            if (i3 == i2) {
                gVar = u8f.g.COMPLETED;
            } else if (i3 == 2) {
                gVar = u8f.g.IN_PROGRESS;
            } else if (i3 == 3) {
                gVar = u8f.g.PENDING;
            } else if (i3 == 4) {
                gVar = u8f.g.FAILED;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = u8f.g.UNKNOWN;
            }
            arrayList.add(new TransferRequestStep(gVar, j0Var.f141561b, j0Var.f141562c, j0Var.d));
            eVar = eVar;
            i2 = 1;
        }
        u8f.e eVar2 = eVar;
        List list2 = yVar.k;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            g9f.b0 b0Var = (g9f.b0) it8.next();
            String str6 = b0Var.f141543a;
            String str7 = b0Var.f141545c;
            String str8 = b0Var.f141544b;
            int i5 = b0Var.d;
            Iterator it9 = it8;
            g9f.m mVar = b0Var.e;
            if (mVar != null) {
                str = str2;
                BigDecimal bigDecimal = mVar.f141564a;
                xi0.a aVar2 = xi0.b.Companion;
                String str9 = mVar.f141565b;
                aVar2.getClass();
                bVar = new ej0.b(bigDecimal, xi0.a.a(str9));
            } else {
                str = str2;
                bVar = null;
            }
            arrayList2.add(new TransferRequestPosition(str6, str7, str8, i5, bVar, b0Var.f));
            it8 = it9;
            str2 = str;
        }
        return new TransferRequest(str2, fVar2, eVar2, zonedDateTime, hVarH, str3, str4, str5, dVarO, arrayList, arrayList2);
    }

    public static final EsimCheckoutPortingSteps v(kfj.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String strC = fVar.getTitle();
        String strB = fVar.getSubtitle();
        List listA = fVar.getSteps();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        int i = 0;
        for (Object obj2 : listA) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(w((s2) obj2, i == 0 ? k1.PAST : k1.FUTURE));
            i = i2;
        }
        return new EsimCheckoutPortingSteps(strC, strB, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EsimPortingStep w(s2 s2Var, k1 defaultState) {
        List arrayList;
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        String strC = s2Var.getTitle();
        kfj.e0 e0VarB = s2Var.getSubtitle();
        String strC2 = e0VarB.getText();
        List listA = e0VarB.getDescriptors();
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = listA.iterator();
        while (true) {
            int i = 0;
            if (!it8.hasNext()) {
                List<String> listB = e0VarB.getParameters();
                if (listB != null) {
                    arrayList = new ArrayList();
                    for (String str : listB) {
                        g0[] g0VarArrValues = g0.values();
                        if (g0VarArrValues.length > 0) {
                            g0 g0Var = g0VarArrValues[0];
                            throw null;
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = zhm.f0.f322471a;
                }
                EsimHyperText esimHyperText = new EsimHyperText(strC2, arrayList2, arrayList);
                String strA = s2Var.getState();
                if (strA != null) {
                    k1[] k1VarArrValues = k1.values();
                    int length = k1VarArrValues.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        k1 k1Var = k1VarArrValues[i];
                        if (kotlin.text.a0.z(k1Var.name(), strA, true)) {
                            descriptor = k1Var;
                            break;
                        }
                        i++;
                    }
                    if (descriptor != null) {
                        defaultState = descriptor;
                    }
                }
                return new EsimPortingStep(strC, esimHyperText, defaultState);
            }
            r rVar = (r) it8.next();
            String text = rVar.getText();
            if (rVar.getAction() != null) {
                dej.f0[] f0VarArrValues = dej.f0.values();
                if (f0VarArrValues.length > 0) {
                    dej.f0 f0Var = f0VarArrValues[0];
                    throw null;
                }
            }
            String url2 = rVar.getUrl();
            descriptor = url2 != null ? new EsimHyperText.Descriptor(text, new EsimDescriptorValue.Link(url2)) : null;
            if (descriptor != null) {
                arrayList2.add(descriptor);
            }
        }
    }

    public static final in8.a x(rn8.c cVar) {
        in8.b bVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f255518a;
        String str2 = cVar.f255519b;
        in8.b[] bVarArrValues = in8.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (kotlin.text.a0.z(bVar.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (bVar != null) {
            return new in8.a(str, bVar);
        }
        throw new IllegalStateException(a10.b.s("State ", str2, " is not valid for junior device"));
    }

    public static final ArrayList y(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ce8.e> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ce8.e eVar : list2) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            arrayList.add(new vd8.f(eVar.getInvitationId(), eVar.getGuardian().getFirstName(), eVar.getGuardian().getLastName(), eVar.getJunior().getFirstName()));
        }
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final os7.a z(zr7.t r40) {
        /*
            Method dump skipped, instruction units count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ifk.b.z(zr7.t):os7.a");
    }
}
