package dcf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f112974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f112975c;
    public final rp0.y d;
    public final rp0.y e;
    public final rp0.y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f112976g;

    public y(List items, z navBarViewModel, aw0.e eVar, rp0.y yVar, rp0.y yVar2, rp0.y yVar3, v eligibilityState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarViewModel, "navBarViewModel");
        Intrinsics.checkNotNullParameter(eligibilityState, "eligibilityState");
        this.f112973a = items;
        this.f112974b = navBarViewModel;
        this.f112975c = eVar;
        this.d = yVar;
        this.e = yVar2;
        this.f = yVar3;
        this.f112976g = eligibilityState;
    }

    @Override // jki.n
    public final List c() {
        return this.f112973a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f112973a, yVar.f112973a) && Intrinsics.f(this.f112974b, yVar.f112974b) && Intrinsics.f(this.f112975c, yVar.f112975c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f112976g, yVar.f112976g);
    }

    public final int hashCode() {
        int iHashCode = (this.f112974b.hashCode() + (this.f112973a.hashCode() * 31)) * 31;
        aw0.e eVar = this.f112975c;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        rp0.y yVar = this.d;
        int iHashCode3 = (iHashCode2 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        rp0.y yVar2 = this.e;
        int iHashCode4 = (iHashCode3 + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        rp0.y yVar3 = this.f;
        return this.f112976g.hashCode() + ((iHashCode4 + (yVar3 != null ? yVar3.hashCode() : 0)) * 31);
    }
}
