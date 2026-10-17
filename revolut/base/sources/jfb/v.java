package jfb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f173842b;

    public /* synthetic */ v(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qlm.j1.f(t.f173838a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173841a = str;
        this.f173842b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f173841a, vVar.f173841a) && this.f173842b == vVar.f173842b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173842b) + (this.f173841a.hashCode() * 31);
    }

    public v(String version, boolean z) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f173841a = version;
        this.f173842b = z;
    }
}
