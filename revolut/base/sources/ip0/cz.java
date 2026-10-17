package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f163806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f163808c;
    public final boolean d;

    public cz(int i, int i2, Clause cardHolderName, boolean z) {
        Intrinsics.checkNotNullParameter(cardHolderName, "cardHolderName");
        this.f163806a = cardHolderName;
        this.f163807b = i;
        this.f163808c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj2;
        return Intrinsics.f(this.f163806a, czVar.f163806a) && this.f163807b == czVar.f163807b && this.f163808c == czVar.f163808c && this.d == czVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f163808c, j6.a.b(this.f163807b, this.f163806a.hashCode() * 31, 31), 31);
    }
}
