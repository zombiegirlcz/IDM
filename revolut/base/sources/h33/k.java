package h33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149029b;

    public k(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f149028a = items;
        this.f149029b = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof k) {
            return new p(((k) oldState).f149029b != this.f149029b);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f149028a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f149028a, kVar.f149028a) && this.f149029b == kVar.f149029b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149029b) + (this.f149028a.hashCode() * 31);
    }
}
