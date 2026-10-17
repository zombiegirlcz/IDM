package rsj;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f257087c;
    public final Map d;
    public final List e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f257088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f257089h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f257090j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f257091l;

    public a(String id10, String category, jo3.b bVar, Map attributes, List valueHistory, Long l2, long j2, long j3, String state, String valueSource, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(valueHistory, "valueHistory");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(valueSource, "valueSource");
        this.f257085a = id10;
        this.f257086b = category;
        this.f257087c = bVar;
        this.d = attributes;
        this.e = valueHistory;
        this.f = l2;
        this.f257088g = j2;
        this.f257089h = j3;
        this.i = state;
        this.f257090j = valueSource;
        this.k = z;
        this.f257091l = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f257085a, aVar.f257085a) && Intrinsics.f(this.f257086b, aVar.f257086b) && Intrinsics.f(this.f257087c, aVar.f257087c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f257088g == aVar.f257088g && this.f257089h == aVar.f257089h && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f257090j, aVar.f257090j) && this.k == aVar.k && this.f257091l == aVar.f257091l;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f257085a.hashCode() * 31, 31, this.f257086b);
        jo3.b bVar = this.f257087c;
        int iD = p.a.d(p.a.e((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.d), 31, this.e);
        Long l2 = this.f;
        return Boolean.hashCode(this.f257091l) + j6.a.c(p.a.c(p.a.c(a0.d.c(a0.d.c((iD + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f257088g), 31, this.f257089h), 31, this.i), 31, this.f257090j), 31, this.k);
    }
}
