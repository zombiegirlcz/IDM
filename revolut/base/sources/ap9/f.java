package ap9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8126b;

    public f(b status, ArrayList participants) {
        Intrinsics.checkNotNullParameter(participants, "participants");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f8125a = participants;
        this.f8126b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f8125a.equals(fVar.f8125a) && this.f8126b.equals(fVar.f8126b);
    }

    public final int hashCode() {
        return this.f8126b.hashCode() + (this.f8125a.hashCode() * 31);
    }
}
