package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.q;
import com.google.protobuf.b4;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.R$id;
import d9.e1;
import do3.p;
import do3.r;
import do3.s;
import do3.v;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import le.u1;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import qlm.n1;
import qlm.o1;
import skm.e0;
import twb.b0;
import ukm.i0;
import ukm.j0;
import ukm.x;
import ukm.y;
import ukm.z;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final void A(View view, long j2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.postDelayed(new androidx.view.d(view, 19), j2);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
    public static final do3.n B(jng.l lVar) {
        LocalDate localDate;
        v vVar;
        String str;
        String str2;
        ArrayList arrayList;
        jng.c cVar;
        boolean z;
        v vVar2;
        v vVar3;
        v vVar4;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String strK = lVar.getId();
        String strM = lVar.getIndividualId();
        String strH = lVar.getFirstName();
        String strO = lVar.getMiddleName();
        String strN = lVar.getLastName();
        String strX = lVar.getUsername();
        String strF = lVar.getEmail();
        boolean zG = lVar.getEmailVerified();
        String strP = lVar.getPhone();
        LocalDate localDate2 = lVar.getBirthDate() != null ? LocalDate.parse(lVar.getBirthDate(), DateTimeFormat.forPattern("yyyy/MM/dd")) : null;
        so3.c cVarA = lVar.getAddress();
        Address addressA = cVarA != null ? to3.a.a(cVarA) : null;
        String strS = lVar.getReferralCode();
        s sVar = (s) u1.u(lVar.getState(), vmg.c.f290576a);
        String strW = lVar.getTerminationReason();
        if (strW != null) {
            v[] vVarArrValues = v.values();
            localDate = localDate2;
            int length = vVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    vVar4 = null;
                    break;
                }
                vVar4 = vVarArrValues[i];
                int i2 = length;
                int i3 = i;
                if (a0.z(vVar4.name(), strW, true)) {
                    break;
                }
                i = i3 + 1;
                length = i2;
            }
            vVar = vVar4;
        } else {
            localDate = localDate2;
            vVar = null;
        }
        Integer numR = lVar.getQueuePosition();
        Boolean boolD = lVar.getCanActivate();
        Long lE = lVar.getCreatedDate();
        jng.k kVarL = lVar.getIdentityDetails();
        p pVarC = kVarL != null ? C(kVarL) : null;
        String strB = lVar.getAnnualIncomeRange();
        LocalDate localDate3 = localDate;
        p pVar = pVarC;
        Boolean boolJ = lVar.getHasProfilePicture();
        do3.b.Companion.getClass();
        boolean z3 = true;
        do3.b bVar = do3.b.FULL;
        List listQ = lVar.getProfiles();
        if (listQ != null) {
            List list = listQ;
            str = strK;
            str2 = strM;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                jng.b bVar2 = (jng.b) it8.next();
                boolean zA = bVar2.getDefault();
                List listB = bVar2.getRegisteredIdentities();
                Iterator it9 = it8;
                String str3 = strH;
                String str4 = strO;
                ArrayList arrayList3 = new ArrayList(w.t(listB, 10));
                Iterator it10 = listB.iterator();
                while (it10.hasNext()) {
                    jng.c cVar2 = (jng.c) it10.next();
                    String strE = cVar2.getId();
                    do3.f fVarValueOf = do3.f.valueOf(cVar2.getService());
                    LocalDateTime localDateTimeY = oi0.d.Y(cVar2.getCreatedDate());
                    s sVarValueOf = s.valueOf(cVar2.getState());
                    so3.c cVarA2 = cVar2.getAddress();
                    Address addressA2 = cVarA2 != null ? to3.a.a(cVarA2) : null;
                    jng.k kVarF = cVar2.getIdentityDetails();
                    p pVarC2 = kVarF != null ? C(kVarF) : null;
                    String strK2 = cVar2.getTerminationReason();
                    Iterator it11 = it10;
                    if (strK2 != null) {
                        v[] vVarArrValues2 = v.values();
                        cVar = cVar2;
                        int length2 = vVarArrValues2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length2) {
                                z = z3;
                                vVar3 = null;
                                break;
                            }
                            vVar3 = vVarArrValues2[i5];
                            int i6 = i5;
                            int i21 = length2;
                            z = z3;
                            if (a0.z(vVar3.name(), strK2, z)) {
                                break;
                            }
                            i5 = i6 + 1;
                            z3 = z;
                            length2 = i21;
                        }
                        vVar2 = vVar3;
                    } else {
                        cVar = cVar2;
                        z = z3;
                        vVar2 = null;
                    }
                    String strB2 = cVar.getAnnualIncomeRange();
                    do3.h hVarB = vmg.d.b(cVar.getSalariedUser());
                    jng.f fVarJ = cVar.getStudent();
                    arrayList3.add(new do3.e(strE, fVarValueOf, localDateTimeY, sVarValueOf, addressA2, pVarC2, vVar2, strB2, hVarB, fVarJ != null ? vmg.e.a(fVarJ) : null, cVar.getGraduationId()));
                    z3 = z;
                    it10 = it11;
                }
                arrayList2.add(new r(arrayList3, zA));
                strO = str4;
                it8 = it9;
                strH = str3;
            }
            arrayList = arrayList2;
        } else {
            str = strK;
            str2 = strM;
            arrayList = null;
        }
        String str5 = strH;
        String str6 = strO;
        do3.h hVarB2 = vmg.d.b(lVar.getSalariedUser());
        jng.f fVarV = lVar.getStudent();
        return new do3.n(str, str2, str5, str6, strN, strX, strF, zG, strP, localDate3, addressA, strS, sVar, vVar, numR, boolD, lE, pVar, strB, boolJ, bVar, arrayList, hVarB2, fVarV != null ? vmg.e.a(fVarV) : null, lVar.getGraduationId());
    }

    public static final p C(jng.k kVar) {
        ArrayList arrayList;
        String occupation = kVar.getOccupation();
        List identificationNumbers = kVar.getIdentificationNumbers();
        if (identificationNumbers != null) {
            List<jng.j> list = identificationNumbers;
            arrayList = new ArrayList(w.t(list, 10));
            for (jng.j jVar : list) {
                arrayList.add(new do3.o(jVar.getName(), jVar.getCountry(), jVar.getValue()));
            }
        } else {
            arrayList = null;
        }
        return new p(occupation, arrayList);
    }

    public static final jng.k D(p pVar) {
        ArrayList arrayList;
        String str = pVar.f116428a;
        List list = pVar.f116429b;
        if (list != null) {
            List<do3.o> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (do3.o oVar : list2) {
                arrayList.add(new jng.j(oVar.getName(), oVar.getCountry(), oVar.a()));
            }
        } else {
            arrayList = null;
        }
        return new jng.k(str, arrayList);
    }

    public static final Object E(j0 j0Var, Object obj2) {
        Object objMo3647trySendJP2dKIU = j0Var.mo3647trySendJP2dKIU(obj2);
        if (objMo3647trySendJP2dKIU instanceof y) {
            return ((z) e0.E(kotlin.coroutines.g.f186406a, new b0(j0Var, obj2, (Continuation) null, 20))).f280843a;
        }
        x xVar = z.Companion;
        Unit unit = Unit.f186387a;
        xVar.getClass();
        return unit;
    }

    public static final n1 a(String serialName, olm.f kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (d0.W(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        aim.f fVar = o1.f247687a;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        o1.a(serialName);
        return new n1(serialName, kind);
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strS;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                strS = "null";
            } else {
                try {
                    strS = obj2.toString();
                } catch (Exception e) {
                    String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(obj2.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj2)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strO), (Throwable) e);
                    strS = j6.a.s("<", strO, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strS;
            i2++;
        }
        StringBuilder sb6 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i3, iIndexOf);
            sb6.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb6.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb6.append(" [");
            sb6.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb6.append(", ");
                sb6.append(objArr[i5]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static final String c(Object[] objArr, int i, int i2, zhm.h hVar) {
        StringBuilder sb6 = new StringBuilder((i2 * 3) + 2);
        sb6.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb6.append(", ");
            }
            Object obj2 = objArr[i + i3];
            if (obj2 == hVar) {
                sb6.append("(this Collection)");
            } else {
                sb6.append(obj2);
            }
        }
        sb6.append("]");
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final olm.g d(String serialName, SerialDescriptor[] typeParameters, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (d0.W(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        olm.a aVar = new olm.a(serialName);
        builderAction.invoke(aVar);
        return new olm.g(serialName, olm.k.f226487b, aVar.b().size(), kotlin.collections.d.v0(typeParameters), aVar);
    }

    public static final olm.g e(String serialName, d kind, SerialDescriptor[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (d0.W(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(olm.k.f226487b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        olm.a aVar = new olm.a(serialName);
        builder.invoke(aVar);
        return new olm.g(serialName, kind, aVar.b().size(), kotlin.collections.d.v0(typeParameters), aVar);
    }

    public static final h3 g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        f3 f3VarNewBuilder = h3.newBuilder();
        block.invoke(f3VarNewBuilder);
        w0 w0VarA = f3VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (h3) w0VarA;
    }

    public static final void h(i0 i0Var, Throwable th10) {
        CancellationException cancellationExceptionA = th10 instanceof CancellationException ? (CancellationException) th10 : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = e1.a("Channel was consumed, consumer had failed", th10);
        }
        i0Var.f(cancellationExceptionA);
    }

    public static final ip.a i(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        hf0.a aVarJ = ue0.e.j(context);
        ip.a aVar = aVarJ instanceof ip.a ? (ip.a) aVarJ : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(j6.a.q("GlobalContext must implement interface ", ip.a.class.getCanonicalName()));
    }

    public static ArrayList j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = f0.f322471a;
        }
        ArrayList arrayListZ = zhm.d0.Z(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj2 : arrayListZ) {
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.checkNotNullExpressionValue(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new eg.f0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.f(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static final xoi.e k(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (xoi.e) i(context).f163347b.getValue();
    }

    public static final jri.f l(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (jri.f) i(context).f163348c.getValue();
    }

    public static final lki.r m(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_modalContainer_tag);
        if (tag2 instanceof lki.r) {
            return (lki.r) tag2;
        }
        return null;
    }

    public static final com.revolut.kompot.navigable.a n(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.controller_tag);
        if (tag2 instanceof com.revolut.kompot.navigable.a) {
            return (com.revolut.kompot.navigable.a) tag2;
        }
        return null;
    }

    public static final void o(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        rv0.j jVarA = kli.c.a(view);
        if (jVarA != null) {
            ((sv0.c) jVarA).h(view);
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void p(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (d.j(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (!PlatformVersion.isAtLeastQ()) {
            Tasks.forResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new q(context, z, taskCompletionSource).run();
        taskCompletionSource.getTask();
    }

    public static final boolean q(View view, View ancestor) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(ancestor, "ancestor");
        Object parent = view.getParent();
        while (parent != null) {
            if (parent == ancestor) {
                return true;
            }
            View view2 = parent instanceof View ? (View) parent : null;
            parent = view2 != null ? view2.getParent() : null;
        }
        return false;
    }

    public static final d4 r(h3 h3Var, String key, h3 other, Function2 merge) {
        Intrinsics.checkNotNullParameter(h3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(merge, "merge");
        fb.c merge2 = new fb.c(merge, key, 13);
        Intrinsics.checkNotNullParameter(h3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(merge2, "merge");
        return (d4) merge2.invoke(h3Var.containsFields(key) ? h3Var.getFieldsOrThrow(key) : null, other.containsFields(key) ? other.getFieldsOrThrow(key) : null);
    }

    public static final f3 s(f3 f3Var, String key, d4 d4Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (d4Var == null) {
            return f3Var;
        }
        f3Var.i(key, d4Var);
        Intrinsics.checkNotNullExpressionValue(f3Var, "putFields(...)");
        return f3Var;
    }

    public static final f3 t(f3 f3Var, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (bool == null) {
            return f3Var;
        }
        b4 b4VarNewBuilder = d4.newBuilder();
        boolean zBooleanValue = bool.booleanValue();
        b4VarNewBuilder.c();
        ((d4) b4VarNewBuilder.f49761b).setBoolValue(zBooleanValue);
        f3Var.i(key, (d4) b4VarNewBuilder.a());
        Intrinsics.checkNotNullExpressionValue(f3Var, "putFields(...)");
        return f3Var;
    }

    public static final f3 u(f3 f3Var, String key, Double d) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (d == null) {
            return f3Var;
        }
        b4 b4VarNewBuilder = d4.newBuilder();
        double dDoubleValue = d.doubleValue();
        b4VarNewBuilder.c();
        ((d4) b4VarNewBuilder.f49761b).setNumberValue(dDoubleValue);
        f3Var.i(key, (d4) b4VarNewBuilder.a());
        Intrinsics.checkNotNullExpressionValue(f3Var, "putFields(...)");
        return f3Var;
    }

    public static final f3 v(f3 f3Var, String key, Integer num) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return x(f3Var, key, num != null ? String.valueOf(num.intValue()) : null);
    }

    public static final f3 w(f3 f3Var, String key, Long l2) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return x(f3Var, key, l2 != null ? String.valueOf(l2.longValue()) : null);
    }

    public static final f3 x(f3 f3Var, String key, String str) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null) {
            return f3Var;
        }
        b4 b4VarNewBuilder = d4.newBuilder();
        b4VarNewBuilder.h(str);
        f3Var.i(key, (d4) b4VarNewBuilder.a());
        Intrinsics.checkNotNullExpressionValue(f3Var, "putFields(...)");
        return f3Var;
    }

    public static final void z(int i, int i2, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i < i2) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i] = null;
            i++;
        }
    }

    public void y(Context context, b bVar, Registry registry) {
    }
}
