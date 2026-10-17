package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements u {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264592b;

    public l(String name, String vaultId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f264591a = name;
        this.f264592b = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f264591a, lVar.f264591a) && Intrinsics.f(this.f264592b, lVar.f264592b);
    }

    public final int hashCode() {
        return this.f264592b.hashCode() + (this.f264591a.hashCode() * 31);
    }
}
