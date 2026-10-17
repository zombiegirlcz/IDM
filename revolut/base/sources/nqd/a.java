package nqd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f218404a;

    public a(Data incomeSortersData) {
        Intrinsics.checkNotNullParameter(incomeSortersData, "incomeSortersData");
        this.f218404a = incomeSortersData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f218404a, ((a) obj2).f218404a);
    }

    public final int hashCode() {
        return this.f218404a.hashCode();
    }
}
