package yra;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardTransferData f316181a;

    public l(PushToCardTransferData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f316181a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f316181a, ((l) obj2).f316181a);
    }

    public final int hashCode() {
        return this.f316181a.hashCode();
    }
}
