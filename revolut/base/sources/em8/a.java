package em8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127635a;

    public a(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter("BUTTON_LOADING_ID", "buttonTag");
        this.f127635a = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f127635a, ((a) obj2).f127635a);
    }

    public final int hashCode() {
        return (this.f127635a.hashCode() * 31) - 1297399221;
    }
}
