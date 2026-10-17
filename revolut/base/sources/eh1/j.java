package eh1;

import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedRevolutCardWrapper f125692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f125693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f125694c;

    public j(SharedRevolutCardWrapper cardWrapper, RevolutCardOtp cardOtp, boolean z) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        this.f125692a = cardWrapper;
        this.f125693b = cardOtp;
        this.f125694c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f125692a, jVar.f125692a) && Intrinsics.f(this.f125693b, jVar.f125693b) && this.f125694c == jVar.f125694c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125694c) + ((this.f125693b.hashCode() + (this.f125692a.hashCode() * 31)) * 31);
    }
}
