package aye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f11146b;

    public l(List items, k toolbarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        this.f11145a = items;
        this.f11146b = toolbarModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f11145a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f11145a, lVar.f11145a) && Intrinsics.f(this.f11146b, lVar.f11146b);
    }

    public final int hashCode() {
        return this.f11146b.hashCode() + (this.f11145a.hashCode() * 31);
    }
}
