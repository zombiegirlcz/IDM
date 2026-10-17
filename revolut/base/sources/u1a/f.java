package u1a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276369a;

    public f(Data qrStateData) {
        Intrinsics.checkNotNullParameter(qrStateData, "qrStateData");
        this.f276369a = qrStateData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f276369a, ((f) obj2).f276369a);
    }

    public final int hashCode() {
        return this.f276369a.hashCode();
    }
}
