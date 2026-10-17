package hp3;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f154413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f154414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f154415c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f154416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kp3.b f154417h;
    public final kp3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f154418j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f154419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f154420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f154421n;
    public final Data o;

    public m(LocalDate selectedDate, Set allActiveFilters, Set eventsToInclude, String selectedTabId, boolean z, String str, List pages, kp3.b bVar, kp3.b bVar2, boolean z3, boolean z4, String str2, Data instrumentData, boolean z6, Data data) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(allActiveFilters, "allActiveFilters");
        Intrinsics.checkNotNullParameter(eventsToInclude, "eventsToInclude");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(instrumentData, "instrumentData");
        this.f154413a = selectedDate;
        this.f154414b = allActiveFilters;
        this.f154415c = eventsToInclude;
        this.d = selectedTabId;
        this.e = z;
        this.f = str;
        this.f154416g = pages;
        this.f154417h = bVar;
        this.i = bVar2;
        this.f154418j = z3;
        this.k = z4;
        this.f154419l = str2;
        this.f154420m = instrumentData;
        this.f154421n = z6;
        this.o = data;
    }

    public static m a(m mVar, LocalDate localDate, Set set, String str, boolean z, String str2, ArrayList arrayList, kp3.b bVar, kp3.b bVar2, boolean z3, boolean z4, Data data, Data data2, int i) {
        LocalDate selectedDate = (i & 1) != 0 ? mVar.f154413a : localDate;
        Set allActiveFilters = mVar.f154414b;
        Set eventsToInclude = (i & 4) != 0 ? mVar.f154415c : set;
        String selectedTabId = (i & 8) != 0 ? mVar.d : str;
        boolean z6 = (i & 16) != 0 ? mVar.e : z;
        String str3 = (i & 32) != 0 ? mVar.f : str2;
        List pages = (i & 64) != 0 ? mVar.f154416g : arrayList;
        kp3.b bVar3 = (i & 128) != 0 ? mVar.f154417h : bVar;
        kp3.b bVar4 = (i & 256) != 0 ? mVar.i : bVar2;
        boolean z11 = (i & 512) != 0 ? mVar.f154418j : z3;
        boolean z12 = (i & 1024) != 0 ? mVar.k : z4;
        String str4 = mVar.f154419l;
        Data instrumentData = (i & 4096) != 0 ? mVar.f154420m : data;
        boolean z29 = mVar.f154421n;
        Data data3 = (i & 16384) != 0 ? mVar.o : data2;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(allActiveFilters, "allActiveFilters");
        Intrinsics.checkNotNullParameter(eventsToInclude, "eventsToInclude");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(instrumentData, "instrumentData");
        return new m(selectedDate, allActiveFilters, eventsToInclude, selectedTabId, z6, str3, pages, bVar3, bVar4, z11, z12, str4, instrumentData, z29, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f154413a, mVar.f154413a) && Intrinsics.f(this.f154414b, mVar.f154414b) && Intrinsics.f(this.f154415c, mVar.f154415c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f154416g, mVar.f154416g) && Intrinsics.f(this.f154417h, mVar.f154417h) && Intrinsics.f(this.i, mVar.i) && this.f154418j == mVar.f154418j && this.k == mVar.k && Intrinsics.f(this.f154419l, mVar.f154419l) && Intrinsics.f(this.f154420m, mVar.f154420m) && this.f154421n == mVar.f154421n && Intrinsics.f(this.o, mVar.o);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.f(p.a.f(this.f154413a.hashCode() * 31, 31, this.f154414b), 31, this.f154415c), 31, this.d), 31, this.e);
        String str = this.f;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f154416g);
        kp3.b bVar = this.f154417h;
        int iHashCode = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        kp3.b bVar2 = this.i;
        int iC2 = j6.a.c(j6.a.c((iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f154418j), 31, this.k);
        String str2 = this.f154419l;
        int iC3 = j6.a.c(kii.e.c(this.f154420m, (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f154421n);
        Data data = this.o;
        return iC3 + (data != null ? data.hashCode() : 0);
    }
}
