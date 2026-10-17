package yk6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f314589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f314590c;
    public final String d;

    public l(dj0.d amount, String merchantName, String str, String code) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f314588a = merchantName;
        this.f314589b = str;
        this.f314590c = amount;
        this.d = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f314588a, lVar.f314588a) && Intrinsics.f(this.f314589b, lVar.f314589b) && Intrinsics.f(this.f314590c, lVar.f314590c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f314588a.hashCode() * 31;
        String str = this.f314589b;
        return this.d.hashCode() + v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f314590c);
    }
}
