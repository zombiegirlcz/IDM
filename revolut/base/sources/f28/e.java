package f28;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f131459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f131460b;

    public e(h0 timeframe, Data data) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f131459a = timeframe;
        this.f131460b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f131459a == eVar.f131459a && Intrinsics.f(this.f131460b, eVar.f131460b);
    }

    @Override // f28.g
    public final Data getData() {
        return this.f131460b;
    }

    public final int hashCode() {
        return this.f131460b.hashCode() + (this.f131459a.hashCode() * 31);
    }
}
