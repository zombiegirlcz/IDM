package ts7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274047a;

    public f(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f274047a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f274047a, ((f) obj2).f274047a);
    }

    public final int hashCode() {
        return this.f274047a.hashCode();
    }
}
