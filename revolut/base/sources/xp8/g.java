package xp8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f307906a;

    public g(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f307906a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f307906a, ((g) obj2).f307906a);
    }

    public final int hashCode() {
        return this.f307906a.hashCode();
    }
}
