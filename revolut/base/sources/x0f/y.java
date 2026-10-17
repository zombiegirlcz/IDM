package x0f;

import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends oki.h implements p {
    public final ExternalCardDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y51.a f301606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i61.b f301607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f301608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q06.l f301609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vte.b f301610t;
    public final wsg.n u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ewe.b f301611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f301612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cli.y f301613y;

    public y(ExternalCardDetailsScreenContract$InputData inputData, cli.n stateMapper, y51.a externalCardsInteractor, i61.b autoTopUpInteractor, ang.f userInteractor, q06.l deeplinkRouter, vte.b topUpLimitsInteractor, wsg.n walletInteractor, gte.a featureToggleInteractor, ewe.b cardVerificationResultRelay) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(autoTopUpInteractor, "autoTopUpInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(topUpLimitsInteractor, "topUpLimitsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardVerificationResultRelay, "cardVerificationResultRelay");
        this.o = inputData;
        this.f301606p = externalCardsInteractor;
        this.f301607q = autoTopUpInteractor;
        this.f301608r = userInteractor;
        this.f301609s = deeplinkRouter;
        this.f301610t = topUpLimitsInteractor;
        this.u = walletInteractor;
        this.v = featureToggleInteractor;
        this.f301611w = cardVerificationResultRelay;
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f301612x = z1VarB;
        this.f301613y = mra.d.b(this, new h(new Data(null, null, true, 3, null), new AutoTopUpState(false, null, null, null, null, null, inputData.f91100b), new Data(null, null, true, 3, null), null, inputData.e), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(x0f.y r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof x0f.s
            if (r0 == 0) goto L13
            r0 = r5
            x0f.s r0 = (x0f.s) r0
            int r1 = r0.f301600w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f301600w = r1
            goto L18
        L13:
            x0f.s r0 = new x0f.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f301600w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            wsg.n r4 = r4.u
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r4 = r4.x(r5)
            r0.f301600w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0f.y.I2(x0f.y, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new wr1.s(this, continuation, 17), new yi5.b(26));
        yji.l.a1(this, vkm.q.Q(this.f301612x, new w2a.q(continuation, this, 27)), null, null, new w(this, continuation, 1), 3);
        yji.l.a1(this, this.f301611w.f130167a, null, null, new wtj.f(this, continuation, 10), 3);
        l2(new wih.c(this, continuation, 18), new yi5.b(26));
        if (((jte.d) this.v).c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c)) {
            yji.l.a1(this, new wyd.f(new vvh.e(mo3.a.g(this.f301613y.B(new h0() { // from class: x0f.v
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return ((h) obj2).f301586a;
                }
            }), null, new wyg.s(11), 1), 6), this, 1), null, null, new w(this, continuation, 0), 3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void J2(String actionId) {
        t61.g gVar;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        int iHashCode = actionId.hashCode();
        ExternalCardDetailsScreenContract$InputData externalCardDetailsScreenContract$InputData = this.o;
        switch (iHashCode) {
            case -1642531097:
                if (!actionId.equals("SETUP_AUTO_TOPUP_ACTION_ID")) {
                    return;
                }
                break;
            case -1052436597:
                if (actionId.equals("UPDATE_CARD_ACTION_ID")) {
                    C2(new m(externalCardDetailsScreenContract$InputData.f91099a));
                    return;
                }
                return;
            case 647569653:
                if (!actionId.equals("ADJUST_AUTO_TOPUP_ACTION_ID")) {
                    return;
                }
                break;
            case 1944416731:
                if (actionId.equals("VERIFY_CARD_ACTION_ID")) {
                    C2(new n(externalCardDetailsScreenContract$InputData.f91099a));
                    return;
                }
                return;
            case 2066014768:
                if (actionId.equals("DELETE_ACTION_ID") && (gVar = (t61.g) ((h) ((j2) this.f301613y.f22677a).getValue()).f301586a.getContent()) != null) {
                    C2(new i(gVar));
                    return;
                }
                return;
            default:
                return;
        }
        l2(new wtj.f(this, null, 9), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f301613y;
    }
}
