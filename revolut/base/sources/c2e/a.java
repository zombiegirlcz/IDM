package c2e;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final w0 a(m2e.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ShopsContext.a aVarNewBuilder = ShopsContext.newBuilder();
        String str = aVar.f201955b;
        if (str != null) {
            aVarNewBuilder.j(str);
        }
        String str2 = aVar.f201956c;
        if (str2 != null) {
            aVarNewBuilder.h(str2);
        }
        if (bool != null) {
            aVarNewBuilder.i(bool.booleanValue());
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
