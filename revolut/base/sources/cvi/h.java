package cvi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw0.a f109472c;

    public h(List items, boolean z, lw0.a navBarBottomSheetHeaderModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarBottomSheetHeaderModel, "navBarBottomSheetHeaderModel");
        this.f109470a = items;
        this.f109471b = z;
        this.f109472c = navBarBottomSheetHeaderModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f109470a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f109470a, hVar.f109470a) && this.f109471b == hVar.f109471b && this.f109472c.equals(hVar.f109472c);
    }

    public final int hashCode() {
        return this.f109472c.hashCode() + j6.a.c(this.f109470a.hashCode() * 31, 31, this.f109471b);
    }
}
