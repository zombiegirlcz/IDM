package g17;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f139550a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f139550a, ((e) obj2).f139550a);
    }

    public final int hashCode() {
        return this.f139550a.hashCode();
    }

    public e(Data boostedPlanRate) {
        Intrinsics.checkNotNullParameter(boostedPlanRate, "boostedPlanRate");
        this.f139550a = boostedPlanRate;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
