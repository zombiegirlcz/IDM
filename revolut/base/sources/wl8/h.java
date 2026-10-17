package wl8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298449a;

    public h(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter("BUTTON_LOADING_ID", "buttonTag");
        this.f298449a = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f298449a, ((h) obj2).f298449a);
    }

    public final int hashCode() {
        return (this.f298449a.hashCode() * 31) - 1297399221;
    }
}
