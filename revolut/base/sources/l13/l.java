package l13;

import cie.k1;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerControllerContract$InputData;
import ffk.t;
import h93.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l13.i;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends oki.h implements e {
    public final CardSubtypePickerControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f73.b f191438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f191439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qh3.c f191440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hy2.f f191441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final al4.b f191442t;
    public final t u;
    public final q89.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f191443w;

    public l(m stateMapper, CardSubtypePickerControllerContract$InputData inputData, f73.b revolutCardNavigationCommandFactory, l93.f revolutCardsInteractor, qh3.c processCheckoutExtension, hy2.f cardDesignInteractor, al4.b comboCardInteractor, t pricingPlanInteractor, q89.e onboardingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardNavigationCommandFactory, "revolutCardNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(processCheckoutExtension, "processCheckoutExtension");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.o = inputData;
        this.f191438p = revolutCardNavigationCommandFactory;
        this.f191439q = revolutCardsInteractor;
        this.f191440r = processCheckoutExtension;
        this.f191441s = cardDesignInteractor;
        this.f191442t = comboCardInteractor;
        this.u = pricingPlanInteractor;
        this.v = onboardingInteractor;
        this.f191443w = mra.d.b(this, new f(inputData.f65023a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        vkm.d dVarB;
        CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData = this.o;
        AccountId accountId = cardSubtypePickerControllerContract$InputData.f65025c;
        Continuation continuation = null;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        String str = joint != null ? joint.f51413b : null;
        pi3.h hVar = cardSubtypePickerControllerContract$InputData.f;
        boolean z = hVar != null && hVar.d;
        int i = k.f191437a[cardSubtypePickerControllerContract$InputData.f65023a.ordinal()];
        if (i == 1) {
            dVarB = rd0.e.b(pd.b.r(this.u.q(), new kzc.a(this, str, 4)));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dVarB = rd0.e.b(hx2.c.b(this.f191441s, str, false, false, false, z, false, false, cardSubtypePickerControllerContract$InputData.e, null, null, null, 3936));
        }
        yji.l.a1(this, new t38.e(nim.a.y(dVarB, new l0g.a(11)), 24, ((om4.f) this.f191442t).b(), new k1(this, continuation, 2)), null, null, new krc.h(this, continuation, 28), 3);
    }

    public final void I2(i event) {
        l0 l0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof j)) {
            if (!(event instanceof i.a)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
            return;
        }
        String str = ((j) event).f191436a;
        if (Intrinsics.f(str, "ID_LOCAL_CARD_PICKER_ITEM")) {
            l0Var = l0.BRAZIL_LOCAL;
        } else if (!Intrinsics.f(str, "ID_GLOBAL_CARD_PICKER_ITEM")) {
            return;
        } else {
            l0Var = l0.BRAZIL_GLOBAL;
        }
        l2(new kq5.d(this, l0Var, null, 24), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f191443w;
    }
}
