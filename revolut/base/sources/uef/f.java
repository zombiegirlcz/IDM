package uef;

import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserDetails f279354a;

    public f(TransactionRecogniserDetails recogniserDetails) {
        Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
        this.f279354a = recogniserDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f279354a, ((f) obj2).f279354a);
    }

    public final int hashCode() {
        return this.f279354a.hashCode();
    }
}
