package i93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f159561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159563c;
    public final l d;

    public i(e type, boolean z, boolean z3, l lVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f159561a = type;
        this.f159562b = z;
        this.f159563c = z3;
        this.d = lVar;
    }

    public static i a(i iVar, boolean z, l lVar, int i) {
        e type = iVar.f159561a;
        if ((i & 2) != 0) {
            z = iVar.f159562b;
        }
        boolean z3 = iVar.f159563c;
        if ((i & 8) != 0) {
            lVar = iVar.d;
        }
        Intrinsics.checkNotNullParameter(type, "type");
        return new i(type, z, z3, lVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f159561a == iVar.f159561a && this.f159562b == iVar.f159562b && this.f159563c == iVar.f159563c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f159561a.hashCode() * 31, 31, this.f159562b), 31, this.f159563c);
        l lVar = this.d;
        return iC + (lVar == null ? 0 : lVar.hashCode());
    }
}
