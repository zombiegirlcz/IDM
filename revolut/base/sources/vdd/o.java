package vdd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287916a;

    public o(String accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f287916a = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f287916a, ((o) obj2).f287916a);
    }

    public final int hashCode() {
        return this.f287916a.hashCode();
    }
}
