package gy4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f147821a;

    public d(j selectedValue) {
        Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
        this.f147821a = selectedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f147821a, ((d) obj2).f147821a);
    }

    public final int hashCode() {
        return this.f147821a.hashCode();
    }
}
