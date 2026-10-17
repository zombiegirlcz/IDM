package x1e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302368b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f302366a.getDescriptor(), i, 3);
            throw null;
        }
        this.f302367a = str;
        this.f302368b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f302367a, cVar.f302367a) && Intrinsics.f(this.f302368b, cVar.f302368b);
    }

    public final int hashCode() {
        return this.f302368b.hashCode() + (this.f302367a.hashCode() * 31);
    }
}
