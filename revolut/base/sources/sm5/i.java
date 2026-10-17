package sm5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f264358c;

    public /* synthetic */ i(int i, String str, String str2, l lVar) {
        if (7 != (i & 7)) {
            j1.f(g.f264355a.getDescriptor(), i, 7);
            throw null;
        }
        this.f264356a = str;
        this.f264357b = str2;
        this.f264358c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f264356a, iVar.f264356a) && Intrinsics.f(this.f264357b, iVar.f264357b) && Intrinsics.f(this.f264358c, iVar.f264358c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f264356a.hashCode() * 31, 31, this.f264357b);
        l lVar = this.f264358c;
        return iC + (lVar == null ? 0 : lVar.hashCode());
    }

    public i(String status, String ownershipMethod, l lVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ownershipMethod, "ownershipMethod");
        this.f264356a = status;
        this.f264357b = ownershipMethod;
        this.f264358c = lVar;
    }
}
