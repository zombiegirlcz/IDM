package koe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f186314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f186315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f186316c;
    public final Data d;

    public h(Data userCountry, Data taxResidencies, Data taxResidencyRules, Data taxCertifications) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(taxCertifications, "taxCertifications");
        this.f186314a = userCountry;
        this.f186315b = taxResidencies;
        this.f186316c = taxResidencyRules;
        this.d = taxCertifications;
    }

    public static h a(h hVar, Data userCountry, Data taxResidencies, Data taxResidencyRules, Data taxCertifications, int i) {
        if ((i & 1) != 0) {
            userCountry = hVar.f186314a;
        }
        if ((i & 2) != 0) {
            taxResidencies = hVar.f186315b;
        }
        if ((i & 4) != 0) {
            taxResidencyRules = hVar.f186316c;
        }
        if ((i & 8) != 0) {
            taxCertifications = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(taxCertifications, "taxCertifications");
        return new h(userCountry, taxResidencies, taxResidencyRules, taxCertifications);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f186314a, hVar.f186314a) && Intrinsics.f(this.f186315b, hVar.f186315b) && Intrinsics.f(this.f186316c, hVar.f186316c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f186316c, kii.e.c(this.f186315b, this.f186314a.hashCode() * 31, 31), 31);
    }
}
