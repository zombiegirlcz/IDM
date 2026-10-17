package com.revolut.feature.tax_residency.impl.screens.tin;

import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$DomainDataItem;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxNumberInputScreenContract$DomainDataItem.UserName f90128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxNumberInputScreenContract$DomainDataItem.Tin f90129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaxNumberInputScreenContract$DomainDataItem.Postcode f90130c;
    public final TaxNumberInputScreenContract$DomainDataItem.TaxRegime d;

    public a(TaxNumberInputScreenContract$DomainDataItem.UserName userName, TaxNumberInputScreenContract$DomainDataItem.Tin tin, TaxNumberInputScreenContract$DomainDataItem.Postcode postcode, TaxNumberInputScreenContract$DomainDataItem.TaxRegime taxRegime) {
        Intrinsics.checkNotNullParameter(tin, "tin");
        this.f90128a = userName;
        this.f90129b = tin;
        this.f90130c = postcode;
        this.d = taxRegime;
    }

    public static a a(a aVar, TaxNumberInputScreenContract$DomainDataItem.Tin tin, TaxNumberInputScreenContract$DomainDataItem.Postcode postcode, TaxNumberInputScreenContract$DomainDataItem.TaxRegime taxRegime, int i) {
        TaxNumberInputScreenContract$DomainDataItem.UserName userName = aVar.f90128a;
        if ((i & 2) != 0) {
            tin = aVar.f90129b;
        }
        if ((i & 4) != 0) {
            postcode = aVar.f90130c;
        }
        if ((i & 8) != 0) {
            taxRegime = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(tin, "tin");
        return new a(userName, tin, postcode, taxRegime);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f90128a, aVar.f90128a) && Intrinsics.f(this.f90129b, aVar.f90129b) && Intrinsics.f(this.f90130c, aVar.f90130c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        TaxNumberInputScreenContract$DomainDataItem.UserName userName = this.f90128a;
        int iHashCode = (this.f90129b.hashCode() + ((userName == null ? 0 : userName.hashCode()) * 31)) * 31;
        TaxNumberInputScreenContract$DomainDataItem.Postcode postcode = this.f90130c;
        int iHashCode2 = (iHashCode + (postcode == null ? 0 : postcode.hashCode())) * 31;
        TaxNumberInputScreenContract$DomainDataItem.TaxRegime taxRegime = this.d;
        return iHashCode2 + (taxRegime != null ? taxRegime.hashCode() : 0);
    }
}
