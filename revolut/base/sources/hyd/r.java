package hyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f156826b;

    public /* synthetic */ r(int i, String str, i iVar) {
        if (3 != (i & 3)) {
            j1.f(p.f156820a.getDescriptor(), i, 3);
            throw null;
        }
        this.f156825a = str;
        this.f156826b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f156825a, rVar.f156825a) && Intrinsics.f(this.f156826b, rVar.f156826b);
    }

    public final int hashCode() {
        return this.f156826b.hashCode() + (this.f156825a.hashCode() * 31);
    }
}
