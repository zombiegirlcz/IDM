package ul8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280905a;

    public f(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter("BUTTON_LOADING_ID", "buttonTag");
        this.f280905a = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f280905a, ((f) obj2).f280905a);
    }

    public final int hashCode() {
        return (this.f280905a.hashCode() * 31) - 1297399221;
    }
}
