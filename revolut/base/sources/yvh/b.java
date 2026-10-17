package yvh;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f317175m = new b("", false, "", Float.valueOf(BitmapDescriptorFactory.HUE_RED), null, 2288);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317178c;
    public final String d;
    public final h e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f317179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f317180h;
    public final Float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f317181j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ZonedDateTime f317182l;

    public /* synthetic */ b(String str, boolean z, String str2, Float f, d dVar, int i) {
        this(str, z, (i & 4) != 0 ? null : "", str2, null, null, null, null, f, "", dVar, null);
    }

    public static b a(b bVar, boolean z, f fVar, Float f, String str, d dVar, int i) {
        String id10 = bVar.f317176a;
        if ((i & 2) != 0) {
            z = bVar.f317177b;
        }
        boolean z3 = z;
        String str2 = bVar.f317178c;
        String str3 = bVar.d;
        h hVar = bVar.e;
        f fVar2 = (i & 32) != 0 ? bVar.f : fVar;
        dj0.d dVar2 = bVar.f317179g;
        Float f4 = bVar.f317180h;
        Float f5 = (i & 256) != 0 ? bVar.i : f;
        String ownerId = (i & 512) != 0 ? bVar.f317181j : str;
        d dVar3 = (i & 1024) != 0 ? bVar.k : dVar;
        ZonedDateTime zonedDateTime = bVar.f317182l;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return new b(id10, z3, str2, str3, hVar, fVar2, dVar2, f4, f5, ownerId, dVar3, zonedDateTime);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f317176a, bVar.f317176a) && this.f317177b == bVar.f317177b && Intrinsics.f(this.f317178c, bVar.f317178c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f317179g, bVar.f317179g) && Intrinsics.f(this.f317180h, bVar.f317180h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f317181j, bVar.f317181j) && this.k == bVar.k && Intrinsics.f(this.f317182l, bVar.f317182l);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f317176a.hashCode() * 31, 31, this.f317177b);
        String str = this.f317178c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.e;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        f fVar = this.f;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        dj0.d dVar = this.f317179g;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Float f = this.f317180h;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.i;
        int iC2 = p.a.c((iHashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31, 31, this.f317181j);
        d dVar2 = this.k;
        int iHashCode7 = (iC2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f317182l;
        return iHashCode7 + (zonedDateTime != null ? zonedDateTime.hashCode() : 0);
    }

    public b(String id10, boolean z, String str, String str2, h hVar, f fVar, dj0.d dVar, Float f, Float f4, String ownerId, d dVar2, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f317176a = id10;
        this.f317177b = z;
        this.f317178c = str;
        this.d = str2;
        this.e = hVar;
        this.f = fVar;
        this.f317179g = dVar;
        this.f317180h = f;
        this.i = f4;
        this.f317181j = ownerId;
        this.k = dVar2;
        this.f317182l = zonedDateTime;
    }
}
