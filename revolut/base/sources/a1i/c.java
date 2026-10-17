package a1i;

import kotlin.Pair;
import wd6.e;
import wd6.g;
import wd6.h;
import wd6.j;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f636a = r0.k(new Pair("LIMIT_ORDER", h.LIMIT), new Pair("STOP_ORDER", h.STOP), new Pair("TAKE_PROFIT", h.TAKE_PROFIT), new Pair("STOP_LOSS", h.STOP_LOSS), new Pair("TAKE_PROFIT_STOP_LOSS", h.TAKE_PROFIT_STOP_LOSS));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f637b = r0.k(new Pair("BUY", e.BUY), new Pair("SELL", e.SELL));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f638c = r0.k(new Pair("ACTIVE", j.ACTIVE), new Pair("COMPLETED", j.COMPLETED), new Pair("FAILED", j.FAILED));
    public static final Object d;

    static {
        g gVar = g.AMOUNT_LIMIT_EXCEEDED;
        Pair pair = new Pair(Integer.valueOf(gVar.a()), gVar);
        g gVar2 = g.LOW_BALANCE;
        Pair pair2 = new Pair(Integer.valueOf(gVar2.a()), gVar2);
        g gVar3 = g.EXCESSIVE_VOLATILITY;
        Pair pair3 = new Pair(Integer.valueOf(gVar3.a()), gVar3);
        g gVar4 = g.DAILY_EXCHANGE_LIMIT_EXCEEDED;
        d = r0.k(pair, pair2, pair3, new Pair(Integer.valueOf(gVar4.a()), gVar4));
    }
}
