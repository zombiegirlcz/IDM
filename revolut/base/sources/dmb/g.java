package dmb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f115880a;

    public g(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f115880a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f115880a, ((g) obj2).f115880a);
    }

    public final int hashCode() {
        return this.f115880a.hashCode();
    }
}
