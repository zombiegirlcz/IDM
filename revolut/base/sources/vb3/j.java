package vb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287385a;

    public j(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f287385a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f287385a, ((j) obj2).f287385a);
    }

    public final int hashCode() {
        return this.f287385a.hashCode();
    }
}
