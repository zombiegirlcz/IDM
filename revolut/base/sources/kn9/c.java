package kn9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreenContract$InputData;
import java.util.Set;
import jqa.h;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayInStoreScreenContract$InputData f186044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f186045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f186046c;
    public final e4m.e d;

    public c(a aVar, b bVar, PayInStoreScreenContract$InputData payInStoreScreenContract$InputData) {
        this.f186044a = payInStoreScreenContract$InputData;
        int i = 24;
        this.f186045b = e4m.b.b(new h(aVar, this, 2, i));
        this.f186046c = e4m.b.b(new h(aVar, this, 1, i));
        this.d = e4m.b.b(new h(aVar, this, 0, i));
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
