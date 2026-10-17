package tob;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f272565a;

    public e(Data riskConfigData) {
        Intrinsics.checkNotNullParameter(riskConfigData, "riskConfigData");
        this.f272565a = riskConfigData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f272565a, ((e) obj2).f272565a);
    }

    public final int hashCode() {
        return this.f272565a.hashCode();
    }
}
