package cyc;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f110081a;

    public e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f110081a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f110081a, ((e) obj2).f110081a);
    }

    public final int hashCode() {
        return this.f110081a.hashCode();
    }
}
