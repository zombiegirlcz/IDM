package kf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183318c;
    public final mf8.e d;

    public d(String userId, String firstName, String walletId, mf8.e kyc2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        this.f183316a = userId;
        this.f183317b = firstName;
        this.f183318c = walletId;
        this.d = kyc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f183316a, dVar.f183316a) && Intrinsics.f(this.f183317b, dVar.f183317b) && Intrinsics.f(this.f183318c, dVar.f183318c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f183316a.hashCode() * 31, 31, this.f183317b), 31, this.f183318c);
    }
}
