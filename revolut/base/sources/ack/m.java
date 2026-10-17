package ack;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.mappers.PlanGiftingSenderDialogMapper$InsufficientFundsDialogPayload;
import hx7.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lbk.c;
import nii.h0;
import nii.j0;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m0;
import nii.m1;
import nii.n1;
import nii.t1;
import nii.u1;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ dj0.d A;
    public final /* synthetic */ String B;
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zm3.l f3177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f3178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f3179y;
    public final /* synthetic */ hha.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b bVar, zm3.l lVar, boolean z, String str, hha.i iVar, dj0.d dVar, String str2, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f3177w = lVar;
        this.f3178x = z;
        this.f3179y = str;
        this.z = iVar;
        this.A = dVar;
        this.B = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f3177w, this.f3178x, this.f3179y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar;
        com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        final com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b bVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            a3b.h hVar = new a3b.h(bVar2, 1);
            final zm3.l lVar = this.f3177w;
            final String str = this.f3179y;
            final hha.i iVar = this.z;
            t1 t1Var = new t1() { // from class: ack.l
                @Override // nii.p1
                public final m0 a(Object obj3) {
                    int i2;
                    cck.c cVar = bVar2.f102489p;
                    String receiverVisibleName = q.v(lVar);
                    cVar.getClass();
                    String planName = str;
                    Intrinsics.checkNotNullParameter(planName, "planName");
                    Intrinsics.checkNotNullParameter(receiverVisibleName, "receiverVisibleName");
                    hha.i billingCode = iVar;
                    Intrinsics.checkNotNullParameter(billingCode, "billingCode");
                    int i3 = cck.b.f23124a[billingCode.ordinal()];
                    if (i3 == 1) {
                        i2 = R$string.plan_gifting_sending_dialog_success_monthly;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$string.plan_gifting_sending_dialog_success_annual;
                    }
                    return new j0((Clause) new TextLocalisedClause(i2, v.k(new TextClause(planName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(receiverVisibleName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
                }
            };
            a5k.n nVar = new a5k.n(this.A, bVar2, lVar, this.B, iVar, (Continuation) null, 1);
            this.u = 1;
            mVar = this;
            obj2 = n14.k.V(bVar2, null, hVar, t1Var, nVar, mVar, 1);
            bVar = bVar2;
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            mVar = this;
            bVar = bVar2;
        }
        nii.h hVar2 = (nii.h) obj2;
        String strN0 = mVar.f3177w.N0();
        if (hVar2 instanceof nii.g) {
            if (mVar.f3178x) {
                bVar.C2(c.b.f193706a);
            } else {
                bVar.n2(new a1a.b(bVar, strN0, (Continuation) null, 18), new whi.b(6));
            }
        } else {
            if (!(hVar2 instanceof nii.f)) {
                throw new NoWhenBranchMatchedException();
            }
            n1 n1Var = ((nii.f) hVar2).f216147b;
            if (n1Var instanceof l1) {
                Parcelable parcelableA = ((l1) n1Var).f216190a.a();
                if (parcelableA instanceof PlanGiftingSenderDialogMapper$InsufficientFundsDialogPayload) {
                    bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, ((PlanGiftingSenderDialogMapper$InsufficientFundsDialogPayload) parcelableA).f102497a, null, null, 30)));
                }
            } else if (!(n1Var instanceof k1) && !(n1Var instanceof j1) && !(n1Var instanceof m1)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}
