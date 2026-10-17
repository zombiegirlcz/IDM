package hp3;

import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f154431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f154432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154433c;
    public final Set d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f154434g;

    public t(LocalDate localDate, LocalDate localDate2, String selectedTabId, Set selectedEventsToInclude, LocalDate selectedDate, String str, String str2) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(selectedEventsToInclude, "selectedEventsToInclude");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        this.f154431a = localDate;
        this.f154432b = localDate2;
        this.f154433c = selectedTabId;
        this.d = selectedEventsToInclude;
        this.e = selectedDate;
        this.f = str;
        this.f154434g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f154431a, tVar.f154431a) && Intrinsics.f(this.f154432b, tVar.f154432b) && Intrinsics.f(this.f154433c, tVar.f154433c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f154434g, tVar.f154434g);
    }

    public final int hashCode() {
        LocalDate localDate = this.f154431a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f154432b;
        int iA = wp5.y.a(p.a.f(p.a.c((iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31, 31, this.f154433c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154434g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
