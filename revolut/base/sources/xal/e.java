package xal;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f303906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.c f303907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tal.a f303908c;

    public e(ArrayList items, tal.c cVar, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f303906a = items;
        this.f303907b = cVar;
        this.f303908c = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f303906a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f303906a.equals(eVar.f303906a) && Intrinsics.f(this.f303907b, eVar.f303907b) && this.f303908c.equals(eVar.f303908c);
    }

    public final int hashCode() {
        int iHashCode = this.f303906a.hashCode() * 31;
        tal.c cVar = this.f303907b;
        return this.f303908c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
