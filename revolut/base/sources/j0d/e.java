package j0d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170000b;

    public /* synthetic */ e(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(c.f169998a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169999a = str;
        this.f170000b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f169999a, eVar.f169999a) && Intrinsics.f(this.f170000b, eVar.f170000b);
    }

    public final int hashCode() {
        return this.f170000b.hashCode() + (this.f169999a.hashCode() * 31);
    }
}
