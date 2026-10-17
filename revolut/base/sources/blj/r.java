package blj;

import android.os.Parcelable;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.impl.R$string;
import dfj.c2;
import dfj.d2;
import dfj.e2;
import dfj.f2;
import dfj.g2;
import dfj.h2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.c0;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f16724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e f16725x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f16725x = eVar;
        this.f16724w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f16725x, this.f16724w, continuation);
            default:
                r rVar = new r(this.f16725x, continuation);
                rVar.f16724w = obj2;
                return rVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((g2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Object obj3 = this.f16724w;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar = this.f16725x;
                q qVar = new q(eVar, obj3, null);
                this.v = 1;
                Object objP2 = eVar.p2(this, qVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar2 = this.f16725x;
                y yVar = eVar2.f101306t;
                w wVar = eVar2.f101304r;
                final g2 g2Var = (g2) this.f16724w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (g2Var instanceof g2.a) {
                        tji.f fVarX = eVar2.X();
                        wVar.getClass();
                        fVarX.d(new y0(null, new c0(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_otp_loading_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_otp_loading_subtitle, null, null, 14), null, false, null, false, false, null, 1916), false, 5));
                    } else if (g2Var instanceof d2) {
                        tji.f fVarX2 = eVar2.X();
                        wVar.getClass();
                        fVarX2.d(new y0(null, w.b(), false, 5));
                    } else if (g2Var instanceof c2) {
                        tji.f fVarX3 = eVar2.X();
                        wVar.getClass();
                        rv6.e eVarD = fVarX3.d(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_otp_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_otp_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5));
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.c cVar = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.c(eVar2);
                        this.f16724w = null;
                        this.v = 1;
                        if (eVarD.collect(cVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else if (g2Var instanceof e2) {
                        final int i3 = 0;
                        eVar2.H2(yVar, new Function1() { // from class: blj.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                h hVar = (h) obj4;
                                switch (i3) {
                                    case 0:
                                        return h.a(hVar, null, new Data(((e2) g2Var).f113948a, null, false, 6, null), null, 5);
                                    default:
                                        return h.a(hVar, null, new Data(((f2) g2Var).f113963a, null, false, 6, null), null, 4);
                                }
                            }
                        });
                        tji.f fVarX4 = eVar2.X();
                        pfj.i iVar = ((e2) g2Var).f113948a;
                        pfj.g gVar = iVar.f235615a.f;
                        wVar.getClass();
                        fVarX4.d(new y0(null, w.a(gVar), false, 5));
                        eVar2.L2(iVar.f235615a.d);
                    } else if (g2Var instanceof f2) {
                        final int i5 = 1;
                        eVar2.H2(yVar, new Function1() { // from class: blj.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                h hVar = (h) obj4;
                                switch (i5) {
                                    case 0:
                                        return h.a(hVar, null, new Data(((e2) g2Var).f113948a, null, false, 6, null), null, 5);
                                    default:
                                        return h.a(hVar, null, new Data(((f2) g2Var).f113963a, null, false, 6, null), null, 4);
                                }
                            }
                        });
                        tji.f fVarX5 = eVar2.X();
                        pfj.i iVar2 = ((f2) g2Var).f113963a;
                        pfj.g gVar2 = iVar2.f235615a.f;
                        wVar.getClass();
                        fVarX5.d(new y0(null, w.a(gVar2), false, 5));
                        eVar2.L2(iVar2.f235615a.d);
                    } else {
                        if (!(g2Var instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tji.f fVarX6 = eVar2.X();
                        wVar.getClass();
                        rv6.e eVarD2 = fVarX6.d(new y0(null, new g0(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_otp_pending_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_otp_pending_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5));
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.d dVar = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.d(eVar2);
                        this.f16724w = null;
                        this.v = 2;
                        if (eVarD2.collect(dVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f16725x = eVar;
    }
}
