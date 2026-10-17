package uy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f284058a;

    public c(i content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f284058a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f284058a, ((c) obj2).f284058a);
    }

    public final int hashCode() {
        return this.f284058a.hashCode();
    }
}
