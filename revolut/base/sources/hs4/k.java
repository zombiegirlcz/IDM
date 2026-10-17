package hs4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f154995b;

    public k(List items, j toolbarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        this.f154994a = items;
        this.f154995b = toolbarModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f154994a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f154994a, kVar.f154994a) && Intrinsics.f(this.f154995b, kVar.f154995b);
    }

    public final int hashCode() {
        return this.f154995b.hashCode() + (this.f154994a.hashCode() * 31);
    }
}
