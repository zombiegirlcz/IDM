package wz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301390b;

    public /* synthetic */ k(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(i.f301388a.getDescriptor(), i, 3);
            throw null;
        }
        this.f301389a = str;
        this.f301390b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f301389a, kVar.f301389a) && Intrinsics.f(this.f301390b, kVar.f301390b);
    }

    public final int hashCode() {
        return this.f301390b.hashCode() + (this.f301389a.hashCode() * 31);
    }
}
