package gwc;

import cli.o;
import fwc.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f147310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147312c;
    public final m d;

    public g(ArrayList tabs, String str, boolean z, m headerState) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f147310a = tabs;
        this.f147311b = str;
        this.f147312c = z;
        this.d = headerState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f147310a.equals(gVar.f147310a) && Intrinsics.f(this.f147311b, gVar.f147311b) && this.f147312c == gVar.f147312c && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f147310a.hashCode() * 31;
        String str = this.f147311b;
        return this.d.hashCode() + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f147312c);
    }
}
