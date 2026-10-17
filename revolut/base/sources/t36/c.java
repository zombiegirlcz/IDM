package t36;

import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f267659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f267660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DefiCurrency f267661c;

    public c(xi0.b ceFiAsset, a aVar, DefiCurrency deFiAsset) {
        Intrinsics.checkNotNullParameter(ceFiAsset, "ceFiAsset");
        Intrinsics.checkNotNullParameter(deFiAsset, "deFiAsset");
        this.f267659a = ceFiAsset;
        this.f267660b = aVar;
        this.f267661c = deFiAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f267659a, cVar.f267659a) && Intrinsics.f(this.f267660b, cVar.f267660b) && Intrinsics.f(this.f267661c, cVar.f267661c);
    }

    public final int hashCode() {
        int iHashCode = this.f267659a.hashCode() * 31;
        a aVar = this.f267660b;
        return this.f267661c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
