package bc6;

import bw0.h;
import bw0.k;
import bw0.m;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import dec.r;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;
import nqi.c;
import u80.b;
import u80.e;
import u80.g;
import u80.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f14389a;

    public a(r pocketInfoMapper, o moneyPrefixFormatter) {
        Intrinsics.checkNotNullParameter(pocketInfoMapper, "pocketInfoMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f14389a = pocketInfoMapper;
    }

    public final CenteredAmountDelegate.Model a(c donateMoneyInputState) {
        Intrinsics.checkNotNullParameter(donateMoneyInputState, "donateMoneyInputState");
        String str = donateMoneyInputState.f218472b;
        d dVar = donateMoneyInputState.f218471a;
        h hVar = new h(str, o.b(new g(dVar, e.UNSIGNED, b.SYMBOL, 8)).toString(), true, null, Boolean.FALSE, false, false, true, false, null, 6868);
        m.Companion.getClass();
        return new CenteredAmountDelegate.Model("ONE_TIME_DONATION_AMOUNT_EDIT_ITEM_ID", null, hVar, new f3(null, null, null, false, h3.LOADING, false), k.a(), null, null, true, false, dVar.f115083b, null, 1314);
    }
}
