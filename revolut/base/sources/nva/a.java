package nva;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.mb;
import tof.q7;
import tof.ua;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public final q7 a(String recurringBuyId, String receiverPocketId) {
        Intrinsics.checkNotNullParameter(recurringBuyId, "recurringBuyId");
        Intrinsics.checkNotNullParameter(receiverPocketId, "receiverPocketId");
        i7.c cVar = i7.Companion;
        mb mbVar = new mb(recurringBuyId);
        i7[] i7VarArr = {new ua(receiverPocketId)};
        cVar.getClass();
        return i7.c.a(mbVar, i7.c.a(i7VarArr));
    }

    public final q7 b(String recurringBuyId, String receiverPocketId) {
        Intrinsics.checkNotNullParameter(recurringBuyId, "recurringBuyId");
        Intrinsics.checkNotNullParameter(receiverPocketId, "receiverPocketId");
        i7.c cVar = i7.Companion;
        mb mbVar = new mb(recurringBuyId);
        i7[] i7VarArr = {new ua(receiverPocketId)};
        cVar.getClass();
        return i7.c.a(mbVar, i7.c.e(i7VarArr));
    }
}
