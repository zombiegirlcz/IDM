package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f260798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260799b;

    public /* synthetic */ t(int i, boolean z, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(r.f260787a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260798a = z;
        this.f260799b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f260798a == tVar.f260798a && Intrinsics.f(this.f260799b, tVar.f260799b);
    }

    public final int hashCode() {
        return this.f260799b.hashCode() + (Boolean.hashCode(this.f260798a) * 31);
    }
}
