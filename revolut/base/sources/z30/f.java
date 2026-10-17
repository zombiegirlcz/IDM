package z30;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f319113a;

    public f(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f319113a = options;
    }

    @Override // z30.j
    public final List a() {
        return this.f319113a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f319113a.equals(((f) obj2).f319113a);
    }

    public final int hashCode() {
        return this.f319113a.hashCode();
    }
}
