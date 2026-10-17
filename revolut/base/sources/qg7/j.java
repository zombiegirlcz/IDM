package qg7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.incentive_reward.impl.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f245674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f245675c;
    public final /* synthetic */ String d;

    public /* synthetic */ j(u uVar, String str, String str2, int i) {
        this.f245673a = i;
        this.f245674b = uVar;
        this.f245675c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f245673a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                u uVar = this.f245674b;
                sg7.a aVar = uVar.f245692s;
                aVar.getClass();
                yji.l.a1(uVar, uVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.lottery_draw_error_claim_reward_title, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_error_claim_reward_description, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_error_claim_reward_action, null, null, 14), null, null, null, false, aVar.f262599a, null, null, null, null, null, 32244), false, 5)), null, null, new q(uVar, this.f245675c, this.d, null, 0), 3);
                break;
            default:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                u uVar2 = this.f245674b;
                sg7.a aVar2 = uVar2.f245692s;
                aVar2.getClass();
                yji.l.a1(uVar2, uVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_error_title, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_error_description, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_error_action, null, null, 14), null, null, null, false, aVar2.f262599a, null, null, null, null, null, 32244), false, 5)), null, null, new q(uVar2, this.f245675c, this.d, null, 1), 3);
                break;
        }
        return Boolean.TRUE;
    }
}
