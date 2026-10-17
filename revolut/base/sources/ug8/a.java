package ug8;

import ig8.e;
import ig8.g;
import ig8.h;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import le.u1;
import rd0.c;
import rd0.d;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final h a(String str, String str2) {
        e eVar;
        int iHashCode = str.hashCode();
        if (iHashCode != 1054696960) {
            if (iHashCode != 1820239614) {
                if (iHashCode == 1982485311 && str.equals("CONFIRMED")) {
                    return h.b.f161091a;
                }
            } else if (str.equals("COMPLETION_STARTED")) {
                return h.a.f161090a;
            }
        } else if (str.equals("COMPLETION_FAILED")) {
            if (str2 != null) {
                eVar = (e) u1.v(str2, b());
                if (eVar == null) {
                    eVar = e.UNKNOWN;
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("failureReason is null while state is COMPLETION_FAILED");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, illegalStateException, h0Var);
                eVar = e.UNKNOWN;
            }
            return new g(eVar);
        }
        throw new IllegalStateException(p.a.p("Unknown state = ", str, " for graduation "));
    }

    public static final Map b() {
        return r0.k(new Pair("INACTIVE_ACCOUNT", e.INACTIVE_ACCOUNT), new Pair("UNVERIFIED_ACCOUNT", e.UNVERIFIED_ACCOUNT), new Pair("NEGATIVE_BALANCE", e.NEGATIVE_BALANCE), new Pair("DECLINED_TRANSFER", e.DECLINED_TRANSFER));
    }
}
