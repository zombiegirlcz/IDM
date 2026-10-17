package wtg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299964b;

    public /* synthetic */ l(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(j.f299962a.getDescriptor(), i, 3);
            throw null;
        }
        this.f299963a = str;
        this.f299964b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f299963a, lVar.f299963a) && Intrinsics.f(this.f299964b, lVar.f299964b);
    }

    public final int hashCode() {
        return this.f299964b.hashCode() + (this.f299963a.hashCode() * 31);
    }
}
