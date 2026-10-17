package zaj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320720a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f320720a, ((a) obj2).f320720a);
    }

    public final int hashCode() {
        return this.f320720a.hashCode();
    }

    public a(Data preLaunchTokenData) {
        Intrinsics.checkNotNullParameter(preLaunchTokenData, "preLaunchTokenData");
        this.f320720a = preLaunchTokenData;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
