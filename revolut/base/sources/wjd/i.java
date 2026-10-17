package wjd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f298047c;
    public final Data d;

    public i(Data biometricType, Data primaryAuthCredentialsType, Data socialAccountsData, boolean z) {
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsType, "primaryAuthCredentialsType");
        Intrinsics.checkNotNullParameter(socialAccountsData, "socialAccountsData");
        this.f298045a = z;
        this.f298046b = biometricType;
        this.f298047c = primaryAuthCredentialsType;
        this.d = socialAccountsData;
    }

    public static i a(i iVar, boolean z, Data biometricType, Data primaryAuthCredentialsType, Data socialAccountsData, int i) {
        if ((i & 1) != 0) {
            z = iVar.f298045a;
        }
        if ((i & 2) != 0) {
            biometricType = iVar.f298046b;
        }
        if ((i & 4) != 0) {
            primaryAuthCredentialsType = iVar.f298047c;
        }
        if ((i & 8) != 0) {
            socialAccountsData = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsType, "primaryAuthCredentialsType");
        Intrinsics.checkNotNullParameter(socialAccountsData, "socialAccountsData");
        return new i(biometricType, primaryAuthCredentialsType, socialAccountsData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f298045a == iVar.f298045a && Intrinsics.f(this.f298046b, iVar.f298046b) && Intrinsics.f(this.f298047c, iVar.f298047c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f298047c, kii.e.c(this.f298046b, Boolean.hashCode(this.f298045a) * 31, 31), 31);
    }
}
