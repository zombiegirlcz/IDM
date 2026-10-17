package wm3;

import cli.n;
import cli.y;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends oki.h implements b {

    @NotNull
    public static final h Companion = new h();
    public final ym3.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f298607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f298608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f298609r;

    public l(ym3.b interactor, AddContactInputData inputData, n stateMapper) {
        String str;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        m70.a.c(t0.f186434a);
        AddContactInputData.Prefill f65975a = inputData.f65972a.getF65975a();
        if (Intrinsics.f(f65975a, AddContactInputData.Prefill.None.f65978a)) {
            str = "";
        } else if (f65975a instanceof AddContactInputData.Prefill.Email) {
            str = ((AddContactInputData.Prefill.Email) f65975a).f65977a;
        } else {
            if (!(f65975a instanceof AddContactInputData.Prefill.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((AddContactInputData.Prefill.Phone) f65975a).f65979a;
        }
        y yVarB = mra.d.b(this, new a("", str, false, inputData.f65972a, inputData.f65973b), stateMapper, null, false, 12);
        j2 j2Var = (j2) yVarB.f22677a;
        this.f298607p = yVarB;
        this.f298608q = q.c(((a) j2Var.getValue()).f298598a);
        this.f298609r = q.c(((a) j2Var.getValue()).f298599b);
    }

    public static final void I2(l lVar, zm3.a aVar) {
        int i = i.f298605a[((a) ((j2) lVar.f298607p.f22677a).getValue()).e.ordinal()];
        if (i == 1) {
            lVar.C2(new el3.c(aVar));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lVar.C1(u0.b(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))), new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat(aVar, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, false, 30)))));
        }
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, yh5.b.d(this.f298608q, this.f298609r), null, null, new k(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f298607p;
    }
}
