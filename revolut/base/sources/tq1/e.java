package tq1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagoPABillConfirmationScreenContract$InputData f273487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f273488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f273489c;

    public e(d dVar, h hVar, PagoPABillConfirmationScreenContract$InputData pagoPABillConfirmationScreenContract$InputData) {
        this.f273487a = pagoPABillConfirmationScreenContract$InputData;
        int i = 6;
        this.f273488b = e4m.b.b(new tg5.h(dVar, this, 1, i));
        this.f273489c = e4m.b.b(new tg5.h(dVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
