package a26;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f672a;

    public e(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f672a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f672a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f672a, ((e) obj2).f672a);
    }

    public final int hashCode() {
        return this.f672a.hashCode();
    }
}
