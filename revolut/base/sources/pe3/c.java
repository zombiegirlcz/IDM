package pe3;

import com.revolut.feature.categorisation.impl.network.TransactionsCategorisationService;
import kotlin.jvm.internal.Intrinsics;
import mhf.j;
import pe0.e;
import pe0.f;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsCategorisationService f235329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f235330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f235331c;

    public c(TransactionsCategorisationService transactionsService, com.revolut.domain.interactors.transactions.a transactionsInteractor, j transactionsSearchIndexInteractor) {
        Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f235329a = transactionsService;
        this.f235330b = transactionsInteractor;
        this.f235331c = transactionsSearchIndexInteractor;
    }

    public static boolean a(f entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return entry instanceof e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (((mjf.k0) r10.f235331c).g(r11, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(pe0.f r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.c.b(pe0.f, gim.c):java.lang.Object");
    }
}
