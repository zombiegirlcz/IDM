package com.revolut.data.network.models.splitbill;

import com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl;
import java.util.List;
import k71.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v61.h;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60227b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f60226a = i;
        this.f60227b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f60226a) {
            case 0:
                return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$1((SplitBillRepositoryImpl) this.f60227b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2);
            case 1:
                return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$3((SplitBillRepositoryImpl) this.f60227b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2);
            case 2:
                return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$3((SplitBillRepositoryImpl) this.f60227b, (Unit) obj2);
            case 3:
                return SplitBillRepositoryImpl.splitBill$lambda$1((SplitBillRepositoryImpl) this.f60227b, (h) obj2);
            case 4:
                return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0$0((SplitBillRepositoryImpl) this.f60227b, (List) obj2);
            case 5:
                return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$1((SplitBillRepositoryImpl) this.f60227b, (String) obj2);
            case 6:
                return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$1((SplitBillRepositoryImpl) this.f60227b, (Unit) obj2);
            default:
                return SplitBillRepositoryImpl.observeSplitBillForTransaction$lambda$0((i) this.f60227b, (List) obj2);
        }
    }
}
