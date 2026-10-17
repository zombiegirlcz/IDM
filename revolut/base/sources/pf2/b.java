package pf2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f235408a;

    public b(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f235408a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f235408a, ((b) obj2).f235408a);
    }

    public final int hashCode() {
        return this.f235408a.hashCode();
    }
}
