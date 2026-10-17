package j1j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f170610a;

    public a(ArrayList cryptoBalances) {
        Intrinsics.checkNotNullParameter(cryptoBalances, "cryptoBalances");
        this.f170610a = cryptoBalances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f170610a.equals(((a) obj2).f170610a);
    }

    public final int hashCode() {
        return this.f170610a.hashCode();
    }
}
