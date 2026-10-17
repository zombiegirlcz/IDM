package i7c;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0002\f\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u001a"}, d2 = {"Li7c/c;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "payAmount", "Li7c/c$b;", "b", "Li7c/c$b;", "d", "()Li7c/c$b;", "points", "Li7c/f;", "Li7c/f;", "()Li7c/f;", "bnpl", "Li7c/a;", "Li7c/a;", "()Li7c/a;", "cashback", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("payAmount")
    @NotNull
    private final jo3.a payAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    private final b points;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bnpl")
    private final f bnpl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cashback")
    private final a cashback;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Li7c/c$b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "discountAmount", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "redeemed", "c", "rewarded", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("discount")
        @NotNull
        private final jo3.a discountAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("redeemed")
        @NotNull
        private final BigDecimal redeemed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("rewarded")
        private final BigDecimal rewarded;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getDiscountAmount() {
            return this.discountAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getRedeemed() {
            return this.redeemed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getRewarded() {
            return this.rewarded;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.discountAmount, bVar.discountAmount) && Intrinsics.f(this.redeemed, bVar.redeemed) && Intrinsics.f(this.rewarded, bVar.rewarded);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.redeemed, this.discountAmount.hashCode() * 31, 31);
            BigDecimal bigDecimal = this.rewarded;
            return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getBnpl() {
        return this.bnpl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getPoints() {
        return this.points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.payAmount, cVar.payAmount) && Intrinsics.f(this.points, cVar.points) && Intrinsics.f(this.bnpl, cVar.bnpl) && Intrinsics.f(this.cashback, cVar.cashback);
    }

    public final int hashCode() {
        int iHashCode = this.payAmount.hashCode() * 31;
        b bVar = this.points;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        f fVar = this.bnpl;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        a aVar = this.cashback;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
