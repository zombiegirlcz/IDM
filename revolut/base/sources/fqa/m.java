package fqa;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f137238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137239b;

    public m(CardOwner cardOwner, boolean z) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f137238a = cardOwner;
        this.f137239b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f137238a, mVar.f137238a) && this.f137239b == mVar.f137239b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137239b) + (this.f137238a.hashCode() * 31);
    }
}
