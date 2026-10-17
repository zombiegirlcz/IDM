package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147377a;

    public /* synthetic */ e1(int i, String str) {
        if (1 == (i & 1)) {
            this.f147377a = str;
        } else {
            qlm.j1.f(c1.f147361a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && Intrinsics.f(this.f147377a, ((e1) obj2).f147377a);
    }

    public final int hashCode() {
        return this.f147377a.hashCode();
    }
}
