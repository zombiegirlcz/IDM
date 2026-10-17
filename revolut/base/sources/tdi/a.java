package tdi;

import aig.p;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static List a(a aVar, Data accountData, Data thresholdData, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = (i & 8) != 0;
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(thresholdData, "thresholdData");
        return (List) iii.c.f(t1.t(accountData, thresholdData), new td1.f(aVar, 3), new ta8.a(aVar, 11), new p(aVar, z, z3));
    }
}
