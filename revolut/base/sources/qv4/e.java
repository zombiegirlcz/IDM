package qv4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f249525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f249526b;

    public e(LinkedHashMap upcomingStatements, LinkedHashMap pastStatements) {
        Intrinsics.checkNotNullParameter(upcomingStatements, "upcomingStatements");
        Intrinsics.checkNotNullParameter(pastStatements, "pastStatements");
        this.f249525a = upcomingStatements;
        this.f249526b = pastStatements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f249525a.equals(eVar.f249525a) && this.f249526b.equals(eVar.f249526b);
    }

    public final int hashCode() {
        return this.f249526b.hashCode() + (this.f249525a.hashCode() * 31);
    }
}
