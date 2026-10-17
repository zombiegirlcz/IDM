package com.revolut.feature.alipay.impl.ui.qr.showcode.modal;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f61084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlipayPlusExpandedCodeScreenContract$InputData.CodeType f61085b;

    public a(Data paymentCode, AlipayPlusExpandedCodeScreenContract$InputData.CodeType codeType) {
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        this.f61084a = paymentCode;
        this.f61085b = codeType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f61084a, aVar.f61084a) && this.f61085b == aVar.f61085b;
    }

    public final int hashCode() {
        return this.f61085b.hashCode() + (this.f61084a.hashCode() * 31);
    }
}
