package f28;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f131461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f131462b;

    public f(h0 timeframe, Data data) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f131461a = timeframe;
        this.f131462b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f131461a == fVar.f131461a && Intrinsics.f(this.f131462b, fVar.f131462b);
    }

    @Override // f28.g
    public final Data getData() {
        return this.f131462b;
    }

    public final int hashCode() {
        return this.f131462b.hashCode() + (this.f131461a.hashCode() * 31);
    }
}
