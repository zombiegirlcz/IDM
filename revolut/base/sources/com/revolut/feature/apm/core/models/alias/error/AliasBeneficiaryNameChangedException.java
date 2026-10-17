package com.revolut.feature.apm.core.models.alias.error;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/error/AliasBeneficiaryNameChangedException;", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AliasBeneficiaryNameChangedException extends NoSuchElementException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61907a;

    public AliasBeneficiaryNameChangedException(String newBeneficiaryName) {
        Intrinsics.checkNotNullParameter(newBeneficiaryName, "newBeneficiaryName");
        this.f61907a = newBeneficiaryName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AliasBeneficiaryNameChangedException) && Intrinsics.f(this.f61907a, ((AliasBeneficiaryNameChangedException) obj2).f61907a);
    }

    public final int hashCode() {
        return this.f61907a.hashCode();
    }
}
