package yrd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316272c;

    public b(String assetId, String assetName) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f316271b = assetId;
        this.f316272c = assetName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f316271b, bVar.f316271b) && Intrinsics.f(this.f316272c, bVar.f316272c);
    }

    public final int hashCode() {
        return this.f316272c.hashCode() + (this.f316271b.hashCode() * 31);
    }
}
