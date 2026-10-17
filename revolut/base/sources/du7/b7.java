package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b7 {

    @NotNull
    public static final a7 Companion = new a7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117615b;

    public /* synthetic */ b7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(z6.f117931a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117614a = str;
        this.f117615b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj2;
        return Intrinsics.f(this.f117614a, b7Var.f117614a) && Intrinsics.f(this.f117615b, b7Var.f117615b);
    }

    public final int hashCode() {
        String str = this.f117614a;
        return this.f117615b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
