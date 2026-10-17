package nz7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuote;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$Step;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o23.v;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220977a;

    public /* synthetic */ g(int i) {
        this.f220977a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f220977a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 1:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 3:
                yki.l FlowCoordinator = (yki.l) obj2;
                MandateTopupFlowContract$Step it8 = (MandateTopupFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new LayoutViewerScreen(R$layout.screen_transparent);
            case 4:
                Throwable th10 = (Throwable) obj2;
                if (((Mandate) obj3) == null) {
                    return th10;
                }
                return null;
            case 5:
                Throwable error = (Throwable) obj2;
                czj.d dVar = (czj.d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                    return error;
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 7:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(10, null, true, false, "ERROR_STATE_ID"));
            case 8:
                Throwable error2 = (Throwable) obj2;
                d0 d0Var = (d0) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (d0Var == null) {
                    return error2;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 11:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, false, false, null));
            case 12:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 13:
                Throwable error4 = (Throwable) obj2;
                v vVar = (v) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (vVar == null) {
                    return error4;
                }
                return null;
            case 14:
                Throwable error5 = (Throwable) obj2;
                e16.b bVar = (e16.b) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bVar == null) {
                    return error5;
                }
                return null;
            case 15:
                Throwable error6 = (Throwable) obj2;
                e16.b bVar2 = (e16.b) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bVar2 == null) {
                    return error6;
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 17:
                Throwable error7 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (tradingLegalEntityInformation == null) {
                    return error7;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 19:
                List assets = (List) obj3;
                Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(assets, "assets");
                List<t36.c> list2 = assets;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (t36.c cVar : list2) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    xi0.b bVar3 = cVar.f267659a;
                    DefiCurrency defiCurrency = cVar.f267661c;
                    n36.d dVar2 = new n36.d(bVar3.f306286a);
                    t36.a aVar = cVar.f267660b;
                    arrayList.add(new n36.i(dVar2, aVar != null ? new n36.g(aVar.f267657b, aVar.f267658c, aVar.f267656a) : null, new d26.f(defiCurrency.d, Integer.valueOf(defiCurrency.e), defiCurrency.f71671a, defiCurrency.f71672b, defiCurrency.f71673c, defiCurrency.f)));
                }
                return arrayList;
            case 20:
                List assets2 = (List) obj3;
                Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(assets2, "assets");
                List<n36.i> list3 = assets2;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (n36.i iVar : list3) {
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    xi0.a aVar2 = xi0.b.Companion;
                    String str = iVar.f211887a.f211881a;
                    aVar2.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    n36.g gVar = iVar.f211888b;
                    arrayList2.add(new t36.c(bVarA, gVar != null ? new t36.a(gVar.f211885b, gVar.f211886c, gVar.f211884a) : null, d8l.d.y(iVar.f211889c)));
                }
                return arrayList2;
            case 21:
                Intrinsics.checkNotNullParameter((n36.l) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((DeFiSwapQuote) obj3, "<unused var>");
                return Unit.f186387a;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                Throwable error8 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (pair == null) {
                    return error8;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 25:
                Throwable error9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error9, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error9, h0Var);
                return error9;
            case 26:
                CharSequence message = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter((CharSequence) obj3, "<unused var>");
                return message;
            case 27:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new o44.i(u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R$string.credit_application_address_plugin_error_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R$string.credit_application_address_plugin_error_action_title, null, null, 14), false, null, null, false, 0, 0, 32596)));
            default:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
        }
    }

    public /* synthetic */ g(jki.p pVar, int i) {
        this.f220977a = i;
    }
}
