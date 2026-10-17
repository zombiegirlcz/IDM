package com.revolut.data.network.models.splitbill;

import kfm.o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f60229b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f60228a = i;
        this.f60229b = function1;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object obj2) {
        switch (this.f60228a) {
            case 0:
                return SplitBillRepositoryImpl.splitBill$lambda$0(this.f60229b, obj2);
            case 1:
                return SplitBillRepositoryImpl.splitBill$lambda$2((b) this.f60229b, obj2);
            case 2:
                return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0$1((b) this.f60229b, obj2);
            case 3:
                return SplitBillRepositoryImpl.reloadSplitBillsAndRequestorDetails$lambda$0$1((cma.b) this.f60229b, obj2);
            case 4:
                return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0$1((cmc.c) this.f60229b, obj2);
            default:
                return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0$1((cmc.c) this.f60229b, obj2);
        }
    }
}
