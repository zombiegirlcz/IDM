package e40;

import com.revolut.chat.domain.model.LastMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastMessage f122363a;

    public r(LastMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f122363a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f122363a, ((r) obj2).f122363a);
    }

    public final int hashCode() {
        return this.f122363a.hashCode();
    }
}
