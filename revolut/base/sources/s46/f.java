package s46;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259780b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f259778a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259779a = str;
        this.f259780b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f259779a, fVar.f259779a) && Intrinsics.f(this.f259780b, fVar.f259780b);
    }

    public final int hashCode() {
        return this.f259780b.hashCode() + (this.f259779a.hashCode() * 31);
    }
}
