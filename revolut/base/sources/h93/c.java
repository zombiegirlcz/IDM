package h93;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f150098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f150100c;
    public final LocalDate d;

    public c(t tVar, ArrayList arrayList, LocalDate localDate, LocalDate localDate2) {
        this.f150098a = tVar;
        this.f150099b = arrayList;
        this.f150100c = localDate;
        this.d = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f150098a == cVar.f150098a && Intrinsics.f(this.f150099b, cVar.f150099b) && Intrinsics.f(this.f150100c, cVar.f150100c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        t tVar = this.f150098a;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        List list = this.f150099b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        LocalDate localDate = this.f150100c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        return iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
