package iyg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169740a;

    public j(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f169740a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f169740a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f169740a, ((j) obj2).f169740a);
    }

    public final int hashCode() {
        return this.f169740a.hashCode();
    }
}
