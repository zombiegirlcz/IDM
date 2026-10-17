package bu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18739b;

    public /* synthetic */ u(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(s.f18736a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18738a = str;
        this.f18739b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f18738a, uVar.f18738a) && this.f18739b == uVar.f18739b;
    }

    public final int hashCode() {
        String str = this.f18738a;
        return Boolean.hashCode(this.f18739b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public u(String str, boolean z) {
        this.f18738a = str;
        this.f18739b = z;
    }
}
