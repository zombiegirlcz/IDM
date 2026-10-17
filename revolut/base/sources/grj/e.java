package grj;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f146028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f146029b;

    public e(LinkedHashMap regularSpendingMap, LinkedHashMap committedSpendingMap) {
        Intrinsics.checkNotNullParameter(regularSpendingMap, "regularSpendingMap");
        Intrinsics.checkNotNullParameter(committedSpendingMap, "committedSpendingMap");
        this.f146028a = regularSpendingMap;
        this.f146029b = committedSpendingMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f146028a.equals(eVar.f146028a) && this.f146029b.equals(eVar.f146029b);
    }

    public final int hashCode() {
        return this.f146029b.hashCode() + (this.f146028a.hashCode() * 31);
    }
}
