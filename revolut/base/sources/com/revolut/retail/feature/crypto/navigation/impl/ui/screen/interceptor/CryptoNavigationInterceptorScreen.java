package com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.crypto.navigation.impl.R$id;
import com.revolut.retail.feature.crypto.navigation.impl.R$layout;
import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreen;
import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData;
import eaj.c;
import eaj.d;
import eaj.e;
import eaj.f;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/navigation/impl/ui/screen/interceptor/CryptoNavigationInterceptorScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Leaj/e;", "Lcom/revolut/retail/feature/crypto/navigation/impl/ui/screen/interceptor/CryptoNavigationInterceptorScreenContract$InputData;", "Laii/q;", "feature_crypto_navigation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoNavigationInterceptorScreen extends BaseRecyclerViewScreen<e, CryptoNavigationInterceptorScreenContract$InputData, q> {
    public final boolean U;
    public final int V;
    public final int W;
    public final PromptContentDelegate X;
    public final List Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f100026a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoNavigationInterceptorScreen(CryptoNavigationInterceptorScreenContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = true;
        this.V = R$id.cryptoNavigationInterceptorScreen_recyclerView;
        this.W = R$layout.screen_crypto_navigation_interceptor;
        PromptContentDelegate promptContentDelegate = new PromptContentDelegate();
        this.X = promptContentDelegate;
        this.Y = u.c(promptContentDelegate);
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: eaj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoNavigationInterceptorScreen f124269b;

            {
                this.f124269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoNavigationInterceptorScreen cryptoNavigationInterceptorScreen = this.f124269b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoNavigationInterceptorScreen.m2()).a().get(aaj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aaj.a.class, " is not found"));
                        }
                        caj.a aVar3 = ((caj.a) aVar2.b()).f22657c;
                        CryptoNavigationInterceptorScreenContract$InputData cryptoNavigationInterceptorScreenContract$InputData = (CryptoNavigationInterceptorScreenContract$InputData) cryptoNavigationInterceptorScreen.G;
                        cryptoNavigationInterceptorScreenContract$InputData.getClass();
                        return new caj.b(aVar3, cryptoNavigationInterceptorScreenContract$InputData);
                    default:
                        return (f) ((caj.b) this.f124269b.Z.getValue()).f22660c.get();
                }
            }
        });
        final int i2 = 1;
        this.f100026a0 = w.y0(new Function0(this) { // from class: eaj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoNavigationInterceptorScreen f124269b;

            {
                this.f124269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoNavigationInterceptorScreen cryptoNavigationInterceptorScreen = this.f124269b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoNavigationInterceptorScreen.m2()).a().get(aaj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aaj.a.class, " is not found"));
                        }
                        caj.a aVar3 = ((caj.a) aVar2.b()).f22657c;
                        CryptoNavigationInterceptorScreenContract$InputData cryptoNavigationInterceptorScreenContract$InputData = (CryptoNavigationInterceptorScreenContract$InputData) cryptoNavigationInterceptorScreen.G;
                        cryptoNavigationInterceptorScreenContract$InputData.getClass();
                        return new caj.b(aVar3, cryptoNavigationInterceptorScreenContract$InputData);
                    default:
                        return (f) ((caj.b) this.f124269b.Z.getValue()).f22660c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (caj.b) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (f) this.f100026a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        PromptContentDelegate promptContentDelegate = this.X;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.f53054h.f121375b), null, new eaj.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.i.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.q()), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
