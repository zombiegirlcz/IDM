package zaj;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MonthPickerDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.delegates.YearPickerDelegate;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreen;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsScreen;
import com.revolut.uicomponent.products.ExternalCardDelegate;
import fdl.e0;
import fdl.e1;
import fdl.h;
import fdl.o0;
import fdl.p2;
import fdl.q0;
import fdl.r;
import fdl.r2;
import fdl.t0;
import fdl.u;
import fdl.v;
import fdl.v2;
import fdl.y;
import java.util.ArrayList;
import kg.p;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320729a;

    public /* synthetic */ f(int i) {
        this.f320729a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f320729a) {
            case 0:
                KProperty[] kPropertyArr = CryptoPreLaunchDetailsScreen.T;
                return new SmallActionButtonDelegate();
            case 1:
                return Unit.f186387a;
            case 2:
                KProperty[] kPropertyArr2 = PixQrRequestAddAmountScreen.T;
                return new InputTextDelegate(null);
            case 3:
                KProperty[] kPropertyArr3 = PixQrRequestAddAmountScreen.T;
                return new LargeActionButtonDelegate();
            case 4:
                return new FixedTabsDelegate();
            case 5:
                return new PlainTextDelegate();
            case 6:
                return new TextDelegate();
            case 7:
                return new FullScreenStateDelegate();
            case 8:
                return new ErrorDelegate();
            case 9:
                return new RowDelegate(null, null, 7);
            case 10:
                return new LargeActionButtonDelegate();
            case 11:
                return new CellDetailsActionDelegate();
            case 12:
                return new CellDetailsDelegate();
            case 13:
                return new CircleActionButtonsBarDelegate();
            case 14:
                return new QRCodeDelegate();
            case 15:
                Lazy lazy = zbl.a.f320963a;
                p pVarA = ged.a.a();
                he0.m mVarB = he0.m.b(fdl.h.class, "type");
                mVarB.c(h.f.class, "FUND");
                mVarB.c(h.d.class, "ETF");
                mVarB.c(h.c.class, "ETC");
                mVarB.c(h.e.class, "ETN");
                mVarB.c(h.a.class, "BOND");
                mVarB.c(h.g.class, "STRUCTURED_NOTE");
                mVarB.c(h.C0789h.class, "FALLBACK_SUBTYPE_LABEL");
                ArrayList arrayList = pVarA.e;
                arrayList.add(mVarB);
                he0.m mVarB2 = he0.m.b(hdl.e.class, "assetType");
                mVarB2.c(hdl.d.class, "CASH");
                mVarB2.c(hdl.g.class, "STOCK");
                arrayList.add(mVarB2);
                he0.m mVarB3 = he0.m.b(e1.class, "type");
                mVarB3.c(fdl.c.class, "AMOUNT");
                mVarB3.c(v2.class, "QUANTITY");
                arrayList.add(mVarB3);
                he0.m mVarB4 = he0.m.b(fdl.l.class, "assetType");
                mVarB4.c(fdl.j.class, "FIAT");
                mVarB4.c(fdl.k.class, "SECURITY");
                arrayList.add(mVarB4);
                he0.m mVar = new he0.m("type", fdl.g.class, false, true);
                mVar.c(v.class, "ETF");
                mVar.c(u.class, "ETC");
                mVar.c(y.class, "ETN");
                mVar.c(fdl.m.class, "BOND");
                mVar.c(r.class, "CFD");
                mVar.c(e0.class, "FUND");
                mVar.c(p2.class, "MUTUAL_FUND");
                mVar.c(r2.class, "STRUCTURED_NOTE");
                mVar.c(t0.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
                arrayList.add(mVar);
                he0.m mVar2 = new he0.m("valueType", fdl.e.class, false, true);
                mVar2.c(o0.class, "PRICE_PRECISE");
                mVar2.c(q0.class, "YTM");
                arrayList.add(mVar2);
                he0.m mVarB5 = he0.m.b(jed.b.class, "type");
                mVarB5.c(jed.e.class, "ETF");
                mVarB5.c(jed.c.class, "BOND");
                mVarB5.c(jed.f.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVarB5, "registerFallbackSubtype(...)");
                arrayList.add(mVarB5);
                he0.m mVar3 = new he0.m("type", r2.q.class, false, true);
                mVar3.c(r2.q.f.class, "STRING");
                mVar3.c(r2.q.d.class, "NUMBER");
                mVar3.c(r2.q.e.class, "PERCENTAGE");
                mVar3.c(r2.q.b.class, "DATE");
                mVar3.c(r2.q.c.class, "MONEY");
                mVar3.c(r2.q.g.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar3, "registerFallbackSubtype(...)");
                arrayList.add(mVar3);
                s90.a.a(pVarA);
                return pVarA.b();
            case 16:
                return new CellDetailsStandaloneNoteDelegate();
            case 17:
                return new SelectableDelegate(new CellDetailsListDelegate());
            case 18:
                return new TextDelegate();
            case 19:
                return new PlainTextWarningDelegate();
            case 20:
                return new WebViewDelegate();
            case 21:
                return new DatePickerDelegate();
            case 22:
                return new MonthPickerDelegate();
            case 23:
                return new YearPickerDelegate();
            case 24:
                return new ProductSelectionDelegate();
            case 25:
                return new ListSubheaderDelegate();
            case 26:
                return new ExternalCardDelegate(0);
            case 27:
                return new PhoneEditorDelegate();
            case 28:
                return new InputDisclosureDelegate();
            default:
                return new InputChecklistDelegate();
        }
    }
}
