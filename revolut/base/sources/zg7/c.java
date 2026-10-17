package zg7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.RedeemRewardFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import yji.l;
import zfd.s;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b f322085b;

    public /* synthetic */ c(com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b bVar, int i) {
        this.f322084a = i;
        this.f322085b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f322084a) {
            case 0:
                if (((Throwable) obj2) != null) {
                    h.D2(this.f322085b.f74888s);
                }
                return Unit.f186387a;
            case 1:
                hub.b it8 = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z = it8.f155599b;
                com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b bVar = this.f322085b;
                if (z) {
                    h.t2(bVar, bVar.f74888s, RedeemRewardFlowContract$Step.RedeemRevPointHub.f74884a, false, null, false, 12);
                } else {
                    h.D2(bVar.f74888s);
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b bVar2 = this.f322085b;
                bVar2.getClass();
                l.a1(bVar2, bVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.incentive_reward_redeem_rev_points_dialog_error_title, null, null, 14), new TextLocalisedClause(R$string.incentive_reward_redeem_rev_points_dialog_error_description, null, null, 14), new TextLocalisedClause(R$string.incentive_reward_redeem_rev_points_dialog_error_button, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5)), null, null, new s(bVar2, (Continuation) null, 3), 3);
                return Boolean.TRUE;
        }
    }
}
