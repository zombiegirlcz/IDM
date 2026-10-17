package hx7;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import aw0.o9;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.meshconnect.link.ui.LinkActivity;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.PaymentMethodDetails;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import com.revolut.feature.store.api.model.StoreShopsOffer;
import com.revolut.feature.trading.managed_portfolios.impl.R$plurals;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsInventoryProviderLogos;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyAvailability;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyType;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import dx4.e1;
import e93.j0;
import f2e.a5;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import my8.y;
import nx4.m0;
import nx4.o0;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import xo4.t;
import xod.a0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final jo3.b A(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new jo3.b(dVar.f115082a, dVar.f115083b.f306286a);
    }

    public static final jo3.b B(jo3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new jo3.b(aVar.getAmount(), aVar.getCurrency());
    }

    public static final xo4.i C(ux4.b bVar) {
        t tVar;
        xo4.s sVar;
        xo4.r rVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<ux4.d> list = bVar.f283864a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ux4.d dVar : list) {
            String str = dVar.f283865a;
            String str2 = dVar.f283866b;
            String str3 = dVar.f283867c;
            String str4 = dVar.d;
            boolean z = dVar.e;
            int i = yo4.a.f315552a[dVar.f.ordinal()];
            if (i == 1) {
                tVar = t.ORIGINAL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tVar = t.FORBEARANCE;
            }
            int i2 = yo4.a.f315553b[dVar.f283868g.ordinal()];
            if (i2 == 1) {
                sVar = xo4.s.EXPIRED;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar = xo4.s.CREATED;
            }
            long j2 = dVar.f283869h;
            Long l2 = dVar.i;
            int i3 = yo4.a.f315554c[dVar.f283870j.ordinal()];
            if (i3 == 1) {
                rVar = xo4.r.PDF;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                rVar = xo4.r.HTML;
            }
            arrayList.add(new xo4.o(str, str2, str3, str4, z, tVar, sVar, j2, l2, rVar));
        }
        return new xo4.i(arrayList);
    }

    public static Interval D(AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        ZoneId zoneId = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneId, "systemDefault(...)");
        Intrinsics.checkNotNullParameter(analyticsSpendingPeriod$Interval, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        LocalDate localDate = analyticsSpendingPeriod$Interval.f99210a;
        LocalTime MIN = LocalTime.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(localDate.atTime(MIN), zoneId);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOf, "of(...)");
        DateTime dateTimeH = jli.b.h(zonedDateTimeOf);
        LocalDate localDate2 = analyticsSpendingPeriod$Interval.f99211b;
        LocalTime MAX = LocalTime.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        ZonedDateTime zonedDateTimeOf2 = ZonedDateTime.of(localDate2.atTime(MAX), zoneId);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOf2, "of(...)");
        return new Interval(dateTimeH, jli.b.h(zonedDateTimeOf2));
    }

    public static final List E(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        for (String str2 : d0.n0(str, new String[]{","}, 0, 6)) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            Integer numValueOf = null;
            for (Object obj2 : d0.n0(str2, new String[]{"-"}, 0, 6)) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                String str3 = (String) obj2;
                if (i == 0) {
                    numValueOf = Integer.valueOf(Integer.parseInt(str3));
                } else {
                    arrayList2.add(new Child(Integer.valueOf(Integer.parseInt(str3))));
                }
                i = i2;
            }
            if (numValueOf != null) {
                arrayList.add(new HotelsPropertyRoomOccupancy(numValueOf.intValue(), arrayList2));
            }
        }
        return zhm.d0.d1(arrayList);
    }

    public static final String F(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        StringBuilder sb6 = new StringBuilder();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy = (HotelsPropertyRoomOccupancy) obj2;
            sb6.append(hotelsPropertyRoomOccupancy.f98127a);
            List list3 = hotelsPropertyRoomOccupancy.f98128b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list3) {
                if (((Child) obj3).f98125a != null) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                sb6.append("-" + ((Child) it8.next()).f98125a);
            }
            if (i != list.size() - 1) {
                sb6.append(",");
            }
            arrayList.add(Unit.f186387a);
            i = i2;
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final Clause G(pdh.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (e6f.a.f122995a[cVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.managed_portfolios_templates_header_subtitle_past_week, null, null, 14);
            case 2:
                return new TextLocalisedQuantityClause(R$plurals.managed_portfolios_templates_header_subtitle_past_months, (Number) 1, (List) null, (Style) null, 28);
            case 3:
                return new TextLocalisedQuantityClause(R$plurals.managed_portfolios_templates_header_subtitle_past_months, (Number) 6, (List) null, (Style) null, 28);
            case 4:
                return new TextLocalisedClause(R$string.managed_portfolios_templates_header_subtitle_year_to_date, null, null, 14);
            case 5:
                return new TextLocalisedQuantityClause(R$plurals.managed_portfolios_templates_header_subtitle_past_years, (Number) 1, (List) null, (Style) null, 28);
            case 6:
                return new TextLocalisedQuantityClause(R$plurals.managed_portfolios_templates_header_subtitle_past_years, (Number) 5, (List) null, (Style) null, 28);
            case 7:
                return new TextLocalisedQuantityClause(R$plurals.managed_portfolios_templates_header_subtitle_past_years, (Number) 10, (List) null, (Style) null, 28);
            case 8:
                return new TextLocalisedClause(R$string.managed_portfolios_templates_header_subtitle_all, null, null, 14);
            case 9:
            case 10:
                throw new IllegalArgumentException("Unsupported time span: " + cVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final y H(tt8.l lVar) {
        my8.l lVar2 = lVar.f274294a;
        ArrayList arrayList = lVar.f274295b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(H((tt8.l) it8.next()));
        }
        return new y(lVar2, arrayList2);
    }

    public static final yld.d I(zod.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (a0.f307793a[aVar.ordinal()]) {
            case 1:
            case 2:
                return yld.d.SPENDING;
            case 3:
                return yld.d.NET_BALANCE;
            case 4:
                return yld.d.INCOME;
            case 5:
                return yld.d.CASHFLOW;
            case 6:
                return yld.d.SALES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String J(int i) {
        return a0.d.n("+", i);
    }

    public static efm.r K(efm.r rVar, f9b.f errorView, boolean z, boolean z3, lrk.h hVar, int i) {
        if ((i & 16) != 0) {
            hVar = null;
        }
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        errorView.getClass();
        efm.r rVarCompose = rVar.compose(new f9b.b(z, errorView, hVar, z3));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }

    public static efm.b L(efm.b bVar, f9b.f errorView, boolean z, Function1 function1, int i) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        errorView.getClass();
        efm.b bVarH = bVar.h(new com.google.firebase.messaging.j(errorView, function1, z));
        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
        return bVarH;
    }

    public static efm.k M(rfm.w wVar, f9b.f errorView) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        errorView.getClass();
        efm.k kVarD = wVar.d(new f2i.o(errorView, 18));
        Intrinsics.checkNotNullExpressionValue(kVarD, "compose(...)");
        return kVarD;
    }

    public static efm.r N(efm.r rVar, f9b.f errorView, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        errorView.getClass();
        efm.r rVarCompose = rVar.compose(new f9b.e(errorView, z, z3));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }

    public static efm.d0 O(efm.d0 d0Var, f9b.f errorView, boolean z, Function1 function1, int i) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        errorView.getClass();
        efm.d0 d0VarG = d0Var.g(new f9b.b(errorView, function1, false, z));
        Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
        return d0VarG;
    }

    public static Rect P(List list) {
        Iterator it8 = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it8.hasNext()) {
            Point point = (Point) it8.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    public static String Q(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        return (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) ? "" : strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }

    public static List R(zzf zzfVar) {
        Point[] pointArr = new Point[4];
        double dSin = Math.sin(Math.toRadians(zzfVar.f44571zze));
        double dCos = Math.cos(Math.toRadians(zzfVar.f44571zze));
        pointArr[0] = new Point(zzfVar.f44567zza, zzfVar.f44568zzb);
        double d = zzfVar.f44567zza;
        double d5 = zzfVar.f44569zzc;
        Point point = new Point((int) (d + (d5 * dCos)), (int) ((d5 * dSin) + ((double) zzfVar.f44568zzb)));
        pointArr[1] = point;
        double d6 = point.x;
        int i = zzfVar.f44570zzd;
        pointArr[2] = new Point((int) (d6 - (((double) i) * dSin)), (int) ((((double) i) * dCos) + ((double) pointArr[1].y)));
        Point point2 = pointArr[0];
        int i2 = point2.x;
        Point point3 = pointArr[2];
        int i3 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i3 - point4.x) + i2, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }

    public static final void a(LinkActivity linkActivity, qk.b liveData, Function1 body) {
        Intrinsics.checkNotNullParameter(linkActivity, "<this>");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(body, "body");
        liveData.observe(linkActivity, new aw.h(new js7.c(19, body)));
    }

    public static final String b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        if (strGroup != null) {
            return strGroup;
        }
        throw new IllegalStateException(j6.a.l(i, "Group ", " does not exist"));
    }

    public static oc.b c(Context context) {
        kpj.f fVar;
        synchronized (oc.c.class) {
            try {
                if (oc.c.f224001a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    oc.c.f224001a = new kpj.f(new oc.f(context, 0));
                }
                fVar = oc.c.f224001a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return (oc.b) ((pc.c) fVar.f188258b).zza();
    }

    public static final String d(ipa.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = (String) jVar.get("groupId");
        if (str != null) {
            return str;
        }
        String strC = ipa.k.c(jVar);
        return strC == null ? "" : strC;
    }

    public static final String e(ipa.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = (String) jVar.get("encrypted_content");
        return str == null ? "" : str;
    }

    public static final String f(ipa.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("groupId");
    }

    public static final double g(dj0.d targetPrice, dj0.d currentPrice) {
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        return (((targetPrice.f115082a * 100.0d) / currentPrice.f115082a) - 100.0d) / ((double) 100);
    }

    public static final CompositeClause h(HotelsProperty hotelsProperty, boolean z) {
        HotelsPropertyType hotelsPropertyType;
        String str;
        Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
        if (!z || (hotelsPropertyType = hotelsProperty.d) == null || (str = hotelsPropertyType.f98052b) == null) {
            return null;
        }
        return new CompositeClause(v.k(new TextClause("· ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
    }

    public static final UrlImage i(HotelsProperty hotelsProperty, boolean z, List providers, boolean z3) {
        fgi.a aVar;
        Object next;
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos;
        Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
        Intrinsics.checkNotNullParameter(providers, "providers");
        if (z && (aVar = hotelsProperty.u) != null) {
            Iterator it8 = providers.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((fgi.b) next).f135075a == aVar) {
                    break;
                }
            }
            fgi.b bVar = (fgi.b) next;
            if (bVar != null && (hotelsInventoryProviderLogos = bVar.f135077c) != null) {
                return h9g.e.d(hotelsInventoryProviderLogos, z3);
            }
        }
        return null;
    }

    public static final int j(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(((HotelsPropertyRoomOccupancy) it8.next()).f98127a));
        }
        Iterator it9 = arrayList.iterator();
        if (!it9.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it9.next();
        while (it9.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() + ((Number) it9.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    public static final int k(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(((HotelsPropertyRoomOccupancy) it8.next()).f98128b.size()));
        }
        Iterator it9 = arrayList.iterator();
        if (!it9.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it9.next();
        while (it9.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() + ((Number) it9.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    public static final int l(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<HotelsPropertyRoomOccupancy> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy : list2) {
            arrayList.add(Integer.valueOf(hotelsPropertyRoomOccupancy.f98128b.size() + hotelsPropertyRoomOccupancy.f98127a));
        }
        Iterator it8 = arrayList.iterator();
        if (!it8.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() + ((Number) it8.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    public static final boolean m(HotelsProperty hotelsProperty) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
        HotelsPropertyAvailability hotelsPropertyAvailability = hotelsProperty.f97985h;
        if (hotelsPropertyAvailability != null) {
            if (hotelsPropertyAvailability != null ? hotelsPropertyAvailability.f98000a : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n(hoc.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a().isEmpty() || ((hoc.h) zhm.d0.b0(dVar.a())).getValue().compareTo(((hoc.h) zhm.d0.m0(dVar.a())).getValue()) <= 0;
    }

    public static final boolean o(HotelsProperty hotelsProperty, fgi.a providerId) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        return hotelsProperty.u == providerId;
    }

    public static final List p(Function1 getDefaultErrorItems) {
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
    }

    public static final ArrayList q(List list, List updatedItems) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(updatedItems, "updatedItems");
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Object obj2 : list2) {
            Object obj3 = null;
            if (obj2 instanceof xl2.t) {
                Iterator it8 = updatedItems.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    BackendItem backendItem = (BackendItem) next;
                    if ((backendItem instanceof xl2.t) && Intrinsics.f(((xl2.t) backendItem).getF63711a(), ((xl2.t) obj2).getF63711a())) {
                        obj3 = next;
                        break;
                    }
                }
                obj3 = (BackendItem) obj3;
            }
            if (obj3 != null) {
                obj2 = obj3;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    public static final TransactionsSelectionItem r(FormScreen formScreen) {
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        Object objB0 = zhm.d0.b0(formScreen.f63468b);
        Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem");
        return (TransactionsSelectionItem) objB0;
    }

    public static final c93.l s(v93.c cVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        dj0.d dVarO = mo3.a.o(cVar.getTotal());
        dj0.d dVarO2 = mo3.a.o(cVar.getFee());
        List taxes = cVar.getTaxes();
        j0 j0Var = null;
        if (taxes != null) {
            List<v93.a> list = taxes;
            arrayList = new ArrayList(w.t(list, 10));
            for (v93.a aVar : list) {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                dj0.d dVarO3 = mo3.a.o(aVar.getAmount());
                c93.n nVar = c93.o.Companion;
                String taxName = aVar.getTaxName();
                nVar.getClass();
                arrayList.add(new c93.m(dVarO3, c93.n.a(taxName)));
            }
        } else {
            arrayList = null;
        }
        v93.b quote = cVar.getQuote();
        if (quote != null) {
            Intrinsics.checkNotNullParameter(quote, "<this>");
            dj0.d dVarO4 = mo3.a.o(quote.getPoints());
            j0Var = new j0(dj0.d.c(dVarO4, 0L, xi0.b.a(dVarO4.f115083b, 6), 1), mo3.a.o(quote.getDiscount()), mo3.a.o(quote.getFinalTotal()));
        }
        return new c93.l(dVarO, dVarO2, arrayList, j0Var);
    }

    public static final ServiceProvider t(mp1.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strA = bVar.getId();
        String strC = bVar.getName();
        String strB = bVar.getLogoUrl();
        mp1.a aVarD = bVar.getPaymentMethodDetailsDto();
        Intrinsics.checkNotNullParameter(aVarD, "<this>");
        return new ServiceProvider(strA, strC, strB, new PaymentMethodDetails(aVarD.getAccountNumber()));
    }

    public static final StoreShopsOffer u(a5 a5Var) {
        Intrinsics.checkNotNullParameter(a5Var, "<this>");
        return new StoreShopsOffer(a5Var.f131540a);
    }

    public static final dj0.d v(jo3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        long amount = bVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = bVar.getCurrency();
        aVar.getClass();
        return new dj0.d(amount, xi0.a.a(currency));
    }

    public static final mu3.b w(m04.b bVar) {
        Object next;
        String id10;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List listP0 = zhm.d0.P0(bVar.getTabs().getItems(), new m04.c());
        String id11 = bVar.getTabs().getId();
        String title = bVar.getTitle();
        String description = bVar.getDescription();
        String rightNavBarButtonTitle = bVar.getRightNavBarButtonTitle();
        List<m04.a> list = listP0;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((m04.a) next).getSelected()) {
                break;
            }
        }
        m04.a aVar = (m04.a) next;
        if (aVar == null || (id10 = aVar.getId()) == null) {
            id10 = ((m04.a) zhm.d0.b0(listP0)).getId();
        }
        String str = id10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (m04.a aVar2 : list) {
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            String id12 = aVar2.getId();
            String title2 = aVar2.getTitle();
            String buttonTitle = aVar2.getButtonTitle();
            ArrayList arrayListZ = zhm.d0.Z(aVar2.getItems());
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = arrayListZ.iterator();
            while (it9.hasNext()) {
                e1 e1VarP = o0.p((m0) it9.next(), arrayListZ);
                if (e1VarP != null) {
                    arrayList2.add(e1VarP);
                }
            }
            arrayList.add(new mu3.a(id12, title2, buttonTitle, arrayList2));
        }
        return new mu3.b(id11, title, description, arrayList, rightNavBarButtonTitle, str);
    }

    public static final ux4.b x(xo4.i iVar) {
        ux4.h hVar;
        ux4.g gVar;
        ux4.f fVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        List<xo4.o> documents = iVar.getDocuments();
        ArrayList arrayList = new ArrayList(w.t(documents, 10));
        for (xo4.o oVar : documents) {
            String id10 = oVar.getId();
            String name = oVar.getName();
            String displayName = oVar.getDisplayName();
            String url2 = oVar.getUrl();
            boolean isRead = oVar.getIsRead();
            int i = yo4.a.d[oVar.getType().ordinal()];
            if (i == 1) {
                hVar = ux4.h.ORIGINAL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = ux4.h.FORBEARANCE;
            }
            int i2 = yo4.a.e[oVar.getState().ordinal()];
            if (i2 == 1) {
                gVar = ux4.g.EXPIRED;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = ux4.g.CREATED;
            }
            long createdDate = oVar.getCreatedDate();
            Long signDate = oVar.getSignDate();
            int i3 = yo4.a.f[oVar.getFileType().ordinal()];
            if (i3 == 1) {
                fVar = ux4.f.PDF;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = ux4.f.HTML;
            }
            arrayList.add(new ux4.d(id10, name, displayName, url2, isRead, hVar, gVar, createdDate, signDate, fVar));
        }
        return new ux4.b(arrayList);
    }

    public static final a5 y(StoreShopsOffer storeShopsOffer) {
        Intrinsics.checkNotNullParameter(storeShopsOffer, "<this>");
        return new a5(storeShopsOffer.f88602a);
    }

    public static final v93.c z(c93.l lVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        jo3.a aVarP = mo3.a.p(lVar.f22290a);
        jo3.a aVarP2 = mo3.a.p(lVar.f22291b);
        List list = lVar.f22292c;
        v93.b bVar = null;
        if (list != null) {
            List<c93.m> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (c93.m mVar : list2) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                arrayList.add(new v93.a(mo3.a.p(mVar.f22293a), mVar.f22294b.name()));
            }
        } else {
            arrayList = null;
        }
        j0 j0Var = lVar.d;
        if (j0Var != null) {
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            bVar = new v93.b(mo3.a.p(j0Var.f123876a), mo3.a.p(j0Var.f123877b), mo3.a.p(j0Var.f123878c));
        }
        return new v93.c(aVarP, aVarP2, arrayList, bVar);
    }
}
