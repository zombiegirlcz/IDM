package srd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f265171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f265172c;

    public f(aim.e items, b headerModel, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f265170a = items;
        this.f265171b = headerModel;
        this.f265172c = actions;
    }

    @Override // cli.p
    public final List c() {
        return this.f265170a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f265170a, fVar.f265170a) && Intrinsics.f(this.f265171b, fVar.f265171b) && Intrinsics.f(this.f265172c, fVar.f265172c);
    }

    public final int hashCode() {
        return this.f265172c.hashCode() + ((this.f265171b.hashCode() + (this.f265170a.hashCode() * 31)) * 31);
    }
}
