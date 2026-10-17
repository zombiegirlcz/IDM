package ici;

import aii.r;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f160293a;

    public e(HashSet selectedRisks) {
        Intrinsics.checkNotNullParameter(selectedRisks, "selectedRisks");
        this.f160293a = selectedRisks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f160293a.equals(((e) obj2).f160293a);
    }

    public final int hashCode() {
        return this.f160293a.hashCode();
    }
}
