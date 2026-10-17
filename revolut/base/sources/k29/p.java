package k29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180436b;

    public /* synthetic */ p(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(n.f180434a.getDescriptor(), i, 3);
            throw null;
        }
        this.f180435a = str;
        this.f180436b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f180435a, pVar.f180435a) && this.f180436b == pVar.f180436b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180436b) + (this.f180435a.hashCode() * 31);
    }
}
