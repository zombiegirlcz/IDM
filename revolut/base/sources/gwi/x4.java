package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class x4 {

    @NotNull
    public static final w4 Companion = new w4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147561a;

    public /* synthetic */ x4(int i, String str) {
        if (1 == (i & 1)) {
            this.f147561a = str;
        } else {
            qlm.j1.f(v4.f147542a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x4) && Intrinsics.f(this.f147561a, ((x4) obj2).f147561a);
    }

    public final int hashCode() {
        return this.f147561a.hashCode();
    }
}
