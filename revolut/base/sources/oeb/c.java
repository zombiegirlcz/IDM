package oeb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f224572a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224572a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f224572a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f224572a, ((c) obj2).f224572a);
    }

    public final int hashCode() {
        return this.f224572a.hashCode();
    }
}
