package jxd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoTopUpMethodsScreenContract$InputData f179139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f179140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f179141c;

    public b(f fVar, a aVar, AutoTopUpMethodsScreenContract$InputData autoTopUpMethodsScreenContract$InputData) {
        this.f179139a = autoTopUpMethodsScreenContract$InputData;
        int i = 4;
        this.f179140b = e4m.b.b(new jqa.h(fVar, this, 1, i));
        this.f179141c = e4m.b.b(new jqa.h(fVar, this, 0, i));
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
