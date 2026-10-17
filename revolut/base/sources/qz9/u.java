package qz9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.payments.social.impl.R$string;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pzd.x;
import r0e.n;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250451a;

    public /* synthetic */ u(int i) {
        this.f250451a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean z = true;
        switch (this.f250451a) {
            case 0:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                mza.d dVar = (mza.d) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (dVar == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable error3 = (Throwable) obj2;
                mza.d dVar2 = (mza.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar2 == null) {
                    return error3;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.u.c(new FullScreenStateDelegate.Model("CHAT_ERROR_ITEM_ID", null, new TextLocalisedClause(R$string.social_payments_chat_keyboard_error_subtitle, null, null, 14), null, null, new TextLocalisedClause(R$string.social_payments_chat_keyboard_error_button, null, null, 14), false, null, null, false, 0, 0, 32720));
            case 6:
                Throwable th10 = (Throwable) obj2;
                if (((x) obj3) == null) {
                    return th10;
                }
                return null;
            case 7:
                Function1 defaultErrorItem = (Function1) obj3;
                n.a aVar = r0e.n.Companion;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return (List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null));
            case 8:
                ApmProduct product = (ApmProduct) obj2;
                wi0.b countryCode = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(product, "product");
                Intrinsics.checkNotNullParameter(countryCode, "country");
                product.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return Boolean.valueOf(product.c().contains(countryCode));
            case 9:
                ApmProduct product2 = (ApmProduct) obj2;
                wi0.b countryCode2 = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(product2, "product");
                Intrinsics.checkNotNullParameter(countryCode2, "country");
                product2.getClass();
                if (!(product2 instanceof ApmBlik)) {
                    Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                    if (!product2.c().contains(countryCode2)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new r15.j(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_difficulties_title, null, null, 14), (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)));
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                aim.e eVarB = zhm.u.b();
                eVarB.add(r18.n.b(true));
                eVarB.addAll((Collection) getDefaultErrorItems3.invoke(new iii.d(6, q18.f.f241406a, true, false, null)));
                return zhm.u.a(eVarB);
            case 12:
                Throwable error4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (obj3 == null) {
                    return error4;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new o1d.d(new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_alerts_widget_home_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_watchlist_screen_asset_section_buttons_try_again, null, null, 14));
            case 14:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 15:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 16:
                Throwable error6 = (Throwable) obj2;
                xi0.b bVar = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bVar == null) {
                    return error6;
                }
                return null;
            case 17:
                Throwable error7 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list3 == null) {
                    return error7;
                }
                return null;
            case 18:
                Throwable error8 = (Throwable) obj2;
                v38.e eVar = (v38.e) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (eVar == null) {
                    return error8;
                }
                return null;
            case 19:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return (List) defaultError.invoke(new iii.d(8, null, true, true, "CFD_PORTFOLIO_ERROR_STATE_ID"));
            case 20:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(10, null, true, false, "STORE_SEARCH_ERROR_STATE_ID"));
            case 21:
                Throwable error9 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list4 == null) {
                    return error9;
                }
                return null;
            case 22:
                Throwable error10 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list5 == null) {
                    return error10;
                }
                return null;
            case 23:
                Throwable error11 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list6 == null) {
                    return error11;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 28:
                Throwable error12 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (iVar == null) {
                    return error12;
                }
                return null;
            default:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(14, null, false, false, null));
        }
    }

    public /* synthetic */ u(Object obj2, int i) {
        this.f250451a = i;
    }
}
