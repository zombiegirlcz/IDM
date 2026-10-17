package ks5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import dsh.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements csh.g {
    @Override // csh.g
    public final List a(Class contextClass) {
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        if (!contextClass.equals(CryptoWidgetContext.class)) {
            return f0.f322471a;
        }
        dsh.e.Companion.getClass();
        return u.c(new i("FeaturesLarge", dsh.d.a()));
    }

    @Override // csh.g
    public final List b(Class cls) {
        if (!cls.equals(CryptoWidgetContext.class)) {
            return f0.f322471a;
        }
        dsh.e.Companion.getClass();
        return v.k(new i("OrdersDynamic", dsh.d.a()), new i("WatchlistItems", dsh.d.a()), new i("TransactionsDynamic", dsh.d.a()), new i("AlertsList", dsh.d.a()), new i("CardsSmall", dsh.d.a()), new i("ReceiveSmall", dsh.d.a()), new i("TopMoversLarge", dsh.d.a()), new i("SymbolStandalone", dsh.d.a()));
    }
}
