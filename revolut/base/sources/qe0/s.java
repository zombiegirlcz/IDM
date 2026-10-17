package qe0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f245045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f245046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245047c;
    public volatile boolean d;

    public s(Function2 storeTimeStamp, Function1 getTimeStamp, long j2) {
        Intrinsics.checkNotNullParameter(storeTimeStamp, "storeTimeStamp");
        Intrinsics.checkNotNullParameter(getTimeStamp, "getTimeStamp");
        this.f245045a = storeTimeStamp;
        this.f245046b = getTimeStamp;
        this.f245047c = j2;
    }

    public final boolean a(Object params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        return b(params, z, false);
    }

    public final boolean b(Object params, boolean z, boolean z3) {
        Long lN;
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.d && z) {
            return true;
        }
        if (!z && !z3) {
            return false;
        }
        String str = (String) this.f245046b.invoke(params);
        if (str == null || (lN = z.n(d0.z0(str, ":", str))) == null) {
            return true;
        }
        long jLongValue = lN.longValue();
        if (jLongValue == -1) {
            return true;
        }
        long millis = DateTime.now().getMillis() - jLongValue;
        m70.a.c(t0.f186434a);
        Long lN2 = z.n(d0.v0(str, ":", ""));
        return millis > (lN2 != null ? lN2.longValue() : this.f245047c);
    }

    public final w4l.k c(Object params, w4l.k requestedStrategy) {
        Intrinsics.checkNotNullParameter(requestedStrategy, "requestedStrategy");
        Intrinsics.checkNotNullParameter(params, "params");
        return d(requestedStrategy, params, false);
    }

    public final w4l.k d(w4l.k requestedStrategy, Object params, boolean z) {
        Intrinsics.checkNotNullParameter(requestedStrategy, "requestedStrategy");
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.i iVar = w4l.i.f294643c;
        if (b(params, Intrinsics.f(requestedStrategy, iVar), z)) {
            return iVar;
        }
        boolean zF = Intrinsics.f(requestedStrategy, iVar);
        w4l.h hVar = w4l.h.f294642c;
        if (zF) {
            return hVar;
        }
        if (Intrinsics.f(requestedStrategy, hVar) || Intrinsics.f(requestedStrategy, w4l.j.f294644c)) {
            return requestedStrategy;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public final void e(String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f245045a.invoke(params, "-1");
    }

    public final void f(Object params) {
        Intrinsics.checkNotNullParameter(params, "params");
        g(params, null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public final void g(Object params, Long l2) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(params, "params");
        long millis = DateTime.now().getMillis();
        if (l2 != null) {
            strValueOf = millis + ":" + l2;
        } else {
            strValueOf = String.valueOf(millis);
        }
        this.f245045a.invoke(params, strValueOf);
        this.d = false;
    }
}
