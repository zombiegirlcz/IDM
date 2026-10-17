package r8f;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6f.a f252425a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f252425a, ((d) obj2).f252425a);
    }

    public final int hashCode() {
        return this.f252425a.hashCode();
    }

    public d(j6f.a allocationItems) {
        Intrinsics.checkNotNullParameter(allocationItems, "allocationItems");
        this.f252425a = allocationItems;
    }

    public /* synthetic */ d(int i) {
        this(new j6f.a(0));
    }
}
