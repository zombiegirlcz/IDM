package p9d;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.tracking.v3.IdContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static final CellDetailsChevronDelegate.Model a(String listId, FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(node, "node");
        String f51435b = node.getF51435b();
        Intrinsics.checkNotNullParameter(node, "<this>");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        aVarNewBuilder.h(node.getF51434a());
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new CellDetailsChevronDelegate.Model(listId, f51435b, node, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), 1996);
    }
}
