package aw1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f10659b;

    public n(List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f10658a = items;
        this.f10659b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f10658a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f10658a, nVar.f10658a) && this.f10659b.equals(nVar.f10659b);
    }

    public final int hashCode() {
        return this.f10659b.hashCode() + (this.f10658a.hashCode() * 31);
    }
}
