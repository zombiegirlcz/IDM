package l92;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193026a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193026a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f193026a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f193026a, ((c) obj2).f193026a);
    }

    public final int hashCode() {
        return this.f193026a.hashCode();
    }
}
