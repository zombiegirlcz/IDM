package rv6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f257702a;

    public k() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f257702a, ((k) obj2).f257702a);
    }

    public final int hashCode() {
        return this.f257702a.hashCode();
    }

    public k(Data planDetailsData) {
        Intrinsics.checkNotNullParameter(planDetailsData, "planDetailsData");
        this.f257702a = planDetailsData;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
