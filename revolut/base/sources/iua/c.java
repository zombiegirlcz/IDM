package iua;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f168543a;

    public c(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f168543a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f168543a, ((c) obj2).f168543a);
    }

    public final int hashCode() {
        return this.f168543a.hashCode();
    }
}
