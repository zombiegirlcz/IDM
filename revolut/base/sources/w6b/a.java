package w6b;

import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import efm.d0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r5b.p;
import w4l.k;
import w6h.g;
import wda.i;
import wda.r;
import wda.x;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295409a;

    public /* synthetic */ a(int i) {
        this.f295409a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f295409a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 2:
                g.a aVar = g.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 3:
                g.a aVar2 = g.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                break;
            case 5:
                p action = (p) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected ActionItem " + action + " in SwitchPlanConfirmation");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                break;
            case 6:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                break;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 8:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                break;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                break;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 14:
                Function1 function1 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(function1, "default");
                break;
            case 15:
                Throwable error = (Throwable) obj2;
                DisclaimerParams disclaimerParams = (DisclaimerParams) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (disclaimerParams == null) {
                }
                break;
            case 16:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (obj3 != null) {
                }
                break;
            case 17:
                Throwable error3 = (Throwable) obj2;
                yt8.c cVar = (yt8.c) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cVar != null) {
                }
                break;
            case 18:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list != null) {
                }
                break;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 20:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                break;
            case 21:
                Intrinsics.checkNotNullParameter((FiatExchangeOrderQuoteParams) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((FiatExchangeOrderQuote) obj3, "<unused var>");
                break;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 23:
                ((Boolean) obj2).getClass();
                i iVar = r.Companion;
                break;
            case 24:
                Throwable error5 = (Throwable) obj2;
                k kVar = (k) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (kVar == null) {
                }
                break;
            case 25:
                Throwable error6 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (set == null) {
                }
                break;
            case 26:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                String storageKey = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(storageKey, "storageKey");
                ufm.b bVarM = d0.m(new x(h0.f322473a));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                break;
            case 27:
                Throwable th10 = (Throwable) obj2;
                Function1 defaultItemsFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItemsFactory, "defaultItemsFactory");
                if (th10 == null) {
                }
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
        }
        return f0.f322471a;
    }
}
