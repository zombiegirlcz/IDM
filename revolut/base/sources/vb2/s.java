package vb2;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends oki.h implements g {
    public final rve.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xb2.b f287375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f287376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ob2.i f287377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f287378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public yte.l f287379t;
    public String u;

    public s(rve.i storedMethodInteractor, xb2.b inputValidator, wj0.a idempotencyKeyHolder, ob2.i payToLegalTermsNavigationProvider, q stateMapper) {
        Intrinsics.checkNotNullParameter(storedMethodInteractor, "storedMethodInteractor");
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(payToLegalTermsNavigationProvider, "payToLegalTermsNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = storedMethodInteractor;
        this.f287375p = inputValidator;
        this.f287376q = idempotencyKeyHolder;
        this.f287377r = payToLegalTermsNavigationProvider;
        this.f287378s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    public static Object I2(s sVar, yte.l lVar, String str, uk9.h hVar, int i) {
        yte.l lVar2 = (i & 1) != 0 ? null : lVar;
        String str2 = (i & 2) != 0 ? null : str;
        wj0.a aVar = sVar.f287376q;
        if (lVar2 != null && !lVar2.equals(sVar.f287379t)) {
            sVar.f287379t = lVar2;
            aVar.a("STORED_METHOD_IDEMPOTENCY_TAG");
        }
        if (str2 != null && !str2.equals(sVar.u)) {
            sVar.u = str2;
            aVar.a("STORED_METHOD_IDEMPOTENCY_TAG");
        }
        rve.i iVar = sVar.o;
        yte.m mVar = yte.m.PAY_TO;
        gve.b bVar = iVar.f257771b;
        bVar.getClass();
        g0a.e eVar = new g0a.e(bVar, mVar, lVar2, str2, (Continuation) null);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, eVar, hVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f287376q.a("STORED_METHOD_IDEMPOTENCY_TAG");
    }

    public final void J2(n uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        if (uiEvent instanceof i) {
            B2();
            return;
        }
        boolean z = uiEvent instanceof l;
        y yVar = this.f287378s;
        if (z) {
            H2(yVar, new r(((l) uiEvent).f287368a, 0));
            return;
        }
        if (!(uiEvent instanceof m)) {
            Continuation continuation = null;
            if (uiEvent instanceof j) {
                l2(new uxe.l(this, continuation, 13), new yi5.b(26));
                return;
            } else {
                if (!(uiEvent instanceof k)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.f(((k) uiEvent).f287367a, "ID_CLICKABLE_FOOTER")) {
                    this.f287377r.getClass();
                    C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData("https://www.revolut.com/en-AU/legal/terms/", WebViewScreenTitleSource.Html.f98166a, false)), null, true));
                    return;
                }
                return;
            }
        }
        InputTextDelegate.TextData textData = ((m) uiEvent).f287369a;
        String str = textData.f52597a;
        int iHashCode = str.hashCode();
        if (iHashCode == -1847174103) {
            if (str.equals("LIST_ID_INPUT_BANK_DETAILS_BSB")) {
                H2(yVar, new ak8.i(textData, 26));
            }
        } else if (iHashCode == -160472213) {
            if (str.equals("LIST_ID_INPUT_PAYID")) {
                H2(yVar, new ak8.i(textData, 25));
            }
        } else if (iHashCode == 804070563 && str.equals("LIST_ID_INPUT_BANK_DETAILS_ACCOUNT_NUMBER")) {
            H2(yVar, new ak8.i(textData, 27));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f287378s;
    }
}
