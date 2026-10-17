package nfk;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t0;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f215084a;

    static {
        String str;
        jha.d[] dVarArrValues = jha.d.values();
        int iB = q0.b(dVarArrValues.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (jha.d dVar : dVarArrValues) {
            switch (a.f215083a[dVar.ordinal()]) {
                case 1:
                    str = "EU";
                    break;
                case 2:
                    str = "SG";
                    break;
                case 3:
                    str = "US";
                    break;
                case 4:
                    str = "JP";
                    break;
                case 5:
                    str = "AU";
                    break;
                case 6:
                    m70.a.c(t0.f186434a);
                    str = "";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            linkedHashMap.put(str, dVar);
        }
        f215084a = linkedHashMap;
    }

    private b() {
    }
}
