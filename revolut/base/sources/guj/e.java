package guj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f146966a;

    public e(Data eligibilityCriteria) {
        Intrinsics.checkNotNullParameter(eligibilityCriteria, "eligibilityCriteria");
        this.f146966a = eligibilityCriteria;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f146966a, ((e) obj2).f146966a);
    }

    public final int hashCode() {
        return this.f146966a.hashCode();
    }
}
