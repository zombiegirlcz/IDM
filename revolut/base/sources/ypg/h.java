package ypg;

import aw0.n6;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import tof.i7;
import ytj.r;
import ytj.t;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315872a;

    public /* synthetic */ h(int i) {
        this.f315872a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f315872a) {
            case 0:
                Throwable error = (Throwable) obj2;
                fo3.c cVar = (fo3.c) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (cVar == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pair == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable error3 = (Throwable) obj2;
                fo3.c cVar2 = (fo3.c) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cVar2 == null) {
                    return error3;
                }
                return null;
            case 3:
                Data data2 = (Data) data;
                yvh.b bVar = (yvh.b) org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data2, "t1", "t2");
                return Boolean.valueOf(bVar != null ? bVar.equals(data2.getContent()) : false);
            case 4:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof PopupMenuItem);
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof yr0.d);
            case 7:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return Boolean.FALSE;
            case 8:
                return null;
            case 9:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return Boolean.FALSE;
            case 11:
                Throwable error4 = (Throwable) obj2;
                Pair pair2 = (Pair) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pair2 == null) {
                    return error4;
                }
                return null;
            case 12:
                Throwable error5 = (Throwable) obj2;
                whf.p pVar = (whf.p) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pVar == null) {
                    return error5;
                }
                return null;
            case 13:
                Throwable error6 = (Throwable) obj2;
                i7 i7Var = (i7) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (i7Var == null) {
                    return error6;
                }
                return null;
            case 14:
                Throwable error7 = (Throwable) obj2;
                CreditCardPaymentDetails creditCardPaymentDetails = (CreditCardPaymentDetails) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (creditCardPaymentDetails == null) {
                    return error7;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new r(ytj.o.f316824a, new aw0.e(false, null, null, new n6(null, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 988), null, null, 55), false, u.c(new FullScreenStateDelegate.Model("error_list_id", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), new l6(12, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1860)));
            case 16:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 17:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                Throwable error8 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool == null) {
                    return error8;
                }
                return null;
            case 20:
                Throwable error9 = (Throwable) obj2;
                Boolean bool2 = (Boolean) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool2 == null) {
                    return error9;
                }
                return null;
            case 21:
                Throwable error10 = (Throwable) obj2;
                Boolean bool3 = (Boolean) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (bool3 == null) {
                    return error10;
                }
                return null;
            case 22:
                List payments = (List) obj2;
                Set hiddenPaymentIds = (Set) data;
                Intrinsics.checkNotNullParameter(payments, "payments");
                Intrinsics.checkNotNullParameter(hiddenPaymentIds, "hiddenPaymentIds");
                if (hiddenPaymentIds.isEmpty()) {
                    return payments;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : payments) {
                    Set set = hiddenPaymentIds;
                    qua.n nVarD = ((qua.p) obj3).d();
                    if (!d0.T(set, nVarD != null ? nVarD.a() : null)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 23:
                List payments2 = (List) obj2;
                Set hiddenPaymentIds2 = (Set) data;
                Intrinsics.checkNotNullParameter(payments2, "payments");
                Intrinsics.checkNotNullParameter(hiddenPaymentIds2, "hiddenPaymentIds");
                if (hiddenPaymentIds2.isEmpty()) {
                    return f0.f322471a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : payments2) {
                    Set set2 = hiddenPaymentIds2;
                    qua.n nVarD2 = ((qua.p) obj4).d();
                    if (d0.T(set2, nVarD2 != null ? nVarD2.a() : null)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return iii.c.b(null, "ERROR_LINKED_WALLETS_ITEM_ID", 4, true);
            case 25:
                Throwable th10 = (Throwable) obj2;
                if (((Boolean) data) == null) {
                    return th10;
                }
                return null;
            case 26:
                Function1 defaultErrorItem = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new yv7.h((List) defaultErrorItem.invoke(new iii.d(14, null, false, false, null)), false);
            case 27:
                Throwable error11 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list == null) {
                    return error11;
                }
                return null;
            case 28:
                Throwable error12 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list2 == null) {
                    return error12;
                }
                return null;
            default:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
        }
    }

    public /* synthetic */ h(t tVar) {
        this.f315872a = 15;
    }
}
