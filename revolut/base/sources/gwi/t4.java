package gwi;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class t4 {

    @NotNull
    public static final s4 Companion = new s4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f147524b = {yhm.j.c(yhm.k.PUBLICATION, new gvi.b(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147525a;

    public /* synthetic */ t4(int i, List list) {
        if (1 == (i & 1)) {
            this.f147525a = list;
        } else {
            qlm.j1.f(r4.f147507a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t4) && Intrinsics.f(this.f147525a, ((t4) obj2).f147525a);
    }

    public final int hashCode() {
        return this.f147525a.hashCode();
    }
}
