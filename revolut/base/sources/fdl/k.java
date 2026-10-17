package fdl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000f"}, d2 = {"Lfdl/k;", "Lfdl/l;", "", "toString", "()Ljava/lang/String;", "Lfdl/k$a;", "a", "Lfdl/k$a;", "c", "()Lfdl/k$a;", "value", "b", "Ljava/lang/String;", "symbol", "ref", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final a value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lfdl/k$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "quantity", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("quantity")
        @NotNull
        private final BigDecimal quantity;

        public a(BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.quantity = quantity;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.quantity, ((a) obj2).quantity);
        }

        public final int hashCode() {
            return this.quantity.hashCode();
        }
    }

    public k(a value, String symbol, String ref2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.value = value;
        this.symbol = symbol;
        this.ref = ref2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.value, kVar.value) && Intrinsics.f(this.symbol, kVar.symbol) && Intrinsics.f(this.ref, kVar.ref);
    }

    public final int hashCode() {
        return this.ref.hashCode() + p.a.c(this.value.hashCode() * 31, 31, this.symbol);
    }
}
