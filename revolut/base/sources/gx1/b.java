package gx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p02.a f147612a;

    public b(p02.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f147612a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f147612a, ((b) obj2).f147612a);
    }

    public final int hashCode() {
        return this.f147612a.hashCode();
    }
}
