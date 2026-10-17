package jef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.merchant_history.MerchantHistoryScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MerchantHistoryScreenContract$InputData f173369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f173370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173371c;

    public d(e eVar, g gVar, MerchantHistoryScreenContract$InputData merchantHistoryScreenContract$InputData) {
        this.f173369a = merchantHistoryScreenContract$InputData;
        int i = 5;
        this.f173370b = e4m.b.b(new jdi.i(gVar, this, 1, i));
        this.f173371c = e4m.b.b(new jdi.i(gVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
