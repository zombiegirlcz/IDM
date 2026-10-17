package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class p3 {

    @NotNull
    public static final o3 Companion = new o3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147496c;

    public /* synthetic */ p3(long j2, String str, int i, int i2) {
        if (7 != (i & 7)) {
            qlm.j1.f(n3.f147475a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147494a = i2;
        this.f147495b = str;
        this.f147496c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return this.f147494a == p3Var.f147494a && Intrinsics.f(this.f147495b, p3Var.f147495b) && this.f147496c == p3Var.f147496c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147496c) + p.a.c(Integer.hashCode(this.f147494a) * 31, 31, this.f147495b);
    }
}
