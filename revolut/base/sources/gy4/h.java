package gy4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f147824a;

    public h(j selectedValue) {
        Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
        this.f147824a = selectedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f147824a, ((h) obj2).f147824a);
    }

    public final int hashCode() {
        return this.f147824a.hashCode();
    }
}
