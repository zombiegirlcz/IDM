package kac;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182453a;

    public a(String bookingManagementUrl) {
        Intrinsics.checkNotNullParameter(bookingManagementUrl, "bookingManagementUrl");
        this.f182453a = bookingManagementUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f182453a, ((a) obj2).f182453a);
    }

    public final int hashCode() {
        return this.f182453a.hashCode();
    }
}
