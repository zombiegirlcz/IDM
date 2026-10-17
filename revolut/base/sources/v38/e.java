package v38;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f285858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f285859b;

    public e(List pocketBalances, dj0.d summaryAmount) {
        Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
        Intrinsics.checkNotNullParameter(summaryAmount, "summaryAmount");
        this.f285858a = pocketBalances;
        this.f285859b = summaryAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f285858a, eVar.f285858a) && Intrinsics.f(this.f285859b, eVar.f285859b);
    }

    public final int hashCode() {
        return this.f285859b.hashCode() + (this.f285858a.hashCode() * 31);
    }
}
