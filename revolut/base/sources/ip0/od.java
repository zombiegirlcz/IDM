package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class od extends com.revolut.core.ui_kit.delegates.z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f165652a;

    public od(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f165652a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof od) && Intrinsics.f(this.f165652a, ((od) obj2).f165652a);
    }

    public final int hashCode() {
        return this.f165652a.hashCode();
    }
}
