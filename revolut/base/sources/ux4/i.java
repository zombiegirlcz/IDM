package ux4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {
    private i() {
    }

    public static m a(String facilityId, l variant) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new m(new k(facilityId, j.CREDIT_CARD), variant, "topic.credit-cards");
    }
}
