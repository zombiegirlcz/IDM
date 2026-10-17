package pe2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f235320a;

    public g(Data areaContent) {
        Intrinsics.checkNotNullParameter(areaContent, "areaContent");
        this.f235320a = areaContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f235320a, ((g) obj2).f235320a);
    }

    public final int hashCode() {
        return this.f235320a.hashCode();
    }
}
