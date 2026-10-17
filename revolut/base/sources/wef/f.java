package wef;

import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserDetails f296770a;

    public f(TransactionRecogniserDetails recogniserDetails) {
        Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
        this.f296770a = recogniserDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f296770a, ((f) obj2).f296770a);
    }

    public final int hashCode() {
        return this.f296770a.hashCode();
    }
}
