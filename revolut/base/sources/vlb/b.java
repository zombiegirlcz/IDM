package vlb;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.SavingsGroupContext;
import grl.la;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final w0 a(g gVar) {
        la laVar;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SavingsGroupContext.a aVarNewBuilder = SavingsGroupContext.newBuilder();
        int i = a.f290309a[gVar.ordinal()];
        if (i == 1 || i == 2) {
            laVar = la.Deposits;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            laVar = la.MMF;
        }
        aVarNewBuilder.c();
        ((SavingsGroupContext) aVarNewBuilder.f49761b).setType(laVar);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
