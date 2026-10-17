package eo;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsMetadata;
import com.revolut.tracking.v3.ScreenMetadata;
import com.revolut.tracking.v3.ScreenProtection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final w0 a(AnalyticsMetadata.Companion companion, boolean z) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        AnalyticsMetadata.Companion companion2 = AnalyticsMetadata.INSTANCE;
        ScreenMetadata.a aVarNewBuilder = ScreenMetadata.newBuilder();
        ScreenProtection.a aVarNewBuilder2 = ScreenProtection.newBuilder();
        aVarNewBuilder2.c();
        ((ScreenProtection) aVarNewBuilder2.f49761b).setProtected(z);
        ScreenProtection screenProtection = (ScreenProtection) aVarNewBuilder2.a();
        aVarNewBuilder.c();
        ((ScreenMetadata) aVarNewBuilder.f49761b).setScreenProtection(screenProtection);
        w0 w0VarA = aVarNewBuilder.a();
        companion2.getClass();
        return AnalyticsMetadata.Companion.a(w0VarA);
    }
}
