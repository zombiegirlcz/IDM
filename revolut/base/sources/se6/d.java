package se6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.b f262127c;
    public final f d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f262128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f262129h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f262130j;
    public final a k;

    public d(String id10, String name, io3.b logo, f institutionType, String str, boolean z, boolean z3, b bVar, ArrayList tags, i iVar, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(institutionType, "institutionType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f262125a = id10;
        this.f262126b = name;
        this.f262127c = logo;
        this.d = institutionType;
        this.e = str;
        this.f = z;
        this.f262128g = z3;
        this.f262129h = bVar;
        this.i = tags;
        this.f262130j = iVar;
        this.k = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f262125a, dVar.f262125a) && Intrinsics.f(this.f262126b, dVar.f262126b) && Intrinsics.f(this.f262127c, dVar.f262127c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && this.f262128g == dVar.f262128g && Intrinsics.f(this.f262129h, dVar.f262129h) && this.i.equals(dVar.i) && Intrinsics.f(this.f262130j, dVar.f262130j) && Intrinsics.f(this.k, dVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f262127c.hashCode() + p.a.c(this.f262125a.hashCode() * 31, 31, this.f262126b)) * 31)) * 31;
        String str = this.e;
        int iC = j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f262128g);
        b bVar = this.f262129h;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, (iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        i iVar = this.f262130j;
        int iHashCode2 = (iB + (iVar == null ? 0 : iVar.hashCode())) * 31;
        a aVar = this.k;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
