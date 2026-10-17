package u82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.h f278082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f278083b;

    public e(hrf.h errorState, List suggestions) {
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f278082a = errorState;
        this.f278083b = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f278082a, eVar.f278082a) && Intrinsics.f(this.f278083b, eVar.f278083b);
    }

    public final int hashCode() {
        return this.f278083b.hashCode() + (this.f278082a.hashCode() * 31);
    }
}
