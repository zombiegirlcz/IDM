package pr6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$SepaDirectDebit;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr6.a f238939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f238940c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f238941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f238942h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f238943j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final or6.g f238944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AcquiringPayment$SepaDirectDebit f238945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f238946n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f238947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f238948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lr6.h f238949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f238950s;

    public e(String id10, lr6.a state, LocalDateTime createdAt, LocalDateTime localDateTime, LocalDateTime localDateTime2, dj0.d amount, dj0.d tipAmount, dj0.d dVar, dj0.d dVar2, d type, j paymentMethod, or6.g gVar, AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit, List fees, List rollingReserves, c cVar, String str, lr6.h hVar, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(tipAmount, "tipAmount");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(rollingReserves, "rollingReserves");
        this.f238938a = id10;
        this.f238939b = state;
        this.f238940c = createdAt;
        this.d = localDateTime;
        this.e = localDateTime2;
        this.f = amount;
        this.f238941g = tipAmount;
        this.f238942h = dVar;
        this.i = dVar2;
        this.f238943j = type;
        this.k = paymentMethod;
        this.f238944l = gVar;
        this.f238945m = acquiringPayment$SepaDirectDebit;
        this.f238946n = fees;
        this.o = rollingReserves;
        this.f238947p = cVar;
        this.f238948q = str;
        this.f238949r = hVar;
        this.f238950s = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pr6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = v7.i(this.f238940c, (this.f238939b.hashCode() + (this.f238938a.hashCode() * 31)) * 31, 31);
        LocalDateTime localDateTime = this.d;
        int iHashCode = (i + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.e;
        int iC = v7.c(v7.c((iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31, 31, this.f), 31, this.f238941g);
        dj0.d dVar = this.f238942h;
        int iHashCode2 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.i;
        int iHashCode3 = (this.k.hashCode() + ((this.f238943j.hashCode() + ((iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31)) * 31)) * 31;
        or6.g gVar = this.f238944l;
        int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit = this.f238945m;
        int iD = p.a.d(p.a.d((iHashCode4 + (acquiringPayment$SepaDirectDebit == null ? 0 : acquiringPayment$SepaDirectDebit.f73364a.hashCode())) * 31, 31, this.f238946n), 31, this.o);
        c cVar = this.f238947p;
        int iHashCode5 = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.f238948q;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        lr6.h hVar = this.f238949r;
        int iHashCode7 = (iHashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.f238950s;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }
}
