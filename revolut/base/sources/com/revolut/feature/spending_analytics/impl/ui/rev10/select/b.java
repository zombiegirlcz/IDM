package com.revolut.feature.spending_analytics.impl.ui.rev10.select;

import ard.q0;
import cli.n;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements n {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe3.b f87899a;

    public b(oe3.b transactionsListItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsListItemMapper, "transactionsListItemMapper");
        this.f87899a = transactionsListItemMapper;
    }

    public static boolean a(ard.a aVar) {
        SelectTransactionContract$SelectionMode selectTransactionContract$SelectionMode = aVar.f8635c;
        if (!(selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple)) {
            SelectTransactionContract$SelectionMode.Single single = selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Single ? (SelectTransactionContract$SelectionMode.Single) selectTransactionContract$SelectionMode : null;
            if (single == null || !single.f87890a) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[EDGE_INSN: B:258:0x008b->B:38:0x008b BREAK  A[LOOP:6: B:25:0x0066->B:260:?], EDGE_INSN: B:259:0x008b->B:38:0x008b BREAK  A[LOOP:6: B:25:0x0066->B:260:?]] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r46) {
        /*
            Method dump skipped, instruction units count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.select.b.c(cli.j):cli.o");
    }
}
