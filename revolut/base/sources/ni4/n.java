package ni4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import nhl.s;
import nii.g0;
import nii.m0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends jki.g implements e {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.c f215647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SpousalConsentInitiatorPopupScreenContract$InputData f215648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f215649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ow3.e f215650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w f215651t;
    public final jki.j u;
    public SpousalConsentInitiatorPopupScreenConfig v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function0 f215652w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hw3.c spousalConsentInitiatorInteractor, SpousalConsentInitiatorPopupScreenContract$InputData inputData, j60.a bottomDialogExtension, ow3.e creditApplicationCancellationInteractor, w revolutJobInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(spousalConsentInitiatorInteractor, "spousalConsentInitiatorInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationInteractor, "creditApplicationCancellationInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f215647p = spousalConsentInitiatorInteractor;
        this.f215648q = inputData;
        this.f215649r = bottomDialogExtension;
        this.f215650s = creditApplicationCancellationInteractor;
        this.f215651t = revolutJobInteractor;
        this.u = jki.j.f175191a;
        this.v = inputData.f68445a;
        this.f215652w = new s(12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f215649r.E()), null, null, new l(this, null, 0), 3);
        z2();
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        v2(b.f215637a);
        return true;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2(SpousalConsentInitiatorPopupScreenConfig.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Continuation continuation = null;
        if (action instanceof SpousalConsentInitiatorPopupScreenConfig.Action.ConvertApplication) {
            l2(new j(this, continuation, 1), new yi5.b(26));
            return;
        }
        if (action instanceof SpousalConsentInitiatorPopupScreenConfig.Action.CloseScreen) {
            v2(b.f215637a);
            return;
        }
        if (action instanceof SpousalConsentInitiatorPopupScreenConfig.Action.CancelApplication) {
            l2(new j(this, continuation, 0), new yi5.b(26));
            return;
        }
        if (action instanceof SpousalConsentInitiatorPopupScreenConfig.Action.FailApplication) {
            l2(new j(this, continuation, 2), new yi5.b(26));
        } else {
            if (!(action instanceof SpousalConsentInitiatorPopupScreenConfig.Action.ShowPopup)) {
                throw new NoWhenBranchMatchedException();
            }
            this.v = ((SpousalConsentInitiatorPopupScreenConfig.Action.ShowPopup) action).f66409a;
            z2();
        }
    }

    public final void z2() {
        m0 g0Var;
        int i = h.f215641a[this.f215648q.f68446b.ordinal()];
        if (i == 1) {
            l2(new m(this, this.v, null), new yi5.b(26));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        SpousalConsentInitiatorPopupScreenConfig spousalConsentInitiatorPopupScreenConfig = this.v;
        ju3.h hVar = spousalConsentInitiatorPopupScreenConfig.f;
        SpousalConsentInitiatorPopupScreenConfig.Button button = spousalConsentInitiatorPopupScreenConfig.d;
        SpousalConsentInitiatorPopupScreenConfig.Button button2 = spousalConsentInitiatorPopupScreenConfig.f66404c;
        int i2 = h.f215642b[hVar.ordinal()];
        if (i2 == 1) {
            g0Var = new g0(spousalConsentInitiatorPopupScreenConfig.f66402a, spousalConsentInitiatorPopupScreenConfig.f66403b, null, button2.f66410a, button != null ? button.f66410a : null, null, null, null, false, null, false, null, 16356);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g0Var = new z(spousalConsentInitiatorPopupScreenConfig.f66402a, spousalConsentInitiatorPopupScreenConfig.f66403b, button2.f66410a, button != null ? button.f66410a : null, null, null, false, null, null, null, null, null, null, 32724);
        }
        yji.l.a1(this, X1(new y0(null, g0Var, false, 5)), null, null, new l(this, null, 1), 3);
    }
}
