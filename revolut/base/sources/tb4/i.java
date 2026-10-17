package tb4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f269443a;

    public i(Data evidences) {
        Intrinsics.checkNotNullParameter(evidences, "evidences");
        this.f269443a = evidences;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f269443a, ((i) obj2).f269443a);
    }

    public final int hashCode() {
        return this.f269443a.hashCode();
    }
}
