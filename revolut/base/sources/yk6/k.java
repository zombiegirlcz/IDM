package yk6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f314586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f314587b;

    public k(i headerModel, List items) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314586a = headerModel;
        this.f314587b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f314587b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f314586a, kVar.f314586a) && Intrinsics.f(this.f314587b, kVar.f314587b);
    }

    public final int hashCode() {
        return this.f314587b.hashCode() + (this.f314586a.hashCode() * 31);
    }
}
