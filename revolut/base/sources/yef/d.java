package yef;

import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserDetails f312915a;

    public d(TransactionRecogniserDetails recogniserDetails) {
        Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
        this.f312915a = recogniserDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f312915a, ((d) obj2).f312915a);
    }

    public final int hashCode() {
        return this.f312915a.hashCode();
    }
}
