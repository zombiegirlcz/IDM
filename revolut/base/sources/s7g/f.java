package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260710b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(d.f260695a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260709a = str;
        this.f260710b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f260709a, fVar.f260709a) && Intrinsics.f(this.f260710b, fVar.f260710b);
    }

    public final int hashCode() {
        return this.f260710b.hashCode() + (this.f260709a.hashCode() * 31);
    }
}
