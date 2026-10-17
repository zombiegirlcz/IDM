package eed;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lcd.o;
import lcd.p;
import lcd.q;
import pcd.j;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final icd.a f125179a;

    public d(icd.a savingsProductInteractor, mbd.b savingsVaultMapper) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultMapper, "savingsVaultMapper");
        this.f125179a = savingsProductInteractor;
    }

    public static q a(pcd.e filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        pcd.j jVar = filter.f234855b;
        if (jVar instanceof j.d) {
            return lcd.n.f193865a;
        }
        if (jVar instanceof j.c) {
            return lcd.m.f193864a;
        }
        if (jVar instanceof pcd.l) {
            return new p(((pcd.l) jVar).f234871a);
        }
        if (jVar instanceof pcd.k) {
            return new o(((pcd.k) jVar).f234870a);
        }
        if (Intrinsics.f(jVar, j.a.f234864a)) {
            return lcd.k.f193862a;
        }
        if (Intrinsics.f(jVar, j.b.f234865a)) {
            return lcd.l.f193863a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(lcd.i r30, gim.c r31) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eed.d.b(lcd.i, gim.c):java.io.Serializable");
    }
}
