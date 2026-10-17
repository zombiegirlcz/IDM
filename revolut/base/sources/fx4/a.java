package fx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138719a;

    public a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f138719a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f138719a, ((a) obj2).f138719a);
    }

    public final int hashCode() {
        return this.f138719a.hashCode();
    }
}
