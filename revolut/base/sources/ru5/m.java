package ru5;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.statements.api.models.StatementContent;
import com.revolut.feature.topup_screen.impl.flows.revert_transfer.RevertTransferFlowContract$Step;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257427a;

    public /* synthetic */ m(int i) {
        this.f257427a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f257427a) {
            case 0:
                Throwable error = (Throwable) obj2;
                i7 i7Var = (i7) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (i7Var == null) {
                    return error;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, false, null));
            case 2:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(4, ru6.q.f257455a, true, true, null));
            case 3:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(4, ru6.u.f257458a, true, true, null));
            case 4:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 6:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null));
            case 9:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return rv7.k.a((List) getDefaultErrorItems7.invoke(new iii.d(14, null, true, false, null)), false);
            case 10:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return (List) getDefaultErrorItems8.invoke(new iii.d(12, null, false, false, null));
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 12:
                Function1 getDefaultErrors = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrors, "getDefaultErrors");
                return f0.f322471a;
            case 13:
                Function1 getDefaultErrors2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrors2, "getDefaultErrors");
                return f0.f322471a;
            case 14:
                Throwable error2 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pair == null) {
                    return error2;
                }
                return null;
            case 15:
                Throwable error3 = (Throwable) obj2;
                CreditCardSecurityDeposit creditCardSecurityDeposit = (CreditCardSecurityDeposit) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (creditCardSecurityDeposit == null) {
                    return error3;
                }
                return null;
            case 16:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return (List) defaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null));
            case 17:
                Function1 getDefaultErrorItems9 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return (List) getDefaultErrorItems9.invoke(new iii.d(12, null, false, true, null));
            case 18:
                Function1 getDefaultErrorItems10 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems10, "getDefaultErrorItems");
                return (List) getDefaultErrorItems10.invoke(new iii.d(12, null, true, true, null));
            case 19:
                yki.l FlowCoordinator = (yki.l) obj2;
                RevertTransferFlowContract$Step it8 = (RevertTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new LayoutViewerScreen(R$layout.screen_transparent);
            case 20:
                Function1 defaultErrorMapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorMapper, "defaultErrorMapper");
                return (List) defaultErrorMapper.invoke(new iii.d(14, null, true, false, null));
            case 21:
                Function1 defaultErrorMapper2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorMapper2, "defaultErrorMapper");
                return (List) defaultErrorMapper2.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Collection collection = (List) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(list, "new");
                if (collection == null) {
                    collection = f0.f322471a;
                }
                return d0.E0(list, collection);
            case 23:
                Throwable error4 = (Throwable) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pair2 != null) {
                    return error4;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return Boolean.valueOf(iIntValue < 3);
            case 27:
                Throwable error5 = (Throwable) obj2;
                c71.b bVar = (c71.b) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bVar == null) {
                    return error5;
                }
                return null;
            case 28:
                Throwable error6 = (Throwable) obj2;
                c71.b bVar2 = (c71.b) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bVar2 == null) {
                    return error6;
                }
                return null;
            default:
                Throwable error7 = (Throwable) obj2;
                StatementContent statementContent = (StatementContent) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (statementContent == null) {
                    return error7;
                }
                return null;
        }
    }
}
