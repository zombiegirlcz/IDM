package pj7;

import com.revolut.feature.insurance.api.models.details.CFACClaimProperties;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f236678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj7.a f236679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACClaimProperties f236680c;
    public final CFACPaymentPurpose d;
    public final CFACPaymentCanceller e;
    public final File f;

    public e(long j2, nj7.a configuration, CFACClaimProperties claimProperties, CFACPaymentPurpose cFACPaymentPurpose, CFACPaymentCanceller cFACPaymentCanceller, File file) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(claimProperties, "claimProperties");
        this.f236678a = j2;
        this.f236679b = configuration;
        this.f236680c = claimProperties;
        this.d = cFACPaymentPurpose;
        this.e = cFACPaymentCanceller;
        this.f = file;
    }

    public static e a(e eVar, long j2) {
        nj7.a configuration = eVar.f236679b;
        CFACClaimProperties claimProperties = eVar.f236680c;
        CFACPaymentPurpose cFACPaymentPurpose = eVar.d;
        CFACPaymentCanceller cFACPaymentCanceller = eVar.e;
        File file = eVar.f;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(claimProperties, "claimProperties");
        return new e(j2, configuration, claimProperties, cFACPaymentPurpose, cFACPaymentCanceller, file);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f236678a == eVar.f236678a && this.f236679b == eVar.f236679b && Intrinsics.f(this.f236680c, eVar.f236680c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f236680c.hashCode() + ((this.f236679b.hashCode() + (Long.hashCode(this.f236678a) * 31)) * 31)) * 31;
        CFACPaymentPurpose cFACPaymentPurpose = this.d;
        int iHashCode2 = (iHashCode + (cFACPaymentPurpose == null ? 0 : cFACPaymentPurpose.hashCode())) * 31;
        CFACPaymentCanceller cFACPaymentCanceller = this.e;
        int iHashCode3 = (iHashCode2 + (cFACPaymentCanceller == null ? 0 : cFACPaymentCanceller.hashCode())) * 31;
        File file = this.f;
        return iHashCode3 + (file != null ? file.hashCode() : 0);
    }
}
