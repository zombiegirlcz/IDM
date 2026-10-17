package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264603b;

    public t(String name, String vaultId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f264602a = name;
        this.f264603b = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f264602a, tVar.f264602a) && Intrinsics.f(this.f264603b, tVar.f264603b);
    }

    public final int hashCode() {
        return this.f264603b.hashCode() + (this.f264602a.hashCode() * 31);
    }
}
