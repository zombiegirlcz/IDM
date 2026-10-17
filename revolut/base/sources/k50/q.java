package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f181210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181211b;

    public q(r type, String output) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(output, "output");
        this.f181210a = type;
        this.f181211b = output;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f181210a == qVar.f181210a && Intrinsics.f(this.f181211b, qVar.f181211b);
    }

    public final int hashCode() {
        return this.f181211b.hashCode() + (this.f181210a.hashCode() * 31);
    }
}
