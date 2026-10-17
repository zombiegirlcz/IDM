package kg0;

import com.revolut.feature.feedback.api.domain.FeedbackTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeedbackTag f183896a;

    public b(FeedbackTag tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f183896a = tag2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f183896a, ((b) obj2).f183896a);
    }

    public final int hashCode() {
        return this.f183896a.hashCode();
    }
}
