package com.revolut.feature.apm.bills.billers.api.model;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final String a(Biller biller) {
        String str;
        Intrinsics.checkNotNullParameter(biller, "<this>");
        Biller.Details details = biller.k;
        if (details != null && (str = details.f61151a) != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return biller.f61145a;
    }

    public static final String b(Biller biller) {
        String str;
        Intrinsics.checkNotNullParameter(biller, "<this>");
        Biller.Details details = biller.k;
        if (details != null && (str = details.f61152b) != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return biller.f61146b;
    }
}
