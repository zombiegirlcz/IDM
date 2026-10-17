package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.DocumentDeliveryTrackingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentDeliveryTrackingScreenContract$InputData f247544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247546c;

    public z(k0 k0Var, x xVar, DocumentDeliveryTrackingScreenContract$InputData documentDeliveryTrackingScreenContract$InputData) {
        this.f247544a = documentDeliveryTrackingScreenContract$InputData;
        int i = 8;
        this.f247545b = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247546c = e4m.b.b(new l(k0Var, this, 0, i));
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
