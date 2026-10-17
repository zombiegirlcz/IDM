package fo;

import com.google.protobuf.k3;
import com.revolut.tracking.v3.AnalyticEvent;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticEvent f136731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f136732c;

    public i(String host, AnalyticEvent event, byte[] serializedEvent) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        this.f136730a = host;
        this.f136731b = event;
        this.f136732c = serializedEvent;
    }

    public final String a() {
        String id10 = this.f136731b.getId();
        Intrinsics.checkNotNullExpressionValue(id10, "getId(...)");
        return id10;
    }

    public final long b() {
        k3 clientTimestamp = this.f136731b.getClientTimestamp();
        Intrinsics.checkNotNullExpressionValue(clientTimestamp, "getClientTimestamp(...)");
        Intrinsics.checkNotNullParameter(clientTimestamp, "<this>");
        return TimeUnit.NANOSECONDS.toMillis(clientTimestamp.getNanos()) + TimeUnit.SECONDS.toMillis(clientTimestamp.getSeconds());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!i.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.analytics.offline.SerializedEvent");
        return Intrinsics.f(a(), ((i) obj2).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return p.a.p("SerializedEvent(id=", this.f136731b.getId(), ")");
    }
}
