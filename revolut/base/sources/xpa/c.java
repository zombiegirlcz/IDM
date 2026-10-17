package xpa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardTransferData f307920a;

    public c(PushToCardTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f307920a = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f307920a, ((c) obj2).f307920a);
    }

    public final int hashCode() {
        return this.f307920a.hashCode();
    }
}
