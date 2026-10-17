package kr6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188664a;

    public c(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f188664a = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f188664a, ((c) obj2).f188664a);
    }

    public final int hashCode() {
        return this.f188664a.hashCode();
    }
}
