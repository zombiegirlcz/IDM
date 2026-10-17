package caj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData;
import e4m.e;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoNavigationInterceptorScreenContract$InputData f22658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f22659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f22660c;

    public b(a aVar, CryptoNavigationInterceptorScreenContract$InputData cryptoNavigationInterceptorScreenContract$InputData) {
        this.f22658a = cryptoNavigationInterceptorScreenContract$InputData;
        int i = 18;
        this.f22659b = e4m.b.b(new bt7.e(aVar, this, 1, i));
        this.f22660c = e4m.b.b(new bt7.e(aVar, this, 0, i));
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
