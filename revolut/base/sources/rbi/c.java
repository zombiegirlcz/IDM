package rbi;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbi.a f253120a;

    public c(tbi.a occupation) {
        Intrinsics.checkNotNullParameter(occupation, "occupation");
        this.f253120a = occupation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f253120a == ((c) obj2).f253120a;
    }

    public final int hashCode() {
        return this.f253120a.hashCode();
    }
}
