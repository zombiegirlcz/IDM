package rsj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257094c;
    public final String d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f257095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f257096h;
    public final boolean i;

    public b(String category, String name, String type, String component, boolean z, List options, Integer num, List requiredFor, boolean z3) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(requiredFor, "requiredFor");
        this.f257092a = category;
        this.f257093b = name;
        this.f257094c = type;
        this.d = component;
        this.e = z;
        this.f = options;
        this.f257095g = num;
        this.f257096h = requiredFor;
        this.i = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f257092a, bVar.f257092a) && Intrinsics.f(this.f257093b, bVar.f257093b) && Intrinsics.f(this.f257094c, bVar.f257094c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f257095g, bVar.f257095g) && Intrinsics.f(this.f257096h, bVar.f257096h) && this.i == bVar.i;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(p.a.c(p.a.c(p.a.c(this.f257092a.hashCode() * 31, 31, this.f257093b), 31, this.f257094c), 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.f257095g;
        return Boolean.hashCode(this.i) + p.a.d((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.f257096h);
    }
}
