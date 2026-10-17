package gvi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f147187a;

    public k(ArrayList travellersDetails) {
        Intrinsics.checkNotNullParameter(travellersDetails, "travellersDetails");
        this.f147187a = travellersDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f147187a.equals(((k) obj2).f147187a);
    }

    public final int hashCode() {
        return this.f147187a.hashCode();
    }
}
