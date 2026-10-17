package do9;

import aw0.j8;
import aw0.o9;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyReferenceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements tn9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageTransformations f116474a;

    public d(b fallbackImageProvider) {
        Intrinsics.checkNotNullParameter(fallbackImageProvider, "fallbackImageProvider");
        this.f116474a = new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorPopoverBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG);
    }

    public static ContactImage b(PaymentCounterpartyInfo paymentCounterpartyInfo) {
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "paymentCounterpartyInfo");
        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, paymentCounterpartyInfo.e, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    public final UrlImage a(PaymentCounterpartyInfo paymentCounterpartyInfo, ImageTransformations imageTransformations) {
        String str = paymentCounterpartyInfo.f;
        if (str == null) {
            str = "";
        }
        return new UrlImage(str, null, null, null, 0L, null, null, null, null, b.a(paymentCounterpartyInfo), false, imageTransformations, null, null, false, false, 506878);
    }

    public final j8 c(PaymentCounterpartyInfo paymentCounterpartyInfo) {
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "paymentCounterpartyInfo");
        TextClause textClause = null;
        TextClause textClause2 = new TextClause(paymentCounterpartyInfo.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ContactImage contactImageB = b(paymentCounterpartyInfo);
        String str = paymentCounterpartyInfo.f;
        UrlImage urlImageA = ((str == null || str.length() == 0) && b.a(paymentCounterpartyInfo) == null) ? null : a(paymentCounterpartyInfo, this.f116474a);
        List list = paymentCounterpartyInfo.f79063g;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((PaymentCounterpartyReferenceItem) it8.next()).f79067c);
            }
            textClause = new TextClause(d0.k0(arrayList, " - ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new j8(textClause2, textClause, contactImageB, urlImageA);
    }

    public final RowDelegate.Model d(PaymentCounterpartyInfo paymentCounterpartyInfo) {
        TextClause textClause;
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "paymentCounterpartyInfo");
        String str = paymentCounterpartyInfo.f79060a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(b(paymentCounterpartyInfo), new RawCutoutImageBadge(a(paymentCounterpartyInfo, null)), null, false, null, false, 60);
        TextClause textClause2 = new TextClause(paymentCounterpartyInfo.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        List list = paymentCounterpartyInfo.f79063g;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((PaymentCounterpartyReferenceItem) it8.next()).f79067c);
            }
            textClause = new TextClause(d0.k0(arrayList, " - ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
        }
        return new RowDelegate.Model(str, image40, textClause2, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, paymentCounterpartyInfo, null, 0, 0, 0, 0, 532676568);
    }

    public final QuickActionWidgetDelegate.Model e(String listId, PaymentCounterpartyInfo paymentCounterpartyInfo, int i) {
        d3 d3Var;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "paymentCounterpartyInfo");
        ContactImage contactImageB = b(paymentCounterpartyInfo);
        TextClause textClause = new TextClause(paymentCounterpartyInfo.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        UrlImage urlImageA = a(paymentCounterpartyInfo, this.f116474a);
        BulletImage bulletImageA = i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorOnAccent), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null;
        int i2 = c.f116473a[paymentCounterpartyInfo.f79062c.ordinal()];
        if (i2 == 1) {
            d3Var = new d3(new e3(R$drawable.uikit_icn_24_arrow_up, true), (e3) null, 6);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d3Var = new d3(new e3(R$drawable.uikit_icn_24_info, true), (e3) null, 6);
        }
        return new QuickActionWidgetDelegate.Model(listId, contactImageB, urlImageA, bulletImageA, textClause, d3Var, null, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
