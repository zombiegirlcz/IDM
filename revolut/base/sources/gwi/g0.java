package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f147399b;

    public /* synthetic */ g0(int i, long j2, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(e0.f147376a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147398a = str;
        this.f147399b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f147398a, g0Var.f147398a) && this.f147399b == g0Var.f147399b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147399b) + (this.f147398a.hashCode() * 31);
    }

    public g0(String description, long j2) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f147398a = description;
        this.f147399b = j2;
    }
}
