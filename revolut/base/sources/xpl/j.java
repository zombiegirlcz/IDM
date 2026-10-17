package xpl;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308017a;

    public j(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308017a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f308017a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f308017a, ((j) obj2).f308017a);
    }

    public final int hashCode() {
        return this.f308017a.hashCode();
    }
}
