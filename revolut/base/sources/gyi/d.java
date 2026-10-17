package gyi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147874c;
    public final String d;

    public d(String passId, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f147872a = passId;
        this.f147873b = z;
        this.f147874c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f147872a, dVar.f147872a) && this.f147873b == dVar.f147873b && Intrinsics.f(this.f147874c, dVar.f147874c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f147872a.hashCode() * 31, 31, this.f147873b);
        String str = this.f147874c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
