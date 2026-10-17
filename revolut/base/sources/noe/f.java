package noe;

import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218010a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218010a = items;
    }

    @Override // jki.m
    public final o b(m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        f fVar = (f) oldState;
        boolean zIsEmpty = fVar.f218010a.isEmpty();
        List list = this.f218010a;
        if (!zIsEmpty && list.isEmpty()) {
            list = fVar.f218010a;
        }
        return new e(list);
    }

    @Override // jki.n
    public final List c() {
        return this.f218010a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f218010a, ((f) obj2).f218010a);
    }

    public final int hashCode() {
        return this.f218010a.hashCode();
    }
}
