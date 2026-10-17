package gz9;

import jq9.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f147973a;

    public b(k recentRecipient) {
        Intrinsics.checkNotNullParameter(recentRecipient, "recentRecipient");
        this.f147973a = recentRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f147973a, ((b) obj2).f147973a);
    }

    public final int hashCode() {
        return this.f147973a.hashCode();
    }
}
