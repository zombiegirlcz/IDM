package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class y3 {

    @NotNull
    public static final x3 Companion = new x3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ld7.f f147571c;

    public /* synthetic */ y3(int i, String str, String str2, ld7.f fVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(w3.f147553a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147569a = str;
        this.f147570b = str2;
        this.f147571c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f147569a, y3Var.f147569a) && Intrinsics.f(this.f147570b, y3Var.f147570b) && Intrinsics.f(this.f147571c, y3Var.f147571c);
    }

    public final int hashCode() {
        return this.f147571c.f194043a.hashCode() + p.a.c(this.f147569a.hashCode() * 31, 31, this.f147570b);
    }

    public y3(String icon, String title, ld7.f description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f147569a = icon;
        this.f147570b = title;
        this.f147571c = description;
    }
}
