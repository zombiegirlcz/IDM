package com.revolut.feature.statements.impl.tools.transactions.extras;

import android.text.TextUtils;
import qd0.a;
import qd0.b;

/* JADX INFO: loaded from: classes7.dex */
public enum PaymentType {
    regular,
    priority;

    public static PaymentType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (PaymentType paymentType : values()) {
            String strName = paymentType.name();
            b.Companion.getClass();
            if (strName.equals(str.toLowerCase(a.f244819b))) {
                return paymentType;
            }
        }
        return null;
    }

    public boolean isSwift() {
        return this == priority;
    }
}
