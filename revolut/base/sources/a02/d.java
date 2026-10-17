package a02;

import com.revolut.feature.apm.core.models.alias.error.AliasBeneficiaryNameChangedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasBeneficiaryNameChangedException f110a;

    public d(AliasBeneficiaryNameChangedException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f110a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f110a, ((d) obj2).f110a);
    }

    @Override // a02.g
    public final Throwable getError() {
        return this.f110a;
    }

    public final int hashCode() {
        return this.f110a.f61907a.hashCode();
    }
}
