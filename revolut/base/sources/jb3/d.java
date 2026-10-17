package jb3;

import com.revolut.feature.cash_topup.impl.data.service.CashTopUpBarcodeService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import wim.z;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpBarcodeService f172579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f172580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f172581c;

    public d(CashTopUpBarcodeService service, xe0.e storage, a barcodeMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(barcodeMapper, "barcodeMapper");
        this.f172579a = service;
        this.f172580b = storage;
        this.f172581c = barcodeMapper;
    }

    public final void a(ib3.a aVar) {
        this.f172580b.G(aVar, "BARCODE_DETAILS_KEY", z.d(o0.b(ib3.a.class)));
    }
}
