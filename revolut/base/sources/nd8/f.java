package nd8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f214336a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f214336a, ((f) obj2).f214336a);
    }

    public final int hashCode() {
        return this.f214336a.hashCode();
    }

    public f(Data juniorName) {
        Intrinsics.checkNotNullParameter(juniorName, "juniorName");
        this.f214336a = juniorName;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
