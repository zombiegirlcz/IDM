package j81;

import aii.i;
import com.revolut.error_handling.models.ErrorThrownInDataLoading;
import com.revolut.kompot.common.ActionBreadcrumb;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    @NotNull
    public static final C0978a Companion = new C0978a();

    /* JADX INFO: renamed from: j81.a$a, reason: collision with other inner class name */
    public static final class C0978a {
        private C0978a() {
        }
    }

    public static void b(Exception exc2, ActionBreadcrumb actionBreadcrumb) {
        s0 s0Var = new s0(2);
        StackTraceElement[] stackTrace = exc2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        s0Var.a(d.O(stackTrace));
        s0Var.b(actionBreadcrumb.getStackTrace());
        ArrayList arrayList = s0Var.f186433a;
        exc2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }

    public final void a(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String message = "Error thrown in data loading: " + event.f5287b;
        Intrinsics.checkNotNullParameter(message, "message");
        ErrorThrownInDataLoading errorThrownInDataLoading = new ErrorThrownInDataLoading(message);
        b(errorThrownInDataLoading, event.d);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, "ErrorReporter", null, errorThrownInDataLoading, h0Var);
    }
}
