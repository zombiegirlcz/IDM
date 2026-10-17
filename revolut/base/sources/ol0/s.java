package ol0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226307a;

    public s(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f226307a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f226307a, ((s) obj2).f226307a);
    }

    public final int hashCode() {
        return this.f226307a.hashCode();
    }
}
