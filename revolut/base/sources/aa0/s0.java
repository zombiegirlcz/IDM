package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2741a;

    public s0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f2741a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f2741a, ((s0) obj2).f2741a);
    }

    public final int hashCode() {
        return this.f2741a.hashCode();
    }
}
