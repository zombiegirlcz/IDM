package dej;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortOutCredentials f113634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113636c;

    public r0(EsimPhoneNumberPortOutCredentials esimPhoneNumberPortOutCredentials, long j2, long j3) {
        this.f113634a = esimPhoneNumberPortOutCredentials;
        this.f113635b = j2;
        this.f113636c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f113634a, r0Var.f113634a) && kotlin.time.b.d(this.f113635b, r0Var.f113635b) && kotlin.time.b.d(this.f113636c, r0Var.f113636c);
    }

    public final int hashCode() {
        EsimPhoneNumberPortOutCredentials esimPhoneNumberPortOutCredentials = this.f113634a;
        int iHashCode = esimPhoneNumberPortOutCredentials == null ? 0 : esimPhoneNumberPortOutCredentials.hashCode();
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f113636c) + a0.d.c(iHashCode * 31, 31, this.f113635b);
    }
}
