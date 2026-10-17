package x2g;

import aii.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f302558a;

    public k(ArrayList updatedAnswers) {
        Intrinsics.checkNotNullParameter(updatedAnswers, "updatedAnswers");
        this.f302558a = updatedAnswers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f302558a.equals(((k) obj2).f302558a);
    }

    public final int hashCode() {
        return this.f302558a.hashCode();
    }
}
