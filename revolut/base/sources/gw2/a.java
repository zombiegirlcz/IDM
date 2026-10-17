package gw2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147275c;

    public a(String lastFour, String tokenUniqueReference, String str) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        this.f147273a = lastFour;
        this.f147274b = tokenUniqueReference;
        this.f147275c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f147273a, aVar.f147273a) && Intrinsics.f(this.f147274b, aVar.f147274b) && Intrinsics.f(this.f147275c, aVar.f147275c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f147273a.hashCode() * 31, 31, this.f147274b);
        String str = this.f147275c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
