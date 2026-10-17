package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation;

import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f101298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f101299b;

    public b(boolean z, e eVar) {
        this.f101298a = z;
        this.f101299b = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        if (this.f101298a) {
            this.f101299b.C2(a.C0619a.f101296a);
        }
        return Unit.f186387a;
    }
}
