package xv5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.r;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f309210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f309211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sv5.a f309212c;

    public g(xe0.e storage, mk0.a personalisationStorage, sv5.a cryptoDisplayCurrencyKey) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(cryptoDisplayCurrencyKey, "cryptoDisplayCurrencyKey");
        this.f309210a = storage;
        this.f309211b = personalisationStorage;
        this.f309212c = cryptoDisplayCurrencyKey;
    }

    public final r a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        String id10 = this.f309212c.a();
        Intrinsics.checkNotNullParameter(id10, "id");
        return w.g0(pw5.a.A(this.f309211b, new tk0.d(id10), currency.f306286a));
    }
}
