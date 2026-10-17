package rrg;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f256835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f256836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f256837c;

    public c(int i, ArrayList items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f256835a = items;
        this.f256836b = menuItems;
        this.f256837c = i;
    }

    @Override // jki.n
    public final List c() {
        return this.f256835a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f256835a.equals(cVar.f256835a) && Intrinsics.f(this.f256836b, cVar.f256836b) && this.f256837c == cVar.f256837c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f256837c) + p.a.d(this.f256835a.hashCode() * 31, 31, this.f256836b);
    }
}
