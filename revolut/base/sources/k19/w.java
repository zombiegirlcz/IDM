package k19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180172b;

    public /* synthetic */ w(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(u.f180170a.getDescriptor(), i, 3);
            throw null;
        }
        this.f180171a = str;
        this.f180172b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f180171a, wVar.f180171a) && Intrinsics.f(this.f180172b, wVar.f180172b);
    }

    public final int hashCode() {
        return this.f180172b.hashCode() + (this.f180171a.hashCode() * 31);
    }
}
