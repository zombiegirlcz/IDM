package w3f;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0002\t\nR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"Lw3f/u;", "Lw3f/h0;", "", "Lw3f/u$a;", "s", "Ljava/util/List;", "()Ljava/util/List;", "breakdown", "Companion", "a", "b", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("overnightFeeBreakdown")
    private final List<a> breakdown;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lw3f/u$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "ref", "b", "symbol", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "value", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("symbol")
        @NotNull
        private final String symbol;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final jo3.a value;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.ref, aVar.ref) && Intrinsics.f(this.symbol, aVar.symbol) && Intrinsics.f(this.value, aVar.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + p.a.c(this.ref.hashCode() * 31, 31, this.symbol);
        }
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final List getBreakdown() {
        return this.breakdown;
    }
}
