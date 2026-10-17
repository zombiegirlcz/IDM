package tf1;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.P4UWidgetContext;
import grl.r7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    @NotNull
    public static final C1511a Companion = new C1511a();

    /* JADX INFO: renamed from: tf1.a$a, reason: collision with other inner class name */
    public static final class C1511a {
        private C1511a() {
        }
    }

    public static w0 a(r7 r7Var, String str) {
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        P4UWidgetContext.a aVarNewBuilder = P4UWidgetContext.newBuilder();
        aVarNewBuilder.c();
        ((P4UWidgetContext) aVarNewBuilder.f49761b).setState(r7Var);
        if (str != null) {
            aVarNewBuilder.c();
            ((P4UWidgetContext) aVarNewBuilder.f49761b).setId(str);
        }
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
