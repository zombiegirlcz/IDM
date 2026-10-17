package j05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169950b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f169946a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169949a = str;
        this.f169950b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f169949a, cVar.f169949a) && Intrinsics.f(this.f169950b, cVar.f169950b);
    }

    public final int hashCode() {
        return this.f169950b.hashCode() + (this.f169949a.hashCode() * 31);
    }
}
