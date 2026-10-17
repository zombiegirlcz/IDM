package gwi;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f147480c = {null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147482b;

    public /* synthetic */ o(int i, int i2, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(m.f147453a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147481a = i2;
        this.f147482b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f147481a == oVar.f147481a && Intrinsics.f(this.f147482b, oVar.f147482b);
    }

    public final int hashCode() {
        return this.f147482b.hashCode() + (Integer.hashCode(this.f147481a) * 31);
    }
}
