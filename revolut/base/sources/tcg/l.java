package tcg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269795a;

    public l(String prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f269795a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f269795a, ((l) obj2).f269795a);
    }

    public final int hashCode() {
        return this.f269795a.hashCode();
    }
}
