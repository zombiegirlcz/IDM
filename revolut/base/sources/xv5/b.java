package xv5;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements uk0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f309203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv5.a f309204b;

    public b(xe0.e localStorage, sv5.a cryptoDisplayCurrencyKey) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(cryptoDisplayCurrencyKey, "cryptoDisplayCurrencyKey");
        this.f309203a = localStorage;
        this.f309204b = cryptoDisplayCurrencyKey;
    }

    @Override // uk0.b
    public final boolean a(mk0.a storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        String id10 = this.f309204b.a();
        Intrinsics.checkNotNullParameter(id10, "id");
        return ((String) storage.h(new tk0.d(id10))) == null && ((String) y.t(String.class, this.f309203a, "KEY_SELECTED_CRYPTO_CURRENCY")) != null;
    }

    @Override // uk0.b
    public final void b(mk0.a storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        xe0.e eVar = this.f309203a;
        String str = (String) y.t(String.class, eVar, "KEY_SELECTED_CRYPTO_CURRENCY");
        if (str != null) {
            String id10 = this.f309204b.a();
            Intrinsics.checkNotNullParameter(id10, "id");
            storage.g(new tk0.d(id10), str);
            eVar.I0("KEY_SELECTED_CRYPTO_CURRENCY");
        }
    }
}
