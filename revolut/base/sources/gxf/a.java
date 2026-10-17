package gxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147745a;

    public a(String uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f147745a = uri2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f147745a, ((a) obj2).f147745a);
    }

    public final int hashCode() {
        return this.f147745a.hashCode();
    }
}
