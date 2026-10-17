package s12;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.r2;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements a12.j {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f259043a;

    public f(fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f259043a = qrCodeGenerator;
    }

    public final ArrayList b(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        List<a12.b> list = actions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (a12.b bVar : list) {
            String strQ = j6.a.q("ID_ITEM_EXTRA", bVar.getName());
            Clause title = bVar.getTitle();
            boolean z = false;
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image24(bVar.getIcon(), z, z, 6), title == null ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : title, of.SMALL, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532676592));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final z c(String widgetId, List actions) {
        mx0.d dVar;
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        List<a12.b> list = actions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (a12.b bVar : list) {
            String name = bVar.getName();
            Image icon = bVar.getIcon();
            Clause title = bVar.getTitle();
            int i = e.f259042a[bVar.h().ordinal()];
            if (i == 1) {
                dVar = mx0.d.ACCENT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = mx0.d.SEMIACCENT;
            }
            arrayList.add(new ActionsView.Item(name, dVar, false, e4.EnabledClickable, null, title, icon, null, null, null, false, null, null, bVar, null, 24468));
        }
        return new z(widgetId, arrayList, null, mx0.l.SCROLLABLE, 0, 0, 116);
    }

    public final ActionWidgetDelegate.Model d(TextLocalisedClause name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = "ID_PERMISSIONS";
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(str, new TextLocalisedClause(R$string.apm_permission_contacts_widget_title, null, null, 14), new TextLocalisedClause(R$string.apm_permission_contacts_widget_description, u.c(name), null, 12), new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.apm_permission_contacts_widget_action, null, null, 14), null, 14), com.revolut.core.ui_kit.delegates.q.REGULAR, null, null, false, 8064);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final PaymentLinkWidgetDelegate.Model e(a12.l info) {
        QrCodeAppearance.Type.Rounded.IconConfig iconConfig;
        Intrinsics.checkNotNullParameter(info, "info");
        String str = info.f476c;
        Integer num = info.e;
        i80.a aVarZ = mif.a.Z(fkg.a.l(this.f259043a, str, new h90.a(33, 33), i80.c.H, i80.b.QR_CODE, null, 36));
        if (num != null) {
            int iIntValue = num.intValue();
            int iW = mif.a.w(aVarZ, 30);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$attr.uikit_colorBlack;
            iconConfig = new QrCodeAppearance.Type.Rounded.IconConfig(iW, new QrCodeAppearance.Layer.Image(LayeredImage.Companion.p(companion, iIntValue, Integer.valueOf(i), R$attr.uikit_colorWhite, 4.0f, 24.0f), false));
        } else {
            iconConfig = null;
        }
        return new PaymentLinkWidgetDelegate.Model("ID_QR_WIDGET", new QrCodeImage(aVarZ.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, 7, iconConfig), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), info.f474a, info.f475b, new r2(new TextClause(info.d, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), info.d);
    }
}
