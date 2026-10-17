package wp4;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsContract$InputData;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 extends jki.g implements r {

    @NotNull
    private static final y Companion = new y();
    public final ck4.b A;
    public final bp4.a B;
    public final a C;
    public final lal.a D;
    public final g E;
    public final LayeredImage F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AutopaySettingsContract$InputData f299059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f299060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lb5.b f299061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj4.b f299062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y51.a f299063t;
    public final ang.f u;
    public final vt4.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d3j.b f299064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m3j.j f299065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vp4.a f299066y;
    public final sf0.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(AutopaySettingsContract$InputData inputData, j60.a bottomDialogExtension, lb5.b autopayInteractor, wj4.b backUpCardInfoDialogFactory, y51.a externalCardInteractor, ang.f userInteractor, vt4.b creditCardDialogMapper, d3j.b beneficiaryInteractor, m3j.j beneficiaryAvatarMapper, vp4.a creditCardAutopayDialogMapper, sf0.h serverErrorParser, ck4.b autopaySourceProvider, bp4.a creditCardAutopayLocalizationProvider, a autopaySettingsMapper, lal.a creditCardInfoSectionsInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(autopayInteractor, "autopayInteractor");
        Intrinsics.checkNotNullParameter(backUpCardInfoDialogFactory, "backUpCardInfoDialogFactory");
        Intrinsics.checkNotNullParameter(externalCardInteractor, "externalCardInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(creditCardAutopayDialogMapper, "creditCardAutopayDialogMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(autopaySourceProvider, "autopaySourceProvider");
        Intrinsics.checkNotNullParameter(creditCardAutopayLocalizationProvider, "creditCardAutopayLocalizationProvider");
        Intrinsics.checkNotNullParameter(autopaySettingsMapper, "autopaySettingsMapper");
        Intrinsics.checkNotNullParameter(creditCardInfoSectionsInteractor, "creditCardInfoSectionsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f299059p = inputData;
        this.f299060q = bottomDialogExtension;
        this.f299061r = autopayInteractor;
        this.f299062s = backUpCardInfoDialogFactory;
        this.f299063t = externalCardInteractor;
        this.u = userInteractor;
        this.v = creditCardDialogMapper;
        this.f299064w = beneficiaryInteractor;
        this.f299065x = beneficiaryAvatarMapper;
        this.f299066y = creditCardAutopayDialogMapper;
        this.z = serverErrorParser;
        this.A = autopaySourceProvider;
        this.B = creditCardAutopayLocalizationProvider;
        this.C = autopaySettingsMapper;
        this.D = creditCardInfoSectionsInteractor;
        this.E = new g(new Data(null, null, true, 3, null));
        this.F = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorGreyTone50), R$attr.uikit_colorGreyTone10, 11.2f, Float.valueOf(34.0f), null, 32);
    }

    public final void A2() {
        nb5.e eVar = y2().f299031a.f70705b;
        if (a0.f299029a[eVar.ordinal()] != 1) {
            IllegalStateException illegalStateException = new IllegalStateException("Account details can't be opened for this payment: " + eVar);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        CreditCardDirectDebitMandate creditCardDirectDebitMandate = y2().f299034g;
        if (creditCardDirectDebitMandate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Image image = y2().f299035h;
        if (image == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        v2(new j(creditCardDirectDebitMandate, image));
    }

    @Override // yji.l
    public final void I1() {
        AutopaySettingsContract$InputData autopaySettingsContract$InputData = this.f299059p;
        String str = autopaySettingsContract$InputData.f69097a;
        yb5.e eVar = (yb5.e) this.f299061r;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, rd0.e.n(xam.a.h(new e0(this, null), vkm.q.q(u0.i(eVar.b(str, hVar), eVar.a(autopaySettingsContract$InputData.f69097a, hVar), nim.a.v(this.u.j(w4l.j.f294644c), b0.f)))), zhm.h0.f322473a), null, null, new f0(this, null), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.E;
    }

    public final b y2() {
        return (b) zi0.c.I(((g) t2()).f299048a);
    }

    public final CreditCardAutopayPayment.AutoPayment z2() {
        e eVar = (e) zi0.c.I(((g) t2()).f299048a);
        if (eVar instanceof b) {
            return ((b) eVar).f299031a;
        }
        if (eVar instanceof c) {
            return ((c) eVar).f299038a;
        }
        if (eVar instanceof d) {
            throw new IllegalStateException("Cannot update autopay payment: no autopay payment exists");
        }
        throw new NoWhenBranchMatchedException();
    }
}
