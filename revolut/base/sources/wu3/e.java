package wu3;

import ht3.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f300056a;

    public e(l0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f300056a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f300056a, ((e) obj2).f300056a);
    }

    public final int hashCode() {
        return this.f300056a.hashCode();
    }
}
