package gzc;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148023c;
    public final String d;
    public final s e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f148024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f148025h;
    public final a i;

    public p(String id10, String amount, String title, String description, s reviewState, m frequency, List documents, u incomeSource, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        this.f148021a = id10;
        this.f148022b = amount;
        this.f148023c = title;
        this.d = description;
        this.e = reviewState;
        this.f = frequency;
        this.f148024g = documents;
        this.f148025h = incomeSource;
        this.i = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f148021a, pVar.f148021a) && Intrinsics.f(this.f148022b, pVar.f148022b) && Intrinsics.f(this.f148023c, pVar.f148023c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f148024g, pVar.f148024g) && Intrinsics.f(this.f148025h, pVar.f148025h) && Intrinsics.f(this.i, pVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f148025h.hashCode() + p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f148021a.hashCode() * 31, 31, this.f148022b), 31, this.f148023c), 31, this.d)) * 31)) * 31, 31, this.f148024g)) * 31;
        a aVar = this.i;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
