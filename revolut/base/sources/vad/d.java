package vad;

import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f287268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f287269c;
    public final e d;
    public final Integer e;
    public final LocalDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f287270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f287271h;

    public d(String title, dj0.d dVar, xi0.b bVar, e product, Integer num, LocalDateTime localDateTime, List list, List list2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f287267a = title;
        this.f287268b = dVar;
        this.f287269c = bVar;
        this.d = product;
        this.e = num;
        this.f = localDateTime;
        this.f287270g = list;
        this.f287271h = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f287267a, dVar.f287267a) && Intrinsics.f(this.f287268b, dVar.f287268b) && Intrinsics.f(this.f287269c, dVar.f287269c) && this.d == dVar.d && this.e.equals(dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f287270g, dVar.f287270g) && Intrinsics.f(this.f287271h, dVar.f287271h);
    }

    public final int hashCode() {
        int iHashCode = this.f287267a.hashCode() * 31;
        dj0.d dVar = this.f287268b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        xi0.b bVar = this.f287269c;
        int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 961;
        LocalDateTime localDateTime = this.f;
        int iC = j6.a.c((iHashCode3 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 961, false);
        List list = this.f287270g;
        int iHashCode4 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f287271h;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }
}
