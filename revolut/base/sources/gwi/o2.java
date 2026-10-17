package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class o2 {

    @NotNull
    public static final n2 Companion = new n2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147484a;

    public /* synthetic */ o2(int i, String str) {
        if (1 == (i & 1)) {
            this.f147484a = str;
        } else {
            qlm.j1.f(m2.f147466a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o2) && Intrinsics.f(this.f147484a, ((o2) obj2).f147484a);
    }

    public final int hashCode() {
        return this.f147484a.hashCode();
    }
}
