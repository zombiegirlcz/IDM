package qu3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f249212a;

    public m(l0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f249212a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f249212a, ((m) obj2).f249212a);
    }

    public final int hashCode() {
        return this.f249212a.hashCode();
    }
}
