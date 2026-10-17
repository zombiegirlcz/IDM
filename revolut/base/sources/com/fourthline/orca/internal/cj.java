package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class cj implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qo f27482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gj f27483c;
    private final Function0 d;
    private final Function0 e;
    private final uk f;

    public cj(boolean z, qo flowConfig, gj dataBundle, Function0 skipDocumentDetailsUseCase, Function0 nfcScannerRequiredUseCase, uk flowRepository) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(skipDocumentDetailsUseCase, "skipDocumentDetailsUseCase");
        Intrinsics.checkNotNullParameter(nfcScannerRequiredUseCase, "nfcScannerRequiredUseCase");
        Intrinsics.checkNotNullParameter(flowRepository, "flowRepository");
        this.f27481a = z;
        this.f27482b = flowConfig;
        this.f27483c = dataBundle;
        this.d = skipDocumentDetailsUseCase;
        this.e = nfcScannerRequiredUseCase;
        this.f = flowRepository;
    }

    private final boolean b() {
        return c() && !((Boolean) this.e.invoke()).booleanValue();
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        if (this.f27482b.b().getEnabled() && this.f27483c.c() == null) {
            return zhm.u.c(zi.f35606a);
        }
        if (this.f.h()) {
            return zhm.u.c(b() ? yi.f35308a : new bj(null, 1, null));
        }
        if (((Boolean) this.d.invoke()).booleanValue()) {
            return zhm.u.c(b() ? yi.f35308a : new bj(null, 1, null));
        }
        return zhm.u.c(aj.f26819a);
    }

    public boolean c() {
        return this.f27481a;
    }
}
