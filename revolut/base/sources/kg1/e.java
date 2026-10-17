package kg1;

import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedRevolutCardWrapper f183901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f183903c;

    public e(SharedRevolutCardWrapper cardWrapper, boolean z) {
        d secondaryButtonType = d.TERMINATE_CARD;
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(secondaryButtonType, "secondaryButtonType");
        this.f183901a = cardWrapper;
        this.f183902b = z;
        this.f183903c = secondaryButtonType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f183901a, eVar.f183901a) && this.f183902b == eVar.f183902b && this.f183903c == eVar.f183903c;
    }

    public final int hashCode() {
        return this.f183903c.hashCode() + j6.a.c(this.f183901a.hashCode() * 31, 31, this.f183902b);
    }
}
