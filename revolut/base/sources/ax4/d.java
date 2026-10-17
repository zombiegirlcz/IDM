package ax4;

import auj.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.t0;
import dx4.u1;
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.y;
import dx4.z2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public interface d {
    void B0(i0 i0Var);

    default void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("openVariantSelectionPopup is not supported for config: title=", config.f120756b), null, h0Var);
    }

    void C(j jVar);

    void D1(c5 c5Var);

    default void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("showDocumentsPicker is not supported for id: ", uploadUrl), null, h0Var);
    }

    void G0(i iVar);

    default void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("openAmountInputScreen is not supported for config: ", amountInputScreen.j()), null, h0Var);
    }

    void I(z2 z2Var, Function1 function1);

    default void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("openDocumentsUploadScreen is not supported for id: ", categoryId), null, h0Var);
    }

    void S(String str);

    default void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        U1(new o(item, 12));
    }

    default void U(String str) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("openScreen is not supported for ", str), null, h0Var);
    }

    void U1(Function1 function1);

    void V(Pair pair);

    default void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", a0.d.s("onInfoActionCellItemClicked is not supported for item: id=", infoActionCell.f120661a, ", title=", infoActionCell.f120662b), null, h0Var);
    }

    void Z1(String str, String str2);

    default void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("deleteDocument is not supported for id: ", deleteUrl), null, h0Var);
    }

    default void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("handleDeeplink is not supported for ", deeplink), null, h0Var);
    }

    void d1(String str, String str2);

    default void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", a0.d.s("onNestedDocumentClick is not supported for item name=", documentItem.getName(), ", title=", documentItem.getTitle()), null, h0Var);
    }

    void h2(Pair pair);

    default void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("handleCustomAction is not supported for ", actionId), null, h0Var);
    }

    void k0(b2 b2Var);

    default void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("onInputClicked is not supported for input: listId=", model.f52580a), null, h0Var);
    }

    void m(m4 m4Var);

    default void n1(y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("openAmountInputScreen is not supported for config: ", amountInputScreen.j()), null, h0Var);
    }

    void p1(t0 t0Var);

    default void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", a0.d.s("onExpandableCheckboxSelected is not supported for item id=", expandableCheckboxItem.f120809a, ", title=", expandableCheckboxItem.f120810b), null, h0Var);
    }

    default void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", a0.d.s("onCellItemClicked is not supported for item: id=", cellItem.f120735a, ", title=", cellItem.f120736b), null, h0Var);
    }

    default void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtension", j6.a.q("showDocument is not supported for document: title=", document.f120785c), null, h0Var);
    }
}
