package n88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213282a;

    public e(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f213282a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f213282a, ((e) obj2).f213282a);
    }

    public final int hashCode() {
        return this.f213282a.hashCode();
    }
}
