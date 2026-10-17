package qg7;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails$ShareInfo;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import qg7.g;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends oki.h implements f {
    public final r10.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f245689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wli.x f245690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LotteryResultControllerContract$InputData f245691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sg7.a f245692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f245693t;
    public final cli.y u;

    public u(y stateMapper, r10.q incentiveRewardInteractor, wsg.n walletInteractor, wli.x deeplinkHandler, LotteryResultControllerContract$InputData inputData, sg7.a dialogConfigProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(incentiveRewardInteractor, "incentiveRewardInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogConfigProvider, "dialogConfigProvider");
        this.o = incentiveRewardInteractor;
        this.f245689p = walletInteractor;
        this.f245690q = deeplinkHandler;
        this.f245691r = inputData;
        this.f245692s = dialogConfigProvider;
        this.f245693t = new vii.b();
        this.u = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    public static void I2(u uVar, String str, int i) {
        String str2 = (i & 1) != 0 ? null : str;
        uVar.n2(new p(uVar, "doGoToAccounts", str2, new n(uVar, null), (Continuation) null), new pud.b((i & 2) != 0, uVar, str2, 3));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f245693t, new q7b.j(continuation, this, 13)), h0.f322473a), null, null, new o(this, continuation, 0), 3);
    }

    public final void J2(boolean z) {
        LotteryDrawDetails$ShareInfo lotteryDrawDetails$ShareInfo;
        com.revolut.feature.incentive_reward.impl.model.lotteries.b bVar = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) ((e) ((j2) this.u.f22677a).getValue()).f245668a.getContent();
        if (bVar == null || (lotteryDrawDetails$ShareInfo = bVar.f74859c) == null) {
            r6.b.D("Invalid share info");
        } else {
            C2(new h(lotteryDrawDetails$ShareInfo, z));
        }
    }

    public final void K2(ug7.d dVar) throws Throwable {
        String str;
        if (dVar == null) {
            r6.b.D("Parcel needs to contain a valid button parcel");
            return;
        }
        String str2 = dVar.f279981a;
        int i = l.f245679a[dVar.f279982b.ordinal()];
        Continuation continuation = null;
        cli.y yVar = this.u;
        switch (i) {
            case 1:
                com.revolut.feature.incentive_reward.impl.model.lotteries.b bVar = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) ((e) ((j2) yVar.f22677a).getValue()).f245668a.getContent();
                if (bVar == null || (str = bVar.f74857a) == null) {
                    wp5.y.B("Campaign id is not available");
                    return;
                } else {
                    n2(new p(this, "claimReward", str2, new m(this, str, continuation, 0), (Continuation) null), new j(this, str, str2, 0));
                    return;
                }
            case 2:
                com.revolut.feature.incentive_reward.impl.model.lotteries.b bVar2 = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) ((e) ((j2) yVar.f22677a).getValue()).f245668a.getContent();
                if (bVar2 == null) {
                    wp5.y.B("Draw details is not available");
                    return;
                }
                String str3 = bVar2.f74857a;
                String termsUrl = bVar2.f74858b.f183306c;
                sg7.a aVar = this.f245692s;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
                yji.l.a1(this, X1(new y0(null, new l0(new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_first_reject_title, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_first_reject_description, zhm.u.c(new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_first_reject_description_terms, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) termsUrl, "FIRST_CONFIRMATION_URL_CLICK_ID", false), 10)), null, 12), null, new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_first_reject_primary_action, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_first_reject_secondary_action, null, null, 14), null, false, aVar.f262599a, 868), false, 5)), null, null, new a9h.c(new bib.b(this, str3, termsUrl, str2, 29), this, termsUrl, str2, (Continuation) null, 6), 3);
                return;
            case 3:
                J2(true);
                return;
            case 4:
                I2(this, str2, 2);
                return;
            case 5:
                C2(g.a.f245669a);
                return;
            case 6:
                this.f245693t.a();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
