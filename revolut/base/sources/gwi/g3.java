package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class g3 {

    @NotNull
    public static final f3 Companion = new f3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147401a;

    public /* synthetic */ g3(int i, String str) {
        if (1 == (i & 1)) {
            this.f147401a = str;
        } else {
            qlm.j1.f(e3.f147378a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g3) && Intrinsics.f(this.f147401a, ((g3) obj2).f147401a);
    }

    public final int hashCode() {
        return this.f147401a.hashCode();
    }

    public g3(String passType) {
        Intrinsics.checkNotNullParameter(passType, "passType");
        this.f147401a = passType;
    }
}
