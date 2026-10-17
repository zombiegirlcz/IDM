package pm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237479a;

    public c(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f237479a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f237479a, ((c) obj2).f237479a);
    }

    public final int hashCode() {
        return this.f237479a.hashCode();
    }
}
