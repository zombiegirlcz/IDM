package eaj;

import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData;
import ji5.m;
import jki.h;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f124271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CryptoNavigationInterceptorScreenContract$InputData f124272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f124273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f124274s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p stateMapper, x deeplinkHandler, CryptoNavigationInterceptorScreenContract$InputData inputData, m cryptoPreferencesInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        this.f124271p = deeplinkHandler;
        this.f124272q = inputData;
        this.f124273r = cryptoPreferencesInteractor;
        this.f124274s = j.f175191a;
    }

    @Override // jki.g
    public final i r2() {
        return this.f124274s;
    }
}
