package ji8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj0.b f174386a;

    public e(bj0.b gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f174386a = gender;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f174386a == ((e) obj2).f174386a;
    }

    public final int hashCode() {
        return this.f174386a.hashCode();
    }
}
