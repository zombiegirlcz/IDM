package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f117706b;

    public /* synthetic */ i(int i, String str, e eVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(g.f117678a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117705a = str;
        this.f117706b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f117705a, iVar.f117705a) && Intrinsics.f(this.f117706b, iVar.f117706b);
    }

    public final int hashCode() {
        int iHashCode = this.f117705a.hashCode() * 31;
        e eVar = this.f117706b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
