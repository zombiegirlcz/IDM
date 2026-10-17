package n2m;

import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.domain.model.AppError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f211606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppError f211607b;

    public n(boolean z, AppError appError) {
        this.f211606a = z;
        this.f211607b = appError;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f211606a == nVar.f211606a && Intrinsics.f(this.f211607b, nVar.f211607b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f211606a) * 31;
        AppError appError = this.f211607b;
        return iHashCode + (appError == null ? 0 : appError.hashCode());
    }

    public final String toString() {
        return "SubmissionProcessResultEventArgs(completed=" + this.f211606a + ", error=" + this.f211607b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
