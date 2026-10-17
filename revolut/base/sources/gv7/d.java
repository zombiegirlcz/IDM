package gv7;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f147073a;

    public d(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f147073a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f147073a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f147073a.equals(((d) obj2).f147073a);
    }

    public final int hashCode() {
        return this.f147073a.hashCode();
    }
}
