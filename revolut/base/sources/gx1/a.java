package gx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p02.a f147611a;

    public a(p02.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f147611a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f147611a, ((a) obj2).f147611a);
    }

    public final int hashCode() {
        return this.f147611a.hashCode();
    }
}
