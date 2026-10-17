package gu4;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f146699a = new i();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CreditCardAutopayPayments autopayPayments = (CreditCardAutopayPayments) obj2;
        Intrinsics.checkNotNullParameter(autopayPayments, "autopayPayments");
        od0.i.Companion.getClass();
        return od0.h.a(autopayPayments);
    }
}
