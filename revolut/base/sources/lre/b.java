package lre;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199505c;
    public final String d;
    public final DateTime e;
    public final TermsScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f199506g;

    public b(String id10, String str, String str2, String str3, DateTime createdDate, TermsScope scope, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f199503a = id10;
        this.f199504b = str;
        this.f199505c = str2;
        this.d = str3;
        this.e = createdDate;
        this.f = scope;
        this.f199506g = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f199503a, bVar.f199503a) && Intrinsics.f(this.f199504b, bVar.f199504b) && Intrinsics.f(this.f199505c, bVar.f199505c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f199506g, bVar.f199506g);
    }

    public final int hashCode() {
        int iHashCode = this.f199503a.hashCode() * 31;
        String str = this.f199504b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f199505c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return p.a.c(p.a.c(m72.b.f(this.e, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31, this.f.f90390a), 31, this.f199506g);
    }
}
