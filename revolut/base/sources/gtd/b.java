package gtd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f146577a;

    public b(Data travelData) {
        Intrinsics.checkNotNullParameter(travelData, "travelData");
        this.f146577a = travelData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f146577a, ((b) obj2).f146577a);
    }

    public final int hashCode() {
        return this.f146577a.hashCode();
    }
}
