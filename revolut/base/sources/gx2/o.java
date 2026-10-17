package gx2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147635a;

    public o(List cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f147635a = cards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f147635a, ((o) obj2).f147635a);
    }

    public final int hashCode() {
        return this.f147635a.hashCode();
    }
}
