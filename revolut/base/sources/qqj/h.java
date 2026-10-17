package qqj;

import com.revolut.retail.feature.impl.balance_history.network.BalanceHistoryService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements od0.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BalanceHistoryService f248564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lqj.a f248565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f248566c;
    public final ue0.c d;
    public final l80.e e;

    public h(BalanceHistoryService service, lqj.a dao, ne0.d memoryCache, ue0.c storage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f248564a = service;
        this.f248565b = dao;
        this.f248566c = memoryCache;
        this.d = storage;
        this.e = dateProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        if (r1 != r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0132 -> B:48:0x0135). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(qqj.h r19, kotlinx.coroutines.flow.FlowCollector r20, java.lang.Long r21, long r22, java.lang.Long r24, boolean r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qqj.h.a(qqj.h, kotlinx.coroutines.flow.FlowCollector, java.lang.Long, long, java.lang.Long, boolean, gim.c):java.lang.Object");
    }

    public static final String b(h hVar, Long l2, long j2, List list) {
        hVar.getClass();
        return l2 + "-" + j2 + "-" + list;
    }

    @Override // od0.e
    public final void clear() {
        this.f248565b.e();
        this.d.clear();
        this.f248566c.clear();
    }
}
