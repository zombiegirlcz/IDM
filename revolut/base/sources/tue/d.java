package tue;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ltue/d;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "b", "Ljava/lang/String;", "getPocketId", "pocketId", "Ltue/d$a;", "c", "Ltue/d$a;", "getTopupMethodDetails", "()Ltue/d$a;", "topupMethodDetails", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupMethodDetails")
    @NotNull
    private final a topupMethodDetails;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Ltue/d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTopupStoredMethodId", "topupStoredMethodId", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("topupStoredMethodId")
        @NotNull
        private final String topupStoredMethodId;

        public a(String topupStoredMethodId) {
            Intrinsics.checkNotNullParameter(topupStoredMethodId, "topupStoredMethodId");
            this.topupStoredMethodId = topupStoredMethodId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.topupStoredMethodId, ((a) obj2).topupStoredMethodId);
        }

        public final int hashCode() {
            return this.topupStoredMethodId.hashCode();
        }
    }

    public d(jo3.a amount, String pocketId, a topupMethodDetails) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(topupMethodDetails, "topupMethodDetails");
        this.amount = amount;
        this.pocketId = pocketId;
        this.topupMethodDetails = topupMethodDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.amount, dVar.amount) && Intrinsics.f(this.pocketId, dVar.pocketId) && Intrinsics.f(this.topupMethodDetails, dVar.topupMethodDetails);
    }

    public final int hashCode() {
        return this.topupMethodDetails.hashCode() + p.a.c(this.amount.hashCode() * 31, 31, this.pocketId);
    }
}
