package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147512c;

    public /* synthetic */ s0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(q0.f147498a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147510a = str;
        this.f147511b = str2;
        this.f147512c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f147510a, s0Var.f147510a) && Intrinsics.f(this.f147511b, s0Var.f147511b) && Intrinsics.f(this.f147512c, s0Var.f147512c);
    }

    public final int hashCode() {
        String str = this.f147510a;
        return this.f147512c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f147511b);
    }

    public s0(String str, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f147510a = str;
        this.f147511b = firstName;
        this.f147512c = lastName;
    }
}
