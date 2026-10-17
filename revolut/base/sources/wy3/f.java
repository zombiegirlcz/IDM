package wy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu3.a f301073a;

    public f(bu3.a content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f301073a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f301073a, ((f) obj2).f301073a);
    }

    public final int hashCode() {
        return this.f301073a.hashCode();
    }
}
