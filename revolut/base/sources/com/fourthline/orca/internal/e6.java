package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;

/* JADX INFO: loaded from: classes23.dex */
public final class e6 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hq0 f28002a = d6.f27653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp0 f28003b;

    public e6(int i) {
        c81.a aVar = c81.f27404a;
        this.f28003b = new zp0.c(c81.a.a(aVar, R.string.shared_dialog_info_sepa_mandate_header, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_info_sepa_mandate_message, 0, 2, null), null, kd1.b.f30209a, false, aVar.a(R.string.shared_dialog_info_sepa_mandate_hint, "0." + i), 20, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f28002a;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return this.f28003b;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }
}
