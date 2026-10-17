package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117836b;

    public /* synthetic */ s1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(q1.f117818a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117835a = str;
        this.f117836b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.f117835a, s1Var.f117835a) && Intrinsics.f(this.f117836b, s1Var.f117836b);
    }

    public final int hashCode() {
        return this.f117836b.hashCode() + (this.f117835a.hashCode() * 31);
    }
}
