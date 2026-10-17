package vq1;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import op0.o3;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vq0.g;
import xo9.h;
import xo9.i;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uq1.a f291303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo1.c f291304b;

    public d(uq1.a pagoPAInteractor, vo1.c billsFeatureChecker) {
        Intrinsics.checkNotNullParameter(pagoPAInteractor, "pagoPAInteractor");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        this.f291303a = pagoPAInteractor;
        this.f291304b = billsFeatureChecker;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        String qrCode = ((c) parsingResult).f291302a;
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        oq1.b bVar = this.f291303a.f282069a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        d0<qq1.d> d0VarInitialiseBill = bVar.f227699a.initialiseBill(qrCode);
        o3 o3Var = new o3(23, new o0(20));
        d0VarInitialiseBill.getClass();
        ufm.i iVar = new ufm.i(d0VarInitialiseBill, o3Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(w.i0(iVar), new vpg.b(22, new g(6)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ufm.c cVar = new ufm.c(new fp1.a((fp1.d) this.f291304b, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.i iVar = new ufm.i(cVar, new vpg.b(21, new d62.a(code, 4)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
