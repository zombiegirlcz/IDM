package oel;

import afl.t0;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f224615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f224616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f224617c;
    public final Instant d;
    public final t0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f224618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f224619h;
    public final Instant i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f224620j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f224621l;

    public a(e documents, c details, ArrayList sections, Instant launchDate, t0 priceRange, boolean z, String str, String str2, Instant instant, Instant instant2, b bVar, b bVar2) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        Intrinsics.checkNotNullParameter(priceRange, "priceRange");
        this.f224615a = documents;
        this.f224616b = details;
        this.f224617c = sections;
        this.d = launchDate;
        this.e = priceRange;
        this.f = z;
        this.f224618g = str;
        this.f224619h = str2;
        this.i = instant;
        this.f224620j = instant2;
        this.k = bVar;
        this.f224621l = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f224615a.equals(aVar.f224615a) && this.f224616b.equals(aVar.f224616b) && this.f224617c.equals(aVar.f224617c) && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e) && this.f == aVar.f && Intrinsics.f(this.f224618g, aVar.f224618g) && Intrinsics.f(this.f224619h, aVar.f224619h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f224620j, aVar.f224620j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f224621l, aVar.f224621l);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.e.hashCode() + r6.b.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f224617c, (this.f224616b.hashCode() + (this.f224615a.hashCode() * 31)) * 31, 31), 31, this.d)) * 31, 31, this.f);
        String str = this.f224618g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f224619h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.i;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f224620j;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        b bVar = this.k;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f224621l;
        return iHashCode5 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
