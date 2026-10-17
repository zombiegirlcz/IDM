package oi0;

import com.fasterxml.jackson.databind.JavaType;
import com.revolut.feature.credit.card.api.models.limit_history.CreditCardLimitHistoryItem;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassAdmission;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import dalvik.system.BaseDexClassLoader;
import dfl.q;
import eel.k;
import efm.r;
import iel.h;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.r0;
import k9.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineDispatcher;
import mhd.p0;
import nx4.m0;
import nx4.m2;
import nx4.o0;
import oq9.l;
import oq9.m;
import oq9.n;
import oq9.o;
import oq9.p;
import oq9.s;
import org.joda.time.DateTime;
import oti.b1;
import oti.e1;
import oti.y0;
import qv0.i;
import rv6.e;
import skm.e0;
import tb4.t;
import tji.f;
import v6i.g;
import yhm.m;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d {
    public static final boolean A(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        DateTime dateTime = hVar.f160787h;
        return dateTime != null ? dateTime.isBeforeNow() : hVar.f160784b.isBefore(LocalDate.now());
    }

    public static final boolean B(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var == r0.RECURRING;
    }

    public static final boolean C(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            return ((l) oVar).f227840h;
        }
        if (oVar instanceof m) {
            return ((m) oVar).f227845h;
        }
        if (oVar instanceof n) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean D(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var == r0.STOP;
    }

    public static final boolean F(o oVar, do3.n user) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        if (oVar instanceof l) {
            return pq9.a.b(((l) oVar).d, user);
        }
        if (oVar instanceof m) {
            return pq9.a.b(((m) oVar).d, user);
        }
        if (oVar instanceof n) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean G(o oVar, do3.n user) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        if (oVar instanceof l) {
            return pq9.a.c(((l) oVar).d, user);
        }
        if (oVar instanceof m) {
            return pq9.a.c(((m) oVar).d, user);
        }
        if (oVar instanceof n) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void I(f dialogDisplayer, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        if (z) {
            dialogDisplayer.e(z3 ? 0L : 1000L);
        } else {
            dialogDisplayer.c();
        }
    }

    public static final e J(f dialogDisplayer, tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return dialogDisplayer.d(dialogModel);
    }

    public static final oge.a K(nie.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new oge.a(cVar.getF89728b(), cVar.getF89727a());
    }

    public static final CreditCardLimitHistoryItem L(bo4.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        dj0.d dVarO = mo3.a.o(aVar.getAmount());
        LocalDate localDateB = aVar.getDate();
        jo3.a aVarC = aVar.getDelta();
        return new CreditCardLimitHistoryItem(dVarO, aVarC != null ? mo3.a.o(aVarC) : null, localDateB);
    }

    public static final AsftPass M(b1 b1Var) {
        bti.n nVar;
        String str;
        bti.n nVar2;
        ArrayList arrayList;
        AsftPassRefundBreakdown asftPassRefundBreakdown;
        bti.m mVar;
        bti.l lVar;
        bti.l lVar2;
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        String str2 = b1Var.f229602a;
        Long l2 = b1Var.f229613r;
        String str3 = b1Var.f229603b;
        bti.n[] nVarArrValues = bti.n.values();
        int length = nVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArrValues[i];
            if (a0.z(nVar.name(), str3, true)) {
                break;
            }
            i++;
        }
        if (nVar == null) {
            nVar = bti.n.UNKNOWN;
        }
        bti.n nVar3 = nVar;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(b1Var.f229604c);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(b1Var.d);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        String str4 = b1Var.e;
        String str5 = b1Var.f;
        String str6 = b1Var.f229605g;
        String str7 = b1Var.f229606h;
        String str8 = b1Var.i;
        TimeZone timeZoneN = nz8.d.N(b1Var.f229607j);
        String str9 = b1Var.k;
        String str10 = b1Var.f229608l;
        Long l3 = b1Var.f229609m;
        Instant instantOfEpochMilli3 = l3 != null ? Instant.ofEpochMilli(l3.longValue()) : null;
        Long l4 = b1Var.f229610n;
        Instant instantOfEpochMilli4 = l4 != null ? Instant.ofEpochMilli(l4.longValue()) : null;
        String str11 = b1Var.o;
        OffsetDateTime offsetDateTime = str11 != null ? OffsetDateTime.parse(str11) : null;
        wi0.a aVar = wi0.b.Companion;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        String str12 = b1Var.f229611p;
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str12);
        int i2 = b1Var.f229612q;
        Instant instantOfEpochMilli5 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        int i3 = b1Var.f229614s;
        List list = b1Var.f229615t;
        if (list != null) {
            List list2 = list;
            str = str2;
            nVar2 = nVar3;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                y0 y0Var = (y0) it8.next();
                Intrinsics.checkNotNullParameter(y0Var, "<this>");
                Iterator it9 = it8;
                String str13 = y0Var.f229706a;
                Instant instant = instantOfEpochMilli;
                bti.m[] mVarArrValues = bti.m.values();
                String str14 = str4;
                int length2 = mVarArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        mVar = null;
                        break;
                    }
                    mVar = mVarArrValues[i5];
                    int i6 = i5;
                    int i21 = length2;
                    if (a0.z(mVar.name(), str13, true)) {
                        break;
                    }
                    i5 = i6 + 1;
                    length2 = i21;
                }
                if (mVar == null) {
                    mVar = bti.m.UNKNOWN;
                }
                bti.m mVar2 = mVar;
                String str15 = y0Var.f229707b;
                if (str15 != null) {
                    bti.l[] lVarArrValues = bti.l.values();
                    int length3 = lVarArrValues.length;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= length3) {
                            lVar2 = null;
                            break;
                        }
                        lVar2 = lVarArrValues[i22];
                        int i32 = i22;
                        int i33 = length3;
                        if (a0.z(lVar2.name(), str15, true)) {
                            break;
                        }
                        i22 = i32 + 1;
                        length3 = i33;
                    }
                    lVar = lVar2;
                } else {
                    lVar = null;
                }
                String str16 = y0Var.f229708c;
                Instant instantOfEpochMilli6 = Instant.ofEpochMilli(y0Var.d);
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli6, "ofEpochMilli(...)");
                arrayList.add(new AsftPassAdmission(mVar2, lVar, str16, instantOfEpochMilli6, y0Var.e, y0Var.f));
                str5 = str5;
                it8 = it9;
                instantOfEpochMilli = instant;
                str4 = str14;
            }
        } else {
            str = str2;
            nVar2 = nVar3;
            arrayList = null;
        }
        Instant instant2 = instantOfEpochMilli;
        String str17 = str4;
        String str18 = str5;
        e1 e1Var = b1Var.u;
        if (e1Var != null) {
            Intrinsics.checkNotNullParameter(e1Var, "<this>");
            asftPassRefundBreakdown = new AsftPassRefundBreakdown(mo3.a.o(e1Var.f229632b), e1Var.f229631a);
        } else {
            asftPassRefundBreakdown = null;
        }
        return new AsftPass(str, nVar2, instant2, instantOfEpochMilli2, str17, str18, str6, str7, str8, timeZoneN, str9, str10, instantOfEpochMilli3, instantOfEpochMilli4, offsetDateTime2, bVarA, i2, instantOfEpochMilli5, i3, arrayList, asftPassRefundBreakdown);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    public static final cv3.a N(t14.a aVar) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? arrayList3;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strI = aVar.getTitle();
        String strC = aVar.getDescription();
        String strH = aVar.getTag();
        List listF = aVar.getSecondSubtitles();
        if (listF != null) {
            List list = listF;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(o0.o((m2) it8.next()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        List listE = aVar.getItems();
        if (listE != null) {
            ArrayList arrayListZ = d0.Z(listE);
            arrayList2 = new ArrayList();
            Iterator it9 = arrayListZ.iterator();
            while (it9.hasNext()) {
                dx4.e1 e1VarP = o0.p((m0) it9.next(), arrayListZ);
                if (e1VarP != null) {
                    arrayList2.add(e1VarP);
                }
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        ?? r62 = arrayList2;
        List listA = aVar.getBottomItems();
        if (listA != null) {
            ArrayList arrayListZ2 = d0.Z(listA);
            arrayList3 = new ArrayList();
            Iterator it10 = arrayListZ2.iterator();
            while (it10.hasNext()) {
                dx4.e1 e1VarP2 = o0.p((m0) it10.next(), arrayListZ2);
                if (e1VarP2 != null) {
                    arrayList3.add(e1VarP2);
                }
            }
        } else {
            arrayList3 = f0.f322471a;
        }
        return new cv3.a(strI, strC, strH, arrayList4, r62, arrayList3, aVar.getDisclaimer(), aVar.getButtonTitle(), aVar.getSecondaryButtonTitle());
    }

    public static final vke.c O(oke.b bVar, vke.d type) {
        vke.a bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        String strD = bVar.getId();
        String strF = bVar.getTitle();
        String strE = bVar.getSubtitle();
        String strC = bVar.getIcon();
        boolean zB = bVar.getCloseable();
        oke.a aVarA = bVar.getAction();
        if (aVarA instanceof oke.e) {
            bVar2 = new vke.e(((oke.e) bVar.getAction()).getUri(), ((oke.e) bVar.getAction()).getTitle());
        } else {
            if (aVarA instanceof oke.c) {
                String strA = ((oke.c) bVar.getAction()).getHtml();
                oke.d dVarB = ((oke.c) bVar.getAction()).getLink();
                bVar2 = new vke.b(strA, dVarB != null ? new a80.d(dVarB.getTitle(), dVarB.getUri(), 1) : null);
            } else {
                bVar2 = null;
            }
        }
        return new vke.c(strD, zB, strF, type, strE, bVar2, strC);
    }

    public static final b1 P(AsftPass asftPass) {
        String str;
        String str2;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(asftPass, "<this>");
        String str3 = asftPass.f98713a;
        String strName = asftPass.f98714b.name();
        long epochMilli = asftPass.f98715c.toEpochMilli();
        long epochMilli2 = asftPass.d.toEpochMilli();
        String str4 = asftPass.e;
        String str5 = asftPass.f;
        String str6 = asftPass.f98716g;
        String str7 = asftPass.f98717h;
        String str8 = asftPass.i;
        TimeZone timeZone = asftPass.f98718j;
        Intrinsics.checkNotNullParameter(timeZone, "<this>");
        String string = timeZone.toZoneId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String str9 = asftPass.k;
        String str10 = asftPass.f98719l;
        Instant instant = asftPass.f98720m;
        e1 e1Var = null;
        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
        Instant instant2 = asftPass.f98721n;
        Long lValueOf2 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
        OffsetDateTime offsetDateTime = asftPass.o;
        String string2 = offsetDateTime != null ? offsetDateTime.toString() : null;
        String str11 = asftPass.f98722p.f297794a;
        int i = asftPass.f98723q;
        Instant instant3 = asftPass.f98724r;
        Long lValueOf3 = instant3 != null ? Long.valueOf(instant3.toEpochMilli()) : null;
        int i2 = asftPass.f98725s;
        List list = asftPass.f98726t;
        if (list != null) {
            List list2 = list;
            str = str3;
            str2 = strName;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                AsftPassAdmission asftPassAdmission = (AsftPassAdmission) it8.next();
                Intrinsics.checkNotNullParameter(asftPassAdmission, "<this>");
                Iterator it9 = it8;
                String strName2 = asftPassAdmission.f98727a.name();
                bti.l lVar = asftPassAdmission.f98728b;
                arrayList.add(new y0(strName2, lVar != null ? lVar.name() : null, asftPassAdmission.f98729c, asftPassAdmission.e, asftPassAdmission.d.toEpochMilli(), asftPassAdmission.f));
                it8 = it9;
            }
        } else {
            str = str3;
            str2 = strName;
            arrayList = null;
        }
        AsftPassRefundBreakdown asftPassRefundBreakdown = asftPass.u;
        if (asftPassRefundBreakdown != null) {
            Intrinsics.checkNotNullParameter(asftPassRefundBreakdown, "<this>");
            e1Var = new e1(mo3.a.p(asftPassRefundBreakdown.f98731b), asftPassRefundBreakdown.f98730a);
        }
        return new b1(str, str2, epochMilli, epochMilli2, str4, str5, str6, str7, str8, string, str9, str10, lValueOf, lValueOf2, string2, str11, i, lValueOf3, i2, arrayList, e1Var);
    }

    public static final long Q(LocalDateTime localDateTime, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return localDateTime.atZone(zoneId).toInstant().toEpochMilli();
    }

    public static /* synthetic */ long R(LocalDateTime localDateTime) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return Q(localDateTime, zoneIdSystemDefault);
    }

    public static final String S(LocationDomain locationDomain) {
        Intrinsics.checkNotNullParameter(locationDomain, "<this>");
        return locationDomain.f78066a + "," + locationDomain.f78067b;
    }

    public static h3a.m T(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new h3a.m(null, iVar);
    }

    public static ArrayList U(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new h3a.m(null, (i) it8.next()));
        }
        return arrayList;
    }

    public static final LocalDate V(Instant instant, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        LocalDate localDateFrom = LocalDate.from((TemporalAccessor) ZonedDateTime.ofInstant(instant, zoneId));
        Intrinsics.checkNotNullExpressionValue(localDateFrom, "from(...)");
        return localDateFrom;
    }

    public static /* synthetic */ LocalDate W(Instant instant) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return V(instant, zoneIdSystemDefault);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.time.LocalDateTime] */
    public static final LocalDateTime X(long j2, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        ?? localDateTime = Instant.ofEpochMilli(j2).atZone(zoneId).toLocalDateTime();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        return localDateTime;
    }

    public static /* synthetic */ LocalDateTime Y(long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return X(j2, zoneIdSystemDefault);
    }

    public static LocalDateTime Z(Instant instant) {
        ZoneId zoneId = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneId, "systemDefault(...)");
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        LocalDateTime localDateTimeFrom = LocalDateTime.from((TemporalAccessor) ZonedDateTime.ofInstant(instant, zoneId));
        Intrinsics.checkNotNullExpressionValue(localDateTimeFrom, "from(...)");
        return localDateTimeFrom;
    }

    public static final boolean a(Enum r06, Object obj2) {
        return obj2 == null || obj2.equals(r06);
    }

    public static final dj0.d a0(dfl.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new dj0.d(aVar.f114177a, aVar.f114178b);
    }

    public static final void b(ClassLoader classLoader) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(classLoader);
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Field declaredField2 = obj2.getClass().getDeclaredField("nativeLibraryPathElements");
        declaredField2.setAccessible(true);
        Object obj3 = declaredField2.get(obj2);
        Object obj4 = obj3 instanceof Object[] ? (Object[]) obj3 : null;
        if (obj4 == null) {
            throw new IllegalStateException("nativeLibraryPathElements is not an array");
        }
        Object[] objArr = (Object[]) obj4.clone();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = (objArr.length / 2) - 1;
        if (length >= 0) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            int length2 = objArr.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj5 = objArr[i];
                    objArr[i] = objArr[length2];
                    objArr[length2] = obj5;
                    length2--;
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (declaredField2.get(obj2) == obj4) {
            declaredField2.set(obj2, objArr);
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "NativeLibraryPathPatcher", "Native library path repair skipped: nativeLibraryPathElements changed concurrently", null, null, 16);
        }
    }

    public static final g b0(j8l.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = y6i.a.f311313a[dVar.ordinal()];
        if (i == 1) {
            return g.BUY;
        }
        if (i == 2) {
            return g.SELL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            o oVar = (o) obj2;
            if ((oVar instanceof l) || (oVar instanceof m)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final long c0(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        ZoneId zoneId = g0m.a.f139502a;
        return Q(localDateTime, g0m.a.f139502a);
    }

    public static final dfl.a d(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (dfl.a) qVar;
    }

    public static final LocalDateTime d0(long j2) {
        ZoneId zoneId = g0m.a.f139502a;
        return X(j2, g0m.a.f139502a);
    }

    public static final ArrayList e(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(M((b1) it8.next()));
        }
        return arrayList;
    }

    public static final void e0(r rVar, String sectionName) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
    }

    public static final long f(LocalDateTime localDateTime, LocalDateTime other) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ChronoUnit.DAYS.between(localDateTime, other);
    }

    public static final boolean f0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            if (uj3.b.b(kotlin.text.d0.t0(str, kotlin.ranges.f.o(0, 9))) == kotlin.text.a.a(str.charAt(9)) && uj3.b.b(kotlin.text.d0.t0(str, kotlin.ranges.f.o(13, 19))) == kotlin.text.a.a(str.charAt(19))) {
                if (uj3.b.b(kotlin.text.d0.t0(str, kotlin.ranges.f.o(21, 27))) == kotlin.text.a.a(str.charAt(27))) {
                    return true;
                }
            }
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            Object objA = yhm.o.a(th10);
            if (yhm.m.a(objA) == null) {
            }
        }
        return false;
    }

    public static final Object g0(f fVar, CoroutineDispatcher coroutineDispatcher, Function1 function1, Continuation continuation) {
        return e0.J(coroutineDispatcher, new p0(fVar, function1, null, 5), continuation);
    }

    public static final o h(String code, List list) {
        Object next;
        boolean zF;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            o oVar = (o) next;
            if (oVar instanceof l) {
                zF = Intrinsics.f(pq9.a.a(((l) oVar).d), code);
            } else if (oVar instanceof oq9.m) {
                zF = Intrinsics.f(pq9.a.a(((oq9.m) oVar).d), code);
            } else {
                if (!(oVar instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                zF = false;
            }
            if (zF) {
                break;
            }
        }
        return (o) next;
    }

    public static final String i(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return A(hVar) ? hVar.f : hVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(zjh.f r4, java.lang.String r5, xi0.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof emc.b
            if (r0 == 0) goto L13
            r0 = r7
            emc.b r0 = (emc.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            emc.b r0 = new emc.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            efm.r r4 = r4.B(r5, r7)
            emc.c r7 = new kotlin.jvm.internal.h0() { // from class: emc.c
                static {
                    /*
                        emc.c r0 = new emc.c
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:emc.c) emc.c.f emc.c
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: emc.c.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.String r0 = "getBaseCurrency()Lcom/revolut/core/model/currency/Currency;"
                        r1 = 0
                        java.lang.Class<alc.n> r2 = alc.n.class
                        java.lang.String r3 = "baseCurrency"
                        r4.<init>(r2, r3, r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: emc.c.<init>():void");
                }

                @Override // kotlin.jvm.internal.h0, wim.p
                public final java.lang.Object get(java.lang.Object r1) {
                    /*
                        r0 = this;
                        alc.n r1 = (alc.n) r1
                        xi0.b r1 = r1.i
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: emc.c.get(java.lang.Object):java.lang.Object");
                }
            }
            efm.r r4 = nim.a.w(r4, r7)
            emc.a r7 = new emc.a
            r2 = 0
            r7.<init>(r5, r6, r2)
            r5 = 0
            r6 = 2
            efm.r r4 = m70.a.g(r4, r7, r5, r6)
            efm.d0 r4 = r4.firstOrError()
            java.lang.String r5 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.v = r3
            java.lang.Object r7 = nim.a.b(r4, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oi0.d.j(zjh.f, java.lang.String, xi0.b, gim.c):java.lang.Object");
    }

    public static final String k(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            return pq9.a.a(((l) oVar).d);
        }
        if (oVar instanceof oq9.m) {
            return pq9.a.a(((oq9.m) oVar).d);
        }
        if (oVar instanceof n) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final oq9.r l(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            return ((l) oVar).d;
        }
        if (oVar instanceof oq9.m) {
            return ((oq9.m) oVar).d;
        }
        if (oVar instanceof n) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final wi0.b m(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            return ((l) oVar).f227839g;
        }
        if (oVar instanceof oq9.m) {
            return ((oq9.m) oVar).f227844g;
        }
        if (oVar instanceof n) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String n(yg0.a r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Throwable r4 = r4.f313481b
            boolean r0 = r4 instanceof com.revolut.core.mobile_services.api.exceptions.MsApiException
            r1 = 0
            if (r0 == 0) goto L10
            r0 = r4
            com.revolut.core.mobile_services.api.exceptions.MsApiException r0 = (com.revolut.core.mobile_services.api.exceptions.MsApiException) r0
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L24
            jh0.b r0 = r0.f51387a
            if (r0 == 0) goto L24
            jh0.b r2 = jh0.b.UNKNOWN
            if (r0 == r2) goto L1c
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.toString()
            goto L25
        L24:
            r0 = r1
        L25:
            java.lang.String r2 = r4.getMessage()
            if (r2 == 0) goto L32
            boolean r3 = kotlin.text.d0.W(r2)
            if (r3 != 0) goto L32
            r1 = r2
        L32:
            java.lang.Class r4 = r4.getClass()
            kotlin.jvm.internal.p0 r2 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KClass r4 = r2.b(r4)
            java.lang.String r4 = r4.m()
            if (r4 != 0) goto L44
            java.lang.String r4 = "anonymous class"
        L44:
            if (r0 != 0) goto L4a
            if (r1 != 0) goto L49
            return r4
        L49:
            return r1
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi0.d.n(yg0.a):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(w39.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof rwc.a
            if (r0 == 0) goto L13
            r0 = r7
            rwc.a r0 = (rwc.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rwc.a r0 = new rwc.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            goto L48
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Long r7 = new java.lang.Long     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            r4 = 10000(0x2710, double:4.9407E-320)
            r7.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            z39.b r6 = (z39.b) r6     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            ufm.i r6 = r6.c(r7)     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            r0.v = r3     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            java.lang.Object r7 = nim.a.b(r6, r0)     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            if (r7 != r1) goto L48
            return r1
        L48:
            od0.i r7 = (od0.i) r7     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            java.lang.Object r6 = r7.g()     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            com.revolut.feature.location.api.domain.models.location.LocationDomain r6 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r6     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> L53
            return r6
        L51:
            r6 = move-exception
            goto L55
        L53:
            r6 = 0
            return r6
        L55:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oi0.d.o(w39.b, gim.c):java.lang.Object");
    }

    public static final String p(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            l lVar = (l) oVar;
            return kotlin.text.d0.F0(lVar.e + " " + lVar.f).toString();
        }
        if (!(oVar instanceof oq9.m)) {
            if (oVar instanceof n) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        oq9.m mVar = (oq9.m) oVar;
        return kotlin.text.d0.F0(mVar.e + " " + mVar.f).toString();
    }

    public static final String q(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            oq9.r rVar = ((l) oVar).d;
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            if (rVar instanceof s) {
                return ((s) rVar).f227852a;
            }
            return null;
        }
        if (!(oVar instanceof oq9.m)) {
            if (oVar instanceof n) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        oq9.r rVar2 = ((oq9.m) oVar).d;
        Intrinsics.checkNotNullParameter(rVar2, "<this>");
        if (rVar2 instanceof s) {
            return ((s) rVar2).f227852a;
        }
        return null;
    }

    public static final String r(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            return ((l) oVar).e;
        }
        if (oVar instanceof oq9.m) {
            return ((oq9.m) oVar).e;
        }
        if (oVar instanceof n) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j7i.a s(AccountWrapper topAccount, AccountWrapper bottomAccount, c7i.f rule) {
        Intrinsics.checkNotNullParameter(topAccount, "topAccount");
        Intrinsics.checkNotNullParameter(bottomAccount, "bottomAccount");
        Intrinsics.checkNotNullParameter(rule, "rule");
        int i = j7i.b.f171920a[rule.ordinal()];
        if (i == 1) {
            return new j7i.a(topAccount, bottomAccount);
        }
        if (i == 2) {
            return new j7i.a(bottomAccount, topAccount);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String t(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            oq9.r rVar = ((l) oVar).d;
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            if (rVar instanceof p) {
                return ((p) rVar).f227849b;
            }
            return null;
        }
        if (!(oVar instanceof oq9.m)) {
            if (oVar instanceof n) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        oq9.r rVar2 = ((oq9.m) oVar).d;
        Intrinsics.checkNotNullParameter(rVar2, "<this>");
        if (rVar2 instanceof p) {
            return ((p) rVar2).f227849b;
        }
        return null;
    }

    public static final void u(f dialogDisplayer) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        dialogDisplayer.a();
    }

    public static final void v(f dialogDisplayer, tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        dialogDisplayer.b(dialogModel);
    }

    public static final vii.b w(vii.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.a(Unit.f186387a, w4l.h.f294642c);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final boolean x(k kVar) {
        ej0.b bVar;
        BigDecimal bigDecimal;
        if (kVar != null) {
            eel.h hVar = kVar.d;
            List list = kVar.f125232a;
            int i = l4h.m.f192139a[kVar.e.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eel.g gVar = (eel.g) hVar;
                BigDecimal bigDecimal2 = gVar != null ? gVar.f125231a : null;
                if (bigDecimal2 == null) {
                    eel.l lVar = (eel.l) d0.d0(list);
                    if (lVar != null) {
                        bigDecimal2 = ((eel.g) lVar.f125239c).f125231a;
                        eel.l lVar2 = (eel.l) d0.o0(list);
                        return lVar2 != null || (bigDecimal = ((eel.g) lVar2.f125239c).f125231a) == null || bigDecimal.compareTo(bigDecimal2) >= 0;
                    }
                } else {
                    eel.l lVar22 = (eel.l) d0.o0(list);
                    if (lVar22 != null) {
                    }
                }
                return true;
            }
            eel.f fVar = (eel.f) hVar;
            ej0.b bVar2 = fVar != null ? fVar.f125230a : null;
            if (bVar2 == null) {
                eel.l lVar3 = (eel.l) d0.d0(list);
                if (lVar3 != null) {
                    bVar2 = ((eel.f) lVar3.f125239c).f125230a;
                    eel.l lVar4 = (eel.l) d0.o0(list);
                    return lVar4 != null || (bVar = ((eel.f) lVar4.f125239c).f125230a) == null || bVar.compareTo(bVar2) >= 0;
                }
            } else {
                eel.l lVar42 = (eel.l) d0.o0(list);
                if (lVar42 != null) {
                }
            }
        }
        return true;
    }

    public static final boolean y(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var == r0.LIMIT;
    }

    public static final boolean z(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var == r0.MARKET;
    }

    public abstract d E(Class cls, k9.k kVar);

    public abstract k9.k H(Class cls);

    public t g(JavaType javaType, v vVar, k9.d dVar) {
        k9.k kVarI = vVar.i(javaType, dVar);
        return new t(kVarI, E(javaType.f26182a, kVarI), 4);
    }
}
