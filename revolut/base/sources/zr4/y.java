package zr4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import om4.r1;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a f324583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f324583w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f324583w, continuation, 0);
            case 1:
                return new y(this.f324583w, continuation, 1);
            case 2:
                return new y(this.f324583w, continuation, 2);
            case 3:
                return new y(this.f324583w, continuation, 3);
            default:
                return new y(this.f324583w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar2 = this.f324583w;
                    al4.m mVar = aVar2.f69375p;
                    InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData = aVar2.o;
                    String str = instalmentDetailsScreenContract$InputData.f69368a;
                    String str2 = instalmentDetailsScreenContract$InputData.f69369b;
                    this.v = 1;
                    if (((r1) mVar).d(str, str2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar4 = this.f324583w;
                    y yVar = new y(aVar4, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, yVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar6 = this.f324583w;
                    y yVar2 = new y(aVar6, null, 1);
                    this.v = 1;
                    if (ue8.c.f0(aVar6, yVar2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                j0 j0Var = new j0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_management_dialog_cancelled_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
                com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar8 = this.f324583w;
                xxh.d dVar = new xxh.d(aVar8, 3);
                vkj.l lVar = new vkj.l(j0Var, 9);
                y yVar3 = new y(aVar8, null, 2);
                this.v = 1;
                Object objS = n14.k.S(aVar8.X(), null, dVar, lVar, yVar3, this);
                return objS == aVar7 ? aVar7 : objS;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar10 = this.f324583w;
                    al4.m mVar2 = aVar10.f69375p;
                    InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData2 = aVar10.o;
                    String str3 = instalmentDetailsScreenContract$InputData2.f69368a;
                    String str4 = instalmentDetailsScreenContract$InputData2.f69369b;
                    this.v = 1;
                    if (al4.m.a(mVar2, str3, str4, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
