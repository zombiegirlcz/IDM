package abl;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.a f2985b;

    public e(ArrayList items, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f2984a = items;
        this.f2985b = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f2984a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f2984a.equals(eVar.f2984a) && this.f2985b.equals(eVar.f2985b);
    }

    public final int hashCode() {
        return this.f2985b.hashCode() + (this.f2984a.hashCode() * 31);
    }
}
