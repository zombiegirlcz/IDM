package ds4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f117219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117220b;

    public s(r toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f117219a = toolbarModel;
        this.f117220b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f117220b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f117219a, sVar.f117219a) && Intrinsics.f(this.f117220b, sVar.f117220b);
    }

    public final int hashCode() {
        return this.f117220b.hashCode() + (this.f117219a.f117218a.hashCode() * 31);
    }
}
