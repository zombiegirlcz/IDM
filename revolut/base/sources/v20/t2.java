package v20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lv20/t2;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "tickDurationInMillis", "Ld70/a;", "Ld70/a;", "()Ld70/a;", "amplitudes", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tickDurationMilliseconds")
    private final long tickDurationInMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticks")
    @NotNull
    private final d70.a amplitudes;

    public t2(long j2, d70.c amplitudes) {
        Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
        this.tickDurationInMillis = j2;
        this.amplitudes = amplitudes;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d70.a getAmplitudes() {
        return this.amplitudes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTickDurationInMillis() {
        return this.tickDurationInMillis;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return this.tickDurationInMillis == t2Var.tickDurationInMillis && Intrinsics.f(this.amplitudes, t2Var.amplitudes);
    }

    public final int hashCode() {
        return this.amplitudes.hashCode() + (Long.hashCode(this.tickDurationInMillis) * 31);
    }
}
