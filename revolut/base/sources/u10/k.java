package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f276299c;
    public final Instant d;
    public final UUID e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f276301h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f276302j;

    public /* synthetic */ k(UUID uuid, String str, Instant instant, UUID uuid2, Instant instant2, String str2, String str3, String str4, String str5) {
        this(uuid, str, null, instant, uuid2, instant2, str2, str3, str4, str5);
    }

    public final UUID a() {
        return this.f276297a;
    }

    public final String b() {
        return this.i;
    }

    public final String c() {
        return this.f276302j;
    }

    public final String d() {
        return this.f276300g;
    }

    public final Instant e() {
        return this.f276299c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f276297a, kVar.f276297a) && Intrinsics.f(this.f276298b, kVar.f276298b) && Intrinsics.f(this.f276299c, kVar.f276299c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f276300g, kVar.f276300g) && Intrinsics.f(this.f276301h, kVar.f276301h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f276302j, kVar.f276302j);
    }

    public final String f() {
        return this.f276301h;
    }

    public final UUID g() {
        return this.e;
    }

    public final Instant h() {
        return this.d;
    }

    public final int hashCode() {
        UUID uuid = this.f276297a;
        int iC = p.a.c((uuid == null ? 0 : uuid.hashCode()) * 31, 31, this.f276298b);
        Instant instant = this.f276299c;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.d;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        UUID uuid2 = this.e;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        Instant instant3 = this.f;
        int iHashCode4 = (iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        String str = this.f276300g;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f276301h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f276302j;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.f276298b;
    }

    public final Instant j() {
        return this.f;
    }

    public k(UUID uuid, String state, Instant instant, Instant instant2, UUID uuid2, Instant instant3, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f276297a = uuid;
        this.f276298b = state;
        this.f276299c = instant;
        this.d = instant2;
        this.e = uuid2;
        this.f = instant3;
        this.f276300g = str;
        this.f276301h = str2;
        this.i = str3;
        this.f276302j = str4;
    }
}
