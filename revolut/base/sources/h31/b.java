package h31;

import com.revolut.analytics.tracking.v3.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f149003a;

    public b(d diagnosticEventsTracker) {
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        this.f149003a = diagnosticEventsTracker;
    }
}
