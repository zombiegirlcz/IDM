package dbe;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import dj0.d;
import efm.r;
import hce.c;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import qua.h;
import qua.p;
import qua.u;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f112738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f112739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gbe.a f112740c;

    public b(a9e.b commonSubscriptionMapper, e dateProvider, gbe.a billCommonSubscriptionMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(billCommonSubscriptionMapper, "billCommonSubscriptionMapper");
        this.f112738a = commonSubscriptionMapper;
        this.f112739b = dateProvider;
        this.f112740c = billCommonSubscriptionMapper;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // abe.a
    public final List b(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        vua.a aVar = model.f112735a.f249330s;
        return this.f112740c.a(model, aVar != null ? aVar.a() : null, false, false);
    }

    @Override // abe.a
    public final r c(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(c subscriptionContent) {
        Image imageC;
        String str;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        hce.b bVar = subscriptionContent.f150886a;
        p pVar = bVar.f150883a;
        boolean zI = u.i(pVarC, ((f) this.f112739b).g());
        d dVarB = zae.c.b(subscriptionContent);
        i9e.f fVar = (i9e.f) this.f112738a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        String str2 = bVar.f150883a.f249325m;
        Clause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.recurring_payments_form_transfer, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(u.j(pVar) ? R$string.recurring_payment_details_header_bills_and_taxes_subtitle : R$string.recurring_payment_details_header_subtitle_one_off, null, null, 14);
        LayeredImage layeredImageG = fVar.g(!zI);
        if (u.j(pVar)) {
            h hVar = pVar.C;
            if (hVar == null || (str = hVar.f249298b) == null) {
                str = pVar.f249325m;
            }
            imageC = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        } else {
            fVar.getClass();
            imageC = h5k.a.c();
        }
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, imageC, layeredImageG, (Serializable) null, 96));
    }
}
