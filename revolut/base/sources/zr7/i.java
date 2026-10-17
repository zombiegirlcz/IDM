package zr7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f324628b;

    public /* synthetic */ i(int i, String str, e eVar) {
        if (3 != (i & 3)) {
            j1.f(g.f324626a.getDescriptor(), i, 3);
            throw null;
        }
        this.f324627a = str;
        this.f324628b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f324627a, iVar.f324627a) && Intrinsics.f(this.f324628b, iVar.f324628b);
    }

    public final int hashCode() {
        String str = this.f324627a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        e eVar = this.f324628b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public i(String str, e eVar) {
        this.f324627a = str;
        this.f324628b = eVar;
    }
}
