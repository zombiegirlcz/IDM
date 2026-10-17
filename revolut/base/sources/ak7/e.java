package ak7;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5728a;

    public e(String enteredText) {
        Intrinsics.checkNotNullParameter(enteredText, "enteredText");
        this.f5728a = enteredText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f5728a, ((e) obj2).f5728a);
    }

    public final int hashCode() {
        return this.f5728a.hashCode();
    }
}
