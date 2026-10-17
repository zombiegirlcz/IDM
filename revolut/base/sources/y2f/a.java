package y2f;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static jhi.k a(y2f.a r9, com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter.TradingTransactionsFilterImpl r10, java.lang.String r11, java.lang.String r12, long r13, int r15, int r16) {
        /*
            r0 = r16 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r11 = r1
        L6:
            r0 = r16 & 32
            if (r0 == 0) goto Ld
            r0 = 0
        Lb:
            r7 = r0
            goto Lf
        Ld:
            r0 = 1
            goto Lb
        Lf:
            y2f.b r0 = y2f.b.HISTORY_ONLY
            d4f.p r9 = (d4f.p) r9
            java.lang.String r2 = "filter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            java.lang.String r3 = "updates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            f4f.a r4 = r9.f111300a
            r8 = r4
            y3f.v r8 = (y3f.v) r8
            r8.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            if (r11 == 0) goto L45
            boolean r3 = kotlin.text.d0.W(r11)
            if (r3 != 0) goto L34
            goto L35
        L34:
            r11 = r1
        L35:
            if (r11 == 0) goto L45
            java.lang.String r10 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r10)
            zhm.f0 r10 = zhm.f0.f322471a
            go.g r11 = new go.g
            r12 = 2
            r11.<init>(r10, r12)
            goto L59
        L45:
            j3f.f r11 = r8.e
            r11.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            r2 = r10
            r3 = r12
            r4 = r13
            r6 = r15
            androidx.sqlite.db.SimpleSQLiteQuery r10 = j3f.f.a(r2, r3, r4, r6, r7)
            kotlinx.coroutines.flow.Flow r11 = r11.h(r10)
        L59:
            vy5.d0 r10 = new vy5.d0
            r12 = 29
            r10.<init>(r11, r12)
            kotlinx.coroutines.flow.Flow r10 = r8.a(r10, r0)
            d4f.o r11 = new d4f.o
            r12 = 1
            r11.<init>(r9, r1, r12)
            jhi.k r9 = nim.a.u(r11, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y2f.a.a(y2f.a, com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter$TradingTransactionsFilterImpl, java.lang.String, java.lang.String, long, int, int):jhi.k");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static jhi.k b(y2f.a r4, com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter.TradingTransactionsFilterImpl r5, java.lang.String r6, java.lang.String r7, long r8, int r10, int r11) {
        /*
            r11 = r11 & 2
            r0 = 0
            if (r11 == 0) goto L6
            r6 = r0
        L6:
            y2f.b r11 = y2f.b.HISTORY_ONLY
            d4f.p r4 = (d4f.p) r4
            java.lang.String r1 = "filter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r2 = "updates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            f4f.a r3 = r4.f111300a
            y3f.v r3 = (y3f.v) r3
            r3.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            if (r6 == 0) goto L3b
            boolean r2 = kotlin.text.d0.W(r6)
            if (r2 != 0) goto L2a
            goto L2b
        L2a:
            r6 = r0
        L2b:
            if (r6 == 0) goto L3b
            java.lang.String r5 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            zhm.f0 r5 = zhm.f0.f322471a
            go.g r6 = new go.g
            r7 = 2
            r6.<init>(r5, r7)
            goto L4b
        L3b:
            j3f.f r6 = r3.e
            r6.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            androidx.sqlite.db.SimpleSQLiteQuery r5 = j3f.f.b(r5, r7, r8, r10)
            kotlinx.coroutines.flow.Flow r6 = r6.h(r5)
        L4b:
            vy5.d0 r5 = new vy5.d0
            r7 = 29
            r5.<init>(r6, r7)
            kotlinx.coroutines.flow.Flow r5 = r3.a(r5, r11)
            d4f.o r6 = new d4f.o
            r7 = 2
            r6.<init>(r4, r0, r7)
            jhi.k r4 = nim.a.u(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y2f.a.b(y2f.a, com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter$TradingTransactionsFilterImpl, java.lang.String, java.lang.String, long, int, int):jhi.k");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static jhi.k c(y2f.a r4, com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter.TradingTransactionsFilterImpl r5, java.lang.String r6, int r7, int r8) {
        /*
            r8 = r8 & 2
            r0 = 0
            if (r8 == 0) goto L6
            r6 = r0
        L6:
            y2f.b r8 = y2f.b.HISTORY_ONLY
            d4f.p r4 = (d4f.p) r4
            java.lang.String r1 = "filter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r2 = "updates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            f4f.a r3 = r4.f111300a
            y3f.v r3 = (y3f.v) r3
            r3.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            if (r6 == 0) goto L3b
            boolean r2 = kotlin.text.d0.W(r6)
            if (r2 != 0) goto L2a
            goto L2b
        L2a:
            r6 = r0
        L2b:
            if (r6 == 0) goto L3b
            java.lang.String r5 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            zhm.f0 r5 = zhm.f0.f322471a
            go.g r6 = new go.g
            r7 = 2
            r6.<init>(r5, r7)
            goto L4b
        L3b:
            j3f.f r6 = r3.e
            r6.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            androidx.sqlite.db.SimpleSQLiteQuery r5 = j3f.f.c(r5, r0, r0, r7)
            kotlinx.coroutines.flow.Flow r6 = r6.h(r5)
        L4b:
            vy5.d0 r5 = new vy5.d0
            r7 = 29
            r5.<init>(r6, r7)
            kotlinx.coroutines.flow.Flow r5 = r3.a(r5, r8)
            d4f.o r6 = new d4f.o
            r7 = 0
            r6.<init>(r4, r0, r7)
            jhi.k r4 = nim.a.u(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y2f.a.c(y2f.a, com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter$TradingTransactionsFilterImpl, java.lang.String, int, int):jhi.k");
    }
}
