package dv2;

import a0.d;
import a09.r;
import bv2.b;
import com.revolut.feature.card.verification.api.navigation.CardPennyTopUpDestination;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import q06.h;
import sri.m;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f118022a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f118022a = navigator;
    }

    public static CardPennyTopUpDestination b(c cVar) {
        HashMap map = cVar.d;
        String str = (String) map.get("externalCardId");
        String str2 = (String) map.get("currency");
        if (str != null && !d0.W(str) && str2 != null && !d0.W(str2)) {
            return new CardPennyTopUpDestination(str, str2, TopUpTarget.Main.f90573a);
        }
        IllegalStateException illegalStateException = new IllegalStateException(d.s("Card verification topup deeplink had externalCardId=", str, " currency=", str2));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "card-verification-topup");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        CardPennyTopUpDestination cardPennyTopUpDestinationB = b(cVar);
        if (cardPennyTopUpDestinationB != null) {
            return new h(cardPennyTopUpDestinationB, null);
        }
        return null;
    }

    @Override // jf0.d
    public final efm.d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new r(this, deeplink, 24), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
