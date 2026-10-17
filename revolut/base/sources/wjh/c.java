package wjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2b.a f298096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b2b.a content) {
        super("MARGIN");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f298096b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f298096b, ((c) obj2).f298096b);
    }

    public final int hashCode() {
        return this.f298096b.hashCode();
    }
}
