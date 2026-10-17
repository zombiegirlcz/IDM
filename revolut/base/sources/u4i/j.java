package u4i;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f277353a;

    public j(Data fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f277353a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f277353a, ((j) obj2).f277353a);
    }

    public final int hashCode() {
        return this.f277353a.hashCode();
    }
}
