package j1a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillQrInputData f170299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f170300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f170301c;

    public g(i iVar, SplitBillQrInputData splitBillQrInputData) {
        this.f170300b = iVar;
        this.f170299a = splitBillQrInputData;
        this.f170301c = e4m.b.b(new iwh.k(iVar, this, 4));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
