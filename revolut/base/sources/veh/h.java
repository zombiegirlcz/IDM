package veh;

import cli.o;
import cli.p;
import cli.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f288328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f288329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f288330c;
    public final List d;
    public final String e;
    public final Integer f;

    public h(List items, List expirationTabs, String str, List contractTabs, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(expirationTabs, "expirationTabs");
        Intrinsics.checkNotNullParameter(contractTabs, "contractTabs");
        this.f288328a = items;
        this.f288329b = expirationTabs;
        this.f288330c = str;
        this.d = contractTabs;
        this.e = str2;
        this.f = num;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof h)) {
            return null;
        }
        Integer num = ((h) oldState).f;
        return new g(num == null && !Intrinsics.f(num, this.f));
    }

    @Override // cli.p
    public final List c() {
        return this.f288328a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f288328a, hVar.f288328a) && Intrinsics.f(this.f288329b, hVar.f288329b) && Intrinsics.f(this.f288330c, hVar.f288330c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f288328a.hashCode() * 31, 31, this.f288329b);
        String str = this.f288330c;
        int iD2 = p.a.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
