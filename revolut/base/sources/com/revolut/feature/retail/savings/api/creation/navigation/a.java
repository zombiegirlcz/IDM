package com.revolut.feature.retail.savings.api.creation.navigation;

import aii.e;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.vaults.common.SavingAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountCreationFlow$Filter f83134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingAccountType f83135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83136c;

    public a(SavingsAccountCreationFlow$Filter filter, SavingAccountType accountType, boolean z) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f83134a = filter;
        this.f83135b = accountType;
        this.f83136c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f83134a, aVar.f83134a) && Intrinsics.f(this.f83135b, aVar.f83135b) && this.f83136c == aVar.f83136c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83136c) + ((this.f83135b.hashCode() + (this.f83134a.hashCode() * 31)) * 31);
    }

    public a() {
        this(SavingsAccountCreationFlow$Filter.All.f83128a, SavingAccountType.Personal.f94740a, false);
    }
}
