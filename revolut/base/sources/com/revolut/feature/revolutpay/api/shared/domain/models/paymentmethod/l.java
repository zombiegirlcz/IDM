package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.r;
import u6c.s;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f84407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f84408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84409c;

    public l(j walletType, f group, boolean z) {
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        Intrinsics.checkNotNullParameter(group, "group");
        this.f84407a = walletType;
        this.f84408b = group;
        this.f84409c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f84407a == lVar.f84407a && this.f84408b == lVar.f84408b && this.f84409c == lVar.f84409c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84409c) + ((this.f84408b.hashCode() + (this.f84407a.hashCode() * 31)) * 31);
    }
}
