package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147518b;

    public /* synthetic */ t(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(r.f147503a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147517a = str;
        this.f147518b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f147517a, tVar.f147517a) && Intrinsics.f(this.f147518b, tVar.f147518b);
    }

    public final int hashCode() {
        return this.f147518b.hashCode() + (this.f147517a.hashCode() * 31);
    }
}
