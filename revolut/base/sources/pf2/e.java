package pf2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235412a;

    public e(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f235412a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f235412a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f235412a, ((e) obj2).f235412a);
    }

    public final int hashCode() {
        return this.f235412a.hashCode();
    }
}
