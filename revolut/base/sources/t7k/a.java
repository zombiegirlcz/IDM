package t7k;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.domain.models.moneyrequest.TransferLinkDirection;
import com.revolut.retail.feature.payments.payment_links.impl.R$string;
import dj0.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v61.o;
import v61.p;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final C1501a Companion = new C1501a();

    /* JADX INFO: renamed from: t7k.a$a, reason: collision with other inner class name */
    public static final class C1501a {
        private C1501a() {
        }
    }

    public static MoneyClause a(TransferLinkDetails.Active transferLink) {
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        TransferLinkDirection transferLinkDirection = transferLink.f60356g;
        d dVarL = transferLink.k;
        int i = b.f268745b[transferLinkDirection.ordinal()];
        if (i == 1) {
            dVarL = dVarL.l();
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new MoneyClause(dVarL, new MoneyClause.Format.Headers(k7.ALWAYS, null, null, false, false, 30), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
    }

    public static TextLocalisedClause b() {
        return new TextLocalisedClause(R$string.payment_links_placeholder_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
    }

    public static Image c(TransferLinkDetails.Active transferLink) {
        StylableContactImage$Style stylableContactImage$Style;
        Float fValueOf = Float.valueOf(28.0f);
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        if (transferLink == null) {
            throw new NoWhenBranchMatchedException();
        }
        p pVarJ = transferLink.J();
        if (pVarJ == null) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_link, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBlue, 14.0f, fValueOf, null, 32);
        }
        String str = pVarJ.f286310a;
        String str2 = pVarJ.e;
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(pVarJ.f286311b, " ", pVarJ.f286312c);
        int i = b.f268744a[pVarJ.i.ordinal()];
        if (i == 1) {
            stylableContactImage$Style = rf8.a.f253707a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stylableContactImage$Style = null;
        }
        return new ContactImage(str, (String) null, str2, (String) null, (String) null, strO, (String) null, false, (StylableContactImage$ContactStyle) stylableContactImage$Style, (ImageTransformations) null, (TextLocalisedClause) null, 3546);
    }

    public static TimeClause d(TransferLinkDetails transferLink) {
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        return new TimeClause(transferLink.getF().getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
    }

    public static TextLocalisedClause e(TransferLinkDetails.Active transferLink) {
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        int i = b.f268746c[transferLink.f60353a.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.payment_links_accept_link_status_active, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.payment_links_accept_link_status_redeemed, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.payment_links_accept_link_status_rejected, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.payment_links_accept_link_status_expired, null, null, 14);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.payment_links_accept_link_status_cancelled, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause f(TransferLinkDetails transferLink, boolean z) {
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        if (!(transferLink instanceof TransferLinkDetails.Active)) {
            if (transferLink instanceof TransferLinkDetails.NonActive) {
                return b();
            }
            throw new NoWhenBranchMatchedException();
        }
        TransferLinkDetails.Active active = (TransferLinkDetails.Active) transferLink;
        int i = b.f268745b[active.f60356g.ordinal()];
        if (i == 1) {
            o oVar = active.f60361n;
            return oVar != null ? new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_reason_for_transfer_transfer_details_p2p_title, u.c(oVar.getName()), null, 12) : new TextLocalisedClause(R$string.payment_links_title_sent, null, null, 14);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        p pVarJ = active.J();
        String strO = pVarJ != null ? com.google.android.gms.internal.mlkit_vision_face.a.o(pVarJ.f286311b, " ", pVarJ.f286312c) : null;
        return strO == null ? b() : z ? new TextLocalisedClause(R$string.payment_links_accept_link_from_sender, u.c(new TextClause(strO, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12) : new TextLocalisedClause(R$string.payment_links_accept_link_from_sender, u.c(new TextClause(strO, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }
}
