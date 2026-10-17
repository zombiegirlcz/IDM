package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e8 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f184669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bej.m f184670n;
    public final rjf.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iof.a f184671p;

    public e8(klf.h0 commonDataSource, vlf.b commonUiMapper, bej.m esimStatementsInteractor, rjf.f telecomInvoiceNaviCommandFactory, iof.a esimInvoicesDialogBuilder) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(telecomInvoiceNaviCommandFactory, "telecomInvoiceNaviCommandFactory");
        Intrinsics.checkNotNullParameter(esimInvoicesDialogBuilder, "esimInvoicesDialogBuilder");
        this.f184668l = commonDataSource;
        this.f184669m = commonUiMapper;
        this.f184670n = esimStatementsInteractor;
        this.o = telecomInvoiceNaviCommandFactory;
        this.f184671p = esimInvoicesDialogBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(tof.x2 r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.e8.Z2(tof.x2, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (Intrinsics.f(str, "ID_TELECOM_DOWNLOAD_INVOICE")) {
            return Z2(obj2 instanceof tof.x2 ? (tof.x2) obj2 : null, (gim.c) continuation);
        }
        return Boolean.FALSE;
    }
}
