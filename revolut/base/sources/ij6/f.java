package ij6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f161713a;

    public f(Data consentDetailsData) {
        Intrinsics.checkNotNullParameter(consentDetailsData, "consentDetailsData");
        this.f161713a = consentDetailsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f161713a, ((f) obj2).f161713a);
    }

    public final int hashCode() {
        return this.f161713a.hashCode();
    }
}
