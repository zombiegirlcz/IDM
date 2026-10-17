package j7a;

import a08.f0;
import a08.g0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.data.network.services.UserService;
import com.revolut.domain.models.statement.StatementTemplateId;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Payload;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload;
import efm.d0;
import efm.r;
import io3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import oid.y;
import sri.m;
import te0.w;
import z1i.n;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends pri.b implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f171884h;
    public final PdfNativeSaveContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h7a.b f171885j;
    public final m k;

    public k(d presentationModel, PdfNativeSaveContract$Configuration configuration, h7a.b pdfDelegate, m navigator) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(pdfDelegate, "pdfDelegate");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f171884h = presentationModel;
        this.i = configuration;
        this.f171885j = pdfDelegate;
        this.k = navigator;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        ufm.i iVar;
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        PdfNativeSaveContract$Payload payload = this.i.f80318a;
        ooa.d dVar = (ooa.d) this.f171884h;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        ooa.a aVar2 = dVar.f227022c;
        ooa.b bVar = (ooa.b) aVar2;
        te0.j jVar = bVar.f227017c;
        KProperty[] kPropertyArr = ooa.b.d;
        te0.e value = jVar.getValue(bVar, kPropertyArr[1]);
        PdfNativeSaveContract$ProfileConfirmationPayload account = payload instanceof PdfNativeSaveContract$ProfileConfirmationPayload ? (PdfNativeSaveContract$ProfileConfirmationPayload) payload : null;
        if (account == null) {
            account = new PdfNativeSaveContract$ProfileConfirmationPayload.Account(null, null);
        }
        value.set(account);
        zxd.c cVar = dVar.d;
        d61.a aVar3 = dVar.f227020a;
        ooa.b bVar2 = (ooa.b) aVar2;
        PdfNativeSaveContract$ProfileConfirmationPayload pdfNativeSaveContract$ProfileConfirmationPayload = (PdfNativeSaveContract$ProfileConfirmationPayload) bVar2.f227017c.getValue(bVar2, kPropertyArr[1]).get();
        if (pdfNativeSaveContract$ProfileConfirmationPayload instanceof PdfNativeSaveContract$ProfileConfirmationPayload.Account) {
            PdfNativeSaveContract$ProfileConfirmationPayload.Account account2 = (PdfNativeSaveContract$ProfileConfirmationPayload.Account) pdfNativeSaveContract$ProfileConfirmationPayload;
            String str = account2.f80320a;
            l lVar = account2.f80321b;
            UserService userService = aVar3.f111434a.f318941a;
            if (str == null) {
                str = null;
            }
            r<R> map = userService.getProfileAccountConfirmation(str, lVar != null ? lVar.name() : null).map(new n(new z1i.l(8), 12));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            d0 d0VarFirstOrError = m70.a.g(w.f0(map), null, new ol6.b(28), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            iVar = new ufm.i(w.H0(d0VarFirstOrError, ((ryd.w) cVar).e(StatementTemplateId.ACCOUNT_CONFIRMATION)), new y(new ooa.c(dVar, 2), 27), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        } else if (pdfNativeSaveContract$ProfileConfirmationPayload instanceof PdfNativeSaveContract$ProfileConfirmationPayload.Cards) {
            r<R> map2 = aVar3.f111434a.f318941a.getCardsConfirmation().map(new n(new z1i.l(9), 13));
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            d0 d0VarFirstOrError2 = m70.a.g(w.f0(map2), null, new ol6.b(27), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
            iVar = new ufm.i(w.H0(d0VarFirstOrError2, ((ryd.w) cVar).e(StatementTemplateId.CARD_CONFIRMATION)), new y(new ooa.c(dVar, 1), 26), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        } else {
            if (!(pdfNativeSaveContract$ProfileConfirmationPayload instanceof PdfNativeSaveContract$ProfileConfirmationPayload.Subject)) {
                throw new NoWhenBranchMatchedException();
            }
            r<R> map3 = aVar3.f111434a.f318941a.getSarConfirmation().map(new n(new z1i.l(7), 11));
            Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
            d0 d0VarFirstOrError3 = m70.a.g(w.f0(map3), null, new ol6.b(26), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError3, "firstOrError(...)");
            iVar = new ufm.i(w.H0(d0VarFirstOrError3, ((ryd.w) cVar).e(StatementTemplateId.SUBJECT_CONFIRMATION)), new y(new ooa.c(dVar, 0), 25), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        }
        ufm.n nVarI = o70.a.i(iVar);
        h hVar = new h(this, 0);
        h hVar2 = new h(this, 1);
        ufm.i iVar2 = new ufm.i(nVarI, new g0(24, new j2i.c(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new f0(20, hVar), new f0(20, hVar2), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        ifm.b bVar3 = this.f239031a;
        w.j0(bVar3, iVar3);
        h7a.d dVar2 = (h7a.d) this.f171885j;
        efm.b bVarFlatMapCompletable = dVar2.f149867j.flatMapCompletable(new j6k.g(new h(this, 2), 1));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K = K();
        g0 g0Var = new g0(24, new j2i.c(new BreadcrumbException(), 4));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarFlatMapCompletable, g0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar4.w(new f0(20, function1K), new j(0, i.f171881a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar3, hVarW);
        ihm.j jVar2 = dVar2.k;
        h hVar3 = new h(this, 3);
        Function1 function1K2 = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = jVar2.onErrorResumeNext(new g0(24, new j2i.c(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new f0(20, hVar3), new f0(20, function1K2), new j(0, function0J));
        w.j0(bVar3, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
