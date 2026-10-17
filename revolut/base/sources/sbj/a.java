package sbj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.text.a0;
import wk5.c;
import wk5.d;
import wk5.e;
import wk5.f;
import wk5.g;
import wk5.h;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f261592a = r0.k(new Pair("CREATED", g.CREATED), new Pair("PRE_CHECK", g.PRE_CHECK), new Pair("PENDING_VALIDATION", g.PENDING_VALIDATION), new Pair("VALIDATED", g.VALIDATED), new Pair("PENDING_VALIDATION_FAILED", g.PENDING_VALIDATION_FAILED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f261593b = r0.k(new Pair("EXCHANGE", h.EXCHANGE), new Pair("SELF_HOSTED", h.SELF_HOSTED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f261594c = r0.k(new Pair("MANUAL", d.MANUAL), new Pair("MANUAL_VERIFIED", d.MANUAL_VERIFIED), new Pair("REVOLUT", d.REVOLUT), new Pair("TRUST", d.TRUST));
    public static final Object d = r0.k(new Pair("PENDING", f.PENDING), new Pair("VERIFIED", f.VERIFIED));
    public static final Object e = r0.k(new Pair("SELF_ATTESTATION", e.SELF_ATTESTATION), new Pair("MESH", e.MESH), new Pair("MESH_TRANSFER", e.MESH_TRANSFER), new Pair("ADDITIONAL_DETAILS", e.ADDITIONAL_DETAILS));
    public static final Object f = r0.k(new Pair("EXCHANGE_BLACKLIST_MATCH", yk5.f.EXCHANGE_BLACKLIST_MATCH), new Pair("RISK_DETECTED", yk5.f.RISK_DETECTED), new Pair("TRANSACTION_MONITORING_DECLINED", yk5.f.TRANSACTION_MONITORING_DECLINED), new Pair("TRAVEL_RULE_DATA_JURISDICTION_REQ_FAILED", yk5.f.TRAVEL_RULE_DATA_JURISDICTION_REQ_FAILED), new Pair("UNSUPPORTED_ASSET", yk5.f.UNSUPPORTED_ASSET), new Pair("UNSUPPORTED_EMT", yk5.f.UNSUPPORTED_EMT), new Pair("CURRENCY_DELISTED", yk5.f.CURRENCY_DELISTED), new Pair("GAMBLING_BLOCK", yk5.f.GAMBLING_BLOCK), new Pair("USER_RESTRICTED", yk5.f.USER_RESTRICTED), new Pair("UNKNOWN", yk5.f.UNKNOWN));

    public static final ArrayList a(String str, List list) {
        c cVar;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (String str2 : list2) {
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i];
                if (a0.z(cVar.name(), str2, true)) {
                    break;
                }
                i++;
            }
            if (cVar == null) {
                cVar = c.UNKNOWN;
                IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Counterparty requiredFields has an unrecognised ", str, " identifier: ", str2));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
