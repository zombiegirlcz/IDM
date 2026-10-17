package ys1;

import com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumRegistrationStatus.NotRegistered f316383a;

    public a(BizumRegistrationStatus.NotRegistered status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f316383a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f316383a, ((a) obj2).f316383a);
    }

    public final int hashCode() {
        return this.f316383a.hashCode();
    }
}
