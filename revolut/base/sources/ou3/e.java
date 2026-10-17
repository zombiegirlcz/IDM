package ou3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f229788a;

    public e(o prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f229788a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f229788a, ((e) obj2).f229788a);
    }

    public final int hashCode() {
        return this.f229788a.hashCode();
    }
}
