package yzg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f318105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f318106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f318107c;
    public final List d;
    public final b e;
    public final Long f;

    public d(c status, dj0.d dVar, dj0.d dVar2, ArrayList arrayList, b bVar, Long l2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f318105a = status;
        this.f318106b = dVar;
        this.f318107c = dVar2;
        this.d = arrayList;
        this.e = bVar;
        this.f = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f318105a == dVar.f318105a && Intrinsics.f(this.f318106b, dVar.f318106b) && Intrinsics.f(this.f318107c, dVar.f318107c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f318105a.hashCode() * 31;
        dj0.d dVar = this.f318106b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f318107c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        b bVar = this.e;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }
}
