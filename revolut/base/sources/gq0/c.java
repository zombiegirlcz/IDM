package gq0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f145492a;

    public c(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f145492a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f145492a, ((c) obj2).f145492a);
    }

    public final int hashCode() {
        return this.f145492a.hashCode();
    }
}
