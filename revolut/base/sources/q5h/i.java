package q5h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f242403a;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f242403a, ((i) obj2).f242403a);
    }

    public final int hashCode() {
        return this.f242403a.hashCode();
    }

    public i(Data servicesData) {
        Intrinsics.checkNotNullParameter(servicesData, "servicesData");
        this.f242403a = servicesData;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
