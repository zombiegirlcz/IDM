package gx2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f147633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f147634b;

    public m(ArrayList topItems, ArrayList bottomItems) {
        Intrinsics.checkNotNullParameter(topItems, "topItems");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        this.f147633a = topItems;
        this.f147634b = bottomItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f147633a.equals(mVar.f147633a) && this.f147634b.equals(mVar.f147634b);
    }

    public final int hashCode() {
        return this.f147634b.hashCode() + (this.f147633a.hashCode() * 31);
    }
}
