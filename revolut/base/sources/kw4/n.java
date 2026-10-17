package kw4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f190237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f190238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f190239c;

    public n(m toolbarModel, List items, l buttonModel) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f190237a = toolbarModel;
        this.f190238b = items;
        this.f190239c = buttonModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f190238b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f190237a, nVar.f190237a) && Intrinsics.f(this.f190238b, nVar.f190238b) && Intrinsics.f(this.f190239c, nVar.f190239c);
    }

    public final int hashCode() {
        return this.f190239c.hashCode() + p.a.d(this.f190237a.hashCode() * 31, 31, this.f190238b);
    }
}
