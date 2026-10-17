package qna;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f247905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f247906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f247907c;
    public final Integer d;
    public final xi0.b e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f247908g;

    public f() {
        this(0);
    }

    public static f a(f fVar, Boolean bool, Boolean bool2, List list, Integer num, xi0.b bVar, e eVar, boolean z, int i) {
        if ((i & 1) != 0) {
            bool = fVar.f247905a;
        }
        Boolean bool3 = bool;
        if ((i & 2) != 0) {
            bool2 = fVar.f247906b;
        }
        Boolean bool4 = bool2;
        if ((i & 4) != 0) {
            list = fVar.f247907c;
        }
        List customisableTabs = list;
        if ((i & 8) != 0) {
            num = fVar.d;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            bVar = fVar.e;
        }
        xi0.b bVar2 = bVar;
        if ((i & 32) != 0) {
            eVar = fVar.f;
        }
        e eVar2 = eVar;
        if ((i & 64) != 0) {
            z = fVar.f247908g;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(customisableTabs, "customisableTabs");
        return new f(bool3, bool4, customisableTabs, num2, bVar2, eVar2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f247905a, fVar.f247905a) && Intrinsics.f(this.f247906b, fVar.f247906b) && Intrinsics.f(this.f247907c, fVar.f247907c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f247908g == fVar.f247908g;
    }

    public final int hashCode() {
        Boolean bool = this.f247905a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f247906b;
        int iD = p.a.d((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f247907c);
        Integer num = this.d;
        int iHashCode2 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        xi0.b bVar = this.e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e eVar = this.f;
        return Boolean.hashCode(this.f247908g) + ((iHashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public f(Boolean bool, Boolean bool2, List customisableTabs, Integer num, xi0.b bVar, e eVar, boolean z) {
        Intrinsics.checkNotNullParameter(customisableTabs, "customisableTabs");
        this.f247905a = bool;
        this.f247906b = bool2;
        this.f247907c = customisableTabs;
        this.d = num;
        this.e = bVar;
        this.f = eVar;
        this.f247908g = z;
    }

    public f(int i) {
        this(null, null, f0.f322471a, null, null, null, false);
    }
}
