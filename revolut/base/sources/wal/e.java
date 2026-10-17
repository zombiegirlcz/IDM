package wal;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f295976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.c f295977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tal.a f295978c;

    public e(ArrayList items, tal.c cVar, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f295976a = items;
        this.f295977b = cVar;
        this.f295978c = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f295976a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f295976a.equals(eVar.f295976a) && Intrinsics.f(this.f295977b, eVar.f295977b) && this.f295978c.equals(eVar.f295978c);
    }

    public final int hashCode() {
        int iHashCode = this.f295976a.hashCode() * 31;
        tal.c cVar = this.f295977b;
        return this.f295978c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
