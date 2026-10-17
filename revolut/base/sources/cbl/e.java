package cbl;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.a f22895b;

    public e(ArrayList items, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f22894a = items;
        this.f22895b = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f22894a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f22894a.equals(eVar.f22894a) && this.f22895b.equals(eVar.f22895b);
    }

    public final int hashCode() {
        return this.f22895b.hashCode() + (this.f22894a.hashCode() * 31);
    }
}
