package q32;

import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrData;
import ip0.bk0;
import ip0.ck0;
import ip0.ek0;
import ip0.l70;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import ms0.i4;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f241782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f241783b;

    public n(fkg.a qrCodeGenerator, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f241782a = qrCodeGenerator;
        this.f241783b = uiResources;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Object next;
        List listL;
        QrData.Button button;
        TextDelegate.Model model;
        TextDelegate.Model model2;
        TextDelegate.Model model3;
        com.fasterxml.jackson.core.m ek0Var;
        l70 l70Var;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f241775a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            SmallActionButtonDelegate.Model model4 = null;
            if (!it8.hasNext()) {
                eg egVar = new eg("ID_QR_CODE_", arrayList, null, BitmapDescriptorFactory.HUE_RED, 0, 0, 1020);
                yp0.b.r(egVar, R$attr.uikit_dp72, 0, 0, 0, 14);
                Iterator it9 = domainState.f241775a.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (Intrinsics.f(((QrData) next).f62318a, domainState.f241776b)) {
                        break;
                    }
                }
                QrData qrData = (QrData) next;
                if (qrData != null) {
                    String str = qrData.f62318a;
                    String str2 = qrData.f62319b;
                    Clause clause = qrData.f62321g;
                    boolean z = clause != null;
                    QrData.Title title = qrData.e;
                    if (title != null) {
                        if (title instanceof QrData.Title.Header) {
                            ek0Var = new bk0(yj0.CENTER_HORIZONTAL);
                        } else {
                            if (!(title instanceof QrData.Title.Small)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ek0Var = new ek0(yj0.CENTER_HORIZONTAL, new ResourceImage(R$drawable.uikit_icn_24_clipboard, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                        }
                        model = new TextDelegate.Model(j6.a.q("ID_TITLE_", str), title.getF62327a(), title.getF62328b(), ek0Var, new e(str2), null, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 1616);
                    } else {
                        model = null;
                    }
                    Clause clause2 = qrData.f;
                    if (clause2 != null) {
                        model2 = new TextDelegate.Model(j6.a.q("ID_SUBTITLE_", str), clause2, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp8, z ? R$attr.uikit_dp0 : R$attr.uikit_dp24, 0, 0, 1648);
                    } else {
                        model2 = null;
                    }
                    if (clause != null) {
                        String strQ = j6.a.q("ID_CLIPBOARD_", str);
                        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_copy, (Integer) null, (Float) null, (Float) null, 30);
                        m70.a.t(t0.f186434a);
                        model3 = new TextDelegate.Model(strQ, new CompositeClause(v.k(imageClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause), null, null, null, 14), true, new ck0(yj0.CENTER_HORIZONTAL), new e(str2), null, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 1616);
                    } else {
                        model3 = null;
                    }
                    TextDelegate.Model[] elements = {model, model2, model3};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    listL = kotlin.collections.d.L(elements);
                } else {
                    listL = null;
                }
                if (qrData != null && (button = qrData.f62322h) != null) {
                    model4 = new SmallActionButtonDelegate.Model(j6.a.q("ID_BUTTON_SHARE_", qrData.f62318a), h4.CONTEXTUAL, button.f62323a, null, button.f62324b, null, new i4(), new d(qrData.f62319b), null, 0, 0, 0, 0, 32088);
                }
                aim.e eVarB = u.b();
                eVarB.add(egVar);
                if (listL != null) {
                    eVarB.addAll(listL);
                }
                if (model4 != null) {
                    eVarB.add(model4);
                }
                return new i(u.a(eVarB));
            }
            QrData qrData2 = (QrData) it8.next();
            int i = m.f241781a[qrData2.f62320c.ordinal()];
            fkg.a aVar = this.f241782a;
            if (i == 1) {
                i80.a aVarZ = mif.a.Z(fkg.a.l(aVar, qrData2.f62319b, new h90.a(33, 33), i80.c.H, i80.b.QR_CODE, null, 36));
                Integer num = qrData2.d;
                l70Var = new l70(qrData2.f62318a, new QrCodeImage(aVarZ.f159408a, new QrCodeAppearance(num == null ? new QrCodeAppearance.Type.Rounded(900) : new QrCodeAppearance.Type.Rounded(900, mif.a.w(aVarZ, 30), new QrCodeAppearance.Layer.Image(LayeredImage.Companion.p(LayeredImage.INSTANCE, num.intValue(), Integer.valueOf(R$attr.uikit_colorBlack), R$attr.uikit_colorWhite, 4.0f, 24.0f), false)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), false, 0, SyslogConstants.LOG_CLOCK);
                int i2 = R$attr.uikit_dp0;
                yp0.b.p(l70Var, i2, i2, i2, i2);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int iK = kli.a.k(this.f241783b.f22265a, 264.0f);
                l70Var = new l70(qrData2.f62318a, new QrCodeImage(mif.a.Z(fkg.a.l(aVar, qrData2.f62319b, new h90.a(iK, iK), i80.c.H, i80.b.BARCODE_CODE_128, null, 36)).f159408a, new QrCodeAppearance(null, 31), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), true, 0, SyslogConstants.LOG_CLOCK);
                int i3 = R$attr.uikit_dp0;
                yp0.b.p(l70Var, i3, i3, i3, i3);
            }
            arrayList.add(l70Var);
        }
    }
}
