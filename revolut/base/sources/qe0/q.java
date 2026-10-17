package qe0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    @NotNull
    private static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f245042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f245043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245044c;

    public q(Function2 storeTimeStamp, Function1 getTimeStamp, long j2, l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(storeTimeStamp, "storeTimeStamp");
        Intrinsics.checkNotNullParameter(getTimeStamp, "getTimeStamp");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f245042a = storeTimeStamp;
        this.f245043b = getTimeStamp;
        this.f245044c = j2;
    }

    public final boolean a(String params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (z) {
            return true;
        }
        Function1 function1 = this.f245043b;
        Long l2 = (Long) function1.invoke(params);
        if ((l2 != null ? l2.longValue() : -1L) == -1) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l3 = (Long) function1.invoke(params);
        return jCurrentTimeMillis - (l3 != null ? l3.longValue() : -1L) > this.f245044c;
    }

    public final void b(String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f245042a.invoke(params, Long.valueOf(System.currentTimeMillis()));
    }
}
