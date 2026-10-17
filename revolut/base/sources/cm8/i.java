package cm8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25163a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25163a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f25163a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f25163a, ((i) obj2).f25163a);
    }

    public final int hashCode() {
        return this.f25163a.hashCode();
    }
}
