package rr4;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import ip0.iq;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        Iterator it8 = domainState.f256686a.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (!it8.hasNext()) {
                aim.e eVarA = u.a(eVarB);
                LinkedHashMap linkedHashMap = domainState.f256686a;
                if (linkedHashMap.isEmpty()) {
                    z = true;
                } else {
                    Iterator it9 = linkedHashMap.entrySet().iterator();
                    while (it9.hasNext()) {
                        if (!((g) ((Map.Entry) it9.next()).getValue()).f256684a) {
                            break;
                        }
                    }
                    z = true;
                }
                return new m(eVarA, z);
            }
            Map.Entry entry = (Map.Entry) it8.next();
            ql4.g gVar = (ql4.g) entry.getKey();
            g gVar2 = (g) entry.getValue();
            int i = p.f256693a[gVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Instalment document type = " + gVar + " is not supported");
            }
            aim.e eVarB2 = u.b();
            String str = gVar2.f256685b;
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_document_agreement_addendum_title, null, null, 14);
            int i2 = R$string.credit_card_instalment_document_addendum_title;
            List listC = u.c(new RowDelegate.Model("id_instalment_document_addendum", image24, textLocalisedClause, null, 0, new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) new o(new TextLocalisedClause(i2, null, null, 14), str), "id_instalment_document_addendum_link", false), 10), new TextLocalisedClause(R$string.credit_card_instalment_document_agreement_addendum_description, null, null, 14), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB2.addAll(listC);
            List listC2 = u.c(new InputChecklistDelegate.Model("id_instalment_document_addendum_confirm", new TextLocalisedClause(R$string.credit_card_instalment_document_agreement_addendum_confirm_text, null, null, 14), gVar2.f256684a, false, null, iq.CHECK_BUTTON, null, null, ql4.g.PL_ADDENDUM, null, 0, 0, 0, 523992));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            eVarB2.addAll(listC2);
            eVarB.addAll(u.a(eVarB2));
        }
    }
}
