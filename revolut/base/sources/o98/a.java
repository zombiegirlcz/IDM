package o98;

import kotlin.Pair;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f223138a;

    static {
        Pair pair = new Pair("CREATED", p98.a.CREATED);
        Pair pair2 = new Pair("PENDING", p98.a.PENDING);
        p98.a aVar = p98.a.CONFIRMED;
        f223138a = r0.k(pair, pair2, new Pair("CONFIRMED", aVar), new Pair("COMPLETION_STARTED", aVar), new Pair("COMPLETION_FAILED", aVar));
    }
}
