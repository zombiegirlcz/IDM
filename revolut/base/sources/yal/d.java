package yal;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f312071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.c f312072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tal.a f312073c;

    public d(ArrayList items, tal.c cVar, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f312071a = items;
        this.f312072b = cVar;
        this.f312073c = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f312071a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f312071a.equals(dVar.f312071a) && Intrinsics.f(this.f312072b, dVar.f312072b) && this.f312073c.equals(dVar.f312073c);
    }

    public final int hashCode() {
        int iHashCode = this.f312071a.hashCode() * 31;
        tal.c cVar = this.f312072b;
        return this.f312073c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
