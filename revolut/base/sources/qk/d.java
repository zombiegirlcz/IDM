package qk;

import android.hardware.Camera;
import aw0.o9;
import aw0.p8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature_travel_hotels_models.property.cancellation.NoCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import com.revolut.feature_travel_hotels_models.property.room.CancellationWindow;
import com.revolut.kompot.navigable.TransitionAnimation;
import dki.b0;
import dki.c0;
import dki.h0;
import dki.y;
import dki.z;
import do3.q;
import dx4.q3;
import dx4.u1;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.o0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.a0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import m1c.r0;
import m1c.s;
import m2k.f;
import m2k.g;
import m2k.i;
import ml3.u;
import ml3.v;
import nrf.h;
import qlm.g1;
import qlm.h1;
import qlm.i0;
import qlm.o1;
import qlm.p1;
import qlm.w0;
import skm.p0;
import tof.hc;
import tof.q6;
import u91.j;
import vaj.l;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zm3.n;
import zm3.o;
import zm3.p;

/* JADX INFO: loaded from: classes17.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f246926a;

    public static final nrf.e A(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        dj0.d dVarO = mo3.a.o(gVar.getTotal());
        i iVarB = gVar.getTax();
        Intrinsics.checkNotNullParameter(iVarB, "<this>");
        dj0.d dVarO2 = mo3.a.o(iVarB.getTotal());
        List listA = iVarB.getBreakdown();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(z((f) it8.next()));
        }
        jo3.a aVarC = iVarB.getTotalInBaseCurrency();
        h hVar = new h(dVarO2, aVarC != null ? mo3.a.o(aVarC) : null, arrayList);
        m2k.h hVarA = gVar.getFee();
        Intrinsics.checkNotNullParameter(hVarA, "<this>");
        dj0.d dVarO3 = mo3.a.o(hVarA.getTotal());
        boolean zB = hVarA.getIntermediaryFees();
        List listA2 = hVarA.getBreakdown();
        ArrayList arrayList2 = new ArrayList(w.t(listA2, 10));
        Iterator it9 = listA2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(z((f) it9.next()));
        }
        jo3.a aVarD = hVarA.getTotalInBaseCurrency();
        return new nrf.e(dVarO, new nrf.f(dVarO3, zB, arrayList2, aVarD != null ? mo3.a.o(aVarD) : null), hVar);
    }

    public static final taj.i B(vaj.c cVar) {
        taj.e eVar;
        xi0.a aVar = xi0.b.Companion;
        String str = cVar.f287303a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        Instant instant = Instant.parse(cVar.f287304b);
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        l lVar = cVar.f287305c;
        String str2 = lVar.f287315a;
        List<vaj.f> list = lVar.f287316b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (vaj.f fVar : list) {
            arrayList.add(new taj.b(fVar.f287307a, fVar.f287308b, fVar.f287309c));
        }
        List<vaj.i> list2 = lVar.f287317c;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (vaj.i iVar : list2) {
            String str3 = iVar.f287311a;
            taj.e[] eVarArrValues = taj.e.values();
            int length = eVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    eVar = null;
                    break;
                }
                eVar = eVarArrValues[i];
                if (a0.z(eVar.name(), str3, true)) {
                    break;
                }
                i++;
            }
            if (eVar == null) {
                eVar = taj.e.UNKNOWN;
            }
            arrayList2.add(new taj.d(eVar, iVar.f287312b, iVar.f287313c));
        }
        return new taj.i(bVarA, instant, new taj.g(arrayList, arrayList2, str2));
    }

    public static final u91.h C(k91.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        u91.f fVar = u91.g.Companion;
        String id10 = dVar.getCurrentStep();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        u91.g gVar = u91.g.INTRO;
        u91.a aVar = null;
        if (!Intrinsics.f(id10, gVar.getId())) {
            gVar = u91.g.IN_PROGRESS;
            if (!Intrinsics.f(id10, gVar.getId())) {
                gVar = u91.g.SUBMITTED;
                if (!Intrinsics.f(id10, gVar.getId())) {
                    gVar = u91.g.COMPLETED;
                    if (!Intrinsics.f(id10, gVar.getId())) {
                        gVar = null;
                    }
                }
            }
        }
        if (gVar == null) {
            throw new IllegalArgumentException(j6.a.q("Can't parse account switching progress type ", dVar.getCurrentStep()));
        }
        k91.g gVarC = dVar.getEntryPoint();
        h91.a aVar2 = new h91.a(gVarC.getTitle(), gVarC.getSubtitle(), gVarC.getLogoUrl(), gVarC.getDeeplink());
        k91.e eVarA = dVar.getCampaign();
        if (eVarA != null) {
            k91.h hVarA = eVarA.getIncentiveBanner();
            aVar = new u91.a(new j(hVarA.getTitle(), hVarA.getSubtitle(), hVarA.getLogoUrl()), mo3.a.o(eVarA.getIncomeThreshold()));
        }
        return new u91.h(gVar, aVar2, aVar);
    }

    public static final p D(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        v vVar = uVar.f206625b;
        long j2 = uVar.d;
        int i = uVar.f206626c;
        String str = uVar.f206624a;
        int i2 = nl3.b.f216990a[vVar.ordinal()];
        if (i2 == 1) {
            return new o(str, j2, i);
        }
        if (i2 == 2) {
            return new n(str, j2, i);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final DocumentViewerScreenConfig E(q3 q3Var, int i) {
        Intrinsics.checkNotNullParameter(q3Var, "<this>");
        return new DocumentViewerScreenConfig(true, false, ju3.b.INVISIBLE, null, x(i, q3Var.a()), null, 40);
    }

    public static final qta.c F(s46.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        xi0.b bVar = new xi0.b(6, cVar.f259775a.f259779a, null);
        xi0.a aVar = xi0.b.Companion;
        String str = cVar.f259776b;
        aVar.getClass();
        return new qta.c(bVar, xi0.a.a(str), new BigDecimal(cVar.f259777c), new BigDecimal(cVar.d), null, null, null);
    }

    public static final dj0.d G(String currencyCode, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        BigDecimal scale = bigDecimal.setScale(9, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        BigDecimal bigDecimalPow = BigDecimal.TEN.pow(9);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
        BigDecimal bigDecimalMultiply = scale.multiply(bigDecimalPow);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        long jLongValue = bigDecimalMultiply.longValue();
        xi0.b.Companion.getClass();
        return new dj0.d(jLongValue, xi0.b.a(xi0.a.a(currencyCode), 9));
    }

    public static final s4d.c H(z3d.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i = t4d.b.f267974a[fVar.ordinal()];
        if (i == 1) {
            return s4d.c.ADD;
        }
        if (i == 2) {
            return s4d.c.REMOVE;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xul.c I(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        switch (wul.h.f300235b[o0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return xul.c.PENDING;
            case 4:
            case 5:
                return xul.c.CANCELLED_OR_DECLINED;
            case 6:
                return xul.c.COMPLETED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String J(lzi.f fVar) {
        switch (aqj.a.f8468a[fVar.ordinal()]) {
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 7:
                return "SUNDAY";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final lzi.f K(String str) {
        switch (str.hashCode()) {
            case -2015173360:
                if (str.equals("MONDAY")) {
                    return lzi.f.MONDAY;
                }
                break;
            case -1940284966:
                if (str.equals("THURSDAY")) {
                    return lzi.f.THURSDAY;
                }
                break;
            case -1837857328:
                if (str.equals("SUNDAY")) {
                    return lzi.f.SUNDAY;
                }
                break;
            case -1331574855:
                if (str.equals("SATURDAY")) {
                    return lzi.f.SATURDAY;
                }
                break;
            case -259361235:
                if (str.equals("TUESDAY")) {
                    return lzi.f.TUESDAY;
                }
                break;
            case -114841802:
                if (str.equals("WEDNESDAY")) {
                    return lzi.f.WEDNESDAY;
                }
                break;
            case 2082011487:
                if (str.equals("FRIDAY")) {
                    return lzi.f.FRIDAY;
                }
                break;
        }
        throw new IllegalStateException("Unknown analytics cycle weekday: ".concat(str).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r4, kotlin.jvm.functions.Function0 r5) {
        /*
            java.lang.String r0 = "isSystemThemeDark"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r4 == 0) goto L44
            int r0 = r4.hashCode()
            r1 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            java.lang.String r2 = "dark"
            java.lang.String r3 = "light"
            if (r0 == r1) goto L2d
            r5 = 3075958(0x2eef76, float:4.310335E-39)
            if (r0 == r5) goto L26
            r5 = 102970646(0x6233516, float:3.0695894E-35)
            if (r0 == r5) goto L1f
            goto L44
        L1f:
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L43
            goto L44
        L26:
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L44
            goto L42
        L2d:
            java.lang.String r0 = "system"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L36
            goto L44
        L36:
            java.lang.Object r4 = r5.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L43
        L42:
            return r2
        L43:
            return r3
        L44:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.d.a(java.lang.String, kotlin.jvm.functions.Function0):java.lang.String");
    }

    public static final void b(LinkedHashMap linkedHashMap, List list) {
        int size = list.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < size; i++) {
            p8 p8Var = (p8) list.get(i);
            f += p8Var.f10472b;
            linkedHashMap.put(p8Var, Float.valueOf(f));
        }
    }

    public static final List c(List list, eu0.g gVar, float f, float f4) {
        int i = eu0.c.f129456a[gVar.ordinal()];
        if (i == 1) {
            float f5 = f - f4;
            p8 p8Var = (p8) d0.o0(list);
            if (p8Var == null || p8Var.f10471a <= f5) {
                return list;
            }
            return d0.E0(zhm.u.c(new p8(f5, p8Var.f10473c)), list);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float f6 = f + f4;
        p8 p8Var2 = (p8) d0.o0(list);
        if (p8Var2 == null || p8Var2.f10471a >= f6) {
            return list;
        }
        return d0.E0(zhm.u.c(new p8(f6, p8Var2.f10473c)), list);
    }

    public static final k71.i d(String groupId, String str, String str2) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return (str2 == null || str == null) ? str != null ? new k71.d(groupId, str) : str2 != null ? new k71.f(groupId, new hc(str2, null)) : new k71.c(groupId) : new k71.e(groupId, str, new hc(str2, null));
    }

    public static /* synthetic */ k71.i e(int i, String str, String str2, String str3) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return d(str, str2, str3);
    }

    public static final String f(dki.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (uVar instanceof y) {
            y yVar = (y) uVar;
            return "Next(stepType=" + yVar.f115563a.getClass().getSimpleName() + ", addCurrentStepToBackStack=" + yVar.f115564b + ", animation=" + yVar.f115565c + ", executeImmediately=" + yVar.d + ")";
        }
        if (uVar instanceof dki.a) {
            return "Back";
        }
        if (uVar instanceof c0) {
            return "Quit";
        }
        if (uVar instanceof z) {
            return p.a.p("PostFlowResult(dataType=", ((z) uVar).f115566a.getClass().getSimpleName(), ")");
        }
        if (uVar instanceof h0) {
            return "StartPostponedStateRestore";
        }
        if (!(uVar instanceof b0)) {
            throw new NoWhenBranchMatchedException();
        }
        b0 b0Var = (b0) uVar;
        String strP2 = b0Var.f115523a.getU();
        boolean z = b0Var.f115524b;
        TransitionAnimation transitionAnimation = b0Var.f115525c;
        boolean z3 = b0Var.d;
        boolean z4 = b0Var.e;
        StringBuilder sb6 = new StringBuilder("PushControllerCommand(controller=");
        sb6.append(strP2);
        sb6.append(", fromSavedState=");
        sb6.append(z);
        sb6.append(", animation=");
        sb6.append(transitionAnimation);
        sb6.append(", backward=");
        sb6.append(z3);
        sb6.append(", executeImmediately=");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, z4, ")");
    }

    public static final lam.a g(int i) {
        lam.b bVar;
        lam.b bVar2 = lam.b.d;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int i2 = cameraInfo.facing;
        if (i2 == 0) {
            bVar = lam.b.f193471b;
        } else if (i2 == 1) {
            bVar = bVar2;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(j6.a.l(i2, "Lens position ", " is not supported."));
            }
            bVar = lam.b.f193472c;
        }
        return new lam.a(i, bVar, xam.a.D(cameraInfo.orientation), bVar.equals(bVar2));
    }

    public static final oji.e h() {
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        return oji.e.f225788b;
    }

    public static final String j(k71.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof k71.d) {
            return ((k71.d) iVar).f181777c;
        }
        if (iVar instanceof k71.e) {
            return ((k71.e) iVar).f181779c;
        }
        if (iVar instanceof k71.g) {
            return ((k71.g) iVar).f181782b.f272579a;
        }
        if (iVar instanceof k71.h) {
            return ((k71.h) iVar).f181783b.f272579a;
        }
        return null;
    }

    public static final q6 k(k71.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof k71.f) {
            return ((k71.f) iVar).f181781c;
        }
        if (iVar instanceof k71.e) {
            return ((k71.e) iVar).d;
        }
        if (iVar instanceof k71.h) {
            return ((k71.h) iVar).f181784c;
        }
        return null;
    }

    public static final boolean l(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        m1c.u uVar = r0Var.f201448b;
        s sVar = uVar instanceof s ? (s) uVar : null;
        return sVar != null && (sVar.f201451a.isEmpty() ^ true);
    }

    public static boolean m(byte b4) {
        return b4 > -65;
    }

    public static final vkm.d n(wsg.n nVar, xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return rd0.e.b(m70.a.g(nim.a.w(osg.b.e(nVar, false, io3.l.CURRENT, null, null, null, null, accountId, 60), new tpd.b(currency, accountId, 1)), null, new y65.n(16), 1));
    }

    public static final Class o(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return o(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objO = kotlin.collections.d.O(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objO, "first(...)");
            return o((Type) objO);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return o(genericComponentType);
        }
        StringBuilder sb6 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb6.append(type);
        sb6.append(" has type ");
        throw new IllegalArgumentException(h30.l.t(kotlin.jvm.internal.o0.f186429a, type.getClass(), sb6));
    }

    public static final KSerializer p(tlm.e eVar, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer kSerializerA = g1.a(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerA != null) {
            return kSerializerA;
        }
        KClass kClassR = nim.a.r(cls);
        aim.f fVar = o1.f247687a;
        Intrinsics.checkNotNullParameter(kClassR, "<this>");
        KSerializer kSerializer = (KSerializer) o1.f247687a.get(kClassR);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer kSerializerB = eVar.b(kClassR, list);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        if (cls.isInterface()) {
            return new mlm.d(nim.a.r(cls));
        }
        return null;
    }

    public static final KSerializer q(tlm.e eVar, Type type) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer kSerializerR = r(eVar, type, true);
        if (kSerializerR != null) {
            return kSerializerR;
        }
        Class clsO = o(type);
        Intrinsics.checkNotNullParameter(clsO, "<this>");
        throw new SerializationException(h1.e(nim.a.r(clsO)));
    }

    public static final KSerializer r(tlm.e eVar, Type type, boolean z) {
        ArrayList<KSerializer> arrayList;
        KSerializer elementSerializer;
        KSerializer elementSerializer2;
        KClass kClass;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                genericComponentType = (Type) kotlin.collections.d.O(upperBounds);
            }
            Intrinsics.h(genericComponentType);
            if (z) {
                elementSerializer2 = q(eVar, genericComponentType);
            } else {
                elementSerializer2 = s(eVar, genericComponentType);
                if (elementSerializer2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                Intrinsics.i(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                kClass = nim.a.r((Class) rawType);
            } else {
                if (!(genericComponentType instanceof KClass)) {
                    throw new IllegalStateException(h30.l.t(kotlin.jvm.internal.o0.f186429a, genericComponentType.getClass(), new StringBuilder("unsupported type in GenericArray: ")));
                }
                kClass = (KClass) genericComponentType;
            }
            Intrinsics.i(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(elementSerializer2, "elementSerializer");
            return new p1(kClass, elementSerializer2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return p(eVar, cls, f0.f322471a);
            }
            Class<?> componentType = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            if (z) {
                elementSerializer = q(eVar, componentType);
            } else {
                elementSerializer = s(eVar, componentType);
                if (elementSerializer == null) {
                    return null;
                }
            }
            KClass kClass2 = nim.a.r(componentType);
            Intrinsics.checkNotNullParameter(kClass2, "kClass");
            Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
            return new p1(kClass2, elementSerializer);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
                Object objO = kotlin.collections.d.O(upperBounds2);
                Intrinsics.checkNotNullExpressionValue(objO, "first(...)");
                return r(eVar, (Type) objO, true);
            }
            StringBuilder sb6 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb6.append(type);
            sb6.append(" has type ");
            throw new IllegalArgumentException(h30.l.t(kotlin.jvm.internal.o0.f186429a, type.getClass(), sb6));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        Intrinsics.i(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.h(actualTypeArguments);
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                Intrinsics.h(type2);
                arrayList.add(q(eVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                Intrinsics.h(type3);
                KSerializer kSerializerS = s(eVar, type3);
                if (kSerializerS == null) {
                    return null;
                }
                arrayList.add(kSerializerS);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            KSerializer elementSerializer3 = (KSerializer) arrayList.get(0);
            Intrinsics.checkNotNullParameter(elementSerializer3, "elementSerializer");
            return new i0(elementSerializer3, 1);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return nlm.a.a((KSerializer) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return nlm.a.b((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            KSerializer keySerializer = (KSerializer) arrayList.get(0);
            KSerializer valueSerializer = (KSerializer) arrayList.get(1);
            Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
            return new w0(keySerializer, valueSerializer, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            KSerializer keySerializer2 = (KSerializer) arrayList.get(0);
            KSerializer valueSerializer2 = (KSerializer) arrayList.get(1);
            Intrinsics.checkNotNullParameter(keySerializer2, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer2, "valueSerializer");
            return new w0(keySerializer2, valueSerializer2, 1);
        }
        if (r.class.isAssignableFrom(cls2)) {
            KSerializer aSerializer = (KSerializer) arrayList.get(0);
            KSerializer bSerializer = (KSerializer) arrayList.get(1);
            KSerializer cSerializer = (KSerializer) arrayList.get(2);
            Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
            Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
            Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
            return new mlm.a(aSerializer, bSerializer, cSerializer);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (KSerializer kSerializer : arrayList) {
            Intrinsics.i(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(kSerializer);
        }
        return p(eVar, cls2, arrayList2);
    }

    public static final KSerializer s(tlm.e eVar, Type type) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return r(eVar, type, false);
    }

    public static final xfi.a t(CancellationPolicy cancellationPolicy, l80.e dateProvider) {
        Object next;
        Intrinsics.checkNotNullParameter(cancellationPolicy, "<this>");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        boolean z = cancellationPolicy.f98093b;
        ArrayList<CancellationWindow> arrayList = cancellationPolicy.f98094c;
        boolean z3 = cancellationPolicy.f98092a;
        if (!z && !z3) {
            return xfi.c.f305430a;
        }
        if (!z && z3) {
            return xfi.d.f305431a;
        }
        if (!arrayList.isEmpty()) {
            for (CancellationWindow cancellationWindow : arrayList) {
                if (cancellationWindow.d instanceof NoCancellationPenalty) {
                    l80.f fVar = (l80.f) dateProvider;
                    if (fVar.g().isBefore(cancellationWindow.f98096b)) {
                        Iterator it8 = arrayList.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it8.next();
                            CancellationWindow cancellationWindow2 = (CancellationWindow) next;
                            if ((cancellationWindow2.d instanceof NoCancellationPenalty) && fVar.g().isBefore(cancellationWindow2.f98096b)) {
                                break;
                            }
                        }
                        CancellationWindow cancellationWindow3 = (CancellationWindow) next;
                        return cancellationWindow3 != null ? new xfi.b(cancellationWindow3.f98096b) : new xfi.b(null);
                    }
                }
            }
        }
        return xfi.e.f305432a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(kq.g r4, java.util.concurrent.CopyOnWriteArrayList r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof vkm.n
            if (r0 == 0) goto L13
            r0 = r6
            vkm.n r0 = (vkm.n) r0
            int r1 = r0.f290077w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290077w = r1
            goto L18
        L13:
            vkm.n r0 = new vkm.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290077w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.u
            yhm.o.b(r6)
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            v20.c0 r6 = new v20.c0
            r2 = 1
            r6.<init>(r5, r2)
            r0.u = r5
            r0.f290077w = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.d.u(kq.g, java.util.concurrent.CopyOnWriteArrayList, gim.c):java.lang.Object");
    }

    public static final su3.a v(q3 q3Var, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(q3Var, "<this>");
        return new su3.a(q.d(q3Var.b(), l2, l3), q.d(q3Var.c(), l2, l3), q3Var.e(), q3Var.getTitle(), 20);
    }

    public static final u1 w(su3.a aVar, String documentId) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        String str = aVar.f265635a;
        String str2 = aVar.f265636b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = aVar.e;
        if (str3 != null) {
            documentId = str3;
        }
        return new u1(str, str2, documentId);
    }

    public static final TextLocalisedClause x(int i, String str) {
        if (str != null) {
            return new TextLocalisedClause(i, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        return null;
    }

    public static final ArrayList y(vaj.o oVar) {
        taj.i iVarB;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        List list = oVar.f287320a;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            try {
                iVarB = B((vaj.c) it8.next());
            } catch (Exception e) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                iVarB = null;
            }
            if (iVarB != null) {
                arrayList.add(iVarB);
            }
        }
        return arrayList;
    }

    public static final nrf.d z(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String strD = fVar.getShortDescription();
        String strE = fVar.getTitle();
        String strC = fVar.getDescription();
        dj0.d dVarO = mo3.a.o(fVar.getAmount());
        jo3.a aVarB = fVar.getAmountInBaseCurrency();
        return new nrf.d(strD, strE, strC, dVarO, aVarB != null ? mo3.a.o(aVarB) : null, fVar.getType());
    }

    public abstract String i();
}
