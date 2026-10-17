package d56;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111392a;

    public /* synthetic */ r(int i, String str) {
        if (1 == (i & 1)) {
            this.f111392a = str;
        } else {
            j1.f(p.f111391a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f111392a, ((r) obj2).f111392a);
    }

    public final int hashCode() {
        return this.f111392a.hashCode();
    }

    public r(String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f111392a = signature;
    }
}
