package i6g;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158998a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158998a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f158998a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f158998a, ((i) obj2).f158998a);
    }

    public final int hashCode() {
        return this.f158998a.hashCode();
    }
}
