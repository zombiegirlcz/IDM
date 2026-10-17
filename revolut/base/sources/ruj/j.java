package ruj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] i = {null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new rr4.a(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257583c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f257584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f257585h;

    public /* synthetic */ j(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        if (191 != (i2 & 191)) {
            j1.f(a.f257565a.getDescriptor(), i2, 191);
            throw null;
        }
        this.f257581a = str;
        this.f257582b = str2;
        this.f257583c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i2 & 64) == 0) {
            this.f257584g = null;
        } else {
            this.f257584g = str7;
        }
        this.f257585h = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f257581a, jVar.f257581a) && Intrinsics.f(this.f257582b, jVar.f257582b) && Intrinsics.f(this.f257583c, jVar.f257583c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f257584g, jVar.f257584g) && Intrinsics.f(this.f257585h, jVar.f257585h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f257581a.hashCode() * 31, 31, this.f257582b), 31, this.f257583c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f257584g;
        return this.f257585h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public j(String id10, String title, String countryCode, String startDate, String endDate, String assetUrl, String str, ArrayList days) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(days, "days");
        this.f257581a = id10;
        this.f257582b = title;
        this.f257583c = countryCode;
        this.d = startDate;
        this.e = endDate;
        this.f = assetUrl;
        this.f257584g = str;
        this.f257585h = days;
    }
}
