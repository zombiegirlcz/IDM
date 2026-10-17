package uef;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f279356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279357b;

    public i(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f279356a = z;
        this.f279357b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f279357b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f279356a == iVar.f279356a && Intrinsics.f(this.f279357b, iVar.f279357b);
    }

    public final int hashCode() {
        return this.f279357b.hashCode() + (Boolean.hashCode(this.f279356a) * 31);
    }
}
