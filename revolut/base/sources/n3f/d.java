package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Ln3f/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "side", "Ln3f/d$a;", "b", "Ln3f/d$a;", "()Ln3f/d$a;", "transferRequestDetails", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestTransferDetails")
    @NotNull
    private final a transferRequestDetails;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ln3f/d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "counterpartBrokerName", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("counterpartBrokerName")
        private final String counterpartBrokerName;

        public a(String str) {
            this.counterpartBrokerName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCounterpartBrokerName() {
            return this.counterpartBrokerName;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.counterpartBrokerName, ((a) obj2).counterpartBrokerName);
        }

        public final int hashCode() {
            String str = this.counterpartBrokerName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    public d(String side, a transferRequestDetails) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(transferRequestDetails, "transferRequestDetails");
        this.side = side;
        this.transferRequestDetails = transferRequestDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getTransferRequestDetails() {
        return this.transferRequestDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.side, dVar.side) && Intrinsics.f(this.transferRequestDetails, dVar.transferRequestDetails);
    }

    public final int hashCode() {
        return this.transferRequestDetails.hashCode() + (this.side.hashCode() * 31);
    }
}
