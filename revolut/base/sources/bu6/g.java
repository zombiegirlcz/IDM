package bu6;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f18689a = r0.k(new Pair("ACTIVE", es6.c.ACTIVE), new Pair("CLOSED", es6.c.CLOSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18690b = r0.k(new Pair("FIXED_PERCENTAGE", es6.b.FIXED_PERCENTAGE), new Pair("PER_PRODUCT_PERCENTAGE", es6.b.PER_PRODUCT_PERCENTAGE), new Pair("DISABLED", es6.b.DISABLED));

    public static final es6.d a(xt6.a aVar) {
        es6.b bVar;
        es6.c cVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        String moneyBoxId = aVar.getMoneyBoxId();
        String state = aVar.getState();
        es6.c[] cVarArrValues = es6.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            bVar = null;
            if (i2 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i2];
            if (a0.z(cVar.name(), state, true)) {
                break;
            }
            i2++;
        }
        if (cVar == null) {
            cVar = es6.c.UNKNOWN;
        }
        es6.c cVar2 = cVar;
        String automaticAllocation = aVar.getAutomaticAllocation();
        es6.b[] bVarArrValues = es6.b.values();
        int length2 = bVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            es6.b bVar2 = bVarArrValues[i];
            if (a0.z(bVar2.name(), automaticAllocation, true)) {
                bVar = bVar2;
                break;
            }
            i++;
        }
        if (bVar == null) {
            bVar = es6.b.UNKNOWN;
        }
        return new es6.d(id10, moneyBoxId, cVar2, bVar, aVar.getFixedAllocationRate());
    }
}
