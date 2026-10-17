package urd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f282279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f282280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f282281c;
    public final ipd.f d;

    public f(aim.e items, b headerModel, List actions, ipd.f background) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f282279a = items;
        this.f282280b = headerModel;
        this.f282281c = actions;
        this.d = background;
    }

    @Override // cli.p
    public final List c() {
        return this.f282279a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f282279a, fVar.f282279a) && Intrinsics.f(this.f282280b, fVar.f282280b) && Intrinsics.f(this.f282281c, fVar.f282281c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f282280b.hashCode() + (this.f282279a.hashCode() * 31)) * 31, 31, this.f282281c);
    }
}
