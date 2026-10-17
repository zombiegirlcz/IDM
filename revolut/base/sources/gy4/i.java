package gy4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f147825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147826b;

    public i(List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f147825a = header;
        this.f147826b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f147826b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f147825a.equals(iVar.f147825a) && Intrinsics.f(this.f147826b, iVar.f147826b);
    }

    public final int hashCode() {
        return this.f147826b.hashCode() + (this.f147825a.hashCode() * 31);
    }
}
