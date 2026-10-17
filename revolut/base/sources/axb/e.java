package axb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10916a;

    public e(String userVoucherId) {
        Intrinsics.checkNotNullParameter(userVoucherId, "userVoucherId");
        this.f10916a = userVoucherId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f10916a, ((e) obj2).f10916a);
    }

    public final int hashCode() {
        return this.f10916a.hashCode();
    }
}
