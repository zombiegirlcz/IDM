package gv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f147007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147009c;
    public final f d;
    public final p e;

    public g(long j2, int i, int i2, f fVar, p pVar) {
        this.f147007a = j2;
        this.f147008b = i;
        this.f147009c = i2;
        this.d = fVar;
        this.e = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f147007a == gVar.f147007a && this.f147008b == gVar.f147008b && this.f147009c == gVar.f147009c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f147009c, j6.a.b(this.f147008b, Long.hashCode(this.f147007a) * 31, 31), 31);
        f fVar = this.d;
        int iHashCode = (iB + (fVar == null ? 0 : fVar.hashCode())) * 31;
        p pVar = this.e;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }
}
