package vr;

import com.revolut.biometric_verification.impl.domain.models.dynamic_instructions.BiometricVerificationUserInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationUserInput f291445a;

    public j(BiometricVerificationUserInput userInput) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        this.f291445a = userInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f291445a, ((j) obj2).f291445a);
    }

    public final int hashCode() {
        return this.f291445a.hashCode();
    }
}
