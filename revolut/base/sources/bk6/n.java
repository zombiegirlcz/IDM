package bk6;

import bmb.r;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.api.R$string;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.dg;
import ip0.qc;
import ip0.tc;
import ip0.xc;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16277a;

    public /* synthetic */ n(int i) {
        this.f16277a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean z = false;
        switch (this.f16277a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 1:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 3:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
                return null;
            case 4:
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(new xc("ID_CONTENT", u.c(new dg("ID_ERROR", new TextLocalisedClause(R$string.alipay_plus_show_code_error_title, null, null, 14), new TextLocalisedClause(R$string.alipay_plus_show_code_error_retry, null, null, 14))), 0, new tc(qc.f165962a), null, R$attr.uikit_dp96, 0, 0, 876));
            case 6:
                Throwable th10 = (Throwable) obj2;
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                if (th10 != null) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
                }
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 8:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 10:
                Data data = (Data) obj2;
                Data data2 = (Data) obj3;
                if (Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m(data, data2, "old", "new"), data2.getContent()) && Intrinsics.f(data.getError(), data2.getError())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                return Unit.f186387a;
            case 12:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new r((List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)), new bmb.o(0));
            case 13:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                List list2 = (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
                yp0.b.k(list2, 0, 0, 0, 0, 31);
                return list2;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 15:
                Throwable error2 = (Throwable) obj2;
                AppTheme appTheme = (AppTheme) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (appTheme == null) {
                    return error2;
                }
                return null;
            case 16:
                Throwable error3 = (Throwable) obj2;
                AppTheme appTheme2 = (AppTheme) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (appTheme2 == null) {
                    return error3;
                }
                return null;
            case 17:
                Throwable error4 = (Throwable) obj2;
                AppTheme appTheme3 = (AppTheme) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (appTheme3 == null) {
                    return error4;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return r0.g();
            case 19:
                return null;
            case 20:
                Throwable error5 = (Throwable) obj2;
                AdditionalCardholdersState additionalCardholdersState = (AdditionalCardholdersState) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (additionalCardholdersState == null) {
                    return error5;
                }
                return null;
            case 21:
                Throwable error6 = (Throwable) obj2;
                FeatureCommand featureCommand = (FeatureCommand) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (featureCommand == null) {
                    return error6;
                }
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (pair == null) {
                    return error7;
                }
                return null;
            case 23:
                Throwable error8 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool == null) {
                    return error8;
                }
                return null;
            case 24:
                Throwable error9 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (iVar == null) {
                    return error9;
                }
                return null;
            case 25:
                Throwable error10 = (Throwable) obj2;
                CreditCardAutopayPayments creditCardAutopayPayments = (CreditCardAutopayPayments) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (creditCardAutopayPayments == null) {
                    return error10;
                }
                return null;
            case 26:
                Throwable error11 = (Throwable) obj2;
                yw4.p pVar = (yw4.p) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (pVar == null) {
                    return error11;
                }
                return null;
            case 27:
                Throwable error12 = (Throwable) obj2;
                CreditCard creditCard = (CreditCard) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (creditCard == null) {
                    return error12;
                }
                return null;
            case 28:
                Throwable error13 = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (str == null) {
                    return error13;
                }
                return null;
            default:
                Throwable error14 = (Throwable) obj2;
                yw4.p pVar2 = (yw4.p) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (pVar2 == null) {
                    return error14;
                }
                return null;
        }
    }

    public /* synthetic */ n(com.revolut.feature.alipay.impl.ui.qr.showcode.modal.e eVar) {
        this.f16277a = 5;
    }
}
