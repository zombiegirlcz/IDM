package y7d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f311481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311482b;

    public p(q userInputPosition, String userInput) {
        Intrinsics.checkNotNullParameter(userInputPosition, "userInputPosition");
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        this.f311481a = userInputPosition;
        this.f311482b = userInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f311481a == pVar.f311481a && Intrinsics.f(this.f311482b, pVar.f311482b);
    }

    public final int hashCode() {
        return this.f311482b.hashCode() + (this.f311481a.hashCode() * 31);
    }
}
