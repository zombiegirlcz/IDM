package tz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangePinActivationScreenContract$InputData f275783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f275784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f275785c;

    public j(e eVar, k kVar, ChangePinActivationScreenContract$InputData changePinActivationScreenContract$InputData) {
        this.f275783a = changePinActivationScreenContract$InputData;
        int i = 6;
        this.f275784b = e4m.b.b(new tn3.a(this, 1, i));
        this.f275785c = e4m.b.b(new tn3.a(this, 0, i));
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
