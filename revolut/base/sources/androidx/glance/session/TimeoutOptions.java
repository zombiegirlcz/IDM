package androidx.glance.session;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import pkm.e;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/glance/session/TimeoutOptions;", "", "Lkotlin/time/b;", "initialTimeout", "additionalTime", "idleTimeout", "Landroidx/glance/session/TimeSource;", "timeSource", "<init>", "(JJJLandroidx/glance/session/TimeSource;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getInitialTimeout-UwyO8pc", "()J", "getAdditionalTime-UwyO8pc", "getIdleTimeout-UwyO8pc", "Landroidx/glance/session/TimeSource;", "getTimeSource", "()Landroidx/glance/session/TimeSource;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TimeoutOptions {
    private final long additionalTime;
    private final long idleTimeout;
    private final long initialTimeout;

    @NotNull
    private final TimeSource timeSource;

    public /* synthetic */ TimeoutOptions(long j2, long j3, long j5, TimeSource timeSource, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, timeSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutOptions)) {
            return false;
        }
        TimeoutOptions timeoutOptions = (TimeoutOptions) other;
        return b.d(this.initialTimeout, timeoutOptions.initialTimeout) && b.d(this.additionalTime, timeoutOptions.additionalTime) && b.d(this.idleTimeout, timeoutOptions.idleTimeout) && Intrinsics.f(this.timeSource, timeoutOptions.timeSource);
    }

    /* JADX INFO: renamed from: getAdditionalTime-UwyO8pc, reason: not valid java name and from getter */
    public final long getAdditionalTime() {
        return this.additionalTime;
    }

    /* JADX INFO: renamed from: getIdleTimeout-UwyO8pc, reason: not valid java name and from getter */
    public final long getIdleTimeout() {
        return this.idleTimeout;
    }

    /* JADX INFO: renamed from: getInitialTimeout-UwyO8pc, reason: not valid java name and from getter */
    public final long getInitialTimeout() {
        return this.initialTimeout;
    }

    @NotNull
    public final TimeSource getTimeSource() {
        return this.timeSource;
    }

    public int hashCode() {
        long j2 = this.initialTimeout;
        b.Companion companion = b.INSTANCE;
        return this.timeSource.hashCode() + d.c(d.c(Long.hashCode(j2) * 31, 31, this.additionalTime), 31, this.idleTimeout);
    }

    @NotNull
    public String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) b.o(this.initialTimeout)) + ", additionalTime=" + ((Object) b.o(this.additionalTime)) + ", idleTimeout=" + ((Object) b.o(this.idleTimeout)) + ", timeSource=" + this.timeSource + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private TimeoutOptions(long j2, long j3, long j5, TimeSource timeSource) {
        this.initialTimeout = j2;
        this.additionalTime = j3;
        this.idleTimeout = j5;
        this.timeSource = timeSource;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TimeoutOptions(long j2, long j3, long j5, TimeSource timeSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jG;
        long jG2;
        long jG3;
        if ((i & 1) != 0) {
            b.Companion companion = b.INSTANCE;
            jG = c.g(45, e.SECONDS);
        } else {
            jG = j2;
        }
        if ((i & 2) != 0) {
            b.Companion companion2 = b.INSTANCE;
            jG2 = c.g(5, e.SECONDS);
        } else {
            jG2 = j3;
        }
        if ((i & 4) != 0) {
            b.Companion companion3 = b.INSTANCE;
            jG3 = c.g(5, e.SECONDS);
        } else {
            jG3 = j5;
        }
        this(jG, jG2, jG3, (i & 8) != 0 ? TimeSource.INSTANCE.getMonotonic() : timeSource, null);
    }
}
