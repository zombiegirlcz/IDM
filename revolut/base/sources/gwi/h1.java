package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f147407b = {yhm.j.c(yhm.k.PUBLICATION, new gvi.b(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147408a;

    public /* synthetic */ h1(int i, List list) {
        if (1 == (i & 1)) {
            this.f147408a = list;
        } else {
            qlm.j1.f(f1.f147392a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && Intrinsics.f(this.f147408a, ((h1) obj2).f147408a);
    }

    public final int hashCode() {
        return this.f147408a.hashCode();
    }

    public h1(ArrayList ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f147408a = ids;
    }
}
