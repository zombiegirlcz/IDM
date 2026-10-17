package rpd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f256363a;

    public a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f256363a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f256363a, ((a) obj2).f256363a);
    }

    public final int hashCode() {
        return this.f256363a.hashCode();
    }
}
