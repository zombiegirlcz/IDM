package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class g5 {

    @NotNull
    public static final f5 Companion = new f5();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f147402g = {yhm.j.c(yhm.k.PUBLICATION, new gvi.b(26)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f147405c;
    public final String d;
    public final a5 e;
    public final v3 f;

    public /* synthetic */ g5(int i, List list, String str, Boolean bool, String str2, a5 a5Var, v3 v3Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(e5.f147381a.getDescriptor(), i, 1);
            throw null;
        }
        this.f147403a = list;
        if ((i & 2) == 0) {
            this.f147404b = "";
        } else {
            this.f147404b = str;
        }
        if ((i & 4) == 0) {
            this.f147405c = null;
        } else {
            this.f147405c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = a5Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = v3Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.f147403a, g5Var.f147403a) && Intrinsics.f(this.f147404b, g5Var.f147404b) && Intrinsics.f(this.f147405c, g5Var.f147405c) && Intrinsics.f(this.d, g5Var.d) && Intrinsics.f(this.e, g5Var.e) && Intrinsics.f(this.f, g5Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f147403a.hashCode() * 31, 31, this.f147404b);
        Boolean bool = this.f147405c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a5 a5Var = this.e;
        int iHashCode3 = (iHashCode2 + (a5Var == null ? 0 : a5Var.hashCode())) * 31;
        v3 v3Var = this.f;
        return iHashCode3 + (v3Var != null ? v3Var.hashCode() : 0);
    }

    public g5(ArrayList unlimitedCountryProfiles, String helpTopic, Boolean bool, String str, a5 a5Var, v3 v3Var) {
        Intrinsics.checkNotNullParameter(unlimitedCountryProfiles, "unlimitedCountryProfiles");
        Intrinsics.checkNotNullParameter(helpTopic, "helpTopic");
        this.f147403a = unlimitedCountryProfiles;
        this.f147404b = helpTopic;
        this.f147405c = bool;
        this.d = str;
        this.e = a5Var;
        this.f = v3Var;
    }
}
