package ee1;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125062a;

    public e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f125062a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f125062a, ((e) obj2).f125062a);
    }

    public final int hashCode() {
        return this.f125062a.hashCode();
    }
}
