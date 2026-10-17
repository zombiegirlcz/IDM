package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final si0 f166824a;

    public vi0(si0 buttonPayload) {
        Intrinsics.checkNotNullParameter(buttonPayload, "buttonPayload");
        this.f166824a = buttonPayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vi0) && Intrinsics.f(this.f166824a, ((vi0) obj2).f166824a);
    }

    public final int hashCode() {
        return this.f166824a.hashCode();
    }
}
