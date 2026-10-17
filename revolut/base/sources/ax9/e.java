package ax9;

import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreenContract$ProcessingState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileScannerScreenContract$ProcessingState f10899a;

    public e(ProfileScannerScreenContract$ProcessingState processingState) {
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        this.f10899a = processingState;
    }

    public static e a(ProfileScannerScreenContract$ProcessingState processingState) {
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        return new e(processingState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f10899a, ((e) obj2).f10899a);
    }

    public final int hashCode() {
        return this.f10899a.hashCode();
    }
}
