package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class q4 {

    @NotNull
    public static final p4 Companion = new p4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147502b;

    public /* synthetic */ q4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(o4.f147485a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147501a = str;
        this.f147502b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return Intrinsics.f(this.f147501a, q4Var.f147501a) && Intrinsics.f(this.f147502b, q4Var.f147502b);
    }

    public final int hashCode() {
        return this.f147502b.hashCode() + (this.f147501a.hashCode() * 31);
    }

    public q4(String code, String label) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f147501a = code;
        this.f147502b = label;
    }
}
