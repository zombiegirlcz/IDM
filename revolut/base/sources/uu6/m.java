package uu6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List items) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283151b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f283151b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f283151b, ((m) obj2).f283151b);
    }

    public final int hashCode() {
        return this.f283151b.hashCode();
    }
}
