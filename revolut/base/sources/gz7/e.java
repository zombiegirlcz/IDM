package gz7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147945a;

    public e(List detailsList) {
        Intrinsics.checkNotNullParameter(detailsList, "detailsList");
        this.f147945a = detailsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f147945a, ((e) obj2).f147945a);
    }

    public final int hashCode() {
        return this.f147945a.hashCode();
    }
}
