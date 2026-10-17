package ny3;

import ht3.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f220626a;

    public c(l0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f220626a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f220626a, ((c) obj2).f220626a);
    }

    public final int hashCode() {
        return this.f220626a.hashCode();
    }
}
