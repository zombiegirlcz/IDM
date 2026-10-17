package x3g;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f302739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f302741c;
    public final String d;
    public final String e;
    public final e f;

    public c(DateTime publishedDate, String userName, Integer num, String title, String text, e source) {
        Intrinsics.checkNotNullParameter(publishedDate, "publishedDate");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f302739a = publishedDate;
        this.f302740b = userName;
        this.f302741c = num;
        this.d = title;
        this.e = text;
        this.f = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f302739a, cVar.f302739a) && Intrinsics.f(this.f302740b, cVar.f302740b) && Intrinsics.f(this.f302741c, cVar.f302741c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f302739a.hashCode() * 31, 31, this.f302740b);
        Integer num = this.f302741c;
        return this.f.hashCode() + p.a.c(p.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
