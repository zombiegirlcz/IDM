package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import aii.e;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferFlowInputData.NewTransfer f101988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1j.a f101989b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(BankTransferInputData inputData, i1j.a aVar, int i) {
        aVar = (i & 2) != 0 ? null : aVar;
        boolean z = (i & 4) == 0;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this(new BankTransferFlowInputData.NewTransfer(inputData, z), aVar);
    }

    public final i1j.a b() {
        return this.f101989b;
    }

    public final BankTransferFlowInputData.NewTransfer c() {
        return this.f101988a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f101988a, aVar.f101988a) && Intrinsics.f(this.f101989b, aVar.f101989b);
    }

    public final int hashCode() {
        int iHashCode = this.f101988a.hashCode() * 31;
        i1j.a aVar = this.f101989b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public a(BankTransferFlowInputData.NewTransfer inputData, i1j.a aVar) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101988a = inputData;
        this.f101989b = aVar;
    }
}
