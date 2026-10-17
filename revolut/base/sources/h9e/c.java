package h9e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo3.c f150233b;

    public c(List pockets, fo3.c wallet) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        this.f150232a = pockets;
        this.f150233b = wallet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f150232a, cVar.f150232a) && Intrinsics.f(this.f150233b, cVar.f150233b);
    }

    public final int hashCode() {
        return this.f150233b.hashCode() + (this.f150232a.hashCode() * 31);
    }
}
