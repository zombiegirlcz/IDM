package o40;

import com.revolut.chat.domain.model.TranscriptDateRange;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TranscriptDateRange f221905a;

    public c(TranscriptDateRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f221905a = range;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f221905a, ((c) obj2).f221905a);
    }

    public final int hashCode() {
        return this.f221905a.hashCode();
    }
}
