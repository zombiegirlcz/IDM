package fb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f133513c;
    public final p98.a d;
    public final eb8.k e;

    public /* synthetic */ i(int i, String str, int i2, String str2, p98.a aVar, eb8.k kVar) {
        if (15 != (i & 15)) {
            j1.f(g.f133510a.getDescriptor(), i, 15);
            throw null;
        }
        this.f133511a = str;
        this.f133512b = i2;
        this.f133513c = str2;
        this.d = aVar;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f133511a, iVar.f133511a) && this.f133512b == iVar.f133512b && Intrinsics.f(this.f133513c, iVar.f133513c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(j6.a.b(this.f133512b, this.f133511a.hashCode() * 31, 31), 31, this.f133513c)) * 31;
        eb8.k kVar = this.e;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
