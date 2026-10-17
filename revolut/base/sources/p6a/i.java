package p6a;

import cli.o;
import cli.p;
import cli.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f233242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233243b;

    public i(List items, String searchQuery) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f233242a = items;
        this.f233243b = searchQuery;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof i) {
            return new h(!Intrinsics.f(((i) oldState).f233243b, this.f233243b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f233242a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f233242a, iVar.f233242a) && Intrinsics.f(this.f233243b, iVar.f233243b);
    }

    public final int hashCode() {
        return this.f233243b.hashCode() + (this.f233242a.hashCode() * 31);
    }
}
