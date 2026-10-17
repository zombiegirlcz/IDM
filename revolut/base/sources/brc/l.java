package brc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f17987a;

    public l() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f17987a, ((l) obj2).f17987a);
    }

    public final int hashCode() {
        return this.f17987a.hashCode();
    }

    public l(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17987a = data;
    }

    public /* synthetic */ l(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
