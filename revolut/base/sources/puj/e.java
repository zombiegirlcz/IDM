package puj;

import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239914c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f239915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f239916h;

    public e(String id10, String title, String countryCode, LocalDateTime startDate, LocalDateTime endDate, String assetUrl, String str, ArrayList days) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(days, "days");
        this.f239912a = id10;
        this.f239913b = title;
        this.f239914c = countryCode;
        this.d = startDate;
        this.e = endDate;
        this.f = assetUrl;
        this.f239915g = str;
        this.f239916h = days;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f239912a, eVar.f239912a) && Intrinsics.f(this.f239913b, eVar.f239913b) && Intrinsics.f(this.f239914c, eVar.f239914c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f239915g, eVar.f239915g) && this.f239916h.equals(eVar.f239916h);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.i(this.e, v7.i(this.d, p.a.c(p.a.c(this.f239912a.hashCode() * 31, 31, this.f239913b), 31, this.f239914c), 31), 31), 31, this.f);
        String str = this.f239915g;
        return this.f239916h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
