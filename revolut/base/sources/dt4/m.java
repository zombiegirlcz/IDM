package dt4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f117374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f117376c;

    public m(l toolbarModel, List items, k buttonModel) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f117374a = toolbarModel;
        this.f117375b = items;
        this.f117376c = buttonModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f117375b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f117374a, mVar.f117374a) && Intrinsics.f(this.f117375b, mVar.f117375b) && Intrinsics.f(this.f117376c, mVar.f117376c);
    }

    public final int hashCode() {
        return this.f117376c.hashCode() + p.a.d(this.f117374a.hashCode() * 31, 31, this.f117375b);
    }
}
