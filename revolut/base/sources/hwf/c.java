package hwf;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f156170a;

    public c(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f156170a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f156170a, ((c) obj2).f156170a);
    }

    public final int hashCode() {
        return this.f156170a.hashCode();
    }
}
