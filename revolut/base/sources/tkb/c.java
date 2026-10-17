package tkb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jjb.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import wli.x;
import yji.n;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f271929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final skb.f f271930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f80.a f271931n;
    public final x o;

    public c(j60.a bottomDialogExtension, skb.f sheetsModelProvider, f80.a uriHelper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(sheetsModelProvider, "sheetsModelProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f271929l = bottomDialogExtension;
        this.f271930m = sheetsModelProvider;
        this.f271931n = uriHelper;
        this.o = deeplinkHandler;
    }

    public static void Z2(SavingsProduct savingsProduct) {
        IllegalStateException illegalStateException = new IllegalStateException("When protection == null UI items should not be visible for users, check product id=" + savingsProduct.f86617a + ", groupType=" + savingsProduct.f86619c + ", state=" + savingsProduct.d);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, rd0.e.b(this.f271929l.C()), null, new tgk.f(this, null, 15), 3);
    }

    public final void b3(g parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        boolean z = parcel instanceof jjb.f;
        j60.a aVar = this.f271929l;
        if (z) {
            j60.a.v(aVar, false, new sw6.a(this, parcel, 27), 1);
        } else {
            if (!(parcel instanceof jjb.e)) {
                throw new NoWhenBranchMatchedException();
            }
            j60.a.v(aVar, false, null, 3);
        }
    }

    public final void c3(d parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        SavingsProductData savingsProductData = parcel.f271932a;
        ProductGroup productGroup = savingsProductData.f86684b;
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        int i = b.f271928a[productGroup.f86521a.ordinal()];
        skb.f fVar = this.f271930m;
        j60.a aVar = this.f271929l;
        if (i == 1 || i == 2) {
            SavingsProduct.Provider provider = savingsProduct.e;
            SavingsProduct.Explanation providerExplanation = provider != null ? provider.f : null;
            SavingsProduct.Protection protection = savingsProduct.f;
            if (providerExplanation == null) {
                if (protection != null) {
                    d3(savingsProductData);
                    return;
                } else {
                    Z2(savingsProduct);
                    return;
                }
            }
            fVar.getClass();
            Intrinsics.checkNotNullParameter(providerExplanation, "providerExplanation");
            Intrinsics.checkNotNullParameter(providerExplanation, "providerExplanation");
            aVar.x(new y(u.c(skb.c.a(skb.d.Companion, R$attr.uikit_dp16, 0, 14)), new t(new TextClause(providerExplanation.f86642a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new HtmlClause(0, 30, (Integer) null, (Object) null, providerExplanation.f86643b), null, 28), l.WINDOW, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3832));
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        SavingsProduct.Protection protection2 = savingsProduct.f;
        String str = protection2 != null ? protection2.d : null;
        if (protection2 == null) {
            Z2(savingsProduct);
            return;
        }
        if (str == null) {
            d3(savingsProductData);
            return;
        }
        TextClause textClause = new TextClause(protection2.f86661a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        HtmlClause htmlClause = new HtmlClause(0, 30, (Integer) null, (Object) null, str);
        jjb.f fVar2 = new jjb.f(savingsProductData);
        jjb.d data = new jjb.d(textClause, htmlClause, fVar2);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        SavingsProduct.Protection protection3 = savingsProduct.f;
        boolean z = (protection3 != null ? protection3.e : null) != null;
        l lVar = l.WINDOW;
        t tVar = new t(textClause, htmlClause, null, 28);
        aim.e eVarB = u.b();
        eVarB.add(LargeActionButtonDelegate.Model.e(skb.c.a(skb.d.Companion, R$attr.uikit_dp8, R$attr.uikit_dp16, 12), jjb.e.f174811a, 0, 0, 0, 0, 1048319));
        if (z) {
            int i2 = R$attr.uikit_dp0;
            TextLocalisedClause text = new TextLocalisedClause(R$string.savings_details_protection_document_open, null, null, 14);
            int i3 = R$attr.uikit_dp24;
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(text, "text");
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("PROTECTION_DOCUMENT_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, text, false, null, null, null, null, 1000);
            yp0.b.p(model, i2, i3, i5, i5);
            eVarB.add(LargeActionButtonDelegate.Model.e(model, fVar2, 0, 0, 0, 0, 1048319));
        }
        aVar.x(new y(u.a(eVarB), tVar, lVar, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3832));
    }

    public final void d3(SavingsProductData savingsProductData) {
        SavingsProduct.Protection protection = savingsProductData.f86683a.f;
        SavingsDocument savingsDocument = protection != null ? protection.e : null;
        if (savingsDocument != null) {
            A2(new SavingsDocumentLauncherDestination(savingsDocument));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Protection or document for product with id:", savingsProductData.f86683a.f86617a, " is null"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }
}
