package vrl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prl.r f291616a;

    public b(prl.r tradingOrdersRepository) {
        Intrinsics.checkNotNullParameter(tradingOrdersRepository, "tradingOrdersRepository");
        this.f291616a = tradingOrdersRepository;
    }

    public static Object a(b bVar, String str, String str2, bfl.g gVar, gim.c cVar) {
        return bVar.f291616a.b(str, str2, gVar, cVar);
    }
}
