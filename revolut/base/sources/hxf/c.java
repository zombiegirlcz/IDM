package hxf;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f156590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f156591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f156592c;
    public final List d;

    public c() {
        this(null, 15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f156590a == cVar.f156590a && Intrinsics.f(this.f156591b, cVar.f156591b) && Intrinsics.f(this.f156592c, cVar.f156592c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        d dVar = this.f156590a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Integer num = this.f156591b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        LocalDate localDate = this.f156592c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public c(d dVar, Integer num, LocalDate localDate, List list) {
        this.f156590a = dVar;
        this.f156591b = num;
        this.f156592c = localDate;
        this.d = list;
    }

    public /* synthetic */ c(List list, int i) {
        this(null, null, null, (i & 8) != 0 ? null : list);
    }
}
