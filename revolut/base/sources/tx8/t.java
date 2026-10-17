package tx8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f275363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String profileId, int i) {
        super("system_esim", 7);
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        this.f275363c = profileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f275363c, ((t) obj2).f275363c);
    }

    public final int hashCode() {
        return this.f275363c.hashCode() * 961;
    }
}
