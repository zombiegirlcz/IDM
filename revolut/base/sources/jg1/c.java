package jg1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f173898a;

    public c(byte[] opc2) {
        Intrinsics.checkNotNullParameter(opc2, "opc");
        this.f173898a = opc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!c.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.api.models.CardGooglePayProvisionResponse.Opc");
        return Arrays.equals(this.f173898a, ((c) obj2).f173898a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f173898a);
    }
}
