package gzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f148121b;

    public s(aim.e items, o headerData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f148120a = items;
        this.f148121b = headerData;
    }

    @Override // cli.p
    public final List c() {
        return this.f148120a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f148120a, sVar.f148120a) && Intrinsics.f(this.f148121b, sVar.f148121b);
    }

    public final int hashCode() {
        return this.f148121b.hashCode() + (this.f148120a.hashCode() * 31);
    }
}
