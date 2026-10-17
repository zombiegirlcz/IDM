package v30;

import com.revolut.chat.domain.model.Transcript;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Transcript f285841a;

    public z0(Transcript transcript) {
        Intrinsics.checkNotNullParameter(transcript, "transcript");
        this.f285841a = transcript;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z0) && Intrinsics.f(this.f285841a, ((z0) obj2).f285841a);
    }

    public final int hashCode() {
        return this.f285841a.hashCode();
    }
}
