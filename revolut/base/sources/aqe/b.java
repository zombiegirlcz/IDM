package aqe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8422c;

    public b(String title, String subtitle, List list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f8420a = title;
        this.f8421b = subtitle;
        this.f8422c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f8420a, bVar.f8420a) && Intrinsics.f(this.f8421b, bVar.f8421b) && Intrinsics.f(this.f8422c, bVar.f8422c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f8420a.hashCode() * 31, 31, this.f8421b);
        List list = this.f8422c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
