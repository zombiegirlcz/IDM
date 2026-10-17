package uwa;

import java.util.Map;
import kotlin.Pair;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f283563a = r0.k(new Pair("ACTIVE", qwa.a.PENDING), new Pair("REDEEMED", qwa.a.ACTIVE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f283564b = r0.k(new Pair("SEND_MONEY", owa.a.SEND_MONEY), new Pair("SPLIT_BILLS", owa.a.SPLIT_BILLS), new Pair("SAVE_MONEY", owa.a.SAVE_MONEY), new Pair("MUCH_MORE", owa.a.MUCH_MORE), new Pair("CRYPTOCURRENCIES", owa.a.CRYPTOCURRENCIES), new Pair("CRYPTO_ACTIONS", owa.a.CRYPTO_ACTIONS), new Pair("CRYPTO_SECURITY", owa.a.CRYPTO_SECURITY), new Pair("CRYPTO_NEWS", owa.a.CRYPTO_NEWS), new Pair("CRYPTO_LEARN", owa.a.CRYPTO_LEARN), new Pair("CARD", owa.a.CARD), new Pair("SAVINGS", owa.a.SAVINGS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f283565c = r0.k(new Pair("ACTIVE", pwa.i.ACTIVE), new Pair("PAST", pwa.i.PAST));
    public static final Object d = r0.k(new Pair("CREATED", pwa.d.CREATED), new Pair("ACTIVE", pwa.d.ACTIVE), new Pair("REDEEMED", pwa.d.REDEEMED), new Pair("REQUIREMENTS_MET", pwa.d.REQUIREMENTS_MET), new Pair("SKIPPED", pwa.d.SKIPPED), new Pair("REJECTED", pwa.d.REJECTED));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map a() {
        return d;
    }
}
