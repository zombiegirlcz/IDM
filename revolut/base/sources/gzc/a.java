package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f147987c;
    public final String d;
    public final h e;

    public a(String id10, String message, b action, String str, h hVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f147985a = id10;
        this.f147986b = message;
        this.f147987c = action;
        this.d = str;
        this.e = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f147985a, aVar.f147985a) && Intrinsics.f(this.f147986b, aVar.f147986b) && this.f147987c == aVar.f147987c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f147987c.hashCode() + p.a.c(this.f147985a.hashCode() * 31, 31, this.f147986b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.e;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
