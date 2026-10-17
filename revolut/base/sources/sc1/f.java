package sc1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderDevice f261608a;

    public f(CardReaderDevice cardReaderDevice) {
        Intrinsics.checkNotNullParameter(cardReaderDevice, "cardReaderDevice");
        this.f261608a = cardReaderDevice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f261608a, ((f) obj2).f261608a);
    }

    public final int hashCode() {
        return this.f261608a.hashCode();
    }
}
