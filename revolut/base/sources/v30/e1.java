package v30;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lv30/e1;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getKeepAliveIntervalMillis", "()J", "keepAliveIntervalMillis", "b", "idleTimeoutMillis", "Lv30/e1$a;", "c", "Lv30/e1$a;", "()Lv30/e1$a;", "openConnectionBackoff", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("keepAliveIntervalMillis")
    private final long keepAliveIntervalMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("idleTimeoutMillis")
    private final long idleTimeoutMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("openConnectionBackoff")
    @NotNull
    private final a openConnectionBackoff;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0013"}, d2 = {"Lv30/e1$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "minMillis", "b", "maxMillis", "", "D", "d", "()D", "randomFactor", "autoResetMillis", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("minMillis")
        private final long minMillis;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("maxMillis")
        private final long maxMillis;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("randomFactor")
        private final double randomFactor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("autoResetMillis")
        private final long autoResetMillis;

        public a(double d, long j2, long j3, long j5) {
            this.minMillis = j2;
            this.maxMillis = j3;
            this.randomFactor = d;
            this.autoResetMillis = j5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAutoResetMillis() {
            return this.autoResetMillis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getMaxMillis() {
            return this.maxMillis;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getMinMillis() {
            return this.minMillis;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final double getRandomFactor() {
            return this.randomFactor;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.minMillis == aVar.minMillis && this.maxMillis == aVar.maxMillis && Double.compare(this.randomFactor, aVar.randomFactor) == 0 && this.autoResetMillis == aVar.autoResetMillis;
        }

        public final int hashCode() {
            return Long.hashCode(this.autoResetMillis) + m72.b.c(a0.d.c(Long.hashCode(this.minMillis) * 31, 31, this.maxMillis), this.randomFactor, 31);
        }
    }

    public e1(long j2, long j3, a openConnectionBackoff) {
        Intrinsics.checkNotNullParameter(openConnectionBackoff, "openConnectionBackoff");
        this.keepAliveIntervalMillis = j2;
        this.idleTimeoutMillis = j3;
        this.openConnectionBackoff = openConnectionBackoff;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getIdleTimeoutMillis() {
        return this.idleTimeoutMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getOpenConnectionBackoff() {
        return this.openConnectionBackoff;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return this.keepAliveIntervalMillis == e1Var.keepAliveIntervalMillis && this.idleTimeoutMillis == e1Var.idleTimeoutMillis && Intrinsics.f(this.openConnectionBackoff, e1Var.openConnectionBackoff);
    }

    public final int hashCode() {
        return this.openConnectionBackoff.hashCode() + a0.d.c(Long.hashCode(this.keepAliveIntervalMillis) * 31, 31, this.idleTimeoutMillis);
    }
}
