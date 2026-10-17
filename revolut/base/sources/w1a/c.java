package w1a;

import cli.o;
import cli.p;
import cli.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293813a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f293813a = items;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f293813a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f293813a, ((c) obj2).f293813a);
    }

    public final int hashCode() {
        return this.f293813a.hashCode();
    }

    public c() {
        this(f0.f322471a);
    }
}
