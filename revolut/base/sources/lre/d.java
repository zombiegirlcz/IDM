package lre;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199510c;
    public final DateTime d;
    public final String e;

    public d(String type, String name, String contentType, DateTime createdDate, String url2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f199508a = type;
        this.f199509b = name;
        this.f199510c = contentType;
        this.d = createdDate;
        this.e = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f199508a, dVar.f199508a) && Intrinsics.f(this.f199509b, dVar.f199509b) && Intrinsics.f(this.f199510c, dVar.f199510c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.f(this.d, p.a.c(p.a.c(this.f199508a.hashCode() * 31, 31, this.f199509b), 31, this.f199510c), 31);
    }
}
