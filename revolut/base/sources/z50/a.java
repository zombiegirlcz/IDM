package z50;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.IdContext;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final w0 a(AnalyticsContext.Companion companion, UUID chatId) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        aVarNewBuilder.h(chatId.toString());
        IdContext idContext = (IdContext) aVarNewBuilder.a();
        AnalyticsContext.INSTANCE.getClass();
        return AnalyticsContext.Companion.a(idContext);
    }
}
