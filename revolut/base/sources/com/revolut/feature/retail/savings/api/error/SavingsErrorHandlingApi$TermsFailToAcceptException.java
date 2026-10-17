package com.revolut.feature.retail.savings.api.error;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/retail/savings/api/error/SavingsErrorHandlingApi$TermsFailToAcceptException", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsErrorHandlingApi$TermsFailToAcceptException extends NoSuchElementException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83152a;

    public SavingsErrorHandlingApi$TermsFailToAcceptException() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SavingsErrorHandlingApi$TermsFailToAcceptException) && Intrinsics.f(this.f83152a, ((SavingsErrorHandlingApi$TermsFailToAcceptException) obj2).f83152a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f83152a;
    }

    public final int hashCode() {
        String str = this.f83152a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public SavingsErrorHandlingApi$TermsFailToAcceptException(String str) {
        super(str);
        this.f83152a = str;
    }
}
