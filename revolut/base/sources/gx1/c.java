package gx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p02.a f147613a;

    public c(p02.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f147613a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f147613a, ((c) obj2).f147613a);
    }

    public final int hashCode() {
        return this.f147613a.hashCode();
    }
}
