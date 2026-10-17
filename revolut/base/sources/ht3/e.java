package ht3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155262c;
    public final i d;
    public final ArrayList e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f155263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f155264h;

    public e(String title, String str, String str2, i iVar, ArrayList items, c cVar, c cVar2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155260a = title;
        this.f155261b = str;
        this.f155262c = str2;
        this.d = iVar;
        this.e = items;
        this.f = cVar;
        this.f155263g = cVar2;
        this.f155264h = arrayList;
    }

    @Override // ht3.l0
    public final c T() {
        return this.f155263g;
    }

    @Override // ht3.l0
    public final c W() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f155260a, eVar.f155260a) && Intrinsics.f(this.f155261b, eVar.f155261b) && Intrinsics.f(this.f155262c, eVar.f155262c) && Intrinsics.f(this.d, eVar.d) && this.e.equals(eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f155263g, eVar.f155263g) && Intrinsics.f(this.f155264h, eVar.f155264h);
    }

    public final int hashCode() {
        int iHashCode = this.f155260a.hashCode() * 31;
        String str = this.f155261b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155262c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i iVar = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31);
        c cVar = this.f;
        int iHashCode4 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f155263g;
        int iC = j6.a.c((iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, false);
        ArrayList arrayList = this.f155264h;
        return iC + (arrayList != null ? arrayList.hashCode() : 0);
    }
}
