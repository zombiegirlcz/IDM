package gvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147142a;

    public q(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f147142a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f147142a, ((q) obj2).f147142a);
    }

    public final int hashCode() {
        return this.f147142a.hashCode();
    }
}
