package nl5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import nk7.k;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSpareChangeScreenContract$InputData f217029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f217030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f217031c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f217032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f217033h;

    public f(e eVar, BaseScreen baseScreen, CryptoSpareChangeScreenContract$InputData cryptoSpareChangeScreenContract$InputData) {
        this.f217029a = cryptoSpareChangeScreenContract$InputData;
        this.f217030b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 7;
        this.f217031c = e4m.b.b(new k(eVar, this, 2, i));
        this.d = e4m.b.b(new k(eVar, this, 1, i));
        this.e = e4m.b.b(new k(eVar, this, 0, i));
        this.f = e4m.b.b(new k(eVar, this, 4, i));
        this.f217032g = e4m.b.b(new k(eVar, this, 5, i));
        this.f217033h = e4m.b.b(new k(eVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
