package n79;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kw0.g;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f213049b;

    public b(List items, g photoHeaderModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(photoHeaderModel, "photoHeaderModel");
        this.f213048a = items;
        this.f213049b = photoHeaderModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f213048a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f213048a, bVar.f213048a) && Intrinsics.f(this.f213049b, bVar.f213049b);
    }

    public final int hashCode() {
        return this.f213049b.hashCode() + (this.f213048a.hashCode() * 31);
    }
}
