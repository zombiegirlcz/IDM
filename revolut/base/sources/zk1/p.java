package zk1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.api.R$string;
import com.revolut.feature.alipay.impl.ui.qr.showcode.AlipayPlusShowCodeScreenContract$ModalStep;
import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreen;
import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreenContract$InputData;
import ip0.dg;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o97.f0;
import o97.h0;
import pcd.s;
import zhm.u;
import zkh.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322899a;

    public /* synthetic */ p(int i) {
        this.f322899a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        AlipayPlusExpandedCodeScreenContract$InputData.CodeType codeType;
        Data data;
        switch (this.f322899a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AlipayPlusShowCodeScreenContract$ModalStep step = (AlipayPlusShowCodeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, AlipayPlusShowCodeScreenContract$ModalStep.Barcode.f61079a)) {
                    codeType = AlipayPlusExpandedCodeScreenContract$InputData.CodeType.BARCODE;
                } else {
                    if (!Intrinsics.f(step, AlipayPlusShowCodeScreenContract$ModalStep.QrCode.f61080a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    codeType = AlipayPlusExpandedCodeScreenContract$InputData.CodeType.QR_CODE;
                }
                return new AlipayPlusExpandedCodeScreen(new AlipayPlusExpandedCodeScreenContract$InputData(codeType));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listC = u.c(new dg("ID_ERROR", new TextLocalisedClause(R$string.alipay_plus_show_code_error_title, null, null, 14), new TextLocalisedClause(R$string.alipay_plus_show_code_error_retry, null, null, 14)));
                yp0.b.k(listC, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 28);
                return listC;
            case 2:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool2 == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                zh9.i iVar = (zh9.i) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (iVar == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                Long l2 = (Long) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (l2 == null) {
                    return error4;
                }
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                ybl.h hVar = (ybl.h) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (hVar == null) {
                    return error5;
                }
                return null;
            case 7:
                Data itemsData = (Data) obj2;
                Boolean expanded = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(itemsData, "itemsData");
                Intrinsics.checkNotNullParameter(expanded, "expanded");
                boolean zBooleanValue = expanded.booleanValue();
                try {
                    Object content = itemsData.getContent();
                    data = new Data(content != null ? v.m((List) content, zBooleanValue) : null, itemsData.getError(), itemsData.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, itemsData.getLoading());
                }
                Data data2 = data;
                return (data2.getError() == null || data2.getContent() != null) ? data2 : Data.copy$default(data2, zhm.v.k(new f0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_search_category_stocks_name, null, null, 14), "HOLDINGS_HEADER"), h0.f223107a), null, false, 6, null);
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 10:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                yp0.b.k(list, R$attr.uikit_dp24, 0, 0, 0, 30);
                return list;
            case 11:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new zl1.h((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)));
            case 12:
                ((Boolean) obj2).getClass();
                return Boolean.TRUE;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 14:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new zlb.e((List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)), null, false, 14);
            case 15:
                Throwable error6 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (iVar2 == null) {
                    return error6;
                }
                return null;
            case 16:
                Throwable error7 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list2 == null) {
                    return error7;
                }
                return null;
            case 17:
                Throwable error8 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list3 == null) {
                    return error8;
                }
                return null;
            case 18:
                Throwable error9 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool3 == null) {
                    return error9;
                }
                return null;
            case 19:
                Throwable error10 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list4 == null) {
                    return error10;
                }
                return null;
            case 20:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalArgumentException();
            case 21:
                Throwable error11 = (Throwable) obj2;
                s sVar = (s) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (sVar == null) {
                    return error11;
                }
                return null;
            case 22:
                Throwable error12 = (Throwable) obj2;
                s sVar2 = (s) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (sVar2 == null) {
                    return error12;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new zmd.i((List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)), zmd.e.f323462a);
            case 24:
                do3.n user = (do3.n) obj2;
                Data selectedRegisteredIdentityIdData = (Data) obj3;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdData, "selectedRegisteredIdentityIdData");
                return zmg.d.a(user, zmg.d.b(selectedRegisteredIdentityIdData));
            case 25:
                od0.i userOptional = (od0.i) obj2;
                Data selectedRegisteredIdentityIdData2 = (Data) obj3;
                Intrinsics.checkNotNullParameter(userOptional, "userOptional");
                Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdData2, "selectedRegisteredIdentityIdData");
                if (!userOptional.d()) {
                    return userOptional;
                }
                do3.n nVarA = zmg.d.a((do3.n) userOptional.c(), zmg.d.b(selectedRegisteredIdentityIdData2));
                od0.i.Companion.getClass();
                return od0.h.a(nVarA);
            case 26:
                do3.n user2 = (do3.n) obj2;
                Data selectedRegisteredIdentityIdData3 = (Data) obj3;
                Intrinsics.checkNotNullParameter(user2, "user");
                Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdData3, "selectedRegisteredIdentityIdData");
                return zmg.d.a(user2, zmg.d.b(selectedRegisteredIdentityIdData3));
            case 27:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new zmj.f0((List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null)), zmj.m.f323566b, new zmj.s(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_subscription_details_header_title, null, null, 14), null, null), zhm.f0.f322471a);
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f322899a = i;
    }
}
