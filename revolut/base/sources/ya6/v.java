package ya6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311984a;

    public v(String charityId) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f311984a = charityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f311984a, ((v) obj2).f311984a);
    }

    public final int hashCode() {
        return this.f311984a.hashCode();
    }
}
