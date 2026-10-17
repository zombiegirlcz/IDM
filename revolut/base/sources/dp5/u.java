package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f116814b;

    public /* synthetic */ u(int i, boolean z, Boolean bool) {
        if (3 != (i & 3)) {
            qlm.j1.f(s.f116808a.getDescriptor(), i, 3);
            throw null;
        }
        this.f116813a = z;
        this.f116814b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f116813a == uVar.f116813a && Intrinsics.f(this.f116814b, uVar.f116814b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f116813a) * 31;
        Boolean bool = this.f116814b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
