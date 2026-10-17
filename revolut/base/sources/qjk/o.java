package qjk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o {
    public static String a(hha.d plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        return "revolut://app/".concat(hha.s.m(plan) ? "plus" : hha.s.n(plan) ? "premium" : hha.s.j(plan) ? "metal" : hha.s.p(plan) ? "ultra" : hha.s.o(plan) ? "private" : "plans");
    }
}
