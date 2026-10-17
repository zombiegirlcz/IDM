package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class r5 {

    @NotNull
    public static final q5 Companion = new q5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147509b;

    public /* synthetic */ r5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p5.f147497a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147508a = str;
        this.f147509b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj2;
        return Intrinsics.f(this.f147508a, r5Var.f147508a) && Intrinsics.f(this.f147509b, r5Var.f147509b);
    }

    public final int hashCode() {
        int iHashCode = this.f147508a.hashCode() * 31;
        String str = this.f147509b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public r5(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f147508a = type;
        this.f147509b = str;
    }
}
