package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260785b;

    public /* synthetic */ q(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(o.f260772a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260784a = str;
        this.f260785b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f260784a, qVar.f260784a) && Intrinsics.f(this.f260785b, qVar.f260785b);
    }

    public final int hashCode() {
        return this.f260785b.hashCode() + (this.f260784a.hashCode() * 31);
    }
}
