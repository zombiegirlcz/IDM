package cbi;

import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailVerificationFlowInputData f22862a;

    public c() {
        EmailVerificationFlowInputData inputData = new EmailVerificationFlowInputData(null);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f22862a = inputData;
    }

    public final EmailVerificationFlowInputData b() {
        return this.f22862a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f22862a, ((c) obj2).f22862a);
    }

    public final int hashCode() {
        return this.f22862a.hashCode();
    }
}
