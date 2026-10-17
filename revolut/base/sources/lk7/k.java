package lk7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f196281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f196282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f196283c;

    public k(ArrayList items, h navBarState, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f196281a = items;
        this.f196282b = navBarState;
        this.f196283c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f196281a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f196281a.equals(kVar.f196281a) && Intrinsics.f(this.f196282b, kVar.f196282b) && this.f196283c == kVar.f196283c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196283c) + ((this.f196282b.hashCode() + (this.f196281a.hashCode() * 31)) * 31);
    }
}
