package ue8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import mf8.e;
import mf8.f;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f279314a = r0.k(new Pair("NONE", mf8.d.NONE), new Pair("PENDING", mf8.d.PENDING), new Pair("PASSED", mf8.d.PASSED), new Pair("FAILED", mf8.d.FAILED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f279315b = r0.k(new Pair("GUARDIAN_SYNC", mf8.c.GUARDIAN_SYNC), new Pair("SUSPICIOUS_DETAILS", mf8.c.SUSPICIOUS_DETAILS), new Pair("FORBIDDEN_NAME", mf8.c.FORBIDDEN_NAME), new Pair("UNKNOWN", mf8.c.UNKNOWN));

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public static final f a(we8.b bVar) {
        we8.c cVar;
        mf8.d dVar;
        mf8.b bVar2;
        String status;
        Object next;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String userId = bVar.getUserId();
        we8.a kyc2 = bVar.getKyc();
        Intrinsics.checkNotNullParameter(kyc2, "<this>");
        List elements = kyc2.getElements();
        if (elements != null) {
            Iterator it8 = elements.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (a0.z(((we8.c) next).getCode(), "IDENTITY", true)) {
                    break;
                }
            }
            cVar = (we8.c) next;
        } else {
            cVar = null;
        }
        ?? r06 = f279314a;
        if (cVar == null || (status = cVar.getStatus()) == null || (dVar = (mf8.d) u1.t(status, mf8.d.PASSED, r06)) == null) {
            dVar = mf8.d.PASSED;
        }
        mf8.d dVar2 = (mf8.d) u1.t(kyc2.getStatus(), mf8.d.FAILED, r06);
        String reason = kyc2.getReason();
        mf8.c cVar2 = reason != null ? (mf8.c) u1.v(reason, f279315b) : null;
        List missingDataPoints = kyc2.getMissingDataPoints();
        if (missingDataPoints == null) {
            missingDataPoints = f0.f322471a;
        }
        List<String> list = missingDataPoints;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (String str : list) {
            mf8.b[] bVarArrValues = mf8.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar2 = null;
                    break;
                }
                bVar2 = bVarArrValues[i];
                if (a0.z(bVar2.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (bVar2 == null) {
                bVar2 = mf8.b.UNKNOWN;
            }
            arrayList.add(bVar2);
        }
        return new f(userId, new e(dVar2, cVar2, arrayList, dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ue8.b.b(java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<f> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (f fVar : list2) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            String str = fVar.f204964a;
            e eVar = fVar.f204965b;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            mf8.d dVar = eVar.f204961a;
            ?? r72 = f279314a;
            String strG = u1.g(dVar, r72);
            mf8.c cVar = eVar.f204962b;
            String strG2 = cVar != null ? u1.g(cVar, f279315b) : null;
            List list3 = eVar.f204963c;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((mf8.b) it8.next()).name());
            }
            arrayList.add(new bf8.b(str, new bf8.a(strG, strG2, arrayList2, u.c(new bf8.c(u1.g(eVar.d, r72))))));
        }
        return arrayList;
    }
}
