package ja8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj0.b f172461a;

    public e(bj0.b gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f172461a = gender;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f172461a == ((e) obj2).f172461a;
    }

    public final int hashCode() {
        return this.f172461a.hashCode();
    }
}
