package q85;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreenContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2e.i0;
import q7b.j;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends jki.g implements d {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f242989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l35.b f242990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ky4.e f242991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f242992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f242993t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j60.a bottomDialog, l35.b loanInteractor, LoanSelectAutopayScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f242989p = bottomDialog;
        this.f242990q = loanInteractor;
        this.f242991r = new ky4.e(0);
        this.f242992s = inputData.f70586a;
        this.f242993t = new c(new Data(null, null, true, 3, null));
    }

    public static RowDelegate.Model.MainImage.Image40 y2(int i) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f242991r, new j(continuation, this, 2)), null, null, new i0(this, continuation, 20), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f242993t;
    }

    public final void z2() {
        d8l.d.t(this, new FeatureCommand(new LoanKompotFeatureConfig.AutoPay(this.f242992s, false)));
    }
}
