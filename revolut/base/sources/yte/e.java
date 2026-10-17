package yte;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f316708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopupMethodType f316709c;
    public final String d;
    public final Instant e;
    public final io3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f316710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f316711h;

    public e(String id10, d dVar, TopupMethodType topupMethodType, String str, Instant instant, io3.b bVar, c cVar, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f316707a = id10;
        this.f316708b = dVar;
        this.f316709c = topupMethodType;
        this.d = str;
        this.e = instant;
        this.f = bVar;
        this.f316710g = cVar;
        this.f316711h = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f316707a, eVar.f316707a) && this.f316708b == eVar.f316708b && this.f316709c == eVar.f316709c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f316710g, eVar.f316710g) && Intrinsics.f(this.f316711h, eVar.f316711h);
    }

    public final int hashCode() {
        int iHashCode = this.f316707a.hashCode() * 31;
        d dVar = this.f316708b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        TopupMethodType topupMethodType = this.f316709c;
        int iHashCode3 = (iHashCode2 + (topupMethodType == null ? 0 : topupMethodType.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.e;
        int iHashCode5 = (iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
        io3.b bVar = this.f;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.f316710g;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str2 = this.f316711h;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }
}
