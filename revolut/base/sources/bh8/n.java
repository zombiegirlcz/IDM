package bh8;

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
import com.revolut.feature.junior_graduation.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f15250w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f15250w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f15250w, continuation, 0);
            case 1:
                return new n(this.f15250w, continuation, 1);
            case 2:
                return new n(this.f15250w, continuation, 2);
            default:
                return new n(this.f15250w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP2;
        Object objP22;
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        u uVar = this.f15250w;
        int i3 = 0;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rul.e eVar = uVar.f15259q;
                this.v = 1;
                Object objB = ((xg8.j) ((xg8.a) eVar.f257630b)).b(true, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                u uVar2 = this.f15250w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    n nVar = new n(uVar2, continuation, i3);
                    this.v = 1;
                    objP2 = uVar2.p2(this, nVar);
                    if (objP2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                ig8.l lVar = (ig8.l) objP2;
                if (lVar instanceof ig8.j) {
                    yg8.e eVar2 = uVar2.f15260r;
                    boolean z = ((ig8.j) lVar).f161096a;
                    eVar2.getClass();
                    return yji.l.b1(uVar2, uVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(z ? R$string.junior_graduation_migration_asset_details_transfer_approved_success_dialog_title : R$string.junior_graduation_migration_asset_details_transfer_approved_success_dialog_account_not_closed_title, null, null, 14), (Clause) (z ? new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_approved_success_dialog_subtitle, null, null, 14) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5)), null, new m(uVar2, null, 0), 3);
                }
                if (!(lVar instanceof ig8.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                yg8.e eVar3 = uVar2.f15260r;
                od0.a aVar3 = od0.a.f224253a;
                TextClause textClause = od0.a.e() ? new TextClause("Confirm assets migration. Debug only", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                eVar3.getClass();
                return yji.l.a1(uVar2, uVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_approved_verification_required_dialog_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_approved_verification_required_dialog_actions_open_revolut_u18, null, null, 14), textClause), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078), false, 5)), null, null, new b96.d(uVar2, (ig8.k) lVar, continuation, 13), 3);
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                j60.a.v(uVar.u, false, null, 3);
                rul.e eVar4 = uVar.f15259q;
                this.v = 1;
                Object objB2 = ((xg8.j) ((xg8.a) eVar4.f257630b)).b(false, this);
                return objB2 == aVar4 ? aVar4 : objB2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = new n(uVar, continuation, i2);
                    this.v = 1;
                    objP22 = uVar.p2(this, nVar2);
                    if (objP22 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP22 = obj2;
                }
                yg8.e eVar5 = uVar.f15260r;
                boolean zA = ((ig8.l) objP22).a();
                eVar5.getClass();
                return yji.l.b1(uVar, uVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(zA ? R$string.junior_graduation_migration_asset_details_transfer_declined_success_dialog_title : R$string.junior_graduation_migration_asset_details_transfer_declined_success_dialog_account_not_closed_title, null, null, 14), (Clause) (zA ? new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_declined_success_dialog_subtitle, null, null, 14) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, zA ? new w1(6, new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_declined_success_dialog_action, null, null, 14), null) : u1.b.f216225a, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5)), null, new m(uVar, null, 1), 3);
        }
    }
}
