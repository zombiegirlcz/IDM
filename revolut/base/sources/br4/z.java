package br4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f17927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17928b;

    public z(y toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17927a = toolbarModel;
        this.f17928b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f17928b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f17927a, zVar.f17927a) && Intrinsics.f(this.f17928b, zVar.f17928b);
    }

    public final int hashCode() {
        return this.f17928b.hashCode() + (this.f17927a.hashCode() * 31);
    }
}
