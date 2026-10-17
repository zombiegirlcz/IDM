package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160785c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f160786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f160787h;
    public final String i;

    public h(String eventId, LocalDate effectiveDate, String symbol, String ref2, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f160783a = eventId;
        this.f160784b = effectiveDate;
        this.f160785c = symbol;
        this.d = ref2;
        this.e = str;
        this.f = str2;
        this.f160786g = dateTime;
        this.f160787h = dateTime2;
        this.i = str3;
    }

    @Override // iel.i
    public final String b() {
        return this.f160783a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f160783a, hVar.f160783a) && Intrinsics.f(this.f160784b, hVar.f160784b) && Intrinsics.f(this.f160785c, hVar.f160785c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f160786g, hVar.f160786g) && Intrinsics.f(this.f160787h, hVar.f160787h) && Intrinsics.f(this.i, hVar.i);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160784b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160785c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(wp5.y.a(this.f160783a.hashCode() * 31, 31, this.f160784b), 31, this.f160785c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.f160786g;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f160787h;
        int iHashCode4 = (iHashCode3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}
