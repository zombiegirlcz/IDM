package h32;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f149006a;

    public d(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f149006a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f149006a, ((d) obj2).f149006a);
    }

    public final int hashCode() {
        return this.f149006a.hashCode();
    }
}
