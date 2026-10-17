package j78;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171865a;

    public b(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f171865a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f171865a, ((b) obj2).f171865a);
    }

    public final int hashCode() {
        return this.f171865a.hashCode();
    }
}
