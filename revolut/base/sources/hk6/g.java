package hk6;

import cli.p;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractList f152854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152855b;

    public g(AbstractList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152854a = items;
        this.f152855b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f152854a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f152854a.equals(gVar.f152854a) && this.f152855b == gVar.f152855b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152855b) + (this.f152854a.hashCode() * 31);
    }
}
