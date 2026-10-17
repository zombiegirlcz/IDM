package gvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147141a;

    public p(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f147141a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f147141a, ((p) obj2).f147141a);
    }

    public final int hashCode() {
        return this.f147141a.hashCode();
    }
}
