package q99;

import kotlin.Pair;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f243840a;

    static {
        k89.b bVar = k89.b.WAITING_FOR_CODE;
        Pair pair = new Pair("IN_PROGRESS", bVar);
        Pair pair2 = new Pair("PENDING", bVar);
        Pair pair3 = new Pair("WAITING_USER_DETAILS", bVar);
        k89.b bVar2 = k89.b.PENDING_OTP;
        Pair pair4 = new Pair("INITIATED", bVar2);
        Pair pair5 = new Pair("WAITING_OTP", bVar2);
        k89.b bVar3 = k89.b.VALIDATING_SIGNATURE;
        Pair pair6 = new Pair("WAITING_RESULT", bVar3);
        Pair pair7 = new Pair("CONFIRMING_OTP", bVar3);
        Pair pair8 = new Pair("COMPLETED", k89.b.COMPLETED);
        Pair pair9 = new Pair("INVALID_OTP", k89.b.INVALID_OTP);
        k89.b bVar4 = k89.b.FAILED;
        f243840a = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("FAILED", bVar4), new Pair("EXPIRED", bVar4));
    }
}
