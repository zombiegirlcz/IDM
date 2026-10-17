package i2b;

import android.content.Context;
import aw0.o9;
import ce8.c;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$color;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.common.models.domain.DeFiRate;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature.salary_switch.impl.models.v2.Employer;
import com.revolut.feature.salary_switch.impl.models.v2.Identification;
import com.revolut.feature.salary_switch.impl.models.v2.Institution;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoom;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import com.revolut.feature_travel_hotels_models.property.room.OccupancyRates;
import com.revolut.feature_travel_hotels_models.property.room.Rates;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import dj0.d;
import do3.n;
import g9f.g;
import gqc.r;
import gqc.x;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import jcl.e;
import kg.o;
import koi.j;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import org.joda.time.DateTime;
import pak.h;
import pf8.k;
import ql4.e0;
import ql4.n0;
import ql4.r0;
import qn2.i;
import tx.f;
import ux9.s;
import ux9.t;
import xv.q;
import yn4.b;
import yn4.l;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final ArrayList A(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new vd8.c(cVar.getRequestId(), cVar.getJuniorId()));
        }
        return arrayList;
    }

    public static final ql4.a B(b bVar) {
        r0 r0Var;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        d dVarO = mo3.a.o(bVar.getMaxPlanAmount());
        d dVarO2 = mo3.a.o(bVar.getMinTransactionAmount());
        List listH = bVar.getTransactionIds();
        List listF = bVar.getTagAvailableTransactionIds();
        String strI = bVar.getTransactionSelectionRule();
        r0[] r0VarArrValues = r0.values();
        int length = r0VarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                r0Var = null;
                break;
            }
            r0Var = r0VarArrValues[i2];
            if (a0.z(r0Var.name(), strI, true)) {
                break;
            }
            i2++;
        }
        if (r0Var == null) {
            r0Var = r0.SINGLE_TRANSACTION;
        }
        r0 r0Var2 = r0Var;
        String strB = bVar.getEligibilityStatus();
        e0[] e0VarArrValues = e0.values();
        int length2 = e0VarArrValues.length;
        while (true) {
            if (i >= length2) {
                e0Var = null;
                break;
            }
            e0Var = e0VarArrValues[i];
            if (a0.z(e0Var.name(), strB, true)) {
                break;
            }
            i++;
        }
        if (e0Var == null) {
            e0Var = e0.INELIGIBLE;
        }
        e0 e0Var2 = e0Var;
        l lVarC = bVar.getIneligibility();
        n0 n0VarP = lVarC != null ? zn4.c.p(lVarC) : null;
        List listG = bVar.getTerms();
        List listA = bVar.getDocuments();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(zn4.c.c((yn4.c) it8.next()));
        }
        return new ql4.a(dVarO, dVarO2, listH, listF, r0Var2, e0Var2, n0VarP, listG, arrayList);
    }

    public static final ArrayList C(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<fo4.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (fo4.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new sl4.d(cVar.getTitle(), cVar.getDescription(), cVar.getLogoUrl(), cVar.getDeepLink(), cVar.getAnalyticsRef()));
        }
        return arrayList;
    }

    public static final ArrayList D(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<de8.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (de8.b bVar : list2) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new vd8.c(bVar.getRequestId(), bVar.getJuniorId()));
        }
        return arrayList;
    }

    public static final g E(u8f.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = e9f.a.f123980a[dVar.ordinal()];
        if (i == 1) {
            return g.IN;
        }
        if (i == 2) {
            return g.OUT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Transfer direction must be selected before making a network request");
    }

    public static final ArrayList F(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<vd8.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (vd8.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new de8.b(cVar.f287821a, cVar.f287822b));
        }
        return arrayList;
    }

    public static final e G(ubl.a aVar) {
        jcl.a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f278928a;
        String str2 = aVar.f278929b;
        Long l2 = aVar.f278930c;
        String str3 = aVar.d;
        String str4 = aVar.e;
        String str5 = aVar.f;
        String str6 = aVar.f278931g;
        jcl.g gVar = null;
        if (str6 != null) {
            o oVarA = zbl.a.a();
            Type type = new TypeToken<jcl.a>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.DeprecatedEntityMapperKt$toEntity$lambda$3$$inlined$fromJsonNullable$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            aVar2 = (jcl.a) oVarA.d(str6, type);
        } else {
            aVar2 = null;
        }
        String str7 = aVar.f278932h;
        if (str7 != null) {
            o oVarA2 = zbl.a.a();
            Type type2 = new TypeToken<jcl.g>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.DeprecatedEntityMapperKt$toEntity$lambda$4$$inlined$fromJsonNullable$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            gVar = (jcl.g) oVarA2.d(str7, type2);
        }
        return new e(str, str2, l2, str3, str4, str5, aVar2, gVar);
    }

    public static final kcl.b H(ubl.b bVar) {
        jo3.b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f278933a;
        String str2 = bVar.f278934b;
        Lazy lazy = zbl.a.f320963a;
        String str3 = bVar.f278935c;
        o oVarA = zbl.a.a();
        Type type = new TypeToken<List<? extends jcl.d>>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.DeprecatedEntityMapperKt$toEntity$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str3, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        List list = (List) objD;
        String str4 = bVar.d;
        if (str4 != null) {
            o oVarA2 = zbl.a.a();
            Type type2 = new TypeToken<jo3.b>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.DeprecatedEntityMapperKt$toEntity$lambda$0$$inlined$fromJsonNullable$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            bVar2 = (jo3.b) oVarA2.d(str4, type2);
        } else {
            bVar2 = null;
        }
        String str5 = bVar.e;
        o oVarA3 = zbl.a.a();
        Type type3 = new TypeToken<lcl.b>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.DeprecatedEntityMapperKt$toEntity$$inlined$fromJson$2
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        Object objD2 = oVarA3.d(str5, type3);
        Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
        lcl.b bVar3 = (lcl.b) objD2;
        String str6 = bVar.f;
        o oVarA4 = zbl.a.a();
        Type type4 = new TypeToken<kcl.a>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.DeprecatedEntityMapperKt$toEntity$$inlined$fromJson$3
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        Object objD3 = oVarA4.d(str6, type4);
        Intrinsics.checkNotNullExpressionValue(objD3, "fromJson(...)");
        kcl.a aVar = (kcl.a) objD3;
        String str7 = bVar.f278936g;
        o oVarA5 = zbl.a.a();
        Type type5 = new TypeToken<kcl.c>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.DeprecatedEntityMapperKt$toEntity$$inlined$fromJson$4
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
        Object objD4 = oVarA5.d(str7, type5);
        Intrinsics.checkNotNullExpressionValue(objD4, "fromJson(...)");
        kcl.c cVar = (kcl.c) objD4;
        Long l2 = bVar.f278937h;
        DateTime dateTime = l2 != null ? new DateTime(l2.longValue()) : null;
        Long l3 = bVar.i;
        return new kcl.b(str, str2, list, bVar2, bVar3, aVar, cVar, dateTime, l3 != null ? new DateTime(l3.longValue()) : null);
    }

    public static final String J(RoomOccupancy roomOccupancy) {
        Intrinsics.checkNotNullParameter(roomOccupancy, "<this>");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(roomOccupancy.f98119a);
        Iterator it8 = roomOccupancy.f98120b.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            sb6.append("-");
            sb6.append(iIntValue);
        }
        return sb6.toString();
    }

    public static final String K(mn2.a aVar, wn2.d dVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = i.f247859b[aVar.ordinal()];
        if (i == 1) {
            return "NL_OVERSTAP";
        }
        if (i == 2) {
            int i2 = dVar == null ? -1 : i.f247858a[dVar.ordinal()];
            if (i2 == -1) {
                return "GB_CASS";
            }
            if (i2 == 1) {
                return "GB_CASS_FULL";
            }
            if (i2 == 2) {
                return "GB_CASS_PARTIAL";
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = dVar == null ? -1 : i.f247858a[dVar.ordinal()];
        if (i3 == -1) {
            return "FR_MOBILITY";
        }
        if (i3 == 1) {
            return "FR_MOBILITY_FULL";
        }
        if (i3 == 2) {
            return "FR_MOBILITY_PARTIAL";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r2.equals("GB_CASS_FULL") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        return mn2.a.CASS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r2.equals("FR_MOBILITY_FULL") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r2.equals("FR_MOBILITY_PARTIAL") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return mn2.a.MOBILITY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.equals("GB_CASS_PARTIAL") != false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final mn2.a M(java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -294999584: goto L35;
                case 216542832: goto L2c;
                case 338994316: goto L21;
                case 924771973: goto L16;
                case 1229925956: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L40
        Ld:
            java.lang.String r0 = "GB_CASS_PARTIAL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
            goto L29
        L16:
            java.lang.String r0 = "NL_OVERSTAP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
            mn2.a r2 = mn2.a.OVERSTAP
            return r2
        L21:
            java.lang.String r0 = "GB_CASS_FULL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
        L29:
            mn2.a r2 = mn2.a.CASS
            return r2
        L2c:
            java.lang.String r0 = "FR_MOBILITY_FULL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
            goto L3d
        L35:
            java.lang.String r0 = "FR_MOBILITY_PARTIAL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
        L3d:
            mn2.a r2 = mn2.a.MOBILITY
            return r2
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown Switch Method: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2b.a.M(java.lang.String):mn2.a");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r2.equals("GB_CASS_FULL") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r2.equals("FR_MOBILITY_FULL") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return wn2.d.FULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r2.equals("FR_MOBILITY_PARTIAL") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        return wn2.d.PARTIAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.equals("GB_CASS_PARTIAL") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final wn2.d N(java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -294999584: goto L34;
                case 216542832: goto L29;
                case 338994316: goto L20;
                case 924771973: goto L16;
                case 1229925956: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "GB_CASS_PARTIAL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
            goto L3c
        L16:
            java.lang.String r0 = "NL_OVERSTAP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
            r2 = 0
            return r2
        L20:
            java.lang.String r0 = "GB_CASS_FULL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
            goto L31
        L29:
            java.lang.String r0 = "FR_MOBILITY_FULL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
        L31:
            wn2.d r2 = wn2.d.FULL
            return r2
        L34:
            java.lang.String r0 = "FR_MOBILITY_PARTIAL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
        L3c:
            wn2.d r2 = wn2.d.PARTIAL
            return r2
        L3f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown Switch Method: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2b.a.N(java.lang.String):wn2.d");
    }

    public static final void P(String listId, String extractedValue, String str, Function2 updateFieldValue) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(updateFieldValue, "updateFieldValue");
        if (!a0.H(listId, "ACCOUNT_FIELD_ID_MASK_PREFIX_", false)) {
            updateFieldValue.invoke(a0.D(listId, "ACCOUNT_FIELD_ID_PREFIX_", "", false), extractedValue);
        } else if (str != null) {
            updateFieldValue.invoke(a0.D(listId, "ACCOUNT_FIELD_ID_MASK_PREFIX_", "", false), extractedValue);
        }
    }

    public static final String a(hxf.c cVar) {
        List list = cVar.d;
        String strK0 = list != null ? d0.k0(list, ",", null, null, 0, new f(8), 30) : null;
        hxf.d dVar = cVar.f156590a;
        return "state=" + (dVar != null ? dVar.name() : null) + ";count=" + cVar.f156591b + ";startFrom=" + cVar.f156592c + ";products=" + strK0;
    }

    public static TextClause b(String time) {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            String str = LocalTime.parse(time).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(locale));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } catch (Exception unused) {
            return new TextClause(time, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    public static final dsh.e c(Map values) {
        Intrinsics.checkNotNullParameter(values, "values");
        dsh.f fVar = new dsh.f();
        for (Map.Entry entry : values.entrySet()) {
            fVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new dsh.e(fVar);
    }

    public static final Object d(Json json, qlm.e deserializer, InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        h hVar = new h(stream);
        try {
            return ebm.a.i(json, deserializer, hVar);
        } finally {
            hVar.m();
        }
    }

    public static final ArrayList e(ArrayList arrayList, n user) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            t tVar = (t) obj2;
            if (!(tVar instanceof s) || !Intrinsics.f(((s) tVar).f283949c, user.f)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final boolean f(TakeProfitStopLoss takeProfitStopLoss) {
        if (takeProfitStopLoss == null || !takeProfitStopLoss.f72159a) {
            return false;
        }
        return (takeProfitStopLoss.f72160b == null && takeProfitStopLoss.f72161c == null) ? false : true;
    }

    public static final boolean h(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        int i = pf8.l.f235519a[kVar.f235518a.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.time.LocalDateTime] */
    public static final boolean i(l80.e eVar, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        return jli.b.g(dateTime).toLocalDateTime().isAfter(oi0.d.Z(((l80.f) eVar).b()).minus(1L, (TemporalUnit) ChronoUnit.MONTHS));
    }

    public static final boolean k(Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return data.getContent() == null;
    }

    public static final boolean l(Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return data.getContent() != null;
    }

    public static final boolean m(wel.e eVar) {
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        ArrayList<kel.g> arrayList = eVar.e;
        if (arrayList == null || !arrayList.isEmpty()) {
            for (kel.g gVar : arrayList) {
                if ((gVar instanceof kel.n) && ((kel.n) gVar).f183174b.compareTo(BigDecimal.ZERO) != 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        ArrayList<kel.g> arrayList2 = eVar.e;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            for (kel.g gVar2 : arrayList2) {
                if ((gVar2 instanceof kel.b) && ((kel.b) gVar2).f183149b.f(d.e)) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        return z || z3;
    }

    public static final boolean n(xv.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (!(lVar instanceof xv.k)) {
            return false;
        }
        Iterable<q> iterableA = lVar.a();
        if ((iterableA instanceof Collection) && ((Collection) iterableA).isEmpty()) {
            return true;
        }
        for (q qVar : iterableA) {
            if (!qVar.d() && !qVar.c()) {
                return false;
            }
        }
        return true;
    }

    public static final List o(List list, List list2) {
        return (list == null || list2 == null) ? list2 == null ? list == null ? f0.f322471a : list : list2 : d0.d1(d0.j1(list, list2));
    }

    public static final List p(List list, j jVar) {
        return (list == null || jVar == null) ? jVar != null ? u.c(jVar) : list == null ? f0.f322471a : list : d0.F0(jVar, list);
    }

    public static final List q(j jVar, List list) {
        return (jVar == null || list == null) ? list == null ? jVar != null ? u.c(jVar) : f0.f322471a : list : d0.d1(d0.j1(u.c(jVar), list));
    }

    public static final List r(j jVar, j jVar2) {
        j[] elements = {jVar, jVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static final kr0.c s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zQ = kli.a.q(context);
        return new kr0.c(context.getColor(zQ ? R$color.internal_white : R$color.internal_accent), zQ);
    }

    public static final ArrayList t(List list, List rooms) {
        BedOptionSelection bedOptionSelection;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            TravelHotelsRoomsInformation travelHotelsRoomsInformation = (TravelHotelsRoomsInformation) it8.next();
            Iterator it9 = rooms.iterator();
            while (true) {
                bedOptionSelection = null;
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((HotelsPropertyRoom) next).f98098a, travelHotelsRoomsInformation.f97938a)) {
                    break;
                }
            }
            HotelsPropertyRoom hotelsPropertyRoom = (HotelsPropertyRoom) next;
            if (hotelsPropertyRoom != null) {
                Iterator it10 = hotelsPropertyRoom.e.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it10.next();
                    if (Intrinsics.f(((Rates) next2).f98115a, travelHotelsRoomsInformation.f97940c)) {
                        break;
                    }
                }
                Rates rates = (Rates) next2;
                if (rates != null) {
                    Iterator it11 = rates.f.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it11.next();
                        OccupancyRates occupancyRates = (OccupancyRates) next3;
                        if (Intrinsics.f(J(occupancyRates.f98112a), travelHotelsRoomsInformation.d)) {
                            Iterator it12 = occupancyRates.f98113b.iterator();
                            while (true) {
                                if (!it12.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it12.next();
                                if (Intrinsics.f(((BedOption) next4).f98087a, travelHotelsRoomsInformation.f97939b)) {
                                    break;
                                }
                            }
                            if (next4 != null) {
                                break;
                            }
                        }
                    }
                    OccupancyRates occupancyRates2 = (OccupancyRates) next3;
                    if (occupancyRates2 != null) {
                        HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = new HotelsPropertyRoomOccupancyRatesSelection(hotelsPropertyRoom, rates, occupancyRates2);
                        for (BedOption bedOption : occupancyRates2.f98113b) {
                            if (Intrinsics.f(bedOption.f98087a, travelHotelsRoomsInformation.f97939b)) {
                                bedOptionSelection = new BedOptionSelection(hotelsPropertyRoomOccupancyRatesSelection, bedOption);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
            if (bedOptionSelection != null) {
                arrayList.add(bedOptionSelection);
            }
        }
        return arrayList;
    }

    public static final bqc.k u(String str) {
        bqc.k kVar;
        bqc.k[] kVarArrValues = bqc.k.values();
        int length = kVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i];
            if (a0.z(kVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException(j6.a.q("Unknown state ", str));
    }

    public static final DeFiRate v(c36.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        c36.c cVar = qVar.f20910a;
        String str = cVar.f20897a;
        String str2 = cVar.f20898b;
        c36.c cVar2 = qVar.f20911b;
        return new DeFiRate(str, str2, cVar2.f20897a, cVar2.f20898b, new BigDecimal(qVar.f20912c));
    }

    public static final Employer w(r rVar) {
        kqc.d dVar;
        kqc.b bVar;
        String str = rVar.f145660a;
        kqc.b[] bVarArrValues = kqc.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            dVar = null;
            if (i2 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i2];
            if (a0.z(bVar.name(), str, true)) {
                break;
            }
            i2++;
        }
        if (bVar == null) {
            bVar = kqc.b.UNKNOWN;
        }
        String str2 = rVar.f145661b;
        x xVar = rVar.f145662c;
        String str3 = xVar.f145668a;
        kqc.d[] dVarArrValues = kqc.d.values();
        int length2 = dVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            kqc.d dVar2 = dVarArrValues[i];
            if (a0.z(dVar2.name(), str3, true)) {
                dVar = dVar2;
                break;
            }
            i++;
        }
        if (dVar == null) {
            dVar = kqc.d.UNKNOWN;
        }
        return new Employer(bVar, str2, new Identification(dVar, xVar.f145669b, xVar.f145670c));
    }

    public static final Institution x(gqc.a0 a0Var) {
        kqc.e eVar;
        String str = a0Var.f145616a;
        kqc.e[] eVarArrValues = kqc.e.values();
        int length = eVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i];
            if (a0.z(eVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (eVar == null) {
            eVar = kqc.e.UNKNOWN;
        }
        return new Institution(eVar, a0Var.f145617b, a0Var.f145618c);
    }

    public static final CustomAsset y(rsj.a aVar) {
        vzi.b bVar;
        d dVar;
        vzi.c cVar;
        vzi.i iVar;
        vzi.i iVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f257085a;
        String str2 = aVar.f257086b;
        vzi.b[] bVarArrValues = vzi.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (a0.z(bVar.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (bVar == null) {
            bVar = vzi.b.UNKNOWN;
        }
        vzi.b bVar2 = bVar;
        jo3.b bVar3 = aVar.f257087c;
        if (bVar3 != null) {
            long amount = bVar3.getAmount();
            xi0.a aVar2 = xi0.b.Companion;
            String currency = bVar3.getCurrency();
            aVar2.getClass();
            dVar = new d(amount, xi0.a.a(currency));
        } else {
            dVar = null;
        }
        List<rsj.e> list = aVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (rsj.e eVar : list) {
            LocalDate localDate = LocalDate.parse(eVar.f257098a);
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            long j2 = eVar.f257099b;
            xi0.a aVar3 = xi0.b.Companion;
            String str3 = eVar.f257100c;
            aVar3.getClass();
            d dVar2 = new d(j2, xi0.a.a(str3));
            String str4 = eVar.d;
            vzi.i[] iVarArrValues = vzi.i.values();
            int length2 = iVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    iVar2 = null;
                    break;
                }
                iVar2 = iVarArrValues[i2];
                if (a0.z(iVar2.name(), str4, true)) {
                    break;
                }
                i2++;
            }
            if (iVar2 == null) {
                iVar2 = vzi.i.USER;
            }
            arrayList.add(new ValueHistoryEntry(localDate, dVar2, iVar2));
        }
        Long l2 = aVar.f;
        ZonedDateTime zonedDateTimeM = l2 != null ? pu7.a.M(l2.longValue(), g0m.a.f139502a) : null;
        long j3 = aVar.f257088g;
        ZoneId zoneId = g0m.a.f139502a;
        ZonedDateTime zonedDateTimeM2 = pu7.a.M(j3, zoneId);
        ZonedDateTime zonedDateTimeM3 = pu7.a.M(aVar.f257089h, zoneId);
        String str5 = aVar.i;
        vzi.c[] cVarArrValues = vzi.c.values();
        int length3 = cVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i3];
            if (a0.z(cVar.name(), str5, true)) {
                break;
            }
            i3++;
        }
        if (cVar == null) {
            cVar = vzi.c.UNKNOWN;
        }
        vzi.c cVar2 = cVar;
        Map map = aVar.d;
        String str6 = aVar.f257090j;
        vzi.i[] iVarArrValues2 = vzi.i.values();
        int length4 = iVarArrValues2.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length4) {
                iVar = null;
                break;
            }
            vzi.i iVar3 = iVarArrValues2[i5];
            if (a0.z(iVar3.name(), str6, true)) {
                iVar = iVar3;
                break;
            }
            i5++;
        }
        if (iVar == null) {
            iVar = vzi.i.USER;
        }
        return new CustomAsset(str, bVar2, dVar, arrayList, zonedDateTimeM, zonedDateTimeM2, zonedDateTimeM3, cVar2, map, iVar, aVar.k, aVar.f257091l);
    }
}
