package fu9;

import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactionsAuthorsViewer$InputData f138152a;

    public e(ReactionsAuthorsViewer$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f138152a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f138152a, ((e) obj2).f138152a);
    }

    public final int hashCode() {
        return this.f138152a.f79508a.hashCode();
    }
}
