package w50;

import com.revolut.chat.domain.model.TranscriptDateRange;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TranscriptDateRange f294653a;

    public c(TranscriptDateRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f294653a = range;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f294653a, ((c) obj2).f294653a);
    }

    public final int hashCode() {
        return this.f294653a.hashCode();
    }
}
