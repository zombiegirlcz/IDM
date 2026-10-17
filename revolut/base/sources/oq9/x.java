package oq9;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227862a;

    public x(String memberId) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        this.f227862a = memberId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f227862a, ((x) obj2).f227862a);
    }

    public final int hashCode() {
        return this.f227862a.hashCode();
    }
}
