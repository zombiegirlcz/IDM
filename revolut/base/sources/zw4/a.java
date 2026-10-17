package zw4;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final w0 a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return v0.a.b(id10, AnalyticsContext.INSTANCE);
    }
}
