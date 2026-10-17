package fa1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderDevice f133205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f133207c;

    public p(CardReaderDevice cardReaderDevice, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(cardReaderDevice, "cardReaderDevice");
        this.f133205a = cardReaderDevice;
        this.f133206b = z;
        this.f133207c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f133205a, pVar.f133205a) && this.f133206b == pVar.f133206b && Intrinsics.f(this.f133207c, pVar.f133207c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f133205a.hashCode() * 31, 31, this.f133206b);
        Integer num = this.f133207c;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
