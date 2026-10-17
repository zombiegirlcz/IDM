package p6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233289a;

    public l(String rawText) {
        Intrinsics.checkNotNullParameter(rawText, "rawText");
        this.f233289a = rawText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f233289a, ((l) obj2).f233289a);
    }

    public final int hashCode() {
        return this.f233289a.hashCode();
    }
}
