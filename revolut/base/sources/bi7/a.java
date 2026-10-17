package bi7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ph7.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15437b;

    public a(c key, List instruments) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f15436a = key;
        this.f15437b = instruments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f15436a == aVar.f15436a && Intrinsics.f(this.f15437b, aVar.f15437b);
    }

    public final int hashCode() {
        return this.f15437b.hashCode() + (this.f15436a.hashCode() * 31);
    }
}
