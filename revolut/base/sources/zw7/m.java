package zw7;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f325814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f325815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325816c;
    public final Integer d;
    public final LocalDate e;

    public m(n code, o urlType, String url2, Integer num, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(urlType, "urlType");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f325814a = code;
        this.f325815b = urlType;
        this.f325816c = url2;
        this.d = num;
        this.e = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f325814a == mVar.f325814a && this.f325815b == mVar.f325815b && Intrinsics.f(this.f325816c, mVar.f325816c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f325815b.hashCode() + (this.f325814a.hashCode() * 31)) * 31, 31, this.f325816c);
        Integer num = this.d;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        LocalDate localDate = this.e;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
