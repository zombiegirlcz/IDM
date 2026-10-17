package ebl;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.c f124387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tal.a f124388c;

    public e(List items, tal.c twinButtonModel, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(twinButtonModel, "twinButtonModel");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f124386a = items;
        this.f124387b = twinButtonModel;
        this.f124388c = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f124386a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f124386a, eVar.f124386a) && Intrinsics.f(this.f124387b, eVar.f124387b) && Intrinsics.f(this.f124388c, eVar.f124388c);
    }

    public final int hashCode() {
        return this.f124388c.hashCode() + ((this.f124387b.hashCode() + (this.f124386a.hashCode() * 31)) * 31);
    }
}
