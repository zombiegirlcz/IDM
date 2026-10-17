package s8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerReviewScreenInputData f261068a;

    public k(PeerToPeerReviewScreenInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f261068a = inputData;
    }

    public final PeerToPeerReviewScreenInputData b() {
        return this.f261068a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f261068a, ((k) obj2).f261068a);
    }

    public final int hashCode() {
        return this.f261068a.hashCode();
    }
}
