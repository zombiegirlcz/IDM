package j1j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f170616a;

    public c(ArrayList savingsBalances) {
        Intrinsics.checkNotNullParameter(savingsBalances, "savingsBalances");
        this.f170616a = savingsBalances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f170616a.equals(((c) obj2).f170616a);
    }

    public final int hashCode() {
        return this.f170616a.hashCode();
    }
}
