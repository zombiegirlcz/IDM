package vgf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.q f289095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f289096b;

    public g(k71.q defaultExtraData, Map byWalletTransactionExtraData) {
        Intrinsics.checkNotNullParameter(defaultExtraData, "defaultExtraData");
        Intrinsics.checkNotNullParameter(byWalletTransactionExtraData, "byWalletTransactionExtraData");
        this.f289095a = defaultExtraData;
        this.f289096b = byWalletTransactionExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f289095a, gVar.f289095a) && Intrinsics.f(this.f289096b, gVar.f289096b);
    }

    public final int hashCode() {
        return this.f289096b.hashCode() + (this.f289095a.hashCode() * 31);
    }
}
