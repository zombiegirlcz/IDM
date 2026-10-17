package rof;

import akl.s;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.ui.transactiondetails.inputnote.InputNoteActivity;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import efm.d0;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import pfm.h;
import pfm.l;
import qp5.x;
import rnd.k;
import sri.m;
import te0.w;
import tpi.j;
import ypi.i;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends bsi.a implements b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pof.a f256000j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f256001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xpi.g f256002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f256003n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rpi.c f256004p;

    public g(pof.a presentationModel, m navigator, i nextButtonView, xpi.g navBarView, f9b.f errorView, j progressView, rpi.c keyboardView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        this.f256000j = presentationModel;
        this.k = navigator;
        this.f256001l = nextButtonView;
        this.f256002m = navBarView;
        this.f256003n = errorView;
        this.o = progressView;
        this.f256004p = keyboardView;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
        xpi.c cVar = (xpi.c) this.f256002m;
        cVar.e0(numValueOf);
        cVar.n0(new TextLocalisedClause(R$string.transfer_money_edit_view_add_note, null, null, 14));
        r rVarQ = cVar.Q();
        d dVar = new d(this, 0);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarQ.onErrorResumeNext(new o0(14, new x(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        lhi.b bVar = new lhi.b(27, dVar);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(bVar, new lhi.b(27, sVar), new z(25, function0J));
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        this.f256001l.f(new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_add_note_save_note, null, null, 14));
        InputNoteActivity inputNoteActivity = (InputNoteActivity) view;
        r map = ((InputTextDelegate) inputNoteActivity.f92111t0.getValue()).e.f121375b.map(new e(1, new k(24)));
        pof.j jVar = (pof.j) this.f256000j;
        r rVarStartWith = map.startWith((String) ((pof.c) jVar.f237987b).w0().get());
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        d0 d0VarFirstOrError = o70.a.f(rVarStartWith).doOnNext(new e(2, new d(this, 4))).switchMap(new rea.j(new d(this, 5), 26)).doOnNext(new rea.j(new d(this, 1), 27)).firstOrError();
        rea.j jVar2 = new rea.j(new d(this, 2), 29);
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, jVar2, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        l lVar = new l(o70.a.g(aVar2), new e(0, new d(this, 3)), 1);
        Intrinsics.checkNotNullExpressionValue(lVar, "doOnEvent(...)");
        h hVarK = ue0.e.K(hx7.a.L(lVar, this.f256003n, false, null, 24));
        r1a.a aVar3 = new r1a.a(this, 21);
        pfm.a aVar4 = new pfm.a(hVarK, new o0(14, new x(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar4.w(new lhi.b(27, sVar), new z(25, aVar3));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_note, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_add_note_placeholder, null, null, 14);
        String str = (String) ((pof.c) jVar.f237987b).w0().get();
        String str2 = !kotlin.text.d0.W(str) ? str : null;
        InputTextDelegate.Model model = new InputTextDelegate.Model("NOTE", str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, textLocalisedClause, textLocalisedClause2, false, null, false, null, null, null, null, null, null, true, 64, null, false, false, false, false, null, 0, null, null, false, true, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -67158032, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        inputNoteActivity.setItems(u.c(model));
    }
}
