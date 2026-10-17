package zmd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323461a;

    public d(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f323461a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f323461a, ((d) obj2).f323461a);
    }

    public final int hashCode() {
        return this.f323461a.hashCode();
    }
}
