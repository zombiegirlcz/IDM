package wy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f301076a;

    public h(q content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f301076a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f301076a, ((h) obj2).f301076a);
    }

    public final int hashCode() {
        return this.f301076a.hashCode();
    }
}
