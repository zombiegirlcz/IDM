package iqh;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f167863a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f167863a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f167863a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f167863a, ((m) obj2).f167863a);
    }

    public final int hashCode() {
        return this.f167863a.hashCode();
    }
}
