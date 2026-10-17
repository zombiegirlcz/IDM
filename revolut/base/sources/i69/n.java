package i69;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158900a;

    public n(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158900a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f158900a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f158900a, ((n) obj2).f158900a);
    }

    public final int hashCode() {
        return this.f158900a.hashCode();
    }
}
