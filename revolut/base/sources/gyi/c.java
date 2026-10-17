package gyi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147870c;

    public c(String passId, String str, String str2) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f147868a = passId;
        this.f147869b = str;
        this.f147870c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f147868a, cVar.f147868a) && Intrinsics.f(this.f147869b, cVar.f147869b) && Intrinsics.f(this.f147870c, cVar.f147870c);
    }

    public final int hashCode() {
        int iHashCode = this.f147868a.hashCode() * 31;
        String str = this.f147869b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147870c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
