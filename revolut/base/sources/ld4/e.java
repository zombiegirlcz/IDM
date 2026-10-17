package ld4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f194023a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f194023a, ((e) obj2).f194023a);
    }

    public final int hashCode() {
        return this.f194023a.hashCode();
    }

    public e(Data configurationData) {
        Intrinsics.checkNotNullParameter(configurationData, "configurationData");
        this.f194023a = configurationData;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
