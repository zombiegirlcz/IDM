package j56;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f171608a;

    public d(f0 items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171608a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f171608a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f171608a, ((d) obj2).f171608a);
    }

    public final int hashCode() {
        return this.f171608a.hashCode();
    }
}
