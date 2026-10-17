package jci;

import aii.r;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f172818a;

    public f(HashSet selectedRisks) {
        Intrinsics.checkNotNullParameter(selectedRisks, "selectedRisks");
        this.f172818a = selectedRisks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f172818a.equals(((f) obj2).f172818a);
    }

    public final int hashCode() {
        return this.f172818a.hashCode();
    }
}
