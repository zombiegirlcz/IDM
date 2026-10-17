package ni0;

import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCardRecognitionResult f215614a;

    public e(PaymentCardRecognitionResult internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f215614a = internal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f215614a, ((e) obj2).f215614a);
    }

    public final int hashCode() {
        return this.f215614a.hashCode();
    }
}
