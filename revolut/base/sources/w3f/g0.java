package w3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lw3f/g0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "baseCurrencyValue", "b", "instrumentCurrencyValue", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseCurrencyValue")
    @NotNull
    private final jo3.a baseCurrencyValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentCurrencyValue")
    @NotNull
    private final jo3.a instrumentCurrencyValue;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getBaseCurrencyValue() {
        return this.baseCurrencyValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getInstrumentCurrencyValue() {
        return this.instrumentCurrencyValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.baseCurrencyValue, g0Var.baseCurrencyValue) && Intrinsics.f(this.instrumentCurrencyValue, g0Var.instrumentCurrencyValue);
    }

    public final int hashCode() {
        return this.instrumentCurrencyValue.hashCode() + (this.baseCurrencyValue.hashCode() * 31);
    }
}
