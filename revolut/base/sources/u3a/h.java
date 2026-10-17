package u3a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f276845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f276846c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f276847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f276848h;
    public final List i;

    public h(List aaniContacts, List bizumContacts, List blikContacts, List brebContacts, List irisContacts, List multibancoContacts, List qvikContacts, List spinContacts, List weroContacts) {
        Intrinsics.checkNotNullParameter(aaniContacts, "aaniContacts");
        Intrinsics.checkNotNullParameter(bizumContacts, "bizumContacts");
        Intrinsics.checkNotNullParameter(blikContacts, "blikContacts");
        Intrinsics.checkNotNullParameter(brebContacts, "brebContacts");
        Intrinsics.checkNotNullParameter(irisContacts, "irisContacts");
        Intrinsics.checkNotNullParameter(multibancoContacts, "multibancoContacts");
        Intrinsics.checkNotNullParameter(qvikContacts, "qvikContacts");
        Intrinsics.checkNotNullParameter(spinContacts, "spinContacts");
        Intrinsics.checkNotNullParameter(weroContacts, "weroContacts");
        this.f276844a = aaniContacts;
        this.f276845b = bizumContacts;
        this.f276846c = blikContacts;
        this.d = brebContacts;
        this.e = irisContacts;
        this.f = multibancoContacts;
        this.f276847g = qvikContacts;
        this.f276848h = spinContacts;
        this.i = weroContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f276844a, hVar.f276844a) && Intrinsics.f(this.f276845b, hVar.f276845b) && Intrinsics.f(this.f276846c, hVar.f276846c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f276847g, hVar.f276847g) && Intrinsics.f(this.f276848h, hVar.f276848h) && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(this.f276844a.hashCode() * 31, 31, this.f276845b), 31, this.f276846c), 31, this.d), 31, this.e), 31, this.f), 31, this.f276847g), 31, this.f276848h);
    }
}
