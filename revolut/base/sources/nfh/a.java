package nfh;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f214906a;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f214906a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f214906a, ((a) obj2).f214906a);
    }

    public final int hashCode() {
        return this.f214906a.f214907a.hashCode();
    }
}
