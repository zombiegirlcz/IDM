package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148000c;
    public final String d;
    public final s e;
    public final a f;

    public g(String id10, String type, String fileName, String fileUrl, s reviewState, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        this.f147998a = id10;
        this.f147999b = type;
        this.f148000c = fileName;
        this.d = fileUrl;
        this.e = reviewState;
        this.f = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f147998a, gVar.f147998a) && Intrinsics.f(this.f147999b, gVar.f147999b) && Intrinsics.f(this.f148000c, gVar.f148000c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f147998a.hashCode() * 31, 31, this.f147999b), 31, this.f148000c), 31, this.d)) * 31;
        a aVar = this.f;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
