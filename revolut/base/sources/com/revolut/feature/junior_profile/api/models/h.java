package com.revolut.feature.junior_profile.api.models;

import com.revolut.feature.address.models.Address;
import ij8.l;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h extends f {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f77127g = {null, null, j.c(k.PUBLICATION, new igb.j(16)), null, null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f77129c;
    public final ij8.h d;
    public final kf8.b e;
    public final JuniorProfileCompany f;

    public /* synthetic */ h(int i, String str, Address address, ij8.h hVar, kf8.b bVar, JuniorProfileCompany juniorProfileCompany) {
        if (31 != (i & 31)) {
            j1.f(g.f77126a.getDescriptor(), i, 31);
            throw null;
        }
        this.f77128b = str;
        this.f77129c = address;
        this.d = hVar;
        this.e = bVar;
        this.f = juniorProfileCompany;
    }

    @Override // com.revolut.feature.junior_profile.api.models.f
    public final String a() {
        return this.f77128b;
    }

    @Override // com.revolut.feature.junior_profile.api.models.f
    public final Address b() {
        return this.f77129c;
    }

    @Override // com.revolut.feature.junior_profile.api.models.f
    public final ij8.h c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f77128b, hVar.f77128b) && Intrinsics.f(this.f77129c, hVar.f77129c) && this.d == hVar.d && this.e == hVar.e && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f77129c.hashCode() + (this.f77128b.hashCode() * 31)) * 31)) * 31)) * 31;
        JuniorProfileCompany juniorProfileCompany = this.f;
        return iHashCode + (juniorProfileCompany == null ? 0 : juniorProfileCompany.f77109a.hashCode());
    }
}
