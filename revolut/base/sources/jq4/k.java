package jq4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f177455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f177456b;

    public k(j toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f177455a = toolbarModel;
        this.f177456b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f177456b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f177455a, kVar.f177455a) && Intrinsics.f(this.f177456b, kVar.f177456b);
    }

    public final int hashCode() {
        return this.f177456b.hashCode() + (this.f177455a.hashCode() * 31);
    }
}
