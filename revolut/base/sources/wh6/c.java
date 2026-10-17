package wh6;

import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f297420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f297421b;

    public /* synthetic */ c(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            j1.f(a.f297419a.getDescriptor(), i, 3);
            throw null;
        }
        this.f297420a = i2;
        this.f297421b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f297420a == cVar.f297420a && this.f297421b == cVar.f297421b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f297421b) + (Integer.hashCode(this.f297420a) * 31);
    }
}
