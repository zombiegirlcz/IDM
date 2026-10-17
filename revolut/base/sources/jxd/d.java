package jxd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomOrderAmountScreenContract$InputData f179145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f179146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f179147c;
    public final e4m.e d;
    public final e4m.e e;

    public d(f fVar, a aVar, CustomOrderAmountScreenContract$InputData customOrderAmountScreenContract$InputData) {
        this.f179146b = fVar;
        this.f179145a = customOrderAmountScreenContract$InputData;
        int i = 5;
        this.f179147c = e4m.b.b(new jqa.h(fVar, this, 2, i));
        this.d = e4m.b.b(new jqa.h(fVar, this, 1, i));
        this.e = e4m.b.b(new jqa.h(fVar, this, 0, i));
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
