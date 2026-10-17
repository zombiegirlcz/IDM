package gbj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f142271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f142272b;

    public d(wk5.a blockchain, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f142271a = currency;
        this.f142272b = blockchain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f142271a, dVar.f142271a) && this.f142272b == dVar.f142272b;
    }

    public final int hashCode() {
        return this.f142272b.hashCode() + (this.f142271a.hashCode() * 31);
    }
}
