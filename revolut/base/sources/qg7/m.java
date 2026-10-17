package qg7;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.v1;
import nii.w1;
import nii.y0;
import nii.z;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f245680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f245681x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(u uVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f245680w = uVar;
        this.f245681x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f245680w, this.f245681x, continuation, 0);
            case 1:
                return new m(this.f245680w, this.f245681x, continuation, 1);
            default:
                return new m(this.f245680w, this.f245681x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        int i = this.u;
        Continuation continuation = null;
        String str = this.f245681x;
        int i2 = 1;
        switch (i) {
            case 0:
                u uVar = this.f245680w;
                sg7.a aVar = uVar.f245692s;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    r10.q qVar = uVar.o;
                    this.v = 1;
                    qf7.i iVar = (qf7.i) qVar.f250849b;
                    iVar.getClass();
                    qf7.h hVar = new qf7.h(iVar, str, null, 0);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, hVar, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                lf7.c cVar = (lf7.c) objJ;
                if (cVar instanceof lf7.b) {
                    aVar.getClass();
                    yji.l.a1(uVar, uVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.lottery_draw_success_claim_reward_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.lottery_draw_success_claim_reward_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.lottery_draw_success_claim_reward_primary_action, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_success_claim_reward_secondary_action, null, null, 14)), false, (AnalyticsProduct) aVar.f262599a, (AnalyticsContext) null, (StatusViewContract$Duration) new StatusViewContract$Duration.Custom(4000L), (h0) null, (ResourceImage) null, 3500), false, 5)), null, null, new o(uVar, continuation, i2), 3);
                } else {
                    if (!(cVar instanceof lf7.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.getClass();
                    yji.l.a1(uVar, uVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.lottery_draw_error_already_claimed_title, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_error_already_claimed_description, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_error_already_claimed_action, null, null, 14), null, null, null, false, aVar.f262599a, null, null, null, null, null, 32244), false, 5)), null, null, new t(uVar, null), 3);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    wli.x xVar = this.f245680w.f245690q;
                    lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                    Boolean bool = Boolean.FALSE;
                    this.v = 1;
                    if (xVar.L1(str, aVar4, bool, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                u uVar2 = this.f245680w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    r10.q qVar2 = uVar2.o;
                    this.v = 1;
                    qf7.i iVar2 = (qf7.i) qVar2.f250849b;
                    iVar2.getClass();
                    qf7.h hVar2 = new qf7.h(iVar2, str, null, 1);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, hVar2, this);
                    if (objJ2 != obj3) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj3) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                sg7.a aVar5 = uVar2.f245692s;
                aVar5.getClass();
                yji.l.a1(uVar2, uVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(R$string.lottery_draw_reject_claim_reward_success_action, null, null, 14), null), false, (AnalyticsProduct) aVar5.f262599a, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4012), false, 5)), null, null, new s(uVar2, null), 3);
                return Unit.f186387a;
        }
    }
}
