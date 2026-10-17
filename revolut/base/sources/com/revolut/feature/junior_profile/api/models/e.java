package com.revolut.feature.junior_profile.api.models;

import com.revolut.feature.address.models.Address;
import ij8.k;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e extends f {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] i = {null, null, j.c(yhm.k.PUBLICATION, new igb.j(15)), null, null, null, null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f77122c;
    public final ij8.h d;
    public final kf8.b e;
    public final JuniorProfileCompany f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f77124h;

    public /* synthetic */ e(int i2, String str, Address address, ij8.h hVar, kf8.b bVar, JuniorProfileCompany juniorProfileCompany, boolean z, String str2) {
        if (127 != (i2 & CertificateBody.profileType)) {
            j1.f(d.f77120a.getDescriptor(), i2, CertificateBody.profileType);
            throw null;
        }
        this.f77121b = str;
        this.f77122c = address;
        this.d = hVar;
        this.e = bVar;
        this.f = juniorProfileCompany;
        this.f77123g = z;
        this.f77124h = str2;
    }

    @Override // com.revolut.feature.junior_profile.api.models.f
    public final String a() {
        return this.f77121b;
    }

    @Override // com.revolut.feature.junior_profile.api.models.f
    public final Address b() {
        return this.f77122c;
    }

    @Override // com.revolut.feature.junior_profile.api.models.f
    public final ij8.h c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f77121b, eVar.f77121b) && Intrinsics.f(this.f77122c, eVar.f77122c) && this.d == eVar.d && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && this.f77123g == eVar.f77123g && Intrinsics.f(this.f77124h, eVar.f77124h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f77122c.hashCode() + (this.f77121b.hashCode() * 31)) * 31)) * 31)) * 31;
        JuniorProfileCompany juniorProfileCompany = this.f;
        int iC = j6.a.c((iHashCode + (juniorProfileCompany == null ? 0 : juniorProfileCompany.f77109a.hashCode())) * 31, 31, this.f77123g);
        String str = this.f77124h;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
