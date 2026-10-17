package kr2;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import tof.k3;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188645c;
    public final String d;
    public final Instant e;
    public final k3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f188646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f188647h;

    public e(String id10, String str, String str2, String str3, Instant activeSince, k3 category, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(activeSince, "activeSince");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f188643a = id10;
        this.f188644b = str;
        this.f188645c = str2;
        this.d = str3;
        this.e = activeSince;
        this.f = category;
        this.f188646g = str4;
        this.f188647h = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f188643a, eVar.f188643a) && Intrinsics.f(this.f188644b, eVar.f188644b) && Intrinsics.f(this.f188645c, eVar.f188645c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f.equals(eVar.f) && Intrinsics.f(this.f188646g, eVar.f188646g) && Intrinsics.f(this.f188647h, eVar.f188647h);
    }

    public final int hashCode() {
        int iHashCode = this.f188643a.hashCode() * 31;
        String str = this.f188644b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f188645c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (this.f.f272879a.hashCode() + r6.b.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e)) * 31;
        String str4 = this.f188646g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f188647h;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
