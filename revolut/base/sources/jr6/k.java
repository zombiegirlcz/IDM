package jr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177945a;

    public k(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f177945a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f177945a, ((k) obj2).f177945a);
    }

    public final int hashCode() {
        return this.f177945a.hashCode();
    }
}
