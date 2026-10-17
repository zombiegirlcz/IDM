package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117660b;

    public /* synthetic */ e0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(c0.f117620a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117659a = str;
        this.f117660b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f117659a, e0Var.f117659a) && Intrinsics.f(this.f117660b, e0Var.f117660b);
    }

    public final int hashCode() {
        return this.f117660b.hashCode() + (this.f117659a.hashCode() * 31);
    }
}
