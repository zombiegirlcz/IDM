package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements u {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264600b;

    public p(String name, String vaultId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f264599a = name;
        this.f264600b = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f264599a, pVar.f264599a) && Intrinsics.f(this.f264600b, pVar.f264600b);
    }

    public final int hashCode() {
        return this.f264600b.hashCode() + (this.f264599a.hashCode() * 31);
    }
}
