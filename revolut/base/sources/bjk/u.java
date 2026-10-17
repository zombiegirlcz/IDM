package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16078b;

    public /* synthetic */ u(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(s.f16065a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16077a = str;
        this.f16078b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f16077a, uVar.f16077a) && Intrinsics.f(this.f16078b, uVar.f16078b);
    }

    public final int hashCode() {
        return this.f16078b.hashCode() + (this.f16077a.hashCode() * 31);
    }
}
