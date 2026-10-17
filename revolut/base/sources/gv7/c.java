package gv7;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147072a;

    public c(List values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f147072a = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f147072a, ((c) obj2).f147072a);
    }

    public final int hashCode() {
        return this.f147072a.hashCode();
    }
}
