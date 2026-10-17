package ksg;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir2.h f189459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f189460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ir2.d f189461c;

    public i(ir2.c fincrimeHomeScreenModel) {
        Intrinsics.checkNotNullParameter(fincrimeHomeScreenModel, "fincrimeHomeScreenModel");
        ir2.h navBarModel = fincrimeHomeScreenModel.f167983a;
        List items = fincrimeHomeScreenModel.f167984b;
        ir2.d twinButtonBlockModel = fincrimeHomeScreenModel.f167985c;
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(twinButtonBlockModel, "twinButtonBlockModel");
        this.f189459a = navBarModel;
        this.f189460b = items;
        this.f189461c = twinButtonBlockModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f189460b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f189459a, iVar.f189459a) && Intrinsics.f(this.f189460b, iVar.f189460b) && Intrinsics.f(this.f189461c, iVar.f189461c);
    }

    public final int hashCode() {
        return this.f189461c.hashCode() + p.a.d(this.f189459a.hashCode() * 31, 31, this.f189460b);
    }
}
