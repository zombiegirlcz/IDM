package snd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264533a;

    public g(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f264533a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f264533a, ((g) obj2).f264533a);
    }

    public final int hashCode() {
        return this.f264533a.hashCode();
    }
}
