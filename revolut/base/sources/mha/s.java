package mha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f205464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f205465c;
    public final xi0.b d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f205466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f205467h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f205468j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f205469l;

    public s(String str, r rVar, m type, xi0.b currency, DateTime dateTime, DateTime dateTime2, k kVar, p pVar, Long l2, p pVar2, Long l3, Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f205463a = str;
        this.f205464b = rVar;
        this.f205465c = type;
        this.d = currency;
        this.e = dateTime;
        this.f = dateTime2;
        this.f205466g = kVar;
        this.f205467h = pVar;
        this.i = l2;
        this.f205468j = pVar2;
        this.k = l3;
        this.f205469l = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f205463a, sVar.f205463a) && this.f205464b == sVar.f205464b && Intrinsics.f(this.f205465c, sVar.f205465c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f205466g, sVar.f205466g) && Intrinsics.f(this.f205467h, sVar.f205467h) && Intrinsics.f(this.i, sVar.i) && Intrinsics.f(this.f205468j, sVar.f205468j) && Intrinsics.f(this.k, sVar.k) && Intrinsics.f(this.f205469l, sVar.f205469l);
    }

    public final int hashCode() {
        String str = this.f205463a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        r rVar = this.f205464b;
        int iJ = h30.l.j(this.d, p.a.c((iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.f205465c.f205460a), 31);
        DateTime dateTime = this.e;
        int iHashCode2 = (iJ + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        k kVar = this.f205466g;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        p pVar = this.f205467h;
        int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        p pVar2 = this.f205468j;
        int iHashCode7 = (iHashCode6 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        Long l3 = this.k;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.f205469l;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }
}
