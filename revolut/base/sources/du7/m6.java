package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m6 {

    @NotNull
    public static final l6 Companion = new l6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117776b;

    public /* synthetic */ m6(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(k6.f117736a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117775a = str;
        this.f117776b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj2;
        return Intrinsics.f(this.f117775a, m6Var.f117775a) && Intrinsics.f(this.f117776b, m6Var.f117776b);
    }

    public final int hashCode() {
        return this.f117776b.hashCode() + (this.f117775a.hashCode() * 31);
    }
}
