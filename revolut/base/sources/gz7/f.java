package gz7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f147946a;

    public f(c petDetails) {
        Intrinsics.checkNotNullParameter(petDetails, "petDetails");
        this.f147946a = petDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f147946a, ((f) obj2).f147946a);
    }

    public final int hashCode() {
        return this.f147946a.hashCode();
    }
}
