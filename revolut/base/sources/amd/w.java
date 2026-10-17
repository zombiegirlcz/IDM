package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6352a;

    public w(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f6352a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f6352a, ((w) obj2).f6352a);
    }

    public final int hashCode() {
        return this.f6352a.hashCode();
    }
}
