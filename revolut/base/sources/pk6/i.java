package pk6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236931a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f236931a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f236931a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f236931a, ((i) obj2).f236931a);
    }

    public final int hashCode() {
        return this.f236931a.hashCode();
    }
}
