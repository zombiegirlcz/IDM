package vm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290546a;

    public c(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f290546a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f290546a, ((c) obj2).f290546a);
    }

    public final int hashCode() {
        return this.f290546a.hashCode();
    }
}
