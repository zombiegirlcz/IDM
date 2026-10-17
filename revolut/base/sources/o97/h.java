package o97;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.GlobalSearchItemContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h {
    public static final w0 a(m0 m0Var, String itemId) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        GlobalSearchItemContext.a aVarNewBuilder = GlobalSearchItemContext.newBuilder();
        aVarNewBuilder.c();
        ((GlobalSearchItemContext) aVarNewBuilder.f49761b).setId(itemId);
        String strName = ((r) m0Var).name();
        aVarNewBuilder.c();
        ((GlobalSearchItemContext) aVarNewBuilder.f49761b).setBlockId(strName);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
