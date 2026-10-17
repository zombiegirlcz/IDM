package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes23.dex */
public abstract class l8 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rc1.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rc1.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(Coordinate coordinate) {
        if (coordinate == null) {
            return true;
        }
        double latitude = coordinate.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = coordinate.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean b(java.util.List r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
        La:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L40
            r5 = r3
            com.fourthline.orca.internal.eh r5 = (com.fourthline.orca.internal.eh) r5
            boolean r6 = r5.h()
            if (r6 == 0) goto L3e
            if (r2 <= 0) goto L3b
            int r2 = r2 + (-1)
            java.lang.Object r2 = r7.get(r2)
            com.fourthline.orca.internal.eh r2 = (com.fourthline.orca.internal.eh) r2
            com.fourthline.core.DocumentFileSide r6 = r2.a()
            com.fourthline.core.DocumentFileSide r5 = r5.a()
            if (r6 == r5) goto L3e
            boolean r2 = r2.h()
            if (r2 != 0) goto L3e
        L3b:
            r0.add(r3)
        L3e:
            r2 = r4
            goto La
        L40:
            zhm.v.s()
            r7 = 0
            throw r7
        L45:
            boolean r7 = r0.isEmpty()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.l8.b(java.util.List):boolean");
    }

    public static final boolean a(Long l2) {
        return l2 == null || l2.longValue() < new Date().getTime();
    }

    public static final boolean a(Date date) {
        if (date != null) {
            return date.before(a());
        }
        return true;
    }

    private static final Date a() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTime();
    }

    public static final boolean a(List list) {
        if (list != null && !list.isEmpty() && b(list)) {
            if (list.isEmpty()) {
                return true;
            }
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!((eh) it8.next()).g()) {
                }
            }
            return true;
        }
        return false;
    }

    public static final i10 a(xj0 xj0Var, String workflowId, rc1 idvPart) {
        Pair pairA;
        Intrinsics.checkNotNullParameter(xj0Var, "<this>");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(idvPart, "idvPart");
        if (a.$EnumSwitchMapping$0[idvPart.ordinal()] != 1 || (pairA = pc1.a(xj0Var)) == null) {
            return null;
        }
        WorkflowResults.IDV.Person person = (WorkflowResults.IDV.Person) pairA.f186385a;
        nl0 nl0Var = (nl0) pairA.f186386b;
        Json jsonA = s40.a();
        jsonA.getClass();
        return new i10(idvPart, new qy("personDataUpload", workflowId, jsonA.c(nl0.INSTANCE.serializer(), nl0Var)), person);
    }

    public static final i10 a(l81 l81Var, String workflowId, rc1 idvPart) {
        Pair pairA;
        Intrinsics.checkNotNullParameter(l81Var, "<this>");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(idvPart, "idvPart");
        if (a.$EnumSwitchMapping$0[idvPart.ordinal()] != 2 || (pairA = pc1.a(l81Var)) == null) {
            return null;
        }
        WorkflowResults.IDV.TaxInfo taxInfo = (WorkflowResults.IDV.TaxInfo) pairA.f186385a;
        w71 w71Var = (w71) pairA.f186386b;
        Json jsonA = s40.a();
        jsonA.getClass();
        return new i10(idvPart, new qy("tinDataUpload", workflowId, jsonA.c(w71.INSTANCE.serializer(), w71Var)), taxInfo);
    }
}
