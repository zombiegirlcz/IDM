package pac;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lpac/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "timestamp", "statusMessage", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timestamp")
    @NotNull
    private final String timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("statusMessage")
    @NotNull
    private final String statusMessage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.timestamp, eVar.timestamp) && Intrinsics.f(this.statusMessage, eVar.statusMessage);
    }

    public final int hashCode() {
        return this.statusMessage.hashCode() + (this.timestamp.hashCode() * 31);
    }
}
