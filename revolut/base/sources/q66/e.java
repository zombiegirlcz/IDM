package q66;

import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefiCurrency f242515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qta.c f242516b;

    public e(DefiCurrency currency, qta.c rate) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f242515a = currency;
        this.f242516b = rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f242515a, eVar.f242515a) && Intrinsics.f(this.f242516b, eVar.f242516b);
    }

    public final int hashCode() {
        return this.f242516b.hashCode() + (this.f242515a.hashCode() * 31);
    }
}
