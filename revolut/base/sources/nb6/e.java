package nb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213992a;

    public e(String charityId) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f213992a = charityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f213992a, ((e) obj2).f213992a);
    }

    public final int hashCode() {
        return this.f213992a.hashCode();
    }
}
